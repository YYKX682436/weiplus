package hm3;

/* loaded from: classes.dex */
public final class m extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public final long f282263i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f282264m;

    /* renamed from: n, reason: collision with root package name */
    public final int f282265n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f282266o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282267p;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282268q;

    /* renamed from: r, reason: collision with root package name */
    public r45.h51 f282269r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(long j17, java.lang.String nonceId, int i17, int i18) {
        super(i18);
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        this.f282263i = j17;
        this.f282264m = nonceId;
        this.f282265n = i17;
        java.lang.String str = "MicroMsg.NetSceneMusicMvGetFinderFeedDetail@" + hashCode();
        this.f282266o = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3763;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetcommentdetail";
        lVar.f70664a = new r45.g51();
        lVar.f70665b = new r45.h51();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f282268q = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetCommentDetailRequest");
        r45.g51 g51Var = (r45.g51) fVar;
        g51Var.set(1, java.lang.Long.valueOf(j17));
        g51Var.set(11, nonceId);
        g51Var.set(3, 1);
        g51Var.set(20, db2.t4.f228171a.n());
        com.tencent.mars.xlog.Log.i(str, "FinderGetCommentDetail feedId:%s, nonceId:%s", java.lang.Long.valueOf(j17), nonceId);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f282267p = callback;
        return dispatch(dispatcher, this.f282268q, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3763;
    }

    @Override // hm3.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i(this.f282266o, "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282267p;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f282268q.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetCommentDetailResponse");
        this.f282269r = (r45.h51) fVar;
        r45.h51 h51Var = new r45.h51();
        r45.h51 h51Var2 = this.f282269r;
        h51Var.parseFrom(h51Var2 != null ? h51Var2.toByteArray() : null);
        fm3.y yVar = fm3.y.f264161a;
        java.lang.String nonceId = this.f282264m;
        kotlin.jvm.internal.o.g(nonceId, "nonceId");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("putFinderFeedDetail, feedId:");
        long j17 = this.f282263i;
        sb6.append(j17);
        sb6.append(", nonceId:");
        sb6.append(nonceId);
        sb6.append(", response:");
        sb6.append(h51Var.hashCode());
        sb6.append(",timestamp:");
        sb6.append(elapsedRealtime);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.MusicMvCgiRetCache", sb6.toString());
        fm3.y.f264162b.put(new fm3.f(j17, nonceId), new fm3.e(h51Var, elapsedRealtime));
        yVar.a(elapsedRealtime);
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282267p;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
