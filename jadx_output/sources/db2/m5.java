package db2;

/* loaded from: classes3.dex */
public final class m5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228073g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228074h;

    /* renamed from: i, reason: collision with root package name */
    public r45.s82 f228075i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m5(java.lang.String r2, java.lang.String r3, int r4, r45.qt2 r5, int r6, kotlin.jvm.internal.i r7) {
        /*
            r1 = this;
            r7 = r6 & 4
            if (r7 == 0) goto L5
            r4 = 0
        L5:
            r6 = r6 & 8
            if (r6 == 0) goto La
            r5 = 0
        La:
            java.lang.String r6 = "query"
            kotlin.jvm.internal.o.g(r2, r6)
            java.lang.String r6 = "offset"
            kotlin.jvm.internal.o.g(r3, r6)
            r1.<init>(r5)
            r45.s82 r5 = new r45.s82
            r5.<init>()
            r1.f228075i = r5
            com.tencent.mm.modelbase.l r5 = new com.tencent.mm.modelbase.l
            r5.<init>()
            r6 = 4140(0x102c, float:5.801E-42)
            r5.f70667d = r6
            java.lang.String r6 = "/cgi-bin/micromsg-bin/finderlivesearchmoregames"
            r5.f70666c = r6
            r45.r82 r6 = new r45.r82
            r6.<init>()
            android.content.Context r7 = com.tencent.mm.sdk.platformtools.x2.f193071a
            java.lang.String r0 = "getContext(...)"
            kotlin.jvm.internal.o.f(r7, r0)
            java.lang.String r7 = xy2.c.e(r7)
            r0 = 1
            r6.set(r0, r7)
            r7 = 2
            r6.set(r7, r2)
            r7 = 3
            r6.set(r7, r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r0 = 4
            r6.set(r0, r7)
            com.tencent.mm.plugin.finder.assist.b3 r7 = com.tencent.mm.plugin.finder.assist.b3.f102022a
            r45.rm0 r7 = r7.f()
            r0 = 5
            r6.set(r0, r7)
            r5.f70664a = r6
            r45.s82 r6 = new r45.s82
            r6.<init>()
            r5.f70665b = r6
            com.tencent.mm.modelbase.o r5 = r5.a()
            r1.f228073g = r5
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "NetSceneFinderGameSearch init: query = "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = ", offset = "
            r5.append(r2)
            r5.append(r3)
            java.lang.String r2 = ", scene = "
            r5.append(r2)
            r5.append(r4)
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "Finder.NetSceneFinderGameSearch"
            com.tencent.mars.xlog.Log.i(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: db2.m5.<init>(java.lang.String, java.lang.String, int, r45.qt2, int, kotlin.jvm.internal.i):void");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGameSearch", "errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.protobuf.f fVar = this.f228073g.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveSearchMoreGamesResponse");
        this.f228075i = (r45.s82) fVar;
        com.tencent.mm.modelbase.u0 u0Var = this.f228074h;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228074h = u0Var;
        return dispatch(sVar, this.f228073g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4140;
    }
}
