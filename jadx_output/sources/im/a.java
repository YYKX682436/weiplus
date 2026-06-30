package im;

/* loaded from: classes12.dex */
public final class a extends im.g {
    @Override // im.g
    public void a(com.tencent.mm.storage.f9 msg, com.tencent.mm.autogen.mmdata.rpt.AndroidSendMsgFailStruct struct) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(struct, "struct");
        java.lang.String j17 = msg.j();
        r05.k kVar = new r05.k();
        kotlin.jvm.internal.o.d(j17);
        kVar.fromXml(j17, true);
        struct.f55079f = kVar.getInteger(kVar.f368365d + 6);
        struct.f55078e = 49L;
        bu.b bVar = (bu.b) ((java.util.LinkedHashMap) bu.a.f24473a).get(java.lang.Long.valueOf(msg.getMsgId()));
        if (bVar == null) {
            bVar = new bu.b();
        }
        struct.f55082i = bVar.f24474a;
        struct.f55083j = struct.b("ErrMsg", r26.i0.v(bVar.f24475b, ",", ";", false, 4, null), true);
    }

    @Override // im.g
    public boolean b(com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return msg.k2();
    }
}
