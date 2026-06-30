package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public final /* synthetic */ class ShowVideoUI$$b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210240d;

    public /* synthetic */ ShowVideoUI$$b(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210240d = showVideoUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        rs0.r rVar = rs0.r.f399316a;
        com.tencent.mm.ui.tools.ShowVideoUI showVideoUI = this.f210240d;
        rs0.q a17 = rVar.a(showVideoUI.f210221f);
        showVideoUI.E.post(new com.tencent.mm.ui.tools.bc(showVideoUI, a17 != null && ((i17 = a17.f399314c) == 6 || i17 == 7)));
    }
}
