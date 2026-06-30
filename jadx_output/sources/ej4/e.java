package ej4;

/* loaded from: classes4.dex */
public final class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f253340d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f253341e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f253342f;

    /* renamed from: g, reason: collision with root package name */
    public pj4.e1 f253343g;

    public e(long j17, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.Integer num) {
        this.f253340d = num;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4255;
        lVar.f70666c = "/cgi-bin/micromsg-bin/textstatusgeticonconfig";
        lVar.f70664a = new pj4.d1();
        lVar.f70665b = new pj4.e1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f253342f = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetIconConfigReq");
        pj4.d1 d1Var = (pj4.d1) fVar;
        d1Var.f355019d = j17;
        d1Var.f355020e = l17 != null ? l17.longValue() : 0L;
        d1Var.f355021f = l18 != null ? l18.longValue() : 0L;
        pj4.h0 h0Var = new pj4.h0();
        h0Var.f355078d = "weapp_panel";
        h0Var.f355079e = l19 != null ? l19.longValue() : 0L;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(h0Var);
        d1Var.f355023h = linkedList;
        d1Var.f355022g = num != null ? num.intValue() : 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetIconConfig", "key:" + j17 + " coverAgendaKey:" + l17 + " keyValueConfigKey:" + l18 + " flag:" + num);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253341e = callback;
        return dispatch(dispatcher, this.f253342f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4255;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetIconConfig", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f253342f.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetIconConfigResp");
            this.f253343g = (pj4.e1) fVar;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f253341e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
