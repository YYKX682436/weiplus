package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class y1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.a2 f149449d;

    public y1(com.tencent.mm.plugin.mmsight.ui.a2 a2Var) {
        this.f149449d = a2Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.mmsight.ui.a2 a2Var = this.f149449d;
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = a2Var.f149272h;
        if (videoPlayerTextureView != null && videoPlayerTextureView.isPlaying()) {
            if (a2Var.f149269e <= 0 || a2Var.f149272h.getCurrentPosition() < a2Var.f149269e) {
                a2Var.f149265a.setCurrentCursorPosition(a2Var.f149272h.getCurrentPosition() / a2Var.f149267c);
            } else {
                a2Var.f149272h.a(a2Var.f149268d, true);
                a2Var.f149265a.setCurrentCursorPosition(a2Var.f149268d / a2Var.f149267c);
            }
        }
        return true;
    }
}
