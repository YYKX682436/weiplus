package zx4;

/* loaded from: classes8.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f477173d;

    /* renamed from: e, reason: collision with root package name */
    public int f477174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f477175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zx4.l0 f477176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f477177h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f477178i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, zx4.l0 l0Var, boolean z17, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f477175f = webViewUI;
        this.f477176g = l0Var;
        this.f477177h = z17;
        this.f477178i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zx4.q(this.f477175f, this.f477176g, this.f477177h, this.f477178i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zx4.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r8.f477174e
            r2 = 3
            r3 = 2
            boolean r4 = r8.f477177h
            zx4.l0 r5 = r8.f477176g
            r6 = 1
            if (r1 == 0) goto L2c
            if (r1 == r6) goto L24
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            kotlin.ResultKt.throwOnFailure(r9)
            goto L89
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            kotlin.ResultKt.throwOnFailure(r9)
            goto L7a
        L24:
            java.lang.Object r1 = r8.f477173d
            com.tencent.mm.ui.widget.MMWebView r1 = (com.tencent.mm.ui.widget.MMWebView) r1
            kotlin.ResultKt.throwOnFailure(r9)
            goto L5d
        L2c:
            kotlin.ResultKt.throwOnFailure(r9)
            com.tencent.mm.plugin.webview.ui.tools.WebViewUI r9 = r8.f477175f
            com.tencent.mm.ui.widget.MMWebView r1 = r9.f183815f
            j62.e r9 = j62.e.g()
            com.tencent.mm.repairer.config.webview.RepairerConfigWebViewScreenshotUseXWeb r7 = new com.tencent.mm.repairer.config.webview.RepairerConfigWebViewScreenshotUseXWeb
            r7.<init>()
            int r9 = r9.c(r7)
            if (r9 != r6) goto L44
            r9 = r6
            goto L45
        L44:
            r9 = 0
        L45:
            if (r9 == 0) goto L7d
            r9 = 2022(0x7e6, float:2.833E-42)
            boolean r9 = com.tencent.xweb.a3.k(r9)
            if (r9 == 0) goto L7d
            kotlin.jvm.internal.o.d(r1)
            r8.f477173d = r1
            r8.f477174e = r6
            java.lang.Object r9 = zx4.l0.b(r5, r1, r4, r8)
            if (r9 != r0) goto L5d
            return r0
        L5d:
            zx4.o r9 = (zx4.o) r9
            boolean r2 = r9 instanceof zx4.n
            if (r2 == 0) goto L64
            goto L8b
        L64:
            java.lang.String r9 = "WebviewScreenShotHelper"
            java.lang.String r2 = "genLongScreenShotByXWeb failed, fallback to genLongScreenShot"
            com.tencent.mars.xlog.Log.i(r9, r2)
            kotlin.jvm.internal.o.d(r1)
            r9 = 0
            r8.f477173d = r9
            r8.f477174e = r3
            java.lang.Object r9 = zx4.l0.a(r5, r1, r4, r8)
            if (r9 != r0) goto L7a
            return r0
        L7a:
            zx4.o r9 = (zx4.o) r9
            goto L8b
        L7d:
            kotlin.jvm.internal.o.d(r1)
            r8.f477174e = r2
            java.lang.Object r9 = zx4.l0.a(r5, r1, r4, r8)
            if (r9 != r0) goto L89
            return r0
        L89:
            zx4.o r9 = (zx4.o) r9
        L8b:
            yz5.l r0 = r8.f477178i
            r0.invoke(r9)
            jz5.f0 r9 = jz5.f0.f302826a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: zx4.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
