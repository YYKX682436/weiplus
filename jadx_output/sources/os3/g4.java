package os3;

/* loaded from: classes8.dex */
public class g4 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.ReadMailUI f348090d;

    public g4(com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI) {
        this.f348090d = readMailUI;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        com.tencent.mm.plugin.qqmail.ui.ReadMailUI readMailUI = this.f348090d;
        if (readMailUI.isFinishing() || readMailUI.isDestroyed() || iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            return;
        }
        java.lang.String str = iPCString.f68406d;
        ks3.b0 b0Var = null;
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "msg", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MailMsgHelper", "parse fail, maps is null");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MailMsgHelper", "parse mail msg %s", str);
            b0Var = new ks3.b0();
            b0Var.f311626a = (java.lang.String) d17.get(".msg.pushmail.mailid");
            b0Var.f311627b = (java.lang.String) d17.get(".msg.pushmail.content.date");
            b0Var.f311628c = (java.lang.String) d17.get(".msg.pushmail.content.subject");
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.pushmail.content.fromlist.$count"), 0);
            int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.pushmail.content.tolist.$count"), 0);
            int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".msg.pushmail.content.cclist.$count"), 0);
            for (int i17 = 0; i17 < P; i17++) {
                android.os.Bundle bundle = new android.os.Bundle();
                java.lang.String str2 = ".msg.pushmail.content.fromlist.item";
                if (i17 > 0) {
                    str2 = ".msg.pushmail.content.fromlist.item" + i17;
                }
                bundle.putString(ya.b.ITEM_NAME, (java.lang.String) d17.get(str2 + ".name"));
                bundle.putString("item_addr", (java.lang.String) d17.get(str2 + ".addr"));
                b0Var.f311629d.add(bundle);
            }
            for (int i18 = 0; i18 < P2; i18++) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                java.lang.String str3 = ".msg.pushmail.content.tolist.item";
                if (i18 > 0) {
                    str3 = ".msg.pushmail.content.tolist.item" + i18;
                }
                bundle2.putString(ya.b.ITEM_NAME, (java.lang.String) d17.get(str3 + ".name"));
                bundle2.putString("item_addr", (java.lang.String) d17.get(str3 + ".addr"));
                b0Var.f311630e.add(bundle2);
            }
            for (int i19 = 0; i19 < P3; i19++) {
                android.os.Bundle bundle3 = new android.os.Bundle();
                java.lang.String str4 = ".msg.pushmail.content.cclist.item";
                if (i19 > 0) {
                    str4 = ".msg.pushmail.content.cclist.item" + i19;
                }
                bundle3.putString(ya.b.ITEM_NAME, (java.lang.String) d17.get(str4 + ".name"));
                bundle3.putString("item_addr", (java.lang.String) d17.get(str4 + ".addr"));
                b0Var.f311631f.add(bundle3);
            }
        }
        readMailUI.f154927f = b0Var;
        if (b0Var != null) {
            com.tencent.mm.sdk.platformtools.u3.h(new os3.q3(this));
        }
    }
}
