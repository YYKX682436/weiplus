package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class cd implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210335d;

    public cd(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210335d = showVideoUI;
    }

    @Override // m34.e
    public void a(int i17) {
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210335d;
        if (!showVideoUI.f210238z.e()) {
            showVideoUI.f210238z.prepare();
        } else {
            showVideoUI.f210238z.a(i17 * 1000, true);
            showVideoUI.f210238z.setOnSeekCompleteCallback(new com.tencent.mm.ui.tools.bd(this));
        }
    }

    @Override // m34.e
    public void b() {
    }

    @Override // m34.e
    public void d(int i17) {
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210335d;
        showVideoUI.f210238z.a(i17 * 1000, false);
        if (showVideoUI.f210238z.isPlaying()) {
            showVideoUI.f210238z.pause();
        }
    }
}
