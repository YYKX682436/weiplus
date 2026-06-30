package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f199536d = 3;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sb5.z f199537e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f199538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f199539g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f199540h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f199541i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.MMChattingListView f199542m;

    public n4(sb5.z zVar, long j17, int i17, int i18, com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.view.MMChattingListView mMChattingListView) {
        this.f199537e = zVar;
        this.f199538f = j17;
        this.f199539g = i17;
        this.f199540h = i18;
        this.f199541i = f9Var;
        this.f199542m = mMChattingListView;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) this.f199537e;
        long j17 = this.f199538f;
        android.view.View O0 = kVar.O0(j17);
        android.view.KeyEvent.Callback findViewById = O0 != null ? O0.findViewById(com.tencent.mm.R.id.sr8) : null;
        com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView chattingMediaGroupMvvmView = findViewById instanceof com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView ? (com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.ChattingMediaGroupMvvmView) findViewById : null;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Long.valueOf(j17);
        int i17 = this.f199539g;
        objArr[1] = java.lang.Integer.valueOf(i17);
        objArr[2] = java.lang.Boolean.valueOf(chattingMediaGroupMvvmView != null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupCommonComponent", "[tryUpdateMediaGroupMvvmViewOnTongue] msgId:%s selection:%s mvvmView:%s", objArr);
        if (chattingMediaGroupMvvmView != null) {
            int i18 = this.f199540h;
            chattingMediaGroupMvvmView.setFromNewsJumpInfo(new com.tencent.mm.ui.chatting.viewitems.mvvmview.mediagroup.e1(i18));
            chattingMediaGroupMvvmView.D(this.f199541i);
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemMediaGroupCommonComponent", "[tryUpdateMediaGroupMvvmViewOnTongue] msgId:%s selection:%s unreadCount:%s", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
            return;
        }
        int i19 = this.f199536d;
        this.f199536d = i19 - 1;
        if (i19 > 0) {
            this.f199542m.getListView().postDelayed(this, 100L);
        }
    }
}
