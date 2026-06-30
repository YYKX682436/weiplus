package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class de implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f131891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderLiveVisitorFansRightView f131892e;

    public de(java.lang.String str, com.tencent.mm.plugin.finder.view.FinderLiveVisitorFansRightView finderLiveVisitorFansRightView) {
        this.f131891d = str;
        this.f131892e = finderLiveVisitorFansRightView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView$updateAnnouncement$2$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.Lj((ml2.r0) c17, ml2.j4.f327625u, null, null, 6, null);
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f131891d;
        intent.putExtra("nowUrl", str);
        intent.putExtra("thumbUrl", str);
        intent.putExtra("urlList", new java.lang.String[]{str});
        intent.putExtra("isFromWebView", false);
        intent.putExtra("ShowIndicator", false);
        intent.putExtra("BottomSheetStyle", 0);
        intent.putExtra("shouldShowScanQrCodeMenu", true);
        j45.l.j(this.f131892e.getContext(), "subapp", ".ui.gallery.GestureGalleryUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/FinderLiveVisitorFansRightView$updateAnnouncement$2$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
