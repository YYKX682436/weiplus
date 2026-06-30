package im;

/* loaded from: classes12.dex */
public final class i extends im.g {
    @Override // im.g
    public void a(com.tencent.mm.storage.f9 msg, com.tencent.mm.autogen.mmdata.rpt.AndroidSendMsgFailStruct struct) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(struct, "struct");
        jz5.g gVar = im.m.f292159d;
        jz5.o oVar = (jz5.o) ((java.util.HashMap) ((jz5.n) im.m.f292159d).getValue()).get(java.lang.Long.valueOf(msg.getMsgId()));
        if (oVar != null) {
            struct.f55082i = ((java.lang.Number) oVar.f302842e).intValue();
            struct.f55083j = struct.b("ErrMsg", "errType:" + ((java.lang.Number) oVar.f302841d).intValue() + " errMsg:" + ((java.lang.String) oVar.f302843f), true);
        }
        w11.a0 a0Var = w11.a0.f441966a;
        jz5.o oVar2 = (jz5.o) ((java.util.LinkedHashMap) w11.a0.f441967b).get(new com.tencent.mm.plugin.msg.MsgIdTalker(msg.getMsgId(), msg.Q0()));
        if (oVar2 != null) {
            struct.f55082i = ((java.lang.Number) oVar2.f302842e).intValue();
            struct.f55083j = struct.b("ErrMsg", "errType:" + ((java.lang.Number) oVar2.f302841d).intValue() + " errMsg:" + ((java.lang.String) oVar2.f302843f), true);
        }
    }

    @Override // im.g
    public boolean b(com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return msg.getType() == 1;
    }
}
