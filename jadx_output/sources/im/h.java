package im;

/* loaded from: classes12.dex */
public final class h extends im.g {
    @Override // im.g
    public void a(com.tencent.mm.storage.f9 msg, com.tencent.mm.autogen.mmdata.rpt.AndroidSendMsgFailStruct struct) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(struct, "struct");
        long msgId = msg.getMsgId();
        if (((oi3.d) ((java.util.LinkedHashMap) oi3.c.f345614a).get(java.lang.Long.valueOf(msgId))) != null) {
            struct.f55082i = 0;
            struct.f55083j = struct.b("ErrMsg", r26.i0.t("", ",", ";", false), true);
        }
    }

    @Override // im.g
    public boolean b(com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return msg.getType() == 3;
    }
}
