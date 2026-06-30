package os3;

/* loaded from: classes8.dex */
public class z0 extends hs3.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI f348261a;

    public z0(com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI compressPreviewUI) {
        this.f348261a = compressPreviewUI;
    }

    @Override // hs3.j
    public void b(int i17, java.lang.String str) {
        com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI compressPreviewUI = this.f348261a;
        if (i17 != -5) {
            compressPreviewUI.f154866p.setVisibility(8);
            compressPreviewUI.f154865o.setVisibility(0);
            compressPreviewUI.f154864n.setVisibility(8);
            return;
        }
        os3.p3 p3Var = compressPreviewUI.f154861h;
        p3Var.f348172d = new os3.y0(this);
        com.tencent.mm.autogen.events.NeedVerifyQQEvent needVerifyQQEvent = new com.tencent.mm.autogen.events.NeedVerifyQQEvent();
        am.ok okVar = needVerifyQQEvent.f54517g;
        okVar.f7553a = p3Var.f348173e;
        okVar.f7554b = new os3.m3(p3Var, needVerifyQQEvent);
        needVerifyQQEvent.b(android.os.Looper.myLooper());
    }

    @Override // hs3.j
    public void d(java.lang.String str, java.util.Map map) {
        java.lang.String str2;
        os3.z0 z0Var = this;
        java.util.Map map2 = map;
        java.lang.String str3 = (java.lang.String) map2.get(".Response.result.compressfilepath");
        com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI compressPreviewUI = z0Var.f348261a;
        compressPreviewUI.f154863m = str3;
        int i17 = 0;
        int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map2.get(".Response.result.filelist.count"), 0);
        int i18 = 0;
        while (i18 < P) {
            try {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(".Response.result.filelist.list.item");
                sb6.append(i18 > 0 ? java.lang.Integer.valueOf(i18) : "");
                java.lang.String sb7 = sb6.toString();
                java.lang.String str4 = (java.lang.String) map2.get(sb7 + ".path");
                if (str4 != null) {
                    java.lang.String decode = java.net.URLDecoder.decode(str4, com.tencent.tmassistantsdk.protocol.ProtocolPackage.ServerEncoding);
                    java.lang.String str5 = (java.lang.String) map2.get(sb7 + ".parentpath");
                    int P2 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map2.get(sb7 + ".size"), i17);
                    int P3 = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) map2.get(sb7 + ".type"), i17);
                    boolean equals = ((java.lang.String) map2.get(sb7 + ".preview")).equals("1");
                    java.lang.String str6 = (java.lang.String) map2.get(sb7 + ".name");
                    com.tencent.mm.plugin.qqmail.ui.CompressPreviewUI compressPreviewUI2 = z0Var.f348261a;
                    java.util.List list = compressPreviewUI2.f154862i;
                    if (P2 == 0) {
                        str2 = "";
                    } else {
                        str2 = "(" + com.tencent.mm.sdk.platformtools.t8.f0(P2) + ")";
                    }
                    ((java.util.ArrayList) list).add(new os3.a1(compressPreviewUI2, decode, str6, str5, P3, str2, equals));
                }
                i18++;
                z0Var = this;
                map2 = map;
                i17 = 0;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.CompressPreviewUI", e17, "", new java.lang.Object[0]);
            }
        }
        compressPreviewUI.U6("");
    }
}
