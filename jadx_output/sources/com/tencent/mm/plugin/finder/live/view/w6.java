package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class w6 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f116772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView f116773b;

    public w6(android.widget.ImageView imageView, com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView) {
        this.f116772a = imageView;
        this.f116773b = finderLiveMiniView;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        wu5.c cVar;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            android.widget.ImageView imageView = this.f116772a;
            com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView = this.f116773b;
            ku5.u0 u0Var = ku5.t0.f312615d;
            com.tencent.mm.plugin.finder.live.view.v6 v6Var = new com.tencent.mm.plugin.finder.live.view.v6(bitmap, imageView, finderLiveMiniView);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            cVar = t0Var.k(v6Var, 0L);
        } else {
            cVar = null;
        }
        if (cVar == null) {
            com.tencent.mars.xlog.Log.i(this.f116773b.getTAG(), "loadBackgroundImage resource is empty!");
        }
    }
}
