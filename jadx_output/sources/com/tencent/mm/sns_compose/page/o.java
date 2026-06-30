package com.tencent.mm.sns_compose.page;

/* loaded from: classes14.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f193550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.jj4 f193551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f193552f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(yz5.a aVar, r45.jj4 jj4Var, boolean z17) {
        super(3);
        this.f193550d = aVar;
        this.f193551e = jj4Var;
        this.f193552f = z17;
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
        int i17 = z0.t.f468922q1;
        z0.p pVar = z0.p.f468921d;
        com.tencent.mm.sns_compose.page.s0.c(this.f193551e, a0.d0.d(d0.a3.e(pVar, 0.0f, 1, null), false, null, null, this.f193550d, 7, null), true, oVar, 392, 0);
        if (this.f193552f) {
            h1.c d17 = rz0.a.d(com.tencent.mm.R.raw.shortvideo_play_btn, oVar, 0);
            int i18 = z0.d.f468903a;
            a0.q1.a(d17, "play button", MediaContent.a(pVar, z0.a.f468893e), null, null, 0.0f, null, oVar, 56, 120);
        }
        return jz5.f0.f302826a;
    }
}
