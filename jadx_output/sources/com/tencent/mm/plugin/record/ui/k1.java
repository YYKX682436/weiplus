package com.tencent.mm.plugin.record.ui;

/* loaded from: classes9.dex */
public class k1 implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgFileUI f155430d;

    public k1(com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI) {
        this.f155430d = recordMsgFileUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = this.f155430d;
        recordMsgFileUI.f155295q.stop();
        if (recordMsgFileUI.A) {
            return;
        }
        recordMsgFileUI.A = true;
        android.graphics.Bitmap i19 = recordMsgFileUI.f155304z.i(recordMsgFileUI.f155300v, recordMsgFileUI.f155298t, recordMsgFileUI.f155297s);
        java.lang.String f174598m = recordMsgFileUI.f155295q.getF174598m();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        sb6.append(com.tencent.mm.plugin.sight.base.e.b());
        sb6.append("[RecordMsgFileUI] on play sight error, what=");
        sb6.append(i17);
        sb6.append(", extra=");
        sb6.append(i18);
        sb6.append(", path=");
        sb6.append(f174598m == null ? "" : f174598m);
        z65.c.b(android.util.Base64.encodeToString(sb6.toString().getBytes(), 2), "FullScreenPlaySight");
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.record.ui.j1(this, i19, f174598m));
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        fp.k.b();
        com.tencent.mm.plugin.record.ui.RecordMsgFileUI recordMsgFileUI = this.f155430d;
        recordMsgFileUI.f155295q.setLoop(true);
        recordMsgFileUI.f155295q.start();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
