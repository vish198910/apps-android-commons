package fr.free.nrw.commons.explore.depictions;

import com.pedrogomez.renderers.RVRendererAdapter;

import java.util.List;

import fr.free.nrw.commons.BasePresenter;
import fr.free.nrw.commons.upload.structure.depictions.DepictedItem;

/**
 * The contract with with SearchDepictionsFragment and its presenter would talk to each other
 */

public interface SearchDepictionsFragmentContract {

    interface View {
        void initErrorView();

        void handleNoInternet();

        void onSuccess(List<DepictedItem> mediaList);

        void loadingDepictions();

        void clearAdapter();

        void showSnackbar();

        RVRendererAdapter<DepictedItem> getAdapter();

        void onImageUrlFetched(String response, int position);

        void setIsLastPage(boolean isLastPage);
    }

    interface UserActionListener extends BasePresenter<View> {

        void updateDepictionList(String query, int pageSize);

        void saveQuery();

        void initializeQuery(String query);

        String getQuery();

        void fetchThumbnailForEntityId(String entityId,int position);
    }
}
