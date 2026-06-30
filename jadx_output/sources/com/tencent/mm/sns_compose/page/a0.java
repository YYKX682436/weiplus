package com.tencent.mm.sns_compose.page;

/* loaded from: classes14.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193427d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.String str) {
        super(2);
        this.f193427d = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj3 = n0.e1.f333492a;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        long b17 = rz0.a.b(com.tencent.mm.R.color.BW_0_Alpha_0_9, context);
        float f17 = 8;
        long z17 = ((p2.f) ((n0.y0) oVar).i(androidx.compose.ui.platform.m2.f10646e)).z(((float) 2.5d) * f17);
        int i17 = z0.t.f468922q1;
        tz0.x.b(this.f193427d, d0.a2.g(z0.p.f468921d, ((float) 1.5d) * f17, 3 * f17), b17, z17, null, null, null, 0L, null, null, 0L, 2, false, 2, null, null, oVar, com.tencent.mm.boot.BuildConfig.VERSION_CODE, com.tencent.mm.boot.BuildConfig.VERSION_CODE, 55280);
        return jz5.f0.f302826a;
    }
}
