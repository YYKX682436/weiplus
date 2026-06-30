package rg5;

/* loaded from: classes8.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f395275a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.FindMoreFriendsUI f395276b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.lifecycle.k0 f395277c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.FinderIconViewTipPreference f395278d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f395279e;

    public r(android.content.Context context, com.tencent.mm.ui.FindMoreFriendsUI findMoreFriendsUI) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(findMoreFriendsUI, "findMoreFriendsUI");
        this.f395275a = context;
        this.f395276b = findMoreFriendsUI;
        this.f395279e = ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).Ai();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ff A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.tencent.mm.ui.FinderIconViewTipPreference r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 835
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rg5.r.a(com.tencent.mm.ui.FinderIconViewTipPreference, boolean):void");
    }

    public final void b(boolean z17) {
        if (z17 && this.f395276b.F) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_context_id", com.tencent.mm.ui.report.e0.b());
            ((v40.w) ((uc.p) i95.n0.c(uc.p.class))).getClass();
            nq2.d dVar = nq2.d.f338980a;
            if (c92.g.f39738a.b()) {
                com.tencent.mars.xlog.Log.w("NearbyPreloadManager", "startPreloadInNearbyLiveFriendsEntry return for isEnableFindLive.");
            } else {
                dVar.j(intent);
            }
        }
    }
}
