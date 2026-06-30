package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class tq extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f119900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f119901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.wq f119902f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(int i17, r45.h32 h32Var, com.tencent.mm.plugin.finder.live.widget.wq wqVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119900d = i17;
        this.f119901e = h32Var;
        this.f119902f = wqVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.tq(this.f119900d, this.f119901e, this.f119902f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.widget.tq tqVar = (com.tencent.mm.plugin.finder.live.widget.tq) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        tqVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.h32 h32Var = this.f119901e;
        if (this.f119900d != h32Var.getInteger(18)) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", "3");
            jSONObject.put("notice_id", java.lang.String.valueOf(h32Var.getString(4)));
            jSONObject.put("notice_send_type", java.lang.String.valueOf(h32Var.getInteger(18)));
            zy2.zb.j5(zbVar, 51L, jSONObject.toString(), null, 4, null);
        }
        this.f119902f.e0();
        return jz5.f0.f302826a;
    }
}
