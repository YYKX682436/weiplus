package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class s0 implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120773b;

    public s0(int i17, com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var) {
        this.f120772a = i17;
        this.f120773b = t0Var;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Image load callback triggered for[");
        int i17 = this.f120772a;
        sb6.append(i17);
        sb6.append("] URL: ");
        sb6.append(aVar);
        sb6.append(", resource: ");
        sb6.append(bitmap != null);
        com.tencent.mars.xlog.Log.i("WishEditPanelWidget", sb6.toString());
        pm0.v.X(new com.tencent.mm.plugin.finder.live.wish.widget.r0(bitmap, this.f120773b, i17, aVar));
    }
}
