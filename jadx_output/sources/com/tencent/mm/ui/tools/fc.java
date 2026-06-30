package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class fc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210422d;

    public fc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210422d = showVideoUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210422d;
        if (showVideoUI.isFinishing() || showVideoUI.isDestroyed()) {
            return;
        }
        int currentPosition = showVideoUI.f210238z.getCurrentPosition() / 1000;
        if (showVideoUI.B.getmPosition() != currentPosition) {
            showVideoUI.B.a(currentPosition);
        }
        showVideoUI.E.postDelayed(showVideoUI.G, java.lang.Math.min(1000 - (showVideoUI.f210238z.getCurrentPosition() % 1000), 500L));
    }
}
