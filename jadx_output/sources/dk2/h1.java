package dk2;

/* loaded from: classes3.dex */
public final class h1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f233548a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233549b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f233550c;

    public h1(dk2.r4 r4Var, java.lang.String str, yz5.p pVar) {
        this.f233548a = r4Var;
        this.f233549b = str;
        this.f233550c = pVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap;
        r45.xn1 xn1Var;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2;
        r45.xn1 xn1Var2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = 0;
        boolean z17 = fVar.f70615a == 0 && fVar.f70616b == 0;
        dk2.r4 r4Var = this.f233548a;
        java.lang.String str = r4Var.f234009d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doGetFinderLiveContact success:");
        sb6.append(z17);
        sb6.append(" username:");
        java.lang.String str2 = this.f233549b;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (z17) {
            gk2.e eVar = r4Var.f234007b;
            if (eVar != null && (concurrentHashMap2 = ((mm2.c1) eVar.a(mm2.c1.class)).f328780b2) != null) {
                r45.bs1 bs1Var = (r45.bs1) fVar.f70618d;
                concurrentHashMap2.put(str2, java.lang.Boolean.valueOf(pm0.v.z((bs1Var == null || (xn1Var2 = (r45.xn1) bs1Var.getCustom(1)) == null) ? 0 : xn1Var2.getInteger(2), 1)));
            }
            if (eVar != null && (concurrentHashMap = ((mm2.c1) eVar.a(mm2.c1.class)).f328785c2) != null) {
                r45.bs1 bs1Var2 = (r45.bs1) fVar.f70618d;
                if (bs1Var2 != null && (xn1Var = (r45.xn1) bs1Var2.getCustom(1)) != null) {
                    i17 = xn1Var.getInteger(2);
                }
                concurrentHashMap.put(str2, java.lang.Boolean.valueOf(pm0.v.z(i17, 2)));
            }
        }
        yz5.p pVar = this.f233550c;
        if (pVar == null) {
            return null;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        r45.bs1 bs1Var3 = (r45.bs1) fVar.f70618d;
        pVar.invoke(valueOf, bs1Var3 != null ? (r45.xn1) bs1Var3.getCustom(1) : null);
        return jz5.f0.f302826a;
    }
}
