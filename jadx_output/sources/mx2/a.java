package mx2;

/* loaded from: classes2.dex */
public final class a implements androidx.recyclerview.widget.RecyclerView.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderHorizontalViewPager f332479d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.image.FinderImageBanner f332480e;

    public a(com.tencent.mm.plugin.finder.view.FinderHorizontalViewPager finderHorizontalViewPager, com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner) {
        this.f332479d = finderHorizontalViewPager;
        this.f332480e = finderImageBanner;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void R3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        int u07 = this.f332479d.u0(view);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChildViewAttachedToWindow position:");
        sb6.append(u07);
        sb6.append(" focusPosition:");
        com.tencent.mm.plugin.finder.view.image.FinderImageBanner finderImageBanner = this.f332480e;
        sb6.append(finderImageBanner.getFocusPosition());
        sb6.append(" pending:");
        sb6.append(finderImageBanner.B);
        com.tencent.mars.xlog.Log.i("Finder.ImageBanner", sb6.toString());
        if (u07 == finderImageBanner.B) {
            finderImageBanner.p(u07);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a
    public void p3(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
    }
}
