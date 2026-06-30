package ve2;

/* loaded from: classes3.dex */
public final class c implements ve2.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f436089d;

    /* renamed from: e, reason: collision with root package name */
    public ve2.b f436090e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.List f436091f;

    public c(android.view.View viewRoot, android.content.Context context, gk2.e liveData, qo0.c statusMonitor, com.tencent.mm.plugin.finder.live.plugin.l plugin) {
        kotlin.jvm.internal.o.g(viewRoot, "viewRoot");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f436089d = viewRoot;
        this.f436091f = new java.util.ArrayList();
    }

    public final void c() {
        ve2.b bVar = this.f436090e;
        if (bVar != null) {
            com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView finderLiveLogoGroupView = ((ve2.d) bVar).f436093e;
            if (finderLiveLogoGroupView != null) {
                finderLiveLogoGroupView.setVisibility(8);
            }
            if (finderLiveLogoGroupView != null) {
                com.tencent.mars.xlog.Log.i("FinderLiveLogoGroupView", "#reset");
                kotlinx.coroutines.r2 r2Var = finderLiveLogoGroupView.f116309e;
                if (r2Var != null) {
                    kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                }
                ((java.util.ArrayList) finderLiveLogoGroupView.f116311g).clear();
                finderLiveLogoGroupView.f116312h = null;
                finderLiveLogoGroupView.f116310f.removeAllViews();
                finderLiveLogoGroupView.f116313i = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        if ((((kotlinx.coroutines.a) r11).a() ^ true) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(java.util.List r11) {
        /*
            r10 = this;
            java.lang.String r0 = "#updateBubbleInfo"
            java.lang.String r1 = "FinderLiveLogoPresenter"
            com.tencent.mars.xlog.Log.i(r1, r0)
            if (r11 == 0) goto L78
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L10
            goto L78
        L10:
            r10.f436091f = r11
            ve2.b r0 = r10.f436090e
            if (r0 == 0) goto L77
            ve2.d r0 = (ve2.d) r0
            boolean r1 = r11.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L77
            r1 = 0
            com.tencent.mm.plugin.finder.live.view.finderlivelogo.FinderLiveLogoGroupView r0 = r0.f436093e
            if (r0 == 0) goto L71
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "#render taskInfo size: "
            r3.<init>(r4)
            int r4 = r11.size()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "FinderLiveLogoGroupView"
            com.tencent.mars.xlog.Log.i(r4, r3)
            java.util.List r3 = r0.f116311g
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.clear()
            r3.addAll(r11)
            kotlinx.coroutines.r2 r11 = r0.f116309e
            if (r11 == 0) goto L58
            kotlinx.coroutines.a r11 = (kotlinx.coroutines.a) r11
            boolean r11 = r11.a()
            r11 = r11 ^ r2
            if (r11 != r2) goto L55
            r11 = r2
            goto L56
        L55:
            r11 = r1
        L56:
            if (r11 == 0) goto L71
        L58:
            kotlinx.coroutines.r2 r11 = r0.f116309e
            r3 = 0
            if (r11 == 0) goto L60
            kotlinx.coroutines.p2.a(r11, r3, r2, r3)
        L60:
            kotlinx.coroutines.y0 r4 = r0.f116308d
            r5 = 0
            r6 = 0
            dm2.b r7 = new dm2.b
            r7.<init>(r0, r3)
            r8 = 3
            r9 = 0
            kotlinx.coroutines.r2 r11 = kotlinx.coroutines.l.d(r4, r5, r6, r7, r8, r9)
            r0.f116309e = r11
        L71:
            if (r0 != 0) goto L74
            goto L77
        L74:
            r0.setVisibility(r1)
        L77:
            return
        L78:
            kz5.p0 r11 = kz5.p0.f313996d
            r10.f436091f = r11
            r10.c()
            java.lang.String r11 = "#updateBubbleInfo data is null, return"
            com.tencent.mars.xlog.Log.i(r1, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve2.c.f(java.util.List):void");
    }

    @Override // fs2.a
    public void onAttach(java.lang.Object obj) {
        ve2.b callback = (ve2.b) obj;
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f436090e = callback;
    }

    @Override // fs2.a
    public void onDetach() {
        c();
    }
}
