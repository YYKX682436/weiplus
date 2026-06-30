package nr2;

/* loaded from: classes2.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f339210a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f339211b;

    /* renamed from: c, reason: collision with root package name */
    public nr2.l1 f339212c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f339213d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f339214e;

    /* renamed from: f, reason: collision with root package name */
    public nr2.m f339215f;

    /* renamed from: g, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f339216g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f339217h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f339218i;

    public i1(android.app.Activity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f339210a = context;
        this.f339211b = new java.util.ArrayList();
        this.f339214e = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f339218i = new nr2.y0(this);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|19|(1:21)(1:28)|(1:23)|24|(2:26|27))|11|12|13))|31|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r9 = kotlin.Result.INSTANCE;
        r8 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r8));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(nr2.i1 r8, so2.q6 r9, kotlin.coroutines.Continuation r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof nr2.v0
            if (r0 == 0) goto L16
            r0 = r10
            nr2.v0 r0 = (nr2.v0) r0
            int r1 = r0.f339324f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f339324f = r1
            goto L1b
        L16:
            nr2.v0 r0 = new nr2.v0
            r0.<init>(r8, r10)
        L1b:
            r5 = r0
            java.lang.Object r10 = r5.f339322d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f339324f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.ResultKt.throwOnFailure(r10)     // Catch: java.lang.Throwable -> L77
            goto L70
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.throwOnFailure(r10)
            kotlin.Result$Companion r10 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L77
            db2.t1 r1 = new db2.t1     // Catch: java.lang.Throwable -> L77
            android.app.Activity r8 = r8.f339210a     // Catch: java.lang.Throwable -> L77
            java.lang.String r10 = "context"
            kotlin.jvm.internal.o.g(r8, r10)     // Catch: java.lang.Throwable -> L77
            boolean r10 = r8 instanceof com.tencent.mm.ui.MMFragmentActivity     // Catch: java.lang.Throwable -> L77
            r3 = 0
            if (r10 == 0) goto L57
            androidx.appcompat.app.AppCompatActivity r8 = (androidx.appcompat.app.AppCompatActivity) r8     // Catch: java.lang.Throwable -> L77
            pf5.z r10 = pf5.z.f353948a     // Catch: java.lang.Throwable -> L77
            pf5.v r8 = r10.a(r8)     // Catch: java.lang.Throwable -> L77
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r10 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r8 = r8.a(r10)     // Catch: java.lang.Throwable -> L77
            com.tencent.mm.plugin.finder.viewmodel.component.ny r8 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r8     // Catch: java.lang.Throwable -> L77
            goto L58
        L57:
            r8 = r3
        L58:
            if (r8 == 0) goto L5e
            r45.qt2 r3 = r8.V6()     // Catch: java.lang.Throwable -> L77
        L5e:
            r1.<init>(r9, r3)     // Catch: java.lang.Throwable -> L77
            r8 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f339324f = r2     // Catch: java.lang.Throwable -> L77
            r2 = r8
            java.lang.Object r10 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L77
            if (r10 != r0) goto L70
            goto L83
        L70:
            r45.oa1 r10 = (r45.oa1) r10     // Catch: java.lang.Throwable -> L77
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r10)     // Catch: java.lang.Throwable -> L77
            goto L82
        L77:
            r8 = move-exception
            kotlin.Result$Companion r9 = kotlin.Result.INSTANCE
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m521constructorimpl(r8)
        L82:
            r0 = r8
        L83:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.i1.a(nr2.i1, so2.q6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(nr2.i1 i1Var, r45.ux0 ux0Var) {
        i1Var.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", ux0Var.getString(0));
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, ux0Var.getString(1));
        bundle.putString("query", ux0Var.getString(2));
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(i1Var.f339210a, bundle, true, false, new nr2.h1());
    }

    public final void c() {
        this.f339211b.clear();
        this.f339216g = null;
        nr2.l1 l1Var = this.f339212c;
        if (l1Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        l1Var.f();
        com.tencent.mars.xlog.Log.i("Finder.FinderPaidCollectionPresenter", "requestInit CgiFinderGetTopicFeed");
        so2.q6 q6Var = new so2.q6(null, 0, 0L, null, 0L, 0, null, null, 255, null);
        q6Var.f410556b = 16;
        nr2.m mVar = this.f339215f;
        q6Var.f410559e = mVar != null ? mVar.l() : 0L;
        kotlinx.coroutines.l.d(this.f339214e, null, null, new nr2.d1(this, q6Var, null), 3, null);
    }
}
