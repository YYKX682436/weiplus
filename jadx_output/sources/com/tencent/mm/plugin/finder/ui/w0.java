package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class w0 implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAlbumUI f129970a;

    public w0(com.tencent.mm.plugin.finder.ui.FinderAlbumUI finderAlbumUI) {
        this.f129970a = finderAlbumUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        java.lang.String str;
        java.lang.String postId;
        com.tencent.mm.plugin.finder.ui.FinderAlbumUI finderAlbumUI = this.f129970a;
        if (finderAlbumUI.f128507x2) {
            finderAlbumUI.f128507x2 = false;
            return;
        }
        ((qs2.q) finderAlbumUI.F2).getClass();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        java.lang.String str2 = "";
        if (finderFeedReportObject == null || (str = finderFeedReportObject.getClickId()) == null) {
            str = "";
        }
        ((qs2.q) this.f129970a.F2).getClass();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject2 != null && (postId = finderFeedReportObject2.getPostId()) != null) {
            str2 = postId;
        }
        finderAlbumUI.n8(str, str2, 2, c01.id.c() / 1000, 3);
    }
}
