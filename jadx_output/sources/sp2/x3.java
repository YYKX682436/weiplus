package sp2;

/* loaded from: classes2.dex */
public final class x3 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f411273d;

    /* renamed from: e, reason: collision with root package name */
    public r45.ha2 f411274e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f411275f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f411276g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f411277h;

    /* renamed from: i, reason: collision with root package name */
    public int f411278i;

    /* renamed from: m, reason: collision with root package name */
    public int f411279m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f411280n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f411281o;

    /* renamed from: p, reason: collision with root package name */
    public final sp2.w3 f411282p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411273d = "LiveSquareTimeRefreshingUIC_" + hashCode();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(13);
        arrayList.add(14);
        this.f411280n = arrayList;
        this.f411281o = new java.util.concurrent.ConcurrentHashMap();
        this.f411282p = new sp2.w3(this, android.os.Looper.getMainLooper());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean O6(sp2.x3 r7, int r8, bq2.b r9) {
        /*
            r45.ha2 r0 = r7.f411274e
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L7
            goto L2d
        L7:
            switch(r8) {
                case 8: goto L28;
                case 9: goto L23;
                case 10: goto L1d;
                case 11: goto L17;
                case 12: goto La;
                case 13: goto L11;
                case 14: goto Lb;
                default: goto La;
            }
        La:
            goto L2d
        Lb:
            r3 = 5
            int r0 = r0.getInteger(r3)
            goto L2e
        L11:
            r3 = 4
            int r0 = r0.getInteger(r3)
            goto L2e
        L17:
            r3 = 3
            int r0 = r0.getInteger(r3)
            goto L2e
        L1d:
            r3 = 2
            int r0 = r0.getInteger(r3)
            goto L2e
        L23:
            int r0 = r0.getInteger(r1)
            goto L2e
        L28:
            int r0 = r0.getInteger(r2)
            goto L2e
        L2d:
            r0 = r2
        L2e:
            java.lang.String r9 = r7.S6(r9)
            if (r9 != 0) goto L35
            goto L8a
        L35:
            java.util.concurrent.ConcurrentHashMap r3 = r7.f411281o
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)
            java.lang.Object r3 = r3.get(r4)
            java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
            if (r3 == 0) goto L4b
            java.lang.Object r9 = r3.get(r9)
            java.lang.Long r9 = (java.lang.Long) r9
            if (r9 != 0) goto L51
        L4b:
            r3 = 0
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
        L51:
            long r3 = r9.longValue()
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r3 = "checkAddRequestScene scene: "
            r9.<init>(r3)
            r9.append(r8)
            java.lang.String r8 = " interval: "
            r9.append(r8)
            r9.append(r0)
            java.lang.String r8 = " offsetTime: "
            r9.append(r8)
            r9.append(r5)
            java.lang.String r8 = r9.toString()
            java.lang.String r7 = r7.f411273d
            com.tencent.mars.xlog.Log.i(r7, r8)
            long r7 = (long) r0
            r3 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r3
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 < 0) goto L88
            if (r0 <= 0) goto L88
            goto L89
        L88:
            r1 = r2
        L89:
            r2 = r1
        L8a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.x3.O6(sp2.x3, int, bq2.b):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P6(sp2.x3 r19, java.util.ArrayList r20, java.util.ArrayList r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sp2.x3.P6(sp2.x3, java.util.ArrayList, java.util.ArrayList, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void Q6(sp2.x3 x3Var, int i17, bq2.b bVar) {
        java.lang.String S6 = x3Var.S6(bVar);
        if (S6 == null) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = x3Var.f411281o;
        if (concurrentHashMap.get(valueOf) == null) {
            concurrentHashMap.put(java.lang.Integer.valueOf(i17), new java.util.concurrent.ConcurrentHashMap());
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = (java.util.concurrent.ConcurrentHashMap) concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        if (concurrentHashMap2 != null) {
        }
    }

    public final void R6(androidx.recyclerview.widget.RecyclerView recyclerView, com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        this.f411275f = recyclerView;
        this.f411276g = adapter;
        com.tencent.mars.xlog.Log.i(this.f411273d, "bindParentRecyclerView parentRecyclerView: " + this.f411275f + " adapter: " + adapter);
    }

    public final java.lang.String S6(bq2.b bVar) {
        if (bVar instanceof bq2.e) {
            return java.lang.String.valueOf(((bq2.e) bVar).f23566e.getId());
        }
        if (bVar instanceof bq2.c) {
            return ((bq2.c) bVar).f23564e.f379347d;
        }
        if (bVar instanceof bq2.f) {
            return java.lang.String.valueOf(((bq2.f) bVar).f23567e);
        }
        if (bVar instanceof bq2.g) {
            return java.lang.String.valueOf(((bq2.g) bVar).f23569e);
        }
        if (!(bVar instanceof bq2.d)) {
            return null;
        }
        return "interactionEntry_" + ((bq2.d) bVar).f23565e.getInteger(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int T6() {
        r45.ha2 ha2Var = this.f411274e;
        int i17 = 0;
        if (ha2Var != null) {
            int[] iArr = {ha2Var.getInteger(0), ha2Var.getInteger(2), ha2Var.getInteger(1), ha2Var.getInteger(3), ha2Var.getInteger(4), ha2Var.getInteger(5)};
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i18 = 0; i18 < 6; i18++) {
                int i19 = iArr[i18];
                if (i19 > 0) {
                    arrayList.add(java.lang.Integer.valueOf(i19));
                }
            }
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Comparable comparable = (java.lang.Comparable) it.next();
                while (it.hasNext()) {
                    java.lang.Comparable comparable2 = (java.lang.Comparable) it.next();
                    if (comparable.compareTo(comparable2) > 0) {
                        comparable = comparable2;
                    }
                }
                i17 = ((java.lang.Number) comparable).intValue();
            }
        }
        com.tencent.mars.xlog.Log.i(this.f411273d, "getMiniRefreshInterval = " + i17);
        return i17;
    }

    public final void U6(bq2.b bVar, dk2.zg zgVar) {
        boolean z17 = bVar.f23561b.isShown() && bVar.f23561b.isAttachedToWindow();
        com.tencent.mars.xlog.Log.i(this.f411273d, "notifyItemRangeChanged feedObject: " + bVar + " isAttachShow: " + z17);
        if (z17) {
            bVar.f23562c.notifyItemChanged(bVar.f23560a, zgVar);
        }
    }

    public final void V6(int i17, int i18) {
        java.util.ArrayList d17 = kz5.c0.d(13);
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f411275f;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f411276g;
        if (recyclerView == null || wxRecyclerAdapter == null) {
            return;
        }
        java.util.Iterator it = d17.iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            sp2.n3 n3Var = sp2.n3.f411116a;
            java.util.ArrayList d18 = kz5.c0.d(java.lang.Integer.valueOf(intValue));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(n3Var.a(i17, i18, recyclerView, wxRecyclerAdapter, d18));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                bq2.b bVar = (bq2.b) it6.next();
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) this.f411281o.get(java.lang.Integer.valueOf(intValue));
                if (concurrentHashMap != null) {
                }
                com.tencent.mars.xlog.Log.i(this.f411273d, "resetRequestSceneInterval for " + bVar + " from scene " + intValue);
            }
        }
    }

    public final void W6(int i17, int i18) {
        com.tencent.mars.xlog.Log.i(this.f411273d, "startRequestCgi first: " + i17 + " last: " + i18);
        this.f411277h = true;
        this.f411278i = i17;
        this.f411279m = i18;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f411275f;
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f411276g;
        if (recyclerView == null || wxRecyclerAdapter == null) {
            return;
        }
        kotlinx.coroutines.y0 lifecycleScope = getLifecycleScope();
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.l.d(lifecycleScope, kotlinx.coroutines.internal.b0.f310484a, null, new sp2.v3(this, i17, i18, recyclerView, wxRecyclerAdapter, null), 2, null);
    }

    public final void X6() {
        boolean z17 = false;
        this.f411277h = false;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.plugin.finder.ui.MMFinderUI mMFinderUI = activity instanceof com.tencent.mm.plugin.finder.ui.MMFinderUI ? (com.tencent.mm.plugin.finder.ui.MMFinderUI) activity : null;
        if (mMFinderUI != null && mMFinderUI.isPaused()) {
            z17 = true;
        }
        java.lang.String str = this.f411273d;
        if (z17) {
            com.tencent.mars.xlog.Log.i(str, "startTimer fail, page is paused");
            return;
        }
        int T6 = T6();
        sp2.w3 w3Var = this.f411282p;
        w3Var.removeMessages(1);
        com.tencent.mars.xlog.Log.i(str, "startTimer refreshInterval: " + T6);
        if (T6 > 0) {
            this.f411281o.clear();
            w3Var.sendEmptyMessageDelayed(1, T6 * 1000);
        }
    }

    public final void Y6() {
        com.tencent.mars.xlog.Log.i(this.f411273d, "stopTimer");
        this.f411282p.removeMessages(1);
    }

    public final void Z6(r45.ha2 ha2Var) {
        this.f411274e = ha2Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateAsyncInfoConfig: highTag=");
        sb6.append(ha2Var != null ? java.lang.Integer.valueOf(ha2Var.getInteger(0)) : null);
        sb6.append(" product=");
        sb6.append(ha2Var != null ? java.lang.Integer.valueOf(ha2Var.getInteger(2)) : null);
        sb6.append(", agg=");
        sb6.append(ha2Var != null ? java.lang.Integer.valueOf(ha2Var.getInteger(1)) : null);
        sb6.append(", playTogether=");
        sb6.append(ha2Var != null ? java.lang.Integer.valueOf(ha2Var.getInteger(3)) : null);
        com.tencent.mm.sdk.platformtools.Log.c(this.f411273d, sb6.toString(), new java.lang.Object[0]);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i(this.f411273d, "onDestroy");
        Y6();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        Y6();
        com.tencent.mars.xlog.Log.i(this.f411273d, "onPause");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        com.tencent.mars.xlog.Log.i(this.f411273d, "onResume");
        X6();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f411273d = "LiveSquareTimeRefreshingUIC_" + hashCode();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(13);
        arrayList.add(14);
        this.f411280n = arrayList;
        this.f411281o = new java.util.concurrent.ConcurrentHashMap();
        this.f411282p = new sp2.w3(this, android.os.Looper.getMainLooper());
    }
}
