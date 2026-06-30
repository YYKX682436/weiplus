package ee5;

/* loaded from: classes9.dex */
public final class a0 extends qz5.l implements yz5.p {
    public final /* synthetic */ java.util.ArrayList A;
    public final /* synthetic */ java.util.ArrayList B;
    public final /* synthetic */ java.util.ArrayList C;
    public final /* synthetic */ java.util.ArrayList D;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ee5.h0 f251792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251793e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251794f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251795g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251796h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251797i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251798m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251799n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251800o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251801p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251802q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251803r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251804s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251805t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251806u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251807v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251808w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251809x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251810y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f251811z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(ee5.h0 h0Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4, java.util.ArrayList arrayList5, java.util.ArrayList arrayList6, java.util.ArrayList arrayList7, java.util.ArrayList arrayList8, java.util.ArrayList arrayList9, java.util.ArrayList arrayList10, java.util.ArrayList arrayList11, java.util.ArrayList arrayList12, java.util.ArrayList arrayList13, java.util.ArrayList arrayList14, java.util.ArrayList arrayList15, java.util.ArrayList arrayList16, java.util.ArrayList arrayList17, java.util.ArrayList arrayList18, java.util.ArrayList arrayList19, java.util.ArrayList arrayList20, java.util.ArrayList arrayList21, java.util.ArrayList arrayList22, java.util.ArrayList arrayList23, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f251792d = h0Var;
        this.f251793e = arrayList;
        this.f251794f = arrayList2;
        this.f251795g = arrayList3;
        this.f251796h = arrayList4;
        this.f251797i = arrayList5;
        this.f251798m = arrayList6;
        this.f251799n = arrayList7;
        this.f251800o = arrayList8;
        this.f251801p = arrayList9;
        this.f251802q = arrayList10;
        this.f251803r = arrayList11;
        this.f251804s = arrayList12;
        this.f251805t = arrayList13;
        this.f251806u = arrayList14;
        this.f251807v = arrayList15;
        this.f251808w = arrayList16;
        this.f251809x = arrayList17;
        this.f251810y = arrayList18;
        this.f251811z = arrayList19;
        this.A = arrayList20;
        this.B = arrayList21;
        this.C = arrayList22;
        this.D = arrayList23;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ee5.a0(this.f251792d, this.f251793e, this.f251794f, this.f251795g, this.f251796h, this.f251797i, this.f251798m, this.f251799n, this.f251800o, this.f251801p, this.f251802q, this.f251803r, this.f251804s, this.f251805t, this.f251806u, this.f251807v, this.f251808w, this.f251809x, this.f251810y, this.f251811z, this.A, this.B, this.C, this.D, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ee5.a0 a0Var = (ee5.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        a0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        pf5.u uVar = pf5.u.f353936a;
        ee5.h0 h0Var = this.f251792d;
        ee5.v0 v0Var = (ee5.v0) uVar.c(h0Var.getActivity()).a(ee5.v0.class);
        v0Var.getClass();
        java.util.ArrayList matchInfoList = this.f251793e;
        kotlin.jvm.internal.o.g(matchInfoList, "matchInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemFileUIC", "updateMatchInfo >> " + matchInfoList.size());
        v0Var.f252055n = pf5.e.launch$default(v0Var, null, null, new ee5.u0(v0Var, matchInfoList, null), 3, null);
        ee5.n1 n1Var = (ee5.n1) uVar.c(h0Var.getActivity()).a(ee5.n1.class);
        n1Var.getClass();
        java.util.ArrayList matchInfoList2 = this.f251794f;
        kotlin.jvm.internal.o.g(matchInfoList2, "matchInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemMusicUIC", "updateMatchInfo: " + matchInfoList2.size());
        n1Var.f252055n = pf5.e.launch$default(n1Var, null, null, new ee5.m1(n1Var, matchInfoList2, null), 3, null);
        ee5.m2 m2Var = (ee5.m2) uVar.c(h0Var.getActivity()).a(ee5.m2.class);
        m2Var.getClass();
        java.util.ArrayList matchInfoList3 = this.f251795g;
        kotlin.jvm.internal.o.g(matchInfoList3, "matchInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg. FTSMultiItemUrlUIC", "updateMatchInfo >> " + matchInfoList3.size());
        m2Var.f252055n = pf5.e.launch$default(m2Var, null, null, new ee5.l2(m2Var, matchInfoList3, null), 3, null);
        ee5.n0 n0Var = (ee5.n0) uVar.c(h0Var.getActivity()).a(ee5.n0.class);
        n0Var.getClass();
        java.util.ArrayList matchInfoList4 = this.f251796h;
        kotlin.jvm.internal.o.g(matchInfoList4, "matchInfoList");
        com.tencent.mars.xlog.Log.i("FTSMultiItemAppBrandUIC", "updateMatchInfo >> " + matchInfoList4.size());
        n0Var.f252055n = pf5.e.launch$default(n0Var, null, null, new ee5.m0(n0Var, matchInfoList4, null), 3, null);
        ee5.v1 v1Var = (ee5.v1) uVar.c(h0Var.getActivity()).a(ee5.v1.class);
        v1Var.getClass();
        java.util.ArrayList matchInfoList5 = this.f251797i;
        kotlin.jvm.internal.o.g(matchInfoList5, "matchInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemPayUIC", "updateMatchInfo >> " + matchInfoList5.size());
        v1Var.f252055n = pf5.e.launch$default(v1Var, null, null, new ee5.u1(v1Var, matchInfoList5, null), 3, null);
        ee5.y0 y0Var = (ee5.y0) uVar.c(h0Var.getActivity()).a(ee5.y0.class);
        y0Var.getClass();
        java.util.ArrayList matchInfoList6 = this.f251798m;
        kotlin.jvm.internal.o.g(matchInfoList6, "matchInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemFinderFeedUIC", "updateMatchInfo >> " + matchInfoList6.size());
        y0Var.f252055n = pf5.e.launch$default(y0Var, null, null, new ee5.x0(matchInfoList6, y0Var, null), 3, null);
        ee5.h2 h2Var = (ee5.h2) uVar.c(h0Var.getActivity()).a(ee5.h2.class);
        h2Var.getClass();
        java.util.ArrayList matchInfoList7 = this.f251799n;
        kotlin.jvm.internal.o.g(matchInfoList7, "matchInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemShopProductUIC", "updateMatchInfo: " + matchInfoList7.size());
        h2Var.f252055n = pf5.e.launch$default(h2Var, null, null, new ee5.g2(h2Var, matchInfoList7, null), 3, null);
        ee5.d1 d1Var = (ee5.d1) uVar.c(h0Var.getActivity()).a(ee5.d1.class);
        d1Var.getClass();
        java.util.ArrayList matchInfoList8 = this.f251800o;
        kotlin.jvm.internal.o.g(matchInfoList8, "matchInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemGiftUIC", "updateMatchInfo: " + matchInfoList8.size());
        d1Var.f252055n = pf5.e.launch$default(d1Var, null, null, new ee5.c1(d1Var, matchInfoList8, null), 3, null);
        ee5.i1 i1Var = (ee5.i1) uVar.c(h0Var.getActivity()).a(ee5.i1.class);
        i1Var.getClass();
        java.util.ArrayList matchInfoList9 = this.f251801p;
        kotlin.jvm.internal.o.g(matchInfoList9, "matchInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemLocationUIC", "updateMatchInfo: " + matchInfoList9.size());
        i1Var.f252055n = pf5.e.launch$default(i1Var, null, null, new ee5.h1(i1Var, matchInfoList9, null), 3, null);
        ee5.a2 a2Var = (ee5.a2) uVar.c(h0Var.getActivity()).a(ee5.a2.class);
        a2Var.getClass();
        java.util.ArrayList matchInfoList10 = this.f251802q;
        kotlin.jvm.internal.o.g(matchInfoList10, "matchInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemShareCardUIC", "updateMatchInfo: " + matchInfoList10.size());
        a2Var.f252055n = pf5.e.launch$default(a2Var, null, null, new ee5.z1(a2Var, matchInfoList10, null), 3, null);
        ee5.s1 s1Var = (ee5.s1) uVar.c(h0Var.getActivity()).a(ee5.s1.class);
        s1Var.getClass();
        java.util.ArrayList matchInfoList11 = this.f251803r;
        kotlin.jvm.internal.o.g(matchInfoList11, "matchInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemNoteUIC", "updateMatchInfo: " + matchInfoList11.size());
        s1Var.f252055n = pf5.e.launch$default(s1Var, null, null, new ee5.r1(s1Var, matchInfoList11, null), 3, null);
        ee5.q0 q0Var = (ee5.q0) uVar.c(h0Var.getActivity()).a(ee5.q0.class);
        q0Var.getClass();
        java.util.ArrayList matchInfoList12 = this.f251804s;
        kotlin.jvm.internal.o.g(matchInfoList12, "matchInfoList");
        com.tencent.mars.xlog.Log.i("MicroMsg.FTSMultiItemEmojiUIC", "updateMatchInfo >> " + matchInfoList12.size());
        q0Var.f252055n = pf5.e.launch$default(q0Var, null, null, new ee5.p0(matchInfoList12, q0Var, null), 3, null);
        java.util.HashMap hashMap = h0Var.G;
        zd5.b bVar = zd5.b.f471656e;
        hashMap.put(new java.lang.Integer(2), this.f251805t);
        java.util.HashMap hashMap2 = h0Var.G;
        zd5.b bVar2 = zd5.b.f471656e;
        hashMap2.put(new java.lang.Integer(5), this.f251806u);
        java.util.HashMap hashMap3 = h0Var.G;
        zd5.b bVar3 = zd5.b.f471656e;
        hashMap3.put(new java.lang.Integer(3), this.f251807v);
        java.util.HashMap hashMap4 = h0Var.G;
        zd5.b bVar4 = zd5.b.f471656e;
        hashMap4.put(new java.lang.Integer(6), this.f251808w);
        java.util.HashMap hashMap5 = h0Var.G;
        zd5.b bVar5 = zd5.b.f471656e;
        hashMap5.put(new java.lang.Integer(4), this.f251809x);
        java.util.HashMap hashMap6 = h0Var.G;
        zd5.b bVar6 = zd5.b.f471656e;
        hashMap6.put(new java.lang.Integer(0), this.f251810y);
        java.util.HashMap hashMap7 = h0Var.G;
        zd5.b bVar7 = zd5.b.f471656e;
        hashMap7.put(new java.lang.Integer(12), this.f251811z);
        java.util.HashMap hashMap8 = h0Var.G;
        zd5.b bVar8 = zd5.b.f471656e;
        hashMap8.put(new java.lang.Integer(13), this.A);
        java.util.HashMap hashMap9 = h0Var.G;
        zd5.b bVar9 = zd5.b.f471656e;
        hashMap9.put(new java.lang.Integer(10), this.B);
        java.util.HashMap hashMap10 = h0Var.G;
        zd5.b bVar10 = zd5.b.f471656e;
        hashMap10.put(new java.lang.Integer(9), this.C);
        java.util.HashMap hashMap11 = h0Var.G;
        zd5.b bVar11 = zd5.b.f471656e;
        java.lang.Integer num = new java.lang.Integer(11);
        java.util.ArrayList arrayList = this.D;
        hashMap11.put(num, arrayList);
        java.util.HashMap hashMap12 = h0Var.G;
        zd5.b bVar12 = zd5.b.f471656e;
        hashMap12.put(new java.lang.Integer(8), arrayList);
        return jz5.f0.f302826a;
    }
}
