package x2;

/* loaded from: classes13.dex */
public class b implements android.view.ViewGroup.OnHierarchyChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout f451476d;

    public b(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout) {
        this.f451476d = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(android.view.View view, android.view.View view2) {
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f451476d.f11002v;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(android.view.View view, android.view.View view2) {
        androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = this.f451476d;
        coordinatorLayout.r(2);
        android.view.ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = coordinatorLayout.f11002v;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
