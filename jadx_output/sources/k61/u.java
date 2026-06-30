package k61;

/* loaded from: classes9.dex */
public class u implements lm5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k61.w f304517a;

    public u(k61.w wVar) {
        this.f304517a = wVar;
    }

    @Override // lm5.e
    public java.lang.String a() {
        return "Vending.LOGIC";
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String replace;
        nm5.c cVar = (nm5.c) obj;
        k61.p pVar = this.f304517a.f304519a;
        java.lang.String str = (java.lang.String) cVar.a(0);
        boolean z17 = true;
        java.lang.String str2 = (java.lang.String) cVar.a(1);
        java.lang.String str3 = (java.lang.String) cVar.a(2);
        java.lang.String b17 = pVar.f255224n.b("chatroom");
        java.lang.String b18 = pVar.f255224n.b("bill_no");
        synchronized (h61.o.class) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str2) && !com.tencent.mm.sdk.platformtools.t8.K0(b18) && !com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                j61.a y07 = e61.e.Bi().y0(str);
                java.lang.Object[] objArr = new java.lang.Object[5];
                objArr[0] = str2;
                objArr[1] = b17;
                objArr[2] = str;
                objArr[3] = y07;
                if (y07 == null || !y07.field_insertmsg) {
                    z17 = false;
                }
                objArr[4] = java.lang.Boolean.valueOf(z17);
                com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "insertPayMsgAfterPaySucc, launcherUsername: %s, chatroom: %s, payMsgId: %s, record: %s, insertmsg: %s", objArr);
                if (y07 == null || !y07.field_insertmsg) {
                    java.lang.String str4 = "weixin://weixinnewaa/opendetail?billno=" + b18 + "&launcherusername=" + str2;
                    if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AAUtil", "empty msgxml, insert local msgcontent");
                        java.lang.String str5 = com.tencent.mm.ui.bk.C() ? "#7D90A9" : "#576B95";
                        if (str2.equals(c01.z1.r())) {
                            replace = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hgf, str4, str5);
                        } else {
                            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                            replace = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.hgg, c01.a2.f(str2, b17), str5, str4);
                        }
                    } else {
                        replace = str3.replace("\"#037AFF\"", "\"" + (com.tencent.mm.ui.bk.C() ? "#7D90A9" : "#576B95") + "\"");
                    }
                    h61.o.n(replace, b17, y07, str, false);
                }
            }
        }
        return null;
    }
}
