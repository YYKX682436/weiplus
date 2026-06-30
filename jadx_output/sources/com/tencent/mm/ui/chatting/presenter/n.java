package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes9.dex */
public class n extends com.tencent.mm.ui.chatting.presenter.y {

    /* renamed from: u, reason: collision with root package name */
    public static final int[] f202350u = {553648177, 587202609};

    /* renamed from: v, reason: collision with root package name */
    public static final java.lang.String[] f202351v = {"msgId", "type", "createTime", "talker", "content", "isSend", "msgSvrId", "imgPath", "reserved", "flag", "status"};

    /* renamed from: s, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f202352s;

    /* renamed from: t, reason: collision with root package name */
    public final o11.g f202353t;

    public n(android.content.Context context) {
        super(context);
        this.f202352s = new java.util.concurrent.atomic.AtomicBoolean(false);
        o11.f fVar = new o11.f();
        fVar.f342091o = com.tencent.mm.R.raw.app_brand_app_default_icon_for_tail;
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);
        int b18 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 50);
        fVar.f342086j = b17;
        fVar.f342087k = b18;
        fVar.f342077a = true;
        this.f202353t = fVar.a();
    }

    public static java.util.Map p(com.tencent.mm.ui.chatting.presenter.n nVar, java.util.List list) {
        nVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        if (!list.isEmpty() && !nVar.f202352s.get()) {
            java.lang.String X8 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).X8(nVar.f202542e);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i17 = 0;
            for (int i18 = 0; i18 < 11; i18++) {
                if (i18 > 0) {
                    sb6.append(",");
                }
                sb6.append(f202351v[i18]);
            }
            java.lang.String[] strArr = {"SELECT " + ((java.lang.Object) sb6) + " FROM " + X8 + " WHERE msgId IN (", ")"};
            java.lang.String str = strArr[0];
            java.lang.String str2 = strArr[1];
            int size = ((list.size() + 200) - 1) / 200;
            java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(size);
            while (i17 < list.size()) {
                int i19 = i17 + 200;
                int min = java.lang.Math.min(i19, list.size());
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                for (int i27 = i17; i27 < min; i27++) {
                    if (i27 > i17) {
                        sb7.append(",");
                    }
                    sb7.append(list.get(i27));
                }
                ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.d(nVar, str + sb7.toString() + str2, concurrentHashMap, countDownLatch));
                i17 = i19;
            }
            try {
                countDownLatch.await();
            } catch (java.lang.InterruptedException unused) {
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryListPresenter", "[perf] batchRawQuery:%dms, batches:%d, msgIds:%d, found:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(list.size()), java.lang.Integer.valueOf(concurrentHashMap.size()));
        }
        return concurrentHashMap;
    }

    public static void q(com.tencent.mm.ui.chatting.presenter.n nVar, java.util.List list, java.util.Map map, com.tencent.mm.storage.a3 a3Var, java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue) {
        nVar.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (list.isEmpty() || nVar.f202352s.get()) {
            return;
        }
        int size = list.size();
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(((size + 50) - 1) / 50);
        int i17 = 0;
        while (i17 < size) {
            int i18 = i17 + 50;
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.presenter.e(nVar, i17, java.lang.Math.min(i18, size), list, map, a3Var, concurrentLinkedQueue, countDownLatch));
            i17 = i18;
        }
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandHistoryListPresenter", "[perf] Phase1c-parse:%dms, validItems:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis), java.lang.Integer.valueOf(concurrentLinkedQueue.size()));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.tencent.mm.ui.chatting.presenter.l r(com.tencent.mm.ui.chatting.presenter.n r12, com.tencent.mm.storage.f9 r13, com.tencent.mm.storage.a3 r14) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.presenter.n.r(com.tencent.mm.ui.chatting.presenter.n, com.tencent.mm.storage.f9, com.tencent.mm.storage.a3):com.tencent.mm.ui.chatting.presenter.l");
    }

    @Override // zb5.h
    public void a(boolean z17) {
        o();
        this.f202543f.P(z17);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.ui.chatting.presenter.b(this), "HistoryLoadData");
    }

    @Override // zb5.h
    public java.lang.String b() {
        return this.f202541d.getString(com.tencent.mm.R.string.icc);
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 c(android.view.ViewGroup viewGroup, int i17) {
        return new com.tencent.mm.ui.chatting.presenter.m(this, android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.i_, viewGroup, false));
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public void d(androidx.recyclerview.widget.k3 k3Var, int i17, int i18) {
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public androidx.recyclerview.widget.k3 e(android.view.ViewGroup viewGroup, int i17) {
        return null;
    }

    @Override // com.tencent.mm.ui.chatting.adapter.j0
    public void f(com.tencent.mm.ui.chatting.adapter.e0 e0Var, int i17, int i18) {
        com.tencent.mm.ui.chatting.presenter.m mVar = (com.tencent.mm.ui.chatting.presenter.m) e0Var;
        com.tencent.mm.ui.chatting.presenter.k kVar = (com.tencent.mm.ui.chatting.presenter.k) h(i17);
        ot0.a aVar = (ot0.a) kVar.f202291k.y(ot0.a.class);
        if (aVar == null || aVar.f348366v != 1) {
            mVar.f202332m.setVisibility(8);
        } else {
            mVar.f202332m.setVisibility(0);
        }
        java.lang.String str = kVar.f202293m;
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        o11.g gVar = this.f202353t;
        java.lang.String str2 = kVar.f202294n;
        if (K0) {
            mVar.f202333n.setVisibility(8);
            n11.a.b().h(str2, mVar.f202331i, gVar);
            return;
        }
        mVar.f202333n.setVisibility(0);
        android.widget.TextView textView = mVar.f198404g;
        java.lang.CharSequence text = textView.getText();
        android.widget.TextView textView2 = mVar.f202333n;
        textView2.setText(text);
        textView.setText(str);
        mVar.i(textView2, this.f202544g.f198433e);
        java.lang.String str3 = kVar.f202295o;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            n11.a.b().h(str2, mVar.f202331i, gVar);
        } else {
            l01.d0.f314761a.n(new com.tencent.mm.ui.chatting.presenter.j(this, mVar, kVar), str3, null, ((ij1.j) ((k01.u0) i95.n0.c(k01.u0.class))).Bi(45, 45));
        }
    }

    @Override // zb5.h
    public java.lang.String g() {
        return this.f202541d.getString(com.tencent.mm.R.string.icc);
    }

    @Override // zb5.h
    public int getType() {
        return 33;
    }

    @Override // zb5.h
    public com.tencent.mm.ui.chatting.adapter.i0 i() {
        return new com.tencent.mm.ui.chatting.presenter.i(this);
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y
    public int k() {
        return 6;
    }

    @Override // com.tencent.mm.ui.chatting.presenter.y, com.tencent.mm.ui.chatting.presenter.z
    public void onDetach() {
        this.f202352s.set(true);
        super.onDetach();
    }

    public final void s(com.tencent.mm.ui.chatting.presenter.k kVar, java.lang.String str) {
        java.lang.String d17 = te5.e2.d(pt0.f0.Li(this.f202542e, kVar.f198411d));
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17) || !te5.e2.a(str, d17)) {
            return;
        }
        ot0.q qVar = kVar.f202291k;
        ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
        if (aVar == null) {
            aVar = new ot0.a();
            qVar.f(aVar);
        }
        aVar.R = d17;
    }
}
