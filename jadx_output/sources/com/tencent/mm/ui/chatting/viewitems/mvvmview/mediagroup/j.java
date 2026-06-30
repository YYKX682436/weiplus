package com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final kz5.q f204811a = new kz5.q();

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView f204812b;

    public j(com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView) {
        this.f204812b = chattingMediaGroupMvvmView;
    }

    public final com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView a(java.lang.String str) {
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView chattingMediaGroupVideoItemMvvmView;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView = this.f204812b;
        if (str == null) {
            com.tencent.mars.xlog.Log.w(chattingMediaGroupMvvmView.f204708f, "itemViewPool, requestView, uniqueId is null");
            return null;
        }
        android.widget.FrameLayout frameLayout = chattingMediaGroupMvvmView.f204712m;
        if (frameLayout == null) {
            kotlin.jvm.internal.o.o("viewContainer");
            throw null;
        }
        int childCount = frameLayout.getChildCount();
        boolean z17 = false;
        for (int i17 = 0; i17 < childCount; i17++) {
            android.widget.FrameLayout frameLayout2 = chattingMediaGroupMvvmView.f204712m;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.o.o("viewContainer");
                throw null;
            }
            android.view.View childAt = frameLayout2.getChildAt(i17);
            kotlin.jvm.internal.o.d(childAt);
            if (kotlin.jvm.internal.o.b(chattingMediaGroupMvvmView.s(childAt), str) && (childAt instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView)) {
                return (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView) childAt;
            }
        }
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.m mVar = chattingMediaGroupMvvmView.G;
        mVar.getClass();
        b11.e eVar = (b11.e) mVar.f204826b.get(str);
        if (eVar == null) {
            com.tencent.mars.xlog.Log.w(chattingMediaGroupMvvmView.f204708f, "itemViewPool, requestView, idCache not found");
            return null;
        }
        b11.a aVar = (b11.a) eVar.f17034a.getValue();
        kz5.q qVar = this.f204811a;
        java.util.Iterator it = qVar.iterator();
        int i18 = 0;
        while (true) {
            if (!it.hasNext()) {
                i18 = -1;
                break;
            }
            if (((com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView) it.next()).i(aVar)) {
                break;
            }
            i18++;
        }
        if (!qVar.isEmpty()) {
            if (i18 >= 0 && i18 < qVar.f314000f) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView chattingMediaGroupBaseItemMvvmView = (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupBaseItemMvvmView) qVar.get(i18);
                qVar.e(i18);
                chattingMediaGroupBaseItemMvvmView.setId(com.tencent.mm.R.id.sr9);
                chattingMediaGroupBaseItemMvvmView.setTag(com.tencent.mm.R.id.sr9, str);
                android.widget.FrameLayout frameLayout3 = chattingMediaGroupMvvmView.f204712m;
                if (frameLayout3 != null) {
                    frameLayout3.addView(chattingMediaGroupBaseItemMvvmView, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
                    return chattingMediaGroupBaseItemMvvmView;
                }
                kotlin.jvm.internal.o.o("viewContainer");
                throw null;
            }
        }
        android.content.Context context = chattingMediaGroupMvvmView.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (aVar instanceof b11.b) {
            chattingMediaGroupVideoItemMvvmView = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupImgItemMvvmView(context, null, 0, 6, null);
        } else {
            if (!(aVar instanceof b11.d)) {
                throw new jz5.j();
            }
            chattingMediaGroupVideoItemMvvmView = new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupVideoItemMvvmView(context, null, 0, 6, null);
        }
        chattingMediaGroupVideoItemMvvmView.setId(com.tencent.mm.R.id.sr9);
        chattingMediaGroupVideoItemMvvmView.setTag(com.tencent.mm.R.id.sr9, str);
        android.widget.FrameLayout frameLayout4 = chattingMediaGroupMvvmView.f204712m;
        if (frameLayout4 != null) {
            frameLayout4.addView(chattingMediaGroupVideoItemMvvmView, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
            return chattingMediaGroupVideoItemMvvmView;
        }
        kotlin.jvm.internal.o.o("viewContainer");
        throw null;
    }
}
