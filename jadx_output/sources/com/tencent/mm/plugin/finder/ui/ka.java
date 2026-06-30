package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class ka implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI f129426d;

    public ka(com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI finderMediaPreviewUI) {
        this.f129426d = finderMediaPreviewUI;
    }

    @Override // m34.e
    public void a(int i17) {
        int i18 = com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI.D;
        com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI finderMediaPreviewUI = this.f129426d;
        cw2.da videoView = finderMediaPreviewUI.c7().getVideoBanner().getMediaView().getVideoView();
        if (videoView != null) {
            videoView.a(i17, true);
        }
        finderMediaPreviewUI.d7().setIsPlay(true);
    }

    @Override // m34.e
    public void b() {
        int i17 = com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI.D;
        com.tencent.mm.plugin.finder.ui.FinderMediaPreviewUI finderMediaPreviewUI = this.f129426d;
        finderMediaPreviewUI.e7(false);
        finderMediaPreviewUI.d7().setIsPlay(false);
    }

    @Override // m34.e
    public void d(int i17) {
    }
}
