package jn2;

/* loaded from: classes10.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f300618d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f300619e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(jn2.z1 z1Var, jn2.r1 r1Var) {
        super(2);
        this.f300618d = z1Var;
        this.f300619e = r1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.ay1 ay1Var;
        int intValue = ((java.lang.Number) obj).intValue();
        r45.z22 songInfo = (r45.z22) obj2;
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        jn2.z1 z1Var = this.f300618d;
        java.lang.String str = z1Var.f300768g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("singButtonClickListener: pos=");
        sb6.append(intValue);
        sb6.append(", song=");
        r45.by1 by1Var = songInfo.f391631h;
        sb6.append((by1Var == null || (ay1Var = by1Var.f371143d) == null) ? null : ay1Var.f370351e);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        r45.ay1 ay1Var2 = songInfo.f391631h.f371143d;
        jn2.r1 r1Var = this.f300619e;
        if (ay1Var2 != null) {
            sf2.x xVar = r1Var.I;
            xVar.getClass();
            te2.a9.f(te2.a9.f417883a, xVar.h7(), 8, kz5.b0.c(ay1Var2), null, 8, null);
        }
        z1Var.B(songInfo.f391629f);
        sf2.e1 e1Var = (sf2.e1) r1Var.I.controller(sf2.e1.class);
        if (e1Var != null) {
            sf2.e1.m7(e1Var, songInfo, false, false, false, null, 22, null);
        }
        return jz5.f0.f302826a;
    }
}
