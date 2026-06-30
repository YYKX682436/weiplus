package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class bc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f210304d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210305e;

    public bc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI, boolean z17) {
        this.f210305e = showVideoUI;
        this.f210304d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210305e;
        if (showVideoUI.isFinishing() || showVideoUI.isDestroyed()) {
            return;
        }
        if (this.f210304d) {
            showVideoUI.f210238z.h();
        } else {
            showVideoUI.f210238z.i();
        }
        if (showVideoUI.f210238z.e()) {
            showVideoUI.f210238z.start();
            showVideoUI.X6();
        } else {
            showVideoUI.f210238z.stop();
            showVideoUI.f210238z.setVideoPath(showVideoUI.f210221f);
        }
    }
}
