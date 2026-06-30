package sr2;

/* loaded from: classes5.dex */
public final class i4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f411589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.post.PostMainUIC f411590e;

    public i4(android.view.View view, com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC) {
        this.f411589d = view;
        this.f411590e = postMainUIC;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("after add view  widgetView:");
        android.view.View view = this.f411589d;
        sb6.append(view.getWidth());
        sb6.append(" height:");
        sb6.append(view.getHeight());
        sb6.append("  mediaViewContainer:");
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = this.f411590e;
        android.view.ViewGroup viewGroup = postMainUIC.f122514f;
        if (viewGroup == null) {
            kotlin.jvm.internal.o.o("mediaViewContainer");
            throw null;
        }
        sb6.append(viewGroup.getWidth());
        sb6.append(" height:");
        android.view.ViewGroup viewGroup2 = postMainUIC.f122514f;
        if (viewGroup2 == null) {
            kotlin.jvm.internal.o.o("mediaViewContainer");
            throw null;
        }
        sb6.append(viewGroup2.getHeight());
        com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", sb6.toString());
        android.view.ViewGroup viewGroup3 = postMainUIC.f122514f;
        if (viewGroup3 == null) {
            kotlin.jvm.internal.o.o("mediaViewContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup3.getLayoutParams();
        android.widget.FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.FrameLayout.LayoutParams ? (android.widget.FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            android.view.ViewGroup viewGroup4 = postMainUIC.f122514f;
            if (viewGroup4 == null) {
                kotlin.jvm.internal.o.o("mediaViewContainer");
                throw null;
            }
            float dimension = viewGroup4.getResources().getDimension(com.tencent.mm.R.dimen.f479706d1);
            com.tencent.mars.xlog.Log.i("Finder.FinderPostUI", "topMargin:" + dimension + " originMargin:" + layoutParams2.topMargin);
            if (java.lang.Math.abs(layoutParams2.topMargin - dimension) <= 5.0f || ((java.lang.Boolean) com.tencent.mm.plugin.finder.storage.ad0.f126402a.a().r()).booleanValue()) {
                return;
            }
            layoutParams2.topMargin = (int) dimension;
            android.view.ViewGroup viewGroup5 = postMainUIC.f122514f;
            if (viewGroup5 != null) {
                viewGroup5.setLayoutParams(layoutParams2);
            } else {
                kotlin.jvm.internal.o.o("mediaViewContainer");
                throw null;
            }
        }
    }
}
