package yi2;

/* loaded from: classes10.dex */
public final class i0 implements si2.a {
    public final java.util.Map A;
    public final java.util.Map B;
    public boolean C;
    public final java.util.Map D;
    public final androidx.recyclerview.widget.RecyclerView E;
    public final wi2.c F;
    public final jz5.g G;
    public final jz5.g H;
    public final yi2.d0 I;

    /* renamed from: J, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.live.view.c2 f462517J;
    public final com.tencent.mm.app.s2 K;
    public final android.os.Handler L;

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f462518d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f462519e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.x7 f462520f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f462521g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f462522h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f462523i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f462524m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f462525n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.ArrayList f462526o;

    /* renamed from: p, reason: collision with root package name */
    public java.util.ArrayList f462527p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f462528q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f462529r;

    /* renamed from: s, reason: collision with root package name */
    public byte[] f462530s;

    /* renamed from: t, reason: collision with root package name */
    public int f462531t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f462532u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f462533v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f462534w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f462535x;

    /* renamed from: y, reason: collision with root package name */
    public byte[] f462536y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.Map f462537z;

    public i0(gk2.e liveData, android.view.ViewGroup root, com.tencent.mm.plugin.finder.live.plugin.x7 plugin) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f462518d = liveData;
        this.f462519e = root;
        this.f462520f = plugin;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f462521g = arrayList;
        this.f462522h = new java.util.ArrayList();
        this.f462523i = new java.util.ArrayList();
        this.f462524m = new java.util.ArrayList();
        this.f462525n = new java.util.ArrayList();
        this.f462526o = new java.util.ArrayList();
        this.f462527p = new java.util.ArrayList();
        this.f462529r = jz5.h.b(new yi2.h0(this));
        this.f462533v = true;
        this.f462537z = new java.util.LinkedHashMap();
        this.A = new java.util.LinkedHashMap();
        this.B = new java.util.LinkedHashMap();
        this.C = true;
        this.D = new java.util.LinkedHashMap();
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) root.findViewById(com.tencent.mm.R.id.tm7);
        this.E = recyclerView;
        this.G = jz5.h.b(new yi2.z(this));
        this.H = jz5.h.b(new yi2.y(this));
        this.I = new yi2.d0(this);
        this.L = new android.os.Handler(android.os.Looper.getMainLooper());
        float dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.StaggeredGridLayoutManager(2, 1));
        recyclerView.setAdapter(new yi2.q(new com.tencent.mm.plugin.finder.live.mic.pk.factory.FinderLiveMicAnchorConvertFactory(liveData, this), arrayList));
        recyclerView.N(new yi2.r(dimensionPixelSize));
        recyclerView.O(new yi2.s(this));
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        kotlin.jvm.internal.o.f(recyclerView, "recyclerView");
        this.F = new wi2.c(context, recyclerView, arrayList);
        this.K = new yi2.v(this);
    }

    @Override // si2.a
    public void a() {
        this.f462528q = !this.f462528q;
        l();
    }

    @Override // si2.a
    public void b() {
        fj2.s.f263183a.a(ml2.k1.f327639f);
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f462520f;
        x7Var.f365323d.setBackground(null);
        x7Var.D1();
        ((qi2.v) ((jz5.n) this.G).getValue()).I(((mm2.y2) this.f462518d.a(mm2.y2.class)).f329563p, true);
    }

    @Override // si2.a
    public void c() {
        com.tencent.mm.plugin.finder.live.view.c2 c2Var = this.f462517J;
        if (c2Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.p7 p7Var = (com.tencent.mm.plugin.finder.live.plugin.p7) c2Var;
            com.tencent.mm.plugin.finder.live.view.e2 e2Var = p7Var.f113839b;
            boolean N6 = ((mm2.y2) e2Var.getLiveData().a(mm2.y2.class)).N6(true, 1, false);
            com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = p7Var.f113838a;
            if (!N6) {
                com.tencent.mars.xlog.Log.i(x7Var.f115037q, "onInviteAnchorClick invalid");
                return;
            }
            fj2.s.f263183a.d(ml2.q2.H, e2Var.getAiAssistantId(), null);
            com.tencent.mm.plugin.finder.live.widget.mn mnVar = x7Var.f115046z;
            com.tencent.mm.plugin.finder.live.view.e2 e2Var2 = x7Var.S;
            if (e2Var2 == null) {
                kotlin.jvm.internal.o.o("finderLiveApplyLinkAnchorView");
                throw null;
            }
            mnVar.B = e2Var2.getAiAssistantId();
            com.tencent.mm.plugin.finder.live.widget.mn mnVar2 = x7Var.f115046z;
            com.tencent.mm.plugin.finder.live.widget.pp ppVar = mnVar2.f119096t;
            ppVar.getClass();
            dk2.xf k17 = dk2.ef.f233372a.k(ppVar.f119395a);
            if (k17 != null) {
                ((dk2.r4) k17).C(null, null, new com.tencent.mm.plugin.finder.live.widget.op(ppVar));
            }
            ((java.util.LinkedHashMap) ppVar.f119404j).clear();
            android.view.ViewGroup viewGroup = mnVar2.f119083d;
            viewGroup.setVisibility(0);
            viewGroup.animate().translationX(0.0f).setListener(null).start();
            ((java.util.LinkedHashMap) mnVar2.C).clear();
            ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f327827p, "", -1, -1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // si2.a
    public void d(int i17, km2.q micUser) {
        java.lang.Object obj;
        java.util.List list;
        java.util.ArrayList arrayList;
        java.util.List list2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(micUser, "micUser");
        if ((micUser.f309181l == 7) == true) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.dm6), 0).show();
            return;
        }
        mm2.y2 y2Var = (mm2.y2) this.f462518d.a(mm2.y2.class);
        java.util.Map map = ((mm2.o4) y2Var.business(mm2.o4.class)).f329326u;
        kotlin.jvm.internal.o.d(map);
        java.lang.String str = micUser.f309170a;
        synchronized (map) {
            obj = map.get(str);
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
        java.lang.Object obj2 = null;
        r4 = null;
        java.lang.String str2 = null;
        if (!y2Var.N6(true, (arrayList2 != null ? arrayList2.size() : 0) + 1, true)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("acceptAnchor invalid position: ");
            sb6.append(i17);
            sb6.append(" nick: ");
            r45.xn1 xn1Var = micUser.f309187r;
            if (xn1Var != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
                str2 = finderContact.getNickname();
            }
            sb6.append(str2);
            com.tencent.mars.xlog.Log.i("RecyclerViewAdapterEx", sb6.toString());
            return;
        }
        fj2.s.f263183a.d(ml2.q2.S, this.f462535x, new hi2.a(micUser));
        gk2.e eVar = this.f462518d;
        if (eVar != null && (list2 = ((mm2.o4) eVar.a(mm2.o4.class)).f329318o) != null) {
            synchronized (list2) {
                java.util.Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (kotlin.jvm.internal.o.b(((km2.q) next).f309170a, micUser.f309170a)) {
                        obj2 = next;
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj2;
            if (qVar != null) {
                qVar.f309181l = 6;
            }
        }
        gk2.e eVar2 = this.f462518d;
        if (eVar2 != null && (list = ((mm2.o4) eVar2.a(mm2.o4.class)).f329318o) != null) {
            synchronized (list) {
                arrayList = new java.util.ArrayList();
                for (java.lang.Object obj3 : list) {
                    km2.q qVar2 = (km2.q) obj3;
                    if ((!kotlin.jvm.internal.o.b(qVar2.f309170a, micUser.f309170a) && qVar2.f309177h && qVar2.f309181l == 0) != false) {
                        arrayList.add(obj3);
                    }
                }
            }
            synchronized (arrayList) {
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    ((km2.q) it6.next()).f309181l = 7;
                }
            }
        }
        l();
        com.tencent.mm.plugin.finder.live.view.c2 c2Var = this.f462517J;
        if (c2Var != null) {
            ((com.tencent.mm.plugin.finder.live.plugin.p7) c2Var).a(micUser);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0179  */
    @Override // si2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(int r52, r45.xn1 r53) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yi2.i0.e(int, r45.xn1):void");
    }

    @Override // si2.a
    public void f(int i17, r45.xn1 xn1Var) {
        java.util.List list;
        java.lang.Object obj;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        gk2.e eVar = this.f462518d;
        if (eVar != null && (list = ((mm2.o4) eVar.a(mm2.o4.class)).f329319p) != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    obj = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    java.lang.String str = ((km2.q) next).f309172c;
                    if (xn1Var != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
                        obj = finderContact.getUsername();
                    }
                    if (kotlin.jvm.internal.o.b(str, obj)) {
                        obj = next;
                        break;
                    }
                }
            }
            km2.q qVar = (km2.q) obj;
            if (qVar != null) {
                qVar.f309181l = 6;
            }
        }
        l();
        com.tencent.mm.plugin.finder.live.view.c2 c2Var = this.f462517J;
        if (c2Var != null) {
            ((com.tencent.mm.plugin.finder.live.plugin.p7) c2Var).c(xn1Var);
        }
    }

    @Override // si2.a
    public void g() {
        fj2.s.c(fj2.s.f263183a, ml2.q2.C, null, null, 0, 0, 30, null);
        com.tencent.mm.plugin.finder.live.view.c2 c2Var = this.f462517J;
        if (c2Var != null) {
            fj2.j jVar = fj2.j.f263174a;
            com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = ((com.tencent.mm.plugin.finder.live.plugin.p7) c2Var).f113838a;
            com.tencent.mm.ui.widget.dialog.k0 k0Var = x7Var.P;
            android.content.Context context = x7Var.f365323d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            x7Var.P = jVar.c(k0Var, context, new com.tencent.mm.plugin.finder.live.plugin.o7(x7Var));
        }
    }

    @Override // si2.a
    public void h() {
        fj2.s.f263183a.d(ml2.q2.W, this.f462535x, null);
        long j17 = ((mm2.o4) this.f462518d.a(mm2.o4.class)).U.f377134i;
        jz5.g gVar = this.H;
        ((yi2.c) ((jz5.n) gVar).getValue()).f462500i = this.f462535x;
        yi2.c cVar = (yi2.c) ((jz5.n) gVar).getValue();
        int i17 = (int) j17;
        cVar.getClass();
        com.tencent.mars.xlog.Log.i("FinderLiveAnchorMicSettingsPanelWidget", "Opening panel with setting: " + i17);
        cVar.f462503o = i17;
        cVar.y(i17);
        cVar.w();
        ((com.tencent.mm.plugin.finder.live.plugin.l7) this.f462520f.F).i();
    }

    @Override // si2.a
    public void i() {
        com.tencent.mm.plugin.finder.live.view.c2 c2Var = this.f462517J;
        if (c2Var != null) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.k1 k1Var = ml2.k1.f327638e;
            ml2.y4 y4Var = ml2.j0.f327583i;
            ((ml2.j0) c17).Bj(12, null);
            com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = ((com.tencent.mm.plugin.finder.live.plugin.p7) c2Var).f113838a;
            ((mm2.o4) x7Var.P0(mm2.o4.class)).R = 1;
            x7Var.E1();
        }
    }

    public final java.util.ArrayList j() {
        java.lang.Object obj;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.Object obj2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.addAll(this.f462524m);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            java.lang.Object obj3 = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            km2.q qVar = (km2.q) next;
            java.util.List list = ((mm2.o4) this.f462518d.a(mm2.o4.class)).f329324s;
            kotlin.jvm.internal.o.f(list, "<get-anchorPkMicUserList>(...)");
            synchronized (list) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        break;
                    }
                    java.lang.Object next2 = it6.next();
                    java.lang.String str = ((km2.q) next2).f309172c;
                    r45.xn1 xn1Var = qVar.f309187r;
                    if (kotlin.jvm.internal.o.b(str, (xn1Var == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact3.getUsername())) {
                        obj3 = next2;
                        break;
                    }
                }
            }
            if (obj3 == null) {
                arrayList3.add(next);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj4 : arrayList3) {
            km2.q qVar2 = (km2.q) obj4;
            java.util.List list2 = ((mm2.o4) this.f462518d.a(mm2.o4.class)).f329325t;
            kotlin.jvm.internal.o.f(list2, "<get-anchorPkMicUserTempList>(...)");
            synchronized (list2) {
                java.util.Iterator it7 = list2.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it7.next();
                    java.lang.String str2 = ((km2.q) obj2).f309172c;
                    r45.xn1 xn1Var2 = qVar2.f309187r;
                    if (kotlin.jvm.internal.o.b(str2, (xn1Var2 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact2.getUsername())) {
                        break;
                    }
                }
            }
            if (obj2 == null) {
                arrayList4.add(obj4);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (java.lang.Object obj5 : arrayList4) {
            km2.q qVar3 = (km2.q) obj5;
            java.util.List list3 = ((mm2.o4) this.f462518d.a(mm2.o4.class)).f329318o;
            kotlin.jvm.internal.o.f(list3, "<get-linkMicUserList>(...)");
            synchronized (list3) {
                java.util.Iterator it8 = list3.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it8.next();
                    java.lang.String str3 = ((km2.q) obj).f309172c;
                    r45.xn1 xn1Var3 = qVar3.f309187r;
                    if (kotlin.jvm.internal.o.b(str3, (xn1Var3 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact.getUsername())) {
                        break;
                    }
                }
            }
            if (obj == null) {
                arrayList5.add(obj5);
            }
        }
        arrayList.addAll(arrayList5);
        return arrayList;
    }

    public final void k() {
        if (!this.f462533v || this.f462532u) {
            com.tencent.mars.xlog.Log.i("FinderLiveMicAnchorWidget", "loadRecommInfo() skipped - isRecommendMoreData=" + this.f462533v + ", isRecommendLoading=" + this.f462532u);
            return;
        }
        byte[] bArr = this.f462524m.size() == 0 ? this.f462536y : null;
        this.f462532u = true;
        dk2.xf k17 = dk2.ef.f233372a.k(this.f462518d);
        if (k17 != null) {
            ((dk2.r4) k17).C(this.f462530s, bArr, new yi2.c0(this));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04ea A[EDGE_INSN: B:254:0x04ea->B:255:0x04ea BREAK  A[LOOP:12: B:245:0x04be->B:267:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x050e  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:267:? A[LOOP:12: B:245:0x04be->B:267:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yi2.i0.l():void");
    }
}
