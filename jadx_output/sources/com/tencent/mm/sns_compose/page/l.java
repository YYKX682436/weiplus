package com.tencent.mm.sns_compose.page;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f193520d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f193521e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f193522f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String str, yz5.a aVar, boolean z17) {
        super(3);
        this.f193520d = str;
        this.f193521e = aVar;
        this.f193522f = z17;
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
        u5.s a17 = q85.d.a(this.f193520d, oVar, 0);
        int i17 = s1.p.f402054a;
        s1.p pVar = s1.o.f402044a;
        int i18 = z0.t.f468922q1;
        z0.p pVar2 = z0.p.f468921d;
        a0.q1.a(a17, "image", a0.d0.d(d0.a3.e(pVar2, 0.0f, 1, null), false, null, null, this.f193521e, 7, null), null, pVar, 0.0f, null, oVar, 24624, 104);
        if (this.f193522f) {
            h1.c d17 = rz0.a.d(com.tencent.mm.R.raw.shortvideo_play_btn, oVar, 0);
            int i19 = z0.d.f468903a;
            a0.q1.a(d17, "play button", MediaContent.a(pVar2, z0.a.f468893e), null, null, 0.0f, null, oVar, 56, 120);
        }
        return jz5.f0.f302826a;
    }
}
