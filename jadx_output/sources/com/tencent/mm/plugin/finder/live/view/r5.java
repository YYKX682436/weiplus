package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class r5 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f116629a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f116630b;

    public r5(int i17, r45.xn1 xn1Var) {
        this.f116629a = i17;
        this.f116630b = xn1Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            jSONObject.put("list_order", this.f116629a);
            r45.xn1 xn1Var = this.f116630b;
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
            jSONObject.put("user_useranme", finderContact != null ? finderContact.getUsername() : null);
            jSONObject.put("user_identity", xn1Var.getInteger(7));
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.S1, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
    }
}
