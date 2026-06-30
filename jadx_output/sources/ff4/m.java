package ff4;

/* loaded from: classes4.dex */
public final class m extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.LinkedList f261703h = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f261704d;

    /* renamed from: e, reason: collision with root package name */
    public final ff4.l f261705e = new ff4.l(this);

    /* renamed from: f, reason: collision with root package name */
    public final int f261706f = 10;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f261707g;

    public m(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.jf6();
        lVar.f70665b = new r45.kf6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmstorysync";
        lVar.f70667d = 513;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f261704d = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
        ((r45.jf6) fVar).f377787d = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        byte[] a17 = w11.c2.f441991a.a();
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(a17);
        com.tencent.mm.modelbase.o oVar = this.f261704d;
        com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
        ((r45.jf6) fVar).f377788e = cu5Var;
        this.f261707g = callback;
        return dispatch(dispatcher, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 513;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.protobuf.g gVar;
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f261707g;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            } else {
                kotlin.jvm.internal.o.o("callback");
                throw null;
            }
        }
        com.tencent.mm.modelbase.o oVar = this.f261704d;
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncResponse");
        r45.kf6 kf6Var = (r45.kf6) fVar;
        r45.c50 c50Var = kf6Var.f378664d;
        java.util.LinkedList linkedList = c50Var != null ? c50Var.f371295e : null;
        if (linkedList == null) {
            linkedList = new java.util.LinkedList();
        }
        if (linkedList.size() > 0) {
            ff4.l lVar = this.f261705e;
            lVar.getClass();
            lVar.f261701a = linkedList;
            lVar.f261702b.sendEmptyMessage(0);
            return;
        }
        r45.cu5 cu5Var = kf6Var.f378666f;
        if (cu5Var != null && (gVar = cu5Var.f371841f) != null) {
            byte[] g17 = gVar.g();
            com.tencent.mm.protobuf.f fVar2 = oVar.f70710a.f70684a;
            kotlin.jvm.internal.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.StorySyncRequest");
            byte[] c17 = o45.qi.c(((r45.jf6) fVar2).f377788e.f371841f.g(), g17);
            if (c17 != null) {
                if (!(c17.length == 0)) {
                    w11.c2.f441991a.d(c17, true);
                }
            }
        }
        com.tencent.mm.modelbase.u0 u0Var2 = this.f261707g;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        } else {
            kotlin.jvm.internal.o.o("callback");
            throw null;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return this.f261706f;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
