package oj5;

/* loaded from: classes14.dex */
public final class d implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f345838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oj5.r f345839e;

    public d(android.view.View view, oj5.r rVar) {
        this.f345838d = view;
        this.f345839e = rVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.f345838d.removeOnAttachStateChangeListener(this);
        oj5.r rVar = this.f345839e;
        java.lang.String str = rVar.f345879b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doOnAttach] ");
        androidx.recyclerview.widget.RecyclerView recyclerView = rVar.f345878a;
        sb6.append(recyclerView.getContext());
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        recyclerView.setRecycledViewPool(rVar.f345883f);
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return;
        }
        layoutManager.setItemPrefetchEnabled(false);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
    }
}
