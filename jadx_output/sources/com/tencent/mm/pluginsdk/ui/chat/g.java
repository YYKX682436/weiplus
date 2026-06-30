package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class g implements db5.y1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.AppPanel f190323a;

    public g(com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel) {
        this.f190323a = appPanel;
    }

    @Override // db5.y1
    public void a(int i17, int i18) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f190323a;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppPanel", "onMeasure width: %d, heigth:%d, isMeasured:%b, gridWidth:%d, gridHeight:%d", valueOf, valueOf2, java.lang.Boolean.valueOf(appPanel.f189944v), java.lang.Integer.valueOf(appPanel.f189942t), java.lang.Integer.valueOf(appPanel.f189943u));
        if ((appPanel.f189944v && java.lang.Math.abs(appPanel.f189943u - i18) < 10) || i18 == 0 || i17 == 0) {
            return;
        }
        appPanel.getScreenOrientation();
        appPanel.f189944v = true;
        appPanel.f189943u = i18;
        appPanel.f189942t = i17;
        com.tencent.mm.pluginsdk.ui.chat.AppPanel.n(appPanel);
    }
}
