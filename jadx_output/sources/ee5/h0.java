package ee5;

/* loaded from: classes9.dex */
public final class h0 extends com.tencent.mm.ui.component.UIComponent implements o13.x {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public com.tencent.mm.ui.widget.dialog.u3 E;
    public kotlinx.coroutines.r2 F;
    public final java.util.HashMap G;
    public long H;
    public final java.util.concurrent.atomic.AtomicBoolean I;

    /* renamed from: J, reason: collision with root package name */
    public long f251894J;
    public boolean K;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f251895d;

    /* renamed from: e, reason: collision with root package name */
    public p13.c f251896e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f251897f;

    /* renamed from: g, reason: collision with root package name */
    public final androidx.lifecycle.j0 f251898g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.lifecycle.g0 f251899h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.List f251900i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f251901m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.ArrayList f251902n;

    /* renamed from: o, reason: collision with root package name */
    public p13.r f251903o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f251904p;

    /* renamed from: q, reason: collision with root package name */
    public zd5.g f251905q;

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f251906r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f251907s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f251908t;

    /* renamed from: u, reason: collision with root package name */
    public kotlinx.coroutines.r2 f251909u;

    /* renamed from: v, reason: collision with root package name */
    public aq.c f251910v;

    /* renamed from: w, reason: collision with root package name */
    public final ce5.d f251911w;

