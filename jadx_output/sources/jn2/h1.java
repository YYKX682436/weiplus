package jn2;

/* loaded from: classes10.dex */
public final class h1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f300626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f300627e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(jn2.z1 z1Var, jn2.r1 r1Var) {
        super(2);
        this.f300626d = z1Var;
        this.f300627e = r1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        r45.ay1 ay1Var;
        int intValue = ((java.lang.Number) obj).intValue();
        r45.z22 songInfo = (r45.z22) obj2;
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        jn2.z1 z1Var = this.f300626d;
        java.lang.String str = z1Var.f300768g;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("endClickListener: pos=");
        sb6.append(intValue);
        sb6.append(", song=");
        r45.by1 by1Var = songInfo.f391631h;
        sb6.append((by1Var == null || (ay1Var = by1Var.f371143d) == null) ? null : ay1Var.f370351e);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        z1Var.B(null);
        sf2.e1 e1Var = (sf2.e1) this.f300627e.I.controller(sf2.e1.class);
        if (e1Var != null) {
            sf2.e1.m7(e1Var, null, false, false, false, null, 30, null);
        }
        return jz5.f0.f302826a;
    }
}
