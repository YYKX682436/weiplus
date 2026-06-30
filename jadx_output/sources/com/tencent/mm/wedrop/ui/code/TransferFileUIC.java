package com.tencent.mm.wedrop.ui.code;

/* loaded from: classes5.dex */
public final class TransferFileUIC extends wm3.a implements ll5.h {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f214275d;

    /* renamed from: e, reason: collision with root package name */
    public em.j4 f214276e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f214277f;

    /* renamed from: g, reason: collision with root package name */
    public bw5.wd0 f214278g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f214279h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f214280i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f214281m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f214282n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f214283o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.wedrop.ui.code.TransferFileUIC$wifiEventReceiver$1 f214284p;

    /* renamed from: q, reason: collision with root package name */
    public long f214285q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.wedrop.ui.code.TransferFileUIC$apEventReceiver$1 f214286r;

    /* renamed from: s, reason: collision with root package name */
    public aq5.r0 f214287s;

    /* renamed from: t, reason: collision with root package name */
    public int f214288t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.tencent.mm.wedrop.ui.code.TransferFileUIC$wifiEventReceiver$1] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.tencent.mm.wedrop.ui.code.TransferFileUIC$apEventReceiver$1] */
    public TransferFileUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f214281m = jz5.h.b(new fq5.i(this));
        this.f214282n = jz5.h.b(new fq5.c(this));
        this.f214283o = new com.tencent.mm.sdk.coroutines.LifecycleScope("wedropScope", activity, 0, 4, null);
        this.f214284p = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.wedrop.ui.code.TransferFileUIC$wifiEventReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                if (context == null || intent == null) {
                    return;
                }
                jq5.l lVar = jq5.n.f301282a;
                boolean z17 = lVar.c() && lVar.e();
                com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC = com.tencent.mm.wedrop.ui.code.TransferFileUIC.this;
                if (!z17) {
                    transferFileUIC.V6(2);
                    return;
                }
                int i17 = transferFileUIC.f214288t;
                if (i17 == 2 || i17 == 5) {
                    transferFileUIC.U6();
                }
            }
        };
        this.f214286r = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.wedrop.ui.code.TransferFileUIC$apEventReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                if (context == null || intent == null) {
                    return;
                }
                com.tencent.mm.wedrop.ui.code.TransferFileUIC transferFileUIC = com.tencent.mm.wedrop.ui.code.TransferFileUIC.this;
                int i17 = transferFileUIC.f214288t;
                if (i17 == 4 || i17 == 6) {
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.TransferFileUIC", "apEventReceiver() called with: now = " + elapsedRealtime);
                    if (elapsedRealtime - transferFileUIC.f214285q > 200) {
                        transferFileUIC.f214285q = elapsedRealtime;
                        transferFileUIC.U6();
                    }
                }
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x02cb, code lost:
    
        if (r9 == null) goto L200;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void T6(com.tencent.mm.wedrop.ui.code.TransferFileUIC r9, int r10) {
        /*
            Method dump skipped, instructions count: 804
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.wedrop.ui.code.TransferFileUIC.T6(com.tencent.mm.wedrop.ui.code.TransferFileUIC, int):void");
    }

    public final void U6() {
        if (jq5.b.f301255a.b().i("is_first_receive", true)) {
            V6(1);
            return;
        }
        V6(3);
        v65.i.b(this.f214283o, null, new fq5.d(this, null), 1, null);
    }

    public final void V6(int i17) {
        android.view.View view;
        em.j4 j4Var = this.f214276e;
        if (j4Var == null || (view = j4Var.f254476a) == null) {
            return;
        }
        view.post(new fq5.j(this, i17));
    }

    @Override // ll5.h
    public android.view.View i2() {
        com.tencent.mm.ui.widget.code.CodeItemView codeItemView = new com.tencent.mm.ui.widget.code.CodeItemView(getContext(), null, 2, null);
        ll5.a aVar = new ll5.a();
        aVar.f319266d = com.tencent.mm.R.raw.radar;
        aVar.f319267e = codeItemView.getContext().getColor(com.tencent.mm.R.color.Indigo_100);
        java.lang.String string = codeItemView.getContext().getString(com.tencent.mm.R.string.nyv);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        aVar.f319268f = string;
        java.lang.String string2 = codeItemView.getContext().getString(com.tencent.mm.R.string.nyt);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        aVar.f319269g = string2;
        ((hs.d0) ((kd0.i2) i95.n0.c(kd0.i2.class))).wi(kd0.g3.f306649n, aVar, ((java.lang.Number) ((jz5.n) this.f214281m).getValue()).intValue(), null);
        aVar.f319271i = new fq5.a(this, codeItemView);
        codeItemView.setViewModel(aVar);
        return codeItemView;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f214284p, intentFilter);
        android.content.IntentFilter intentFilter2 = new android.content.IntentFilter();
        intentFilter2.addAction("android.net.wifi.WIFI_AP_STATE_CHANGED");
        intentFilter2.addAction("android.net.conn.TETHER_STATE_CHANGED");
        com.tencent.mm.sdk.platformtools.x2.f193071a.registerReceiver(this.f214286r, intentFilter2);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (!this.f214279h) {
            aq5.p0.f13273a.f(this.f214287s, true);
        }
        com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(this.f214284p);
        com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(this.f214286r);
        com.tencent.mars.xlog.Log.i("MicroMsg.WeDrop.TransferFileUIC", "onDestroy() called, hasGoToTransferPage:" + this.f214279h);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        if (r2 == true) goto L18;
     */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            r10 = this;
            boolean r0 = r10.f214277f
            if (r0 != 0) goto L5
            goto L5c
        L5:
            int r0 = r10.f214288t
            r1 = 1
            r2 = 2
            r3 = 0
            if (r0 != r2) goto L3b
            em.j4 r0 = r10.f214276e
            if (r0 == 0) goto L34
            com.tencent.mm.wedrop.ui.view.PermissionAreaView r0 = r0.d()
            if (r0 == 0) goto L34
            java.util.List r0 = r0.f214291f
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r2 = r1
        L1f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r0.next()
            com.tencent.mm.wedrop.ui.view.PermissionLineView r4 = (com.tencent.mm.wedrop.ui.view.PermissionLineView) r4
            boolean r4 = r4.g()
            r2 = r2 & r4
            goto L1f
        L31:
            if (r2 != r1) goto L34
            goto L35
        L34:
            r1 = r3
        L35:
            if (r1 == 0) goto L5a
            r10.U6()
            goto L5a
        L3b:
            if (r0 == r1) goto L5a
            r1 = 3
            if (r0 == r1) goto L5a
            boolean r0 = r10.f214279h
            if (r0 == 0) goto L5a
            androidx.appcompat.app.AppCompatActivity r0 = r10.getActivity()
            kotlinx.coroutines.y0 r4 = v65.m.b(r0)
            kotlinx.coroutines.p0 r5 = kotlinx.coroutines.q1.f310568a
            r6 = 0
            fq5.n r7 = new fq5.n
            r0 = 0
            r7.<init>(r10, r0)
            r8 = 2
            r9 = 0
            kotlinx.coroutines.l.d(r4, r5, r6, r7, r8, r9)
        L5a:
            r10.f214279h = r3
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.wedrop.ui.code.TransferFileUIC.onResume():void");
    }
}
