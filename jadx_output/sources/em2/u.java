package em2;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView f255168a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f255170c;

    /* renamed from: d, reason: collision with root package name */
    public em2.j f255171d;

    /* renamed from: b, reason: collision with root package name */
    public final em2.w f255169b = new em2.w();

    /* renamed from: e, reason: collision with root package name */
    public final em2.k f255172e = new em2.k(this);

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View.OnClickListener f255173f = new em2.n(this);

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View.OnClickListener f255174g = new em2.o(this);

    /* renamed from: h, reason: collision with root package name */
    public final tn0.k1 f255175h = new em2.p(this);

    public static final /* synthetic */ java.lang.String a(em2.u uVar) {
        uVar.getClass();
        return "Finder.FinderLiveMiniWindowManager";
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean b(em2.u r9) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: em2.u.b(em2.u):boolean");
    }

    public static void e(em2.u uVar, android.view.View view, boolean z17, long j17, android.content.Context context, android.content.Intent intent, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        boolean z18 = z17;
        if ((i17 & 4) != 0) {
            j17 = 0;
        }
        long j18 = j17;
        if ((i17 & 8) != 0) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
        }
        android.content.Context context2 = context;
        if ((i17 & 16) != 0) {
            intent = new android.content.Intent();
        }
        uVar.d(view, z18, j18, context2, intent);
    }

    public final com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView c(gk2.e liveData, boolean z17) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView = new com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView(context, null, 0, 6, null);
        this.f255168a = finderLiveMiniView;
        finderLiveMiniView.setupClickListener(this.f255172e);
        com.tencent.mm.plugin.finder.live.view.FinderLiveMiniView finderLiveMiniView2 = this.f255168a;
        if (finderLiveMiniView2 != null) {
            finderLiveMiniView2.k(((mm2.c1) liveData.a(mm2.c1.class)).f328852o, ((mm2.c1) liveData.a(mm2.c1.class)).t7(), z17, false);
        }
        return finderLiveMiniView;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x023a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.view.View r21, boolean r22, long r23, android.content.Context r25, android.content.Intent r26) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: em2.u.d(android.view.View, boolean, long, android.content.Context, android.content.Intent):void");
    }
}
