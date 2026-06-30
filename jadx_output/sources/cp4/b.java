package cp4;

/* loaded from: classes8.dex */
public final class b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: v, reason: collision with root package name */
    public static long f220972v;

    /* renamed from: d, reason: collision with root package name */
    public yz5.r f220973d;

    /* renamed from: e, reason: collision with root package name */
    public cp4.h1 f220974e;

    /* renamed from: f, reason: collision with root package name */
    public gp.c f220975f;

    /* renamed from: h, reason: collision with root package name */
    public java.nio.ByteBuffer f220977h;

    /* renamed from: m, reason: collision with root package name */
    public int f220979m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f220980n;

    /* renamed from: p, reason: collision with root package name */
    public boolean f220982p;

    /* renamed from: q, reason: collision with root package name */
    public int f220983q;

    /* renamed from: u, reason: collision with root package name */
    public volatile boolean f220987u;

    /* renamed from: g, reason: collision with root package name */
    public java.util.ArrayList f220976g = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f220978i = "";

    /* renamed from: o, reason: collision with root package name */
    public boolean f220981o = true;

    /* renamed from: r, reason: collision with root package name */
    public int f220984r = 2;

    /* renamed from: s, reason: collision with root package name */
    public int f220985s = 44100;

    /* renamed from: t, reason: collision with root package name */
    public int f220986t = 1;

    public b() {
        gm0.j1.n().f273288b.a(3835, this);
    }

    public final void a(int i17, com.tencent.mm.protobuf.g gVar, int i18, int i19) {
        int i27 = this.f220979m;
        cp4.h1 h1Var = this.f220974e;
        cp4.h1 h1Var2 = new cp4.h1(i17, gVar, i18, i19, i27, h1Var != null ? h1Var.f221029f : null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append("]do voiceTransLate vid:");
        com.tencent.mm.protobuf.g gVar2 = h1Var2.f221029f;
        sb6.append(gVar2 != null ? gVar2.h(com.tencent.mapsdk.internal.rv.f51270c) : null);
        sb6.append(" seq:");
        sb6.append(i18);
        sb6.append(" size:");
        sb6.append(gVar != null ? java.lang.Integer.valueOf(gVar.f192156a.length) : null);
        sb6.append(" offset:");
        sb6.append(i19);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditCaptionDataManager", sb6.toString());
        java.lang.String str = this.f220978i;
        kotlin.jvm.internal.o.g(str, "<set-?>");
        h1Var2.f221033m = str;
        this.f220974e = h1Var2;
        gm0.j1.n().f273288b.g(this.f220974e);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.ui.plugin.caption.NetSceneGetVideoCaption");
        cp4.h1 h1Var = (cp4.h1) m1Var;
        if (!kotlin.jvm.internal.o.b(h1Var.f221033m, this.f220978i) || this.f220987u) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditCaptionDataManager", "[" + hashCode() + "]onSceneEnd errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        int i19 = h1Var.f221027d;
        if (i17 != 0 || i18 != 0) {
            if (h1Var.f221032i) {
                this.f220983q = -1;
                this.f220982p = false;
                yz5.r rVar = this.f220973d;
                if (rVar != null) {
                    rVar.C(java.lang.Integer.valueOf(i19), this.f220978i, -1, null);
                }
                this.f220981o = true;
                return;
            }
            return;
        }
        this.f220976g = h1Var.f221031h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(hashCode());
        sb6.append("]scene seq:");
        sb6.append(h1Var.f221028e);
        sb6.append(" isLastRequest:");
        sb6.append(h1Var.f221032i);
        sb6.append(" progress:");
        com.tencent.mm.protobuf.f fVar = h1Var.f221030g.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransResponse");
        sb6.append(((r45.ks) fVar).f378914e);
        com.tencent.mars.xlog.Log.i("MicroMsg.EditCaptionDataManager", sb6.toString());
        java.util.Iterator it = this.f220976g.iterator();
        int i27 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.is isVar = (r45.is) next;
            com.tencent.mars.xlog.Log.i("MicroMsg.EditCaptionDataManager", "[" + hashCode() + "]result" + i27 + ": start:" + isVar.f377298e + " end:" + isVar.f377299f + " text:" + isVar.f377297d.h(com.tencent.mapsdk.internal.rv.f51270c));
            if (h1Var.f221032i) {
                com.tencent.mm.protobuf.f fVar2 = h1Var.f221030g.f70711b.f70700a;
                kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransResponse");
                if (((r45.ks) fVar2).f378914e >= 100) {
                    long j17 = f220972v + 1;
                    f220972v = j17;
                    isVar.f377301h = j17;
                }
            }
            i27 = i28;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EditCaptionDataManager", "\n");
        if (h1Var.f221032i) {
            com.tencent.mm.protobuf.f fVar3 = h1Var.f221030g.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar3, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.CCVoiceTransResponse");
            if (((r45.ks) fVar3).f378914e >= 100) {
                this.f220982p = false;
                yz5.r rVar2 = this.f220973d;
                if (rVar2 != null) {
                    rVar2.C(java.lang.Integer.valueOf(i19), this.f220978i, java.lang.Integer.valueOf(this.f220976g.isEmpty() ^ true ? 0 : -2), this.f220976g);
                    return;
                }
                return;
            }
            yz5.r rVar3 = this.f220973d;
            if (rVar3 != null) {
                rVar3.C(java.lang.Integer.valueOf(i19), this.f220978i, 0, this.f220976g);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EditCaptionDataManager", "[" + hashCode() + "]repeat query voice data");
            cp4.h1 h1Var2 = this.f220974e;
            kotlin.jvm.internal.o.d(h1Var2);
            a(i19, null, h1Var2.f221028e, 0);
        }
    }
}
