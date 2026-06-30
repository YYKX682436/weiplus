package com.tencent.mm.plugin.finder.playlist;

/* loaded from: classes14.dex */
public final class p2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f122395a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f122396b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.playlist.s2 f122397c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f122398d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f122399e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f122400f;

    /* renamed from: g, reason: collision with root package name */
    public int f122401g;

    /* renamed from: h, reason: collision with root package name */
    public volatile com.tencent.mm.protobuf.g f122402h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f122403i;

    public p2(android.app.Activity context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f122395a = context;
        this.f122396b = new java.util.ArrayList();
        this.f122399e = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(6:18|19|(1:21)(1:29)|(1:23)(1:28)|24|(2:26|27))|11|12|13))|32|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
    
        r15 = kotlin.Result.INSTANCE;
        r14 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(r14));
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.tencent.mm.plugin.finder.playlist.p2 r14, kotlin.coroutines.Continuation r15) {
        /*
            r14.getClass()
            boolean r0 = r15 instanceof com.tencent.mm.plugin.finder.playlist.f2
            if (r0 == 0) goto L16
            r0 = r15
            com.tencent.mm.plugin.finder.playlist.f2 r0 = (com.tencent.mm.plugin.finder.playlist.f2) r0
            int r1 = r0.f122305f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f122305f = r1
            goto L1b
        L16:
            com.tencent.mm.plugin.finder.playlist.f2 r0 = new com.tencent.mm.plugin.finder.playlist.f2
            r0.<init>(r14, r15)
        L1b:
            r5 = r0
            java.lang.Object r15 = r5.f122303d
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f122305f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            kotlin.ResultKt.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L85
            goto L7e
        L2b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L33:
            kotlin.ResultKt.throwOnFailure(r15)
            kotlin.Result$Companion r15 = kotlin.Result.INSTANCE     // Catch: java.lang.Throwable -> L85
            db2.o0 r1 = new db2.o0     // Catch: java.lang.Throwable -> L85
            java.lang.String r7 = r14.f122400f     // Catch: java.lang.Throwable -> L85
            com.tencent.mm.protobuf.g r8 = r14.f122402h     // Catch: java.lang.Throwable -> L85
            android.app.Activity r15 = r14.f122395a     // Catch: java.lang.Throwable -> L85
            java.lang.String r3 = "context"
            kotlin.jvm.internal.o.g(r15, r3)     // Catch: java.lang.Throwable -> L85
            boolean r3 = r15 instanceof com.tencent.mm.ui.MMFragmentActivity     // Catch: java.lang.Throwable -> L85
            r4 = 0
            if (r3 == 0) goto L5b
            androidx.appcompat.app.AppCompatActivity r15 = (androidx.appcompat.app.AppCompatActivity) r15     // Catch: java.lang.Throwable -> L85
            pf5.z r3 = pf5.z.f353948a     // Catch: java.lang.Throwable -> L85
            pf5.v r15 = r3.a(r15)     // Catch: java.lang.Throwable -> L85
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.ny> r3 = com.tencent.mm.plugin.finder.viewmodel.component.ny.class
            androidx.lifecycle.c1 r15 = r15.a(r3)     // Catch: java.lang.Throwable -> L85
            com.tencent.mm.plugin.finder.viewmodel.component.ny r15 = (com.tencent.mm.plugin.finder.viewmodel.component.ny) r15     // Catch: java.lang.Throwable -> L85
            goto L5c
        L5b:
            r15 = r4
        L5c:
            if (r15 == 0) goto L64
            r45.qt2 r15 = r15.V6()     // Catch: java.lang.Throwable -> L85
            r9 = r15
            goto L65
        L64:
            r9 = r4
        L65:
            r10 = 0
            int r11 = r14.f122401g     // Catch: java.lang.Throwable -> L85
            r12 = 8
            r13 = 0
            r6 = r1
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L85
            r14 = 0
            r4 = 0
            r6 = 3
            r7 = 0
            r5.f122305f = r2     // Catch: java.lang.Throwable -> L85
            r2 = r14
            java.lang.Object r15 = rm0.h.a(r1, r2, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L85
            if (r15 != r0) goto L7e
            goto L91
        L7e:
            r45.d51 r15 = (r45.d51) r15     // Catch: java.lang.Throwable -> L85
            java.lang.Object r14 = kotlin.Result.m521constructorimpl(r15)     // Catch: java.lang.Throwable -> L85
            goto L90
        L85:
            r14 = move-exception
            kotlin.Result$Companion r15 = kotlin.Result.INSTANCE
            java.lang.Object r14 = kotlin.ResultKt.createFailure(r14)
            java.lang.Object r14 = kotlin.Result.m521constructorimpl(r14)
        L90:
            r0 = r14
        L91:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.playlist.p2.a(com.tencent.mm.plugin.finder.playlist.p2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b() {
        com.tencent.mm.plugin.finder.playlist.s2 s2Var = this.f122397c;
        if (s2Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        s2Var.f();
        com.tencent.mars.xlog.Log.i("Finder.FinderPlayListPresenter", "requestInit CgiFinderGetTopicFeed");
        kotlinx.coroutines.l.d(this.f122399e, null, null, new com.tencent.mm.plugin.finder.playlist.l2(this, null), 3, null);
    }
}
