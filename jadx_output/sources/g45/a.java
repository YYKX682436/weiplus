package g45;

/* loaded from: classes9.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final void a(java.lang.String userName, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(userName, "userName");
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (com.tencent.mm.storage.z3.R4(userName)) {
            ((qg5.a) ((ct.p2) i95.n0.c(ct.p2.class))).getClass();
            java.util.HashMap a17 = com.tencent.mm.ui.i1.a(str);
            if (a17 != null) {
                if (w11.t1.a(userName)) {
                    w11.r1 b17 = w11.s1.b(userName, null, 2, null);
                    b17.e(str);
                    b17.h(c01.e2.C(userName));
                    b17.f442131f = 1;
                    b17.f442133h = a17;
                    w11.r1.d(b17, null, 1, null);
                    return;
                }
                w11.r1 b18 = w11.s1.b(userName, null, 2, null);
                b18.g(userName);
                b18.e(str);
                b18.h(c01.e2.C(userName));
                b18.f442131f = 1;
                b18.f442133h = a17;
                b18.f442134i = 5;
                b18.a().a();
                return;
            }
        }
        com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
        am.mt mtVar = sendMsgEvent.f54752g;
        mtVar.f7362a = userName;
        mtVar.f7363b = str;
        mtVar.f7364c = c01.e2.C(userName);
        mtVar.f7365d = i17;
        sendMsgEvent.e();
    }

    public final oi3.g b(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        int type = msgInfo.getType() & 65535;
        int i17 = 0;
        if (type == 49) {
            l15.c cVar = new l15.c();
            java.lang.String U1 = msgInfo.U1();
            if (U1 == null) {
                U1 = "";
            }
            cVar.fromXml(U1, true);
            v05.b k17 = cVar.k();
            if (k17 != null) {
                i17 = k17.getInteger(k17.f368365d + 6);
            }
        }
        oi3.g gVar = new oi3.g();
        int i18 = gVar.f345617d;
        gVar.set(i18 + 4, java.lang.Integer.valueOf(type));
        gVar.set(i18 + 5, java.lang.Integer.valueOf(i17));
        java.lang.String V1 = msgInfo.V1();
        if (V1 == null) {
            V1 = "";
        }
        gVar.set(i18 + 11, V1);
        java.lang.String Q0 = msgInfo.Q0();
        kotlin.jvm.internal.o.f(Q0, "getTalker(...)");
        gVar.set(i18 + 3, Q0);
        gVar.set(i18 + 2, java.lang.Long.valueOf(msgInfo.getCreateTime()));
        gVar.set(i18 + 0, java.lang.Long.valueOf(msgInfo.getMsgId()));
        gVar.set(i18 + 1, java.lang.Long.valueOf(msgInfo.I0()));
        gVar.set(i18 + 7, java.lang.Integer.valueOf(msgInfo.P0()));
        java.lang.String str = msgInfo.G;
        if (str == null) {
            str = "";
        }
        gVar.set(i18 + 12, str);
        java.lang.String U12 = msgInfo.U1();
        gVar.set(i18 + 13, U12 != null ? U12 : "");
        gVar.set(i18 + 10, java.lang.Integer.valueOf(msgInfo.w0()));
        gVar.set(i18 + 9, java.lang.Integer.valueOf(msgInfo.A0()));
        return gVar;
    }
}
