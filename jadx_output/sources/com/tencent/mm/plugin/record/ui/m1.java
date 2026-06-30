package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class m1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f155451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f155453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgFileUI f155454g;

    public m1(com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI, java.util.List list, java.lang.String str, java.lang.Runnable runnable) {
        this.f155454g = recordMsgFileUI;
        this.f155451d = list;
        this.f155452e = str;
        this.f155453f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = this.f155454g;
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(bt3.g2.t(recordMsgFileUI.f155300v, recordMsgFileUI.f155298t, recordMsgFileUI.f155297s, 1));
        for (java.lang.String str : this.f155451d) {
            if (r6Var.m()) {
                java.lang.String U6 = recordMsgFileUI.U6();
                r6Var.o();
                if (recordMsgFileUI.T6() == 15) {
                    tg3.a1 a17 = tg3.t1.a();
                    androidx.appcompat.app.AppCompatActivity context = recordMsgFileUI.getContext();
                    java.lang.String o17 = r6Var.o();
                    r45.gp0 gp0Var = recordMsgFileUI.f155300v;
                    ((dk5.s5) a17).nj(context, str, o17, U6, 62, gp0Var.f375448y, false, false, "", gp0Var.f375431q2);
                } else {
                    tg3.a1 a18 = tg3.t1.a();
                    androidx.appcompat.app.AppCompatActivity context2 = recordMsgFileUI.getContext();
                    java.lang.String o18 = r6Var.o();
                    r45.gp0 gp0Var2 = recordMsgFileUI.f155300v;
                    ((dk5.s5) a18).nj(context2, str, o18, U6, 1, gp0Var2.f375448y, false, false, "", gp0Var2.f375431q2);
                }
            } else {
                java.lang.String str2 = recordMsgFileUI.f155300v.A;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                    com.tencent.mm.opensdk.modelmsg.WXVideoObject wXVideoObject = new com.tencent.mm.opensdk.modelmsg.WXVideoObject();
                    wXVideoObject.videoUrl = str2;
                    com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage(wXVideoObject);
                    java.lang.String str3 = recordMsgFileUI.f155300v.f375404d;
                    java.lang.String string = recordMsgFileUI.getContext().getResources().getString(com.tencent.mm.R.string.cdy);
                    if (str3 == null) {
                        str3 = string;
                    }
                    wXMediaMessage.mediaObject = wXVideoObject;
                    wXMediaMessage.title = str3;
                    r45.gp0 gp0Var3 = recordMsgFileUI.f155300v;
                    wXMediaMessage.description = gp0Var3.f375408f;
                    byte[] x17 = com.tencent.mm.sdk.platformtools.t8.x1(bt3.g2.H(gp0Var3, recordMsgFileUI.f155298t, recordMsgFileUI.f155297s, 1));
                    wXMediaMessage.thumbData = x17;
                    if (x17 == null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        sb6.append(c01.d9.b().e());
                        sb6.append("web/");
                        java.lang.String str4 = recordMsgFileUI.f155300v.G;
                        if (str4 == null) {
                            str4 = "";
                        }
                        sb6.append(kk.k.g(str4.getBytes()));
                        wXMediaMessage.thumbData = com.tencent.mm.sdk.platformtools.t8.x1(sb6.toString());
                    }
                    com.tencent.mm.pluginsdk.model.app.k0.D(wXMediaMessage, "", "", str, 3, null);
                }
            }
            ((dk5.s5) tg3.t1.a()).Ui(this.f155452e, str);
        }
        recordMsgFileUI.b7(2, 7);
        com.tencent.mm.sdk.platformtools.u3.h(this.f155453f);
    }

    public java.lang.String toString() {
        return super.toString() + "|onActivityResult1";
    }
}
