package pf5;

/* loaded from: classes5.dex */
public abstract class p extends pf5.b0 {
    public <T extends android.view.View> T findViewById(int i17) {
        android.view.View findViewIdRootView = getFindViewIdRootView();
        return findViewIdRootView != null ? (T) findViewIdRootView.findViewById(i17) : (T) findViewByIdByActivity(i17);
    }

    public abstract android.view.View findViewByIdByActivity(int i17);

    public abstract android.view.View getFindViewIdRootView();
}
