package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ha implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ec2.f f129321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI f129322e;

    public ha(ec2.f fVar, com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI finderMediaPreviewUI) {
        this.f129321d = fVar;
        this.f129322e = finderMediaPreviewUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ec2.f fVar = this.f129321d;
        int i17 = fVar.f250959d;
        com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI finderMediaPreviewUI = this.f129322e;
        if (i17 == 2) {
            int i18 = com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI.D;
            finderMediaPreviewUI.d7().a(0);
        } else {
            if (i17 != 3) {
                return;
            }
            int i19 = com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI.D;
            finderMediaPreviewUI.d7().setVideoTotalTime(fVar.f250964i);
            finderMediaPreviewUI.d7().a(fVar.f250963h);
        }
    }
}
