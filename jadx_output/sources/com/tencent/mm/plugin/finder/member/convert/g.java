package com.tencent.mm.plugin.finder.member.convert;

/* loaded from: classes2.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f121139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f121140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f121141f;

    public g(r45.mb4 mb4Var, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, in5.s0 s0Var) {
        this.f121139d = mb4Var;
        this.f121140e = baseFinderFeed;
        this.f121141f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/member/convert/MemberImageConvert$refreshPosterMedia$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Intent intent = new android.content.Intent();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        r45.mb4 mb4Var = this.f121139d;
        sb6.append(mb4Var.getString(0));
        sb6.append(mb4Var.getString(18));
        intent.putExtra("nowUrl", sb6.toString());
        intent.putExtra("thumbUrl", mb4Var.getString(1) + mb4Var.getString(19));
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f121140e;
        java.util.LinkedList<r45.mb4> mediaList = baseFinderFeed.getFeedObject().getMediaList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(mediaList, 10));
        for (r45.mb4 mb4Var2 : mediaList) {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(mb4Var2.getString(0));
            java.lang.String string = mb4Var2.getString(18);
            if (string == null) {
                string = "";
            }
            sb7.append(string);
            arrayList2.add(sb7.toString());
        }
        intent.putExtra("urlList", (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]));
        intent.putExtra("isFromWebView", false);
        intent.putExtra("ShowIndicator", false);
        if (baseFinderFeed.getFeedObject().getMediaList().size() > 0) {
            intent.putExtra("ShowGalleryIndicator", true);
        }
        intent.putExtra("BottomSheetStyle", 0);
        intent.putExtra("shouldShowScanQrCodeMenu", true);
        j45.l.j(this.f121141f.f293121e, "subapp", ".ui.gallery.GestureGalleryUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/member/convert/MemberImageConvert$refreshPosterMedia$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
