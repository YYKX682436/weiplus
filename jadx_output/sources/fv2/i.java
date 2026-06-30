package fv2;

/* loaded from: classes10.dex */
public final class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f266979d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f266980e;

    /* renamed from: f, reason: collision with root package name */
    public final jv2.c f266981f;

    public i(jv2.c unsentComment, iv2.b uniEntityItem) {
        kotlin.jvm.internal.o.g(unsentComment, "unsentComment");
        kotlin.jvm.internal.o.g(uniEntityItem, "uniEntityItem");
        r45.w03 w03Var = new r45.w03();
        this.f266981f = unsentComment;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = w03Var;
        r45.x03 x03Var = new r45.x03();
        x03Var.BaseResponse = new r45.ie();
        lVar.f70665b = x03Var;
        lVar.f70672i = 30000;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderunicomment";
        lVar.f70667d = 6964;
        this.f266979d = lVar.a();
        w03Var.f388747f = uniEntityItem.f295125a;
        w03Var.f388748g = uniEntityItem.f295126b;
        w03Var.f388762x = null;
        w03Var.f388745d = db2.t4.f228171a.a(6964);
        w03Var.f388754p = 1;
        w03Var.f388755q = unsentComment.field_scene == 1 ? 3 : 2;
        w03Var.f388751m = unsentComment.j();
        long J0 = unsentComment.J0();
        long F0 = unsentComment.F0();
        w03Var.f388752n = J0;
        w03Var.f388753o = F0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f266980e = u0Var;
        return dispatch(sVar, this.f266979d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6964;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        jv2.c cVar = this.f266981f;
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f266979d.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderUniCommentResponse");
            cVar.u0().setCreatetime(c01.id.a() / 1000);
            cVar.u0().setCommentId(((r45.x03) fVar).f389617d);
            java.util.LinkedList linkedList = cVar.Q;
            if (linkedList != null) {
                linkedList.clear();
            }
            cVar.field_state = 2;
        } else {
            cVar.field_state = 1;
        }
        jv2.h.f302217f.a().y0(cVar.field_feedId, cVar.t0(), cVar.field_localCommentId, com.tencent.mm.plugin.finder.storage.wj0.R, cVar);
        com.tencent.mm.modelbase.u0 u0Var = this.f266980e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
