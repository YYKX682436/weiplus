package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class ed implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210383d;

    public ed(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210383d = showVideoUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210383d;
        showVideoUI.f210238z.start();
        showVideoUI.X6();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210383d;
        showVideoUI.f210238z.start();
        showVideoUI.X6();
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
