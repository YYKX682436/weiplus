package p24;

/* loaded from: classes.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f351435d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f351436e;

    public e(android.view.View view, int i17) {
        this.f351435d = view;
        this.f351436e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        androidx.recyclerview.widget.f2 adapter;
        android.view.View view = this.f351435d;
        android.view.ViewParent parent = view.getParent();
        androidx.recyclerview.widget.RecyclerView recyclerView = parent instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) parent : null;
        if (recyclerView == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        if (this.f351436e == adapter.getItemCount() - 1) {
            int childCount = recyclerView.getChildCount();
            int i17 = 0;
            for (int i18 = 0; i18 < childCount; i18++) {
                i17 += recyclerView.getChildAt(i18).getHeight();
            }
            int height = recyclerView.getHeight();
            if (i17 < height) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int height2 = view.getHeight() + (height - i17);
                if (layoutParams.height != height2) {
                    layoutParams.height = height2;
                    view.setLayoutParams(layoutParams);
                }
            }
        }
    }
}
