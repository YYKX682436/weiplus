package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class y4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.d5 f117543d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f117544e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(com.tencent.mm.plugin.finder.live.viewmodel.d5 d5Var, int i17) {
        super(0);
        this.f117543d = d5Var;
        this.f117544e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f117543d.f117032i = true;
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_TEST_MODE_GUIDE_TIMESTAMP_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_TEST_MODE_GUIDE_COUNT_INT_SYNC, java.lang.Integer.valueOf(this.f117544e + 1));
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 78L, jSONObject.toString(), null, 4, null);
        return jz5.f0.f302826a;
    }
}
