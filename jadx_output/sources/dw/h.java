package dw;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final dw.h f244077a = new dw.h();

    public final java.lang.String a(com.tencent.mm.storage.f9 msgInfo) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        java.util.Map map = null;
        ot0.q qVar = null;
        str = "";
        if (msgInfo.getType() == 436207665) {
            try {
                qVar = ot0.q.v(msgInfo.j());
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BrandEcsMsgDigestLogic", e17, "BrandEcsMsgDigestLogic parseDigestForTypePayC2CNoticeMsg failed", new java.lang.Object[0]);
            }
            if (qVar == null) {
                return "";
            }
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String Q0 = msgInfo.Q0();
            ((sg3.a) v0Var).getClass();
            java.lang.String b17 = c01.a2.b(Q0);
            java.lang.String str4 = "[" + qVar.f348692o1 + "] " + qVar.f348676k1;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(b17);
            sb6.append(':');
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb6.append(str4 != null ? str4 : "");
            return sb6.toString();
        }
        if (msgInfo.getType() == -1879048173) {
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(msgInfo.j(), "msg", null);
            if (d17 == null) {
                return "";
            }
            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String Q02 = msgInfo.Q0();
            ((sg3.a) v0Var2).getClass();
            java.lang.String b18 = c01.a2.b(Q02);
            try {
                java.lang.String str5 = (java.lang.String) d17.get(".msg.brandecsmsg.version");
                java.lang.String str6 = (java.lang.String) d17.get(".msg.brandecsmsg.digest");
                if (str5 != null) {
                    if (kotlin.jvm.internal.o.b(str5, "1") && str6 != null) {
                        try {
                            byte[] decode = android.util.Base64.decode(str6, 2);
                            kotlin.jvm.internal.o.f(decode, "decode(...)");
                            str6 = new java.lang.String(decode, r26.c.f368865a);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                }
                if (str6 != null) {
                    str = str6;
                }
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.BrandEcsMsgDigestLogic", e18, "BrandEcsMsgDigestLogic getFinalDigest failed", new java.lang.Object[0]);
            }
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(b18);
            sb7.append(':');
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            sb7.append(str);
            return sb7.toString();
        }
        if (msgInfo.a3() || msgInfo.b3() || msgInfo.J2()) {
            dw.g gVar = new dw.g(msgInfo);
            if (msgInfo.b3() || msgInfo.J2()) {
                map = uw.f.f431490a.a(uw.e.f431487e, msgInfo);
                str2 = ".msgsource.notify_msg.";
            } else if (msgInfo.getType() == 318767153) {
                map = uw.f.f431490a.a(uw.e.f431486d, msgInfo);
                str2 = ".msg.appmsg.mmreader.notify_msg.";
            } else {
                str2 = "";
            }
            if (map == null || (str3 = (java.lang.String) map.get(str2.concat("box_digest"))) == null) {
                str3 = "";
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str3) && msgInfo.a3()) {
                str3 = (java.lang.String) gVar.invoke();
            }
        } else {
            str3 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            str3 = b(msgInfo);
        }
        tg3.v0 v0Var3 = (tg3.v0) i95.n0.c(tg3.v0.class);
        java.lang.String Q03 = msgInfo.Q0();
        ((sg3.a) v0Var3).getClass();
        java.lang.String b19 = c01.a2.b(Q03);
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
        sb8.append(b19);
        sb8.append(':');
        sb8.append(str3 != null ? str3 : "");
        return sb8.toString();
    }

    public final java.lang.String b(com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        if ((Di != null ? Di.w() : null) == null) {
            return "";
        }
        com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
        com.tencent.mm.pointers.PString pString2 = new com.tencent.mm.pointers.PString();
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        msgInfo.d1(msgInfo.Q0() + ':' + msgInfo.j());
        qm.a0.d(msgInfo, pString, pString2, pInt, true);
        java.lang.String str = pString.value;
        if (str == null || str.length() == 0) {
            kotlin.jvm.internal.o.d(str);
            return str;
        }
        kotlin.jvm.internal.o.d(str);
        java.lang.String substring = str.substring(r26.n0.L(str, ":", 0, false, 6, null) + 1);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        return substring;
    }
}
