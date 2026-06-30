package hm3;

/* loaded from: classes2.dex */
public final class h extends hm3.a {

    /* renamed from: o, reason: collision with root package name */
    public static long f282246o;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282247i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282248m;

    /* renamed from: n, reason: collision with root package name */
    public final long f282249n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(long j17, java.lang.String finderNonceId, boolean z17) {
        super(0, 1, null);
        kotlin.jvm.internal.o.g(finderNonceId, "finderNonceId");
        long c17 = c01.id.c();
        this.f282249n = c17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3710;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlike";
        lVar.f70664a = new r45.qd1();
        lVar.f70665b = new r45.rd1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f282248m = a17;
        long j18 = f282246o;
        if (c17 < j18) {
            f282246o = 1 + j18;
            this.f282249n = j18;
        }
        f282246o = this.f282249n;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLikeRequest");
        r45.qd1 qd1Var = (r45.qd1) fVar;
        qd1Var.set(1, java.lang.Long.valueOf(j17));
        qd1Var.set(2, 0L);
        qd1Var.set(3, java.lang.Integer.valueOf(z17 ? 3 : 4));
        qd1Var.set(4, java.lang.Long.valueOf(this.f282249n));
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        qd1Var.set(11, xy2.c.e(context));
        qd1Var.set(7, 91);
        qd1Var.set(8, finderNonceId);
        qd1Var.set(11, "");
        qd1Var.set(12, 0);
        qd1Var.set(13, 0);
        db2.t4 t4Var = db2.t4.f228171a;
        r45.kv0 a18 = t4Var.a(3710);
        a18.set(1, 91);
        a18.set(3, 1);
        qd1Var.set(9, a18);
        qd1Var.set(10, ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).ek(j17, null, 91));
        db2.t4.i(t4Var, (r45.kv0) qd1Var.getCustom(9), kz5.b0.c(new jz5.l(91, java.lang.Long.valueOf(j17))), null, 4, null);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f282247i = callback;
        return dispatch(dispatcher, this.f282248m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3710;
    }

    @Override // hm3.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMusicMvMVFinderLike", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282247i;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f282248m.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLikeResponse");
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282247i;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
        hz2.d dVar = hz2.d.f286313a;
        dVar.h(i18, i19, str);
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.d1i);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        dVar.d(i18, i19, string);
        java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.d1h);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        dVar.f(i18, i19, string2);
    }
}
