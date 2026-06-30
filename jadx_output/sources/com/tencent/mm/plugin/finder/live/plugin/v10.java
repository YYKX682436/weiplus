package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class v10 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z10 f114635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f114636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.ov2 f114637f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(com.tencent.mm.plugin.finder.live.plugin.z10 z10Var, r45.h32 h32Var, r45.ov2 ov2Var) {
        super(1);
        this.f114635d = z10Var;
        this.f114636e = h32Var;
        this.f114637f = ov2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.view.dd couponCallback = (com.tencent.mm.plugin.finder.view.dd) obj;
        kotlin.jvm.internal.o.g(couponCallback, "couponCallback");
        com.tencent.mm.plugin.finder.live.plugin.z10 z10Var = this.f114635d;
        if (z10Var.f115268t) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            java.lang.String string = this.f114636e.getString(4);
            java.lang.String string2 = this.f114637f.getString(1);
            r0Var.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ml2.f4 f4Var = ml2.f4.f327431e;
            jSONObject.put("commerceAction", 1014);
            if (string == null) {
                string = "";
            }
            jSONObject.put("noticeid", string);
            if (string2 == null) {
                string2 = "";
            }
            jSONObject.put("coupon_id", string2);
            ml2.r0.hj(r0Var, ml2.b4.f327264s, java.lang.String.valueOf(jSONObject), 0L, null, null, null, null, null, 252, null);
        }
        r45.ov2 ov2Var = couponCallback.f131889a;
        r45.l1 l1Var = (r45.l1) ov2Var.getCustom(19);
        if (l1Var != null) {
            com.tencent.mm.plugin.finder.assist.a.b(l1Var);
        }
        r45.h32 h32Var = z10Var.f115266r;
        if (h32Var != null) {
            zl2.t.f(h32Var, ov2Var);
        }
        z10Var.c();
        return jz5.f0.f302826a;
    }
}
