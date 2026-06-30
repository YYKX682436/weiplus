package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class s40 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f114219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cm2.d0 f114220e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.z40 f114221f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s40(xg2.h hVar, kotlin.coroutines.Continuation continuation, cm2.d0 d0Var, com.tencent.mm.plugin.finder.live.plugin.z40 z40Var) {
        super(2, continuation);
        this.f114219d = hVar;
        this.f114220e = d0Var;
        this.f114221f = z40Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.s40(this.f114219d, continuation, this.f114220e, this.f114221f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.s40 s40Var = (com.tencent.mm.plugin.finder.live.plugin.s40) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        s40Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        cm2.d0 d0Var = this.f114220e;
        r45.v42 v42Var = d0Var.f43335v;
        v42Var.set(4, java.lang.Integer.valueOf(v42Var.getInteger(4) == 0 ? 1 : 0));
        int integer = d0Var.f43335v.getInteger(4);
        com.tencent.mm.plugin.finder.live.plugin.z40 z40Var = this.f114221f;
        if (integer == 1) {
            android.content.Context context = z40Var.f115281d;
            db5.t7.m(context, context.getString(com.tencent.mm.R.string.e8l));
        }
        z40Var.a(d0Var);
        z40Var.getClass();
        r45.qc2 qc2Var = new r45.qc2();
        qc2Var.set(0, java.lang.Long.valueOf(d0Var.f43385d));
        qc2Var.set(1, d0Var.f43386e);
        r45.v42 v42Var2 = d0Var.f43335v;
        qc2Var.set(2, new com.tencent.mm.protobuf.g(v42Var2.toByteArray()));
        qc2Var.set(3, java.lang.Boolean.valueOf(v42Var2.getInteger(4) == 1));
        qc2Var.set(4, d0Var.f43396r);
        qc2Var.set(5, ((mm2.f6) z40Var.f115282e.a(mm2.f6.class)).N);
        com.tencent.mars.xlog.Log.i(z40Var.f115285h, "[updateSyncExtra]  hidden_state = " + qc2Var.getBoolean(3) + ", extBUf = " + qc2Var.getByteString(1) + ", current_promoting_id = " + qc2Var.getLong(0));
        dk2.ef.f233392k.h(10, qc2Var);
        return jz5.f0.f302826a;
    }
}
