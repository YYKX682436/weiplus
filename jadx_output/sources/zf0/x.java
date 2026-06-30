package zf0;

/* loaded from: classes12.dex */
public final class x extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f472577d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f472578e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f472579f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f472580g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f472581h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f472582i;

    /* renamed from: m, reason: collision with root package name */
    public int f472583m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f472584n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vf0.g f472585o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ t21.v2 f472586p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f472587q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ oi3.h f472588r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(zf0.v0 v0Var, vf0.g gVar, t21.v2 v2Var, java.util.Map map, oi3.h hVar, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f472584n = v0Var;
        this.f472585o = gVar;
        this.f472586p = v2Var;
        this.f472587q = map;
        this.f472588r = hVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new zf0.x(this.f472584n, this.f472585o, this.f472586p, this.f472587q, this.f472588r, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((zf0.x) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        zf0.v0 v0Var;
        java.lang.String str;
        vf0.g gVar;
        java.lang.String a17;
        java.lang.Object u17;
        zf0.v0 v0Var2;
        java.util.Map map;
        t21.v2 v2Var;
        vf0.g gVar2;
        oi3.h hVar;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f472583m;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.f472584n.f472563i.getClass();
            v0Var = this.f472584n;
            vf0.g gVar3 = this.f472585o;
            t21.v2 v2Var2 = this.f472586p;
            java.util.Map map2 = this.f472587q;
            oi3.h hVar2 = this.f472588r;
            java.lang.Integer d17 = v0Var.d(false);
            if (d17 != null) {
                gVar3.f436163a = d17.intValue();
                return f0Var;
            }
            vf0.u2 u2Var = v0Var.f472563i.f436175b;
            if (com.tencent.mm.sdk.platformtools.t8.K0(u2Var.f436279a)) {
                str = v2Var2.f();
                kotlin.jvm.internal.o.d(str);
            } else {
                str = u2Var.f436279a;
            }
            gVar3.getClass();
            kotlin.jvm.internal.o.g(str, "<set-?>");
            gVar3.f436164b = str;
            c01.f7 k17 = v0Var.f472563i.f436179f.k();
            if (k17 == null || com.tencent.mm.vfs.w6.k(gVar3.f436164b) >= k17.r()) {
                gVar = gVar3;
                if (!v0Var.f472563i.a() && !com.tencent.mm.vfs.w6.j(gVar.f436164b)) {
                    gVar.f436163a = -540002;
                }
                return f0Var;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var.id() + " start to downloadFav Video");
            java.lang.Integer d18 = v0Var.d(true);
            if (d18 != null) {
                gVar3.f436163a = d18.intValue();
                return f0Var;
            }
            a17 = zf0.v0.f472562x.a(k17.k(), bm5.f0.f22570r);
            if (a17 == null) {
                if (map2 != null) {
                    map2.put("e_download_fav_video_failed", "emptyFavCdnUrl");
                }
                gVar3.f436163a = -520009;
                return f0Var;
            }
            vf0.o2 o2Var = vf0.o2.f436242d;
            qi3.f0 f0Var2 = v0Var.f472563i.f436181h;
            java.util.Map map3 = f0Var2 != null ? f0Var2.f363701b : null;
            this.f472577d = v0Var;
            this.f472578e = gVar3;
            this.f472579f = v2Var2;
            this.f472580g = map2;
            this.f472581h = hVar2;
            this.f472582i = a17;
            this.f472583m = 1;
            u17 = zf0.v0.u(v0Var, a17, k17, o2Var, map3, this);
            if (u17 == aVar) {
                return aVar;
            }
            v0Var2 = v0Var;
            map = map2;
            v2Var = v2Var2;
            gVar2 = gVar3;
            hVar = hVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            java.lang.String str2 = (java.lang.String) this.f472582i;
            hVar = (oi3.h) this.f472581h;
            map = (java.util.Map) this.f472580g;
            v2Var = (t21.v2) this.f472579f;
            gVar2 = (vf0.g) this.f472578e;
            v0Var2 = (zf0.v0) this.f472577d;
            kotlin.ResultKt.throwOnFailure(obj);
            a17 = str2;
            u17 = obj;
        }
        int intValue = ((java.lang.Number) u17).intValue();
        if (intValue != 0) {
            if (map != null) {
                map.put("e_download_fav_video_failed", "error[" + intValue + ']');
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.VideoMsg.SendVideoTask", v0Var2.id() + " download Fav Video failed:{" + intValue + '}');
            com.tencent.mm.vfs.w6.h(a17);
            gVar2.f436163a = intValue;
            return f0Var;
        }
        v0Var2.f472563i.f436179f.p(null);
        v0Var2.f472567p = true;
        vf0.m3.l(v2Var, new zf0.w(v0Var2));
        hVar.set(hVar.f345617d + 13, v0Var2.f472563i.f436179f.toXml());
        pt0.e0 e0Var = pt0.f0.f358209b1;
        com.tencent.mm.storage.f9 k18 = e0Var.k(hVar.getString(hVar.f345617d + 3), hVar.getLong(hVar.f345617d + 0));
        if (k18 != null) {
            k18.d1(v0Var2.f472563i.f436179f.toXml());
            qz5.b.d(e0Var.s(k18.Q0(), k18.getMsgId(), k18));
        }
        gVar2.getClass();
        kotlin.jvm.internal.o.g(a17, "<set-?>");
        gVar2.f436164b = a17;
        v0Var2.f472563i.f436188o.f436140a = true;
        java.lang.String sj6 = ((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).sj(hVar, bm5.f0.f22572t, hVar.j(), true);
        if (!com.tencent.mm.vfs.w6.j(sj6) && com.tencent.mm.vfs.w6.j(a17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoMsg.SendVideoTask", v0Var2.id() + " fav thumb not exists, regenerate from video: " + a17);
            gp.a N = v0Var2.N(a17, "fav_thumb_fallback", map);
            v0Var2.f472563i.f436180g = N;
            vf0.m3.c(N, a17, sj6, true, map);
        }
        v0Var = v0Var2;
        gVar = gVar2;
        if (!v0Var.f472563i.a()) {
            gVar.f436163a = -540002;
        }
        return f0Var;
    }
}
