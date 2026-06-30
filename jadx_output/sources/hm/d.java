package hm;

/* loaded from: classes12.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f282144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msg.MsgIdTalker f282145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hm.f f282146f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker, hm.f fVar) {
        super(0);
        this.f282144d = f9Var;
        this.f282145e = msgIdTalker;
        this.f282146f = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.storage.f9 f9Var = this.f282144d;
        if (f9Var == null) {
            com.tencent.mm.plugin.msg.MsgIdTalker msgIdTalker = this.f282145e;
            f9Var = msgIdTalker != null ? pt0.f0.f358209b1.k(msgIdTalker.a(), msgIdTalker.f149480d) : null;
        }
        if (f9Var != null) {
            hm.f fVar = this.f282146f;
            if (((java.util.HashSet) ((jz5.n) fVar.f282150g).getValue()).add(java.lang.Long.valueOf(f9Var.getMsgId()))) {
                com.tencent.mm.autogen.mmdata.rpt.AndroidSendMsgFailStruct androidSendMsgFailStruct = new com.tencent.mm.autogen.mmdata.rpt.AndroidSendMsgFailStruct();
                for (im.g gVar : kz5.c0.i(new im.b(), new im.i(), new im.a(), new im.h())) {
                    if (gVar.b(f9Var)) {
                        gVar.a(f9Var, androidSendMsgFailStruct);
                    }
                }
                pi3.a aVar = (pi3.a) fVar.T6().get(new com.tencent.mm.plugin.msg.MsgIdTalker(f9Var.getMsgId(), f9Var.Q0()).toString());
                if (aVar != null) {
                    if (aVar.k() == 1) {
                        androidSendMsgFailStruct.f55082i = -99999;
                    } else if (aVar.getErrCode() == 0) {
                        androidSendMsgFailStruct.f55082i = aVar.j();
                    } else {
                        androidSendMsgFailStruct.f55082i = aVar.getErrCode();
                    }
                    androidSendMsgFailStruct.f55083j = androidSendMsgFailStruct.b("ErrMsg", aVar.getErrMsg(), true);
                }
                androidSendMsgFailStruct.f55086m = 2;
                androidSendMsgFailStruct.k();
                androidSendMsgFailStruct.o();
            }
        }
        return jz5.f0.f302826a;
    }
}
