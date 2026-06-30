package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class v0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderAlbumUI f129934d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f129935e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f129936f;

    public v0(com.tencent.mm.plugin.finder.ui.FinderAlbumUI finderAlbumUI, com.tencent.mm.ui.widget.dialog.y1 y1Var, java.util.ArrayList arrayList) {
        this.f129934d = finderAlbumUI;
        this.f129935e = y1Var;
        this.f129936f = arrayList;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.ui.FinderAlbumUI.L2;
        com.tencent.mm.plugin.finder.ui.FinderAlbumUI finderAlbumUI = this.f129934d;
        finderAlbumUI.getClass();
        boolean z17 = java.lang.System.currentTimeMillis() - finderAlbumUI.f128506w2 < 1000;
        finderAlbumUI.f128506w2 = java.lang.System.currentTimeMillis();
        if (z17) {
            com.tencent.mars.xlog.Log.i("Finder.AlbumUI", "onSendItemClick: short video btn hit double click check");
            yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        finderAlbumUI.f128507x2 = true;
        this.f129935e.q();
        finderAlbumUI.h8(this.f129936f);
        ((qs2.q) finderAlbumUI.F2).getClass();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject == null || (str = finderFeedReportObject.getClickId()) == null) {
            str = "";
        }
        ((qs2.q) finderAlbumUI.F2).getClass();
        com.tencent.mm.protocal.protobuf.FinderFeedReportObject finderFeedReportObject2 = com.tencent.mm.plugin.finder.report.p2.f125238b;
        if (finderFeedReportObject2 == null || (str2 = finderFeedReportObject2.getPostId()) == null) {
            str2 = "";
        }
        finderAlbumUI.n8(str, str2, 2, c01.id.c() / 1000, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderAlbumUI$showLongVideoPostDialog$1$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
