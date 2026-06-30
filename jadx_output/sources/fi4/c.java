package fi4;

/* loaded from: classes9.dex */
public final class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f263064d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f263065e;

    public c(hi4.e item) {
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4290;
        lVar.f70666c = "/cgi-bin/micromsg-bin/textstatusprivatechatsend";
        lVar.f70664a = new pj4.i2();
        lVar.f70665b = new pj4.j2();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f263065e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusPrivateChatSendReq");
        pj4.i2 i2Var = (pj4.i2) fVar;
        i2Var.f355116d = item.field_tag;
        i2Var.f355117e = item.field_source_id;
        i2Var.f355118f = item.field_card_key;
        i2Var.f355119g = item.field_status_id;
        i2Var.f355120h = item.field_modify_count;
        i2Var.f355121i = item.field_encUsername;
        i2Var.f355122m = item.field_hash_username;
        i2Var.f355124o = item.field_session_id;
        i2Var.f355123n = com.tencent.mm.sdk.platformtools.w2.a(c01.z1.r()) + i2Var.f355124o + item.field_newMsgId + '_' + c01.id.a() + "_greetingReply";
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f263064d = callback;
        return dispatch(dispatcher, this.f263065e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4290;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusPrivateChatSend", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f263065e.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusPrivateChatSendResp");
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f263064d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
