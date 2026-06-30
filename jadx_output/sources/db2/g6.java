package db2;

/* loaded from: classes.dex */
public final class g6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f227994g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f227995h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(java.lang.String anchorUserName, java.lang.String noticeId) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(anchorUserName, "anchorUserName");
        kotlin.jvm.internal.o.g(noticeId, "noticeId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderlivenoticeqrcode";
        lVar.f70667d = 4214;
        r45.k32 k32Var = new r45.k32();
        k32Var.set(2, anchorUserName);
        k32Var.set(3, noticeId);
        te2.sc scVar = te2.sc.f418412a;
        k32Var.set(4, java.lang.Integer.valueOf(te2.sc.f418413b));
        k32Var.set(1, db2.t4.f228171a.a(4214));
        r45.l32 l32Var = new r45.l32();
        lVar.f70664a = k32Var;
        lVar.f70665b = l32Var;
        this.f227994g = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneGetLiveNoticeQrCode", "NetSceneGetLiveNoticeQrCode init userName:" + anchorUserName + ", noticeId:" + noticeId + ' ');
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("Finder.NetSceneGetLiveNoticeQrCode", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        r45.t52 t52Var = (r45.t52) K().getCustom(7);
        if (t52Var != null) {
            te2.sc.f418412a.c(t52Var.getInteger(2), t52Var.getBoolean(1), t52Var.getList(0));
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f227995h;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    public final r45.l32 K() {
        com.tencent.mm.modelbase.o oVar = this.f227994g;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("rr");
            throw null;
        }
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderLiveNoticeQRCodeResponse");
        return (r45.l32) fVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f227995h = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f227994g;
        if (oVar != null) {
            return dispatch(sVar, oVar, this);
        }
        kotlin.jvm.internal.o.o("rr");
        throw null;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4214;
    }
}
