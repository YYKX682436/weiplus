package com.tencent.mm.sns_compose.page;

/* loaded from: classes14.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f193482d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q85.g f193483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f193484f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(yz5.a aVar, q85.g gVar, n0.e5 e5Var) {
        super(3);
        this.f193482d = aVar;
        this.f193483e = gVar;
        this.f193484f = e5Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        d0.z MediaContent = (d0.z) obj;
        n0.o oVar = (n0.o) obj2;
        int intValue = ((java.lang.Number) obj3).intValue();
        kotlin.jvm.internal.o.g(MediaContent, "$this$MediaContent");
        if ((intValue & 14) == 0) {
            intValue |= ((n0.y0) oVar).e(MediaContent) ? 4 : 2;
        }
        if ((intValue & 91) == 18) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        java.lang.Object obj4 = n0.e1.f333492a;
        z0.p pVar = z0.p.f468921d;
        q85.k.a(a0.d0.d(d0.a3.g(pVar, i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.aa9))), false, null, null, this.f193482d, 7, null), this.f193483e, oVar, 64, 0);
        if (!((java.lang.Boolean) this.f193484f.getValue()).booleanValue()) {
            a0.q1.a(rz0.a.d(com.tencent.mm.R.raw.shortvideo_play_btn, oVar, 0), "play video", MediaContent.a(pVar, z0.a.f468893e), null, null, 0.0f, null, oVar, 56, 120);
        }
        return jz5.f0.f302826a;
    }
}
