package wv2;

/* loaded from: classes2.dex */
public final class p extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f450041g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.jf2 f450042h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f450043i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f450044m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderObject f450045n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(com.tencent.mm.plugin.finder.storage.FinderItem r18, r45.jf2 r19, r45.qt2 r20, int r21, kotlin.jvm.internal.i r22) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wv2.p.<init>(com.tencent.mm.plugin.finder.storage.FinderItem, r45.jf2, r45.qt2, int, kotlin.jvm.internal.i):void");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f450044m = u0Var;
        return dispatch(sVar, this.f450043i, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6649;
    }

    @Override // az2.u, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderDraftPost", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f450044m;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
