package db2;

/* loaded from: classes2.dex */
public final class y5 extends az2.u implements db2.d5 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f228246g;

    /* renamed from: h, reason: collision with root package name */
    public final int f228247h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f228248i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.protobuf.g f228249m;

    /* renamed from: n, reason: collision with root package name */
    public final int f228250n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f228251o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228252p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228253q;

    /* renamed from: r, reason: collision with root package name */
    public r45.tu2 f228254r;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public y5(java.lang.String r17, int r18, java.lang.String r19, com.tencent.mm.protobuf.g r20, int r21, r45.qt2 r22, com.tencent.mm.protobuf.g r23, com.tencent.mm.protobuf.g r24, com.tencent.mm.protobuf.g r25, com.tencent.mm.protobuf.g r26, boolean r27, int r28, kotlin.jvm.internal.i r29) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.y5.<init>(java.lang.String, int, java.lang.String, com.tencent.mm.protobuf.g, int, r45.qt2, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, com.tencent.mm.protobuf.g, boolean, int, kotlin.jvm.internal.i):void");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f228251o, "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.protobuf.f fVar = this.f228252p.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderSearchResponse");
        this.f228254r = (r45.tu2) fVar;
        com.tencent.mm.modelbase.u0 u0Var = this.f228253q;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        r45.qt2 qt2Var = this.f16154d;
        if (qt2Var != null) {
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> list = this.f228254r.getList(4);
            kotlin.jvm.internal.o.f(list, "getObjectList(...)");
            for (com.tencent.mm.protocal.protobuf.FinderObject finderObject : list) {
                if (finderObject.getSessionBuffer() != null) {
                    i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((com.tencent.mm.plugin.finder.report.o3) c17).rk(finderObject, qt2Var.getInteger(5), null);
                }
            }
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228253q = u0Var;
        return dispatch(sVar, this.f228252p, this);
    }

    public boolean equals(java.lang.Object obj) {
        return hashCode() == (obj != null ? obj.hashCode() : 0);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3820;
    }

    public int hashCode() {
        return (this.f228246g + '_' + this.f228247h + '_' + this.f228248i + '_' + this.f228249m + '_' + this.f228250n).hashCode();
    }
}
