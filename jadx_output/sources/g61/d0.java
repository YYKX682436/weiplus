package g61;

/* loaded from: classes9.dex */
public class d0 extends com.tencent.mm.sdk.event.n {
    public d0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ReceiveAANewXmlEvent receiveAANewXmlEvent = (com.tencent.mm.autogen.events.ReceiveAANewXmlEvent) iEvent;
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = java.lang.Boolean.valueOf(receiveAANewXmlEvent.f54651g.f7921b == null);
        objArr[1] = java.lang.Integer.valueOf(receiveAANewXmlEvent.f54651g.f7920a);
        am.sp spVar = receiveAANewXmlEvent.f54651g;
        objArr[2] = spVar.f7922c;
        objArr[3] = spVar.f7923d;
        objArr[4] = spVar.f7924e;
        com.tencent.mars.xlog.Log.i("ReceiveAANewXmlEventListener", "receiveAANewXmlEventListener, content==null: %s, type: %s, fromUser: %s, toUser: %s, paymsgid: %s", objArr);
        am.sp spVar2 = receiveAANewXmlEvent.f54651g;
        int i17 = spVar2.f7920a;
        if (i17 == 18) {
            h61.o.c(spVar2.f7921b, spVar2.f7923d, receiveAANewXmlEvent);
        } else if (i17 == 19) {
            java.lang.String str = spVar2.f7921b;
            java.lang.String str2 = spVar2.f7923d;
            java.lang.String str3 = spVar2.f7924e;
            synchronized (h61.o.class) {
                try {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(str) && !com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, chatroom: %s, payMsgId: %s", str2, str3);
                        java.lang.String replace = str.replace("\"#037AFF\"", "\"" + (com.tencent.mm.ui.bk.C() ? "#7D90A9" : "#576B95") + "\"");
                        j61.a y07 = e61.e.Bi().y0(str3);
                        if (y07 != null && y07.field_insertmsg) {
                            com.tencent.mm.storage.f9 Li = pt0.f0.Li(y07.field_chatroom, y07.field_msgId);
                            com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, update old one, msgId: %s, dbMsginfo.id: %s", java.lang.Long.valueOf(y07.field_msgId), java.lang.Long.valueOf(Li.getMsgId()));
                            Li.d1(replace);
                            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(y07.field_msgId, Li, true);
                        }
                        com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "checkIfInsertPaySysMsg, insert new msg");
                        h61.o.n(replace, str2, y07, str3, false);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AAUtil", "checkIfInsertPaySysMsg error: %s", e17.getMessage());
                }
            }
        } else if (i17 == 21) {
            java.lang.String str4 = spVar2.f7921b;
            java.lang.String str5 = spVar2.f7923d;
            java.lang.String str6 = spVar2.f7924e;
            com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "insertUrgePaySysMsg, toUser: %s, paymsgid: %s", str5, str6);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                j61.a y08 = e61.e.Bi().y0(str6);
                if (y08 == null || !y08.field_insertmsg) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "insert new urge msg");
                    h61.o.n(str4, str5, y08, str6, true);
                } else {
                    com.tencent.mm.storage.f9 Li2 = pt0.f0.Li(y08.field_chatroom, y08.field_msgId);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "update old one, msgId: %s, dbMsginfo.id: %s", java.lang.Long.valueOf(y08.field_msgId), java.lang.Long.valueOf(Li2.getMsgId()));
                    Li2.d1(str4);
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(y08.field_msgId, Li2, true);
                }
            }
        }
        return false;
    }
}