    /* renamed from: x, reason: collision with root package name */
    public kotlinx.coroutines.r2 f251912x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f251913y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f251914z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f251895d = "";
        this.f251897f = "";
        androidx.lifecycle.j0 j0Var = new androidx.lifecycle.j0(ae5.n.f4432d);
        this.f251898g = j0Var;
        this.f251899h = j0Var;
        this.f251900i = new java.util.ArrayList();
        this.f251901m = new java.util.ArrayList();
        this.f251902n = new java.util.ArrayList();
        this.f251906r = new java.util.ArrayList();
        this.f251907s = new java.util.ArrayList();
        this.f251910v = aq.c.f12842d;
        this.f251911w = new ce5.d();
        this.G = new java.util.HashMap();
        this.I = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public static final java.util.ArrayList O6(ee5.h0 h0Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2) {
        h0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "getInsetDataFromFlow >> " + arrayList.size() + ' ' + arrayList2.size());
        if (arrayList2.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "picImageList is empty");
            return arrayList;
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        long j17 = ((com.tencent.mm.api.QueryImageData) kz5.n0.i0(arrayList2)).f53204e;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.tencent.mm.api.QueryImageData queryImageData = (com.tencent.mm.api.QueryImageData) it.next();
            if (queryImageData.f53204e < j17) {
                arrayList3.add(queryImageData);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "getInsetDataFromFlow >> " + j17 + ", " + arrayList3.size());
        return arrayList3;
    }

    public final void P6(ae5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f251902n.remove(item);
        this.f251901m.remove(item);
        zd5.g gVar = this.f251905q;
        if (gVar != null) {
            java.util.ArrayList arrayList = this.f251902n;
            kotlin.jvm.internal.o.g(arrayList, "<set-?>");
            gVar.f471683f = arrayList;
        }
        zd5.g gVar2 = this.f251905q;
        if (gVar2 != null) {
            gVar2.notifyDataSetChanged();
        }
    }

    public final void Q6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "dismissDialog " + this.f251897f);
        kotlinx.coroutines.r2 r2Var = this.F;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.E;
        if (u3Var != null && u3Var.isShowing()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "go to dismiss " + this.f251897f);
            com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.E;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0074, code lost:
    
        if (r18.f251908t != false) goto L4;
     */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList R6() {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee5.h0.R6():java.util.ArrayList");
    }

    public final ae5.j S6(com.tencent.mm.api.QueryImageData queryImageData, zd5.a aVar) {
        java.lang.String s17;
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String str = ((ee5.e3) pf5.z.f353948a.a(activity).a(ee5.e3.class)).f251870f;
        com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(queryImageData.f53210n, queryImageData.f53203d);
        boolean R4 = com.tencent.mm.storage.z3.R4(this.f251895d);
        java.lang.String str2 = "";
        if (n17.A0() == 1) {
            s17 = c01.z1.r();
        } else {
            s17 = R4 ? c01.w9.s(n17.j()) : "";
            if (com.tencent.mm.sdk.platformtools.t8.K0(s17)) {
                s17 = n17.Q0();
            }
        }
        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(s17, true);
        if (this.f251904p != null) {
            if (!(s17 == null || s17.length() == 0)) {
                com.tencent.mm.storage.a3 a3Var = this.f251904p;
                kotlin.jvm.internal.o.d(a3Var);
                str2 = a3Var.z0(s17);
            }
        }
        if (str2.length() == 0) {
            str2 = n18 != null ? n18.w0() : null;
        }
        if (str2 == null || str2.length() == 0) {
            str2 = n18 != null ? n18.f2() : null;
        }
        java.lang.String str3 = str2;
        android.text.SpannableString m17 = o13.q.m(getString(aVar == zd5.a.f471652f ? com.tencent.mm.R.string.fgo : com.tencent.mm.R.string.fgn), getString(com.tencent.mm.R.string.fgp), str);
        zd5.b bVar = zd5.b.f471657f;
        long j17 = queryImageData.f53204e;
        long j18 = queryImageData.f53203d;
        return new ae5.j(aVar, bVar, n17.Q0(), str3, m17, k35.m1.f(getContext(), queryImageData.f53204e, true, false), queryImageData.f53205f, n18 != null ? n18.d1() : null, j18, null, this.f251903o, j17, 512, null);
    }

    public final void T6(java.util.ArrayList list, zd5.a type, java.util.ArrayList targetList) {
        boolean z17;
        kotlin.jvm.internal.o.g(list, "list");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(targetList, "targetList");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "size: " + list.size() + ", " + type + ", " + targetList.size());
        if (targetList.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                targetList.add(S6((com.tencent.mm.api.QueryImageData) it.next(), type));
            }
            return;
        }
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            com.tencent.mm.api.QueryImageData queryImageData = (com.tencent.mm.api.QueryImageData) it6.next();
            int size = targetList.size();
            boolean z18 = false;
            int i17 = 0;
            while (true) {
                if (i17 >= size) {
                    z17 = false;
                    break;
                }
                z17 = true;
                if (queryImageData.f53204e == ((ae5.j) targetList.get(i17)).f4422l) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "insetImageToResult find similar");
                    break;
                }
                if (queryImageData.f53204e > ((ae5.j) targetList.get(i17)).f4422l) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "insetImageToResult find inset");
                    targetList.add(i17, S6(queryImageData, type));
                    z17 = false;
                    z18 = true;
                    break;
                }
                i17++;
            }
            if (!z18 && !z17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "insetImageToResult in last");
                targetList.add(targetList.size(), S6(queryImageData, type));
            }
        }
    }

    public final void U6(aq.c type) {
        kotlin.jvm.internal.o.g(type, "type");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "updateCurrentIdentifyType >> " + type);
        this.f251910v = type;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x01c4, code lost:
    
        if (r29.D == false) goto L34;
     */
    @Override // o13.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void X2(p13.v r30) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee5.h0.X2(p13.v):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String stringExtra = getIntent().getStringExtra("detail_username");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f251895d = stringExtra;
        this.f251904p = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f251895d);
        this.E = com.tencent.mm.ui.widget.dialog.u3.c(getActivity(), getString(com.tencent.mm.R.string.ffj), false, 3, null);
        de5.a aVar = de5.a.f229396a;
        java.lang.String userName = this.f251895d;
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "reset");
        de5.a.f229397b = "";
        de5.a.f229398c = "";
        de5.a.f229399d = "";
        de5.a.f229400e = 0;
        de5.a.f229401f = "";
        de5.a.f229402g = 1;
        de5.a.f229403h = 0L;
        de5.a.f229404i = 0L;
        de5.a.f229405j.clear();
        de5.a.f229407l = false;
        de5.a.f229406k = 0L;
        de5.a.f229409n = 0;
        de5.a.f229397b = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiReporter", "setUserName >> " + userName + ", setSessionId >> " + de5.a.f229397b);
        de5.a.f229399d = userName;
        aVar.g(1);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        if (!this.K && this.H != 0) {
            java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.I;
            if (!atomicBoolean.get()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - this.H;
                this.K = true;
                atomicBoolean.set(true);
                com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemAllResultUIC", "reportKeywordSearchIfPending >> keyword search exit, duration: " + currentTimeMillis + "ms");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_history_search_keyword_result_exit", kz5.c1.k(new jz5.l("search_chat_sessionid", de5.a.f229397b), new jz5.l("clk_search_sessionid", de5.a.f229398c), new jz5.l("keyword_input_exit_duration", java.lang.Long.valueOf(currentTimeMillis)), new jz5.l("chat_name", this.f251895d), new jz5.l("search_result_cnt", java.lang.Integer.valueOf(this.f251902n.size())), new jz5.l("search_query", this.f251897f)), 38014);
            }
        }
        if (this.f251896e != null) {
            ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f251896e);
        }
        kotlinx.coroutines.r2 r2Var = this.f251909u;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var2 = this.F;
        if (r2Var2 != null) {
            kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
        }
        kotlinx.coroutines.r2 r2Var3 = this.f251912x;
        if (r2Var3 != null) {
            kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
        }
        ce5.d dVar = this.f251911w;
        dVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.LoadMoreImageDataModel", "destroy");
        dVar.f40812a = null;
        kotlinx.coroutines.r2 r2Var4 = dVar.f40814c;
        if (r2Var4 != null) {
            kotlinx.coroutines.p2.a(r2Var4, null, 1, null);
        }
        kotlinx.coroutines.z0.e(dVar.f40813b, null, 1, null);
        this.G.clear();
    }
}
