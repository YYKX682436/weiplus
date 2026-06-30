package fv2;

/* loaded from: classes10.dex */
public final class h extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final iv2.a f266975d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f266976e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f266977f;

    /* renamed from: g, reason: collision with root package name */
    public final jv2.a f266978g;

    public h(jv2.a unsentComment, iv2.a uniEntityItem) {
        kotlin.jvm.internal.o.g(unsentComment, "unsentComment");
        kotlin.jvm.internal.o.g(uniEntityItem, "uniEntityItem");
        this.f266975d = uniEntityItem;
        r45.w03 w03Var = new r45.w03();
        this.f266978g = unsentComment;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = w03Var;
        r45.x03 x03Var = new r45.x03();
        x03Var.BaseResponse = new r45.ie();
        lVar.f70665b = x03Var;
        lVar.f70672i = 30000;
        lVar.f70666c = "/cgi-bin/micromsg-bin/statuscomment";
        lVar.f70667d = 9704;
        this.f266976e = lVar.a();
        w03Var.f388747f = "";
        w03Var.f388748g = uniEntityItem.f295118a;
        w03Var.f388760v = uniEntityItem.f295119b;
        w03Var.f388746e = java.lang.String.valueOf(c01.id.c());
        w03Var.f388762x = null;
        w03Var.f388754p = 1;
        w03Var.f388755q = unsentComment.field_scene == 1 ? 3 : 2;
        w03Var.f388751m = unsentComment.j();
        w03Var.f388759u = c01.id.c();
        long A0 = unsentComment.A0();
        long replyCommentId = unsentComment.u0().getReplyCommentId();
        w03Var.f388752n = A0;
        w03Var.f388753o = replyCommentId;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f266977f = u0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doScene: username=");
        iv2.a aVar = this.f266975d;
        sb6.append(aVar.f295119b);
        sb6.append(", statusId=");
        sb6.append(aVar.f295118a);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusToComment", sb6.toString());
        xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
        java.lang.String str = aVar.f295118a;
        ((we0.j1) l0Var).getClass();
        boolean z17 = false;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            si4.a G = ai4.m0.f5173a.G();
            kotlin.jvm.internal.o.d(str);
            mj4.h t17 = G.t(str);
            if (t17 != null && (((mj4.k) t17).s() & 64) != 0) {
                z17 = true;
            }
        }
        if (!z17) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.m(context, context.getString(com.tencent.mm.R.string.jwk));
        }
        return dispatch(sVar, this.f266976e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 9704;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.ie ieVar;
        com.tencent.mm.modelbase.o oVar = this.f266976e;
        jv2.a aVar = this.f266978g;
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUniCommentResponse");
            aVar.u0().setCreatetime(c01.id.a() / 1000);
            aVar.u0().setCommentId(((r45.x03) fVar).f389617d);
            java.util.LinkedList linkedList = aVar.N;
            if (linkedList != null) {
                linkedList.clear();
            }
            aVar.field_state = 2;
        } else {
            aVar.field_state = 1;
        }
        com.tencent.mm.protobuf.f fVar2 = oVar.f70711b.f70700a;
        r45.x03 x03Var = fVar2 instanceof r45.x03 ? (r45.x03) fVar2 : null;
        if (x03Var != null && (ieVar = x03Var.BaseResponse) != null && ieVar.f376959d == -10101) {
            iv2.a aVar2 = aVar.M;
            if (aVar2 != null) {
                hu2.a.f285081a.a(aVar2.f295119b, aVar2.f295118a, aVar2.f295120c);
            }
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.m(context, context.getString(com.tencent.mm.R.string.jwi));
        }
        defpackage.y.f458297f.a().y0(aVar.field_feedId, aVar.t0(), aVar.field_localCommentId, 2, aVar);
        com.tencent.mm.modelbase.u0 u0Var = this.f266977f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
