package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes8.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.p f129180d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.j5 f129181e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f129182f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.tencent.mm.plugin.finder.ui.fav.p pVar, so2.j5 j5Var, long j17) {
        super(1);
        this.f129180d = pVar;
        this.f129181e = j5Var;
        this.f129182f = j17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("is_from_finder", 1);
        z30.u uVar = (z30.u) i95.n0.c(z30.u.class);
        java.lang.String y17 = this.f129180d.y(this.f129181e, this.f129182f);
        java.lang.String jSONObject2 = jSONObject.toString();
        ((y30.q) uVar).getClass();
        ((a82.s0) ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).mj()).T6(y17, jSONObject2, null);
        return jz5.f0.f302826a;
    }
}
