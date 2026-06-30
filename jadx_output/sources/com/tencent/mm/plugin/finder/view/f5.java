package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class f5 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.view.d5 f132064i = new com.tencent.mm.plugin.finder.view.d5(null);

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f132065j = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: k, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f132066k = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.FinderCommentDrawer f132067a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.MMFragmentActivity f132068b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.view.a5 f132069c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.b5 f132070d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback f132071e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f132072f;

    /* renamed from: g, reason: collision with root package name */
    public long f132073g;

    /* renamed from: h, reason: collision with root package name */
    public int f132074h;

    public f5() {
        this.f132069c = null;
    }

    public static void c(com.tencent.mm.plugin.finder.view.f5 f5Var, com.tencent.mm.plugin.finder.storage.FinderItem feedObj, boolean z17, long j17, boolean z18, boolean z19, com.tencent.mm.plugin.finder.storage.yj0 yj0Var, boolean z27, int i17, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback closeDrawerCallback, boolean z28, long j18, int i18, int i19, java.lang.String str, int i27, int i28, java.lang.Object obj) {
        boolean z29 = (i28 & 2) != 0 ? false : z17;
        long j19 = (i28 & 4) != 0 ? 0L : j17;
        boolean z37 = (i28 & 8) != 0 ? false : z18;
        boolean z38 = (i28 & 16) != 0 ? true : z19;
        com.tencent.mm.plugin.finder.storage.yj0 yj0Var2 = (i28 & 32) != 0 ? null : yj0Var;
        boolean z39 = (i28 & 64) != 0 ? false : z27;
        int i29 = (i28 & 128) != 0 ? 0 : i17;
        com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback closeDrawerCallback2 = (i28 & 256) != 0 ? null : closeDrawerCallback;
        boolean z47 = (i28 & 512) != 0 ? false : z28;
        long j27 = (i28 & 1024) != 0 ? 1000L : j18;
        int i37 = (i28 & 2048) != 0 ? 0 : i18;
        int i38 = (i28 & 4096) != 0 ? 0 : i19;
        java.lang.String str2 = (i28 & 8192) != 0 ? null : str;
        int i39 = (i28 & 16384) != 0 ? 0 : i27;
        f5Var.getClass();
        kotlin.jvm.internal.o.g(feedObj, "feedObj");
        f5Var.f132071e = closeDrawerCallback2;
        if (((java.lang.Number) com.tencent.mm.plugin.finder.storage.t70.f127590a.r().r()).intValue() != 1) {
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = f5Var.f132068b;
            if (mMFragmentActivity != null) {
                androidx.lifecycle.c1 a17 = pf5.z.f353948a.a(mMFragmentActivity).a(um3.b.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                pf5.e.launchUI$default((pf5.e) a17, null, null, new com.tencent.mm.plugin.finder.view.e5(f5Var, feedObj, null), 3, null);
            }
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = f5Var.f132067a;
            if (finderCommentDrawer != null) {
                finderCommentDrawer.setOnCloseDrawerCallback(closeDrawerCallback2);
            }
            com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer2 = f5Var.f132067a;
            if (finderCommentDrawer2 != null) {
                com.tencent.mm.plugin.finder.view.FinderCommentDrawer.v(finderCommentDrawer2, feedObj, z29, j19, z37, z38, yj0Var2, false, z39, i29, z47, j27, i37, i38, str2, i39, 64, null);
                return;
            }
            return;
        }
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity2 = f5Var.f132068b;
        com.tencent.mm.plugin.finder.view.a5 a5Var = f5Var.f132069c;
        if (a5Var == null || mMFragmentActivity2 == null) {
            return;
        }
        f5Var.f132070d = new com.tencent.mm.plugin.finder.view.b5(feedObj, z29, j19, z37, z38, yj0Var2);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f132065j;
        java.lang.Long valueOf = java.lang.Long.valueOf(currentTimeMillis);
        com.tencent.mm.plugin.finder.view.b5 b5Var = f5Var.f132070d;
        if (b5Var == null) {
            kotlin.jvm.internal.o.o("drawerOpenData");
            throw null;
        }
        concurrentHashMap.put(valueOf, new jz5.l(a5Var, b5Var));
        java.lang.Long valueOf2 = java.lang.Long.valueOf(currentTimeMillis);
        com.tencent.mm.plugin.finder.view.b5 b5Var2 = f5Var.f132070d;
        if (b5Var2 == null) {
            kotlin.jvm.internal.o.o("drawerOpenData");
            throw null;
        }
        concurrentHashMap.put(valueOf2, new jz5.l(a5Var, b5Var2));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("COMMENT_REQUEST_KEY", currentTimeMillis);
        intent.putExtra("FROM_MSG", f5Var.f132072f);
        intent.putExtra("MENTION_ID", f5Var.f132073g);
        intent.putExtra("MENTION_CREATE_TIME", f5Var.f132074h);
        com.tencent.mm.plugin.finder.viewmodel.component.ny.L1.c(mMFragmentActivity2, intent);
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).getClass();
        intent.setClass(mMFragmentActivity2, com.tencent.mm.plugin.finder.feed.ui.FinderCommentUI.class);
        mMFragmentActivity2.startActivityForResult(intent, 500);
        mMFragmentActivity2.overridePendingTransition(0, 0);
    }

    public final void a() {
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = this.f132067a;
        if (finderCommentDrawer != null) {
            finderCommentDrawer.u();
        }
    }

    public final boolean b() {
        com.tencent.mm.plugin.finder.view.FinderCommentDrawer finderCommentDrawer = this.f132067a;
        if (finderCommentDrawer != null) {
            return finderCommentDrawer.q();
        }
        return false;
    }

    public f5(int i17, boolean z17, com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract.CloseDrawerCallback closeDrawerCallback, int i18, kotlin.jvm.internal.i iVar) {
        this.f132069c = new com.tencent.mm.plugin.finder.view.a5(i17, (i18 & 2) != 0 ? false : z17);
    }
}
