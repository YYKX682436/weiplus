package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes10.dex */
public final class x0 implements r35.r3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vp2.n f122020a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f122021b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a1 f122022c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f122023d;

    public x0(vp2.n nVar, kotlin.jvm.internal.h0 h0Var, com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.a1 a1Var, android.widget.ImageView imageView) {
        this.f122020a = nVar;
        this.f122021b = h0Var;
        this.f122022c = a1Var;
        this.f122023d = imageView;
    }

    public boolean a(android.graphics.Bitmap bitmap) {
        pv.j0 j0Var = (pv.j0) i95.n0.c(pv.j0.class);
        com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.w0 w0Var = new com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.w0(this.f122020a, this.f122021b, this.f122022c, this.f122023d);
        ((ov.p0) j0Var).getClass();
        java.lang.Boolean bool = qp1.w.f365755a;
        if (bitmap != null && !bitmap.isRecycled()) {
            new i4.f(bitmap).a(new qp1.z(w0Var, 0));
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallUtil", "getPrimaryColor, bitmap is null");
        w0Var.a(0);
        return true;
    }

    @Override // r35.q3
    public void onFinish() {
    }

    @Override // r35.q3
    public void onStart() {
    }
}
