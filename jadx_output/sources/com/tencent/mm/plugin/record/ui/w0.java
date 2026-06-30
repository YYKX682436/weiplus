package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f155592d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f155593e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f155594f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgFileUI f155595g;

    public w0(com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI, java.util.List list, java.lang.String str, java.lang.Runnable runnable) {
        this.f155595g = recordMsgFileUI;
        this.f155592d = list;
        this.f155593e = str;
        this.f155594f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = this.f155595g;
        java.lang.String t17 = bt3.g2.t(recordMsgFileUI.f155300v, recordMsgFileUI.f155298t, recordMsgFileUI.f155297s, 1);
        com.tencent.mm.opensdk.modelmsg.WXFileObject wXFileObject = new com.tencent.mm.opensdk.modelmsg.WXFileObject();
        wXFileObject.setFilePath(t17);
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = new com.tencent.mm.opensdk.modelmsg.WXMediaMessage();
        wXMediaMessage.mediaObject = wXFileObject;
        r45.gp0 gp0Var = recordMsgFileUI.f155300v;
        wXMediaMessage.title = gp0Var.f375404d;
        wXMediaMessage.description = gp0Var.f375408f;
        wXMediaMessage.thumbData = com.tencent.mm.sdk.platformtools.t8.x1(bt3.g2.H(gp0Var, recordMsgFileUI.f155298t, recordMsgFileUI.f155297s, 1));
        for (java.lang.String str : this.f155592d) {
            com.tencent.mm.pluginsdk.model.app.k0.D(wXMediaMessage, "", "", str, 3, null);
            ((dk5.s5) tg3.t1.a()).Ui(this.f155593e, str);
        }
        com.tencent.mm.sdk.platformtools.u3.h(this.f155594f);
    }

    public java.lang.String toString() {
        return super.toString() + "|onActivityResult2";
    }
}
