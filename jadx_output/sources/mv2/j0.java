package mv2;

/* loaded from: classes2.dex */
public final class j0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mv2.l0 f331586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f331587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.h f331588f;

    public j0(mv2.l0 l0Var, java.util.List list, dn.h hVar) {
        this.f331586d = l0Var;
        this.f331587e = list;
        this.f331588f = hVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.d().q(3870, this);
        mv2.l0 l0Var = this.f331586d;
        com.tencent.mars.xlog.Log.i(l0Var.f331603h, "errType " + i17 + " , errCode " + i18 + ", errMsg " + str);
        kotlin.jvm.internal.o.e(m1Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.cgi.NetSceneFinderOplog");
        db2.v5 v5Var = (db2.v5) m1Var;
        java.util.List K = v5Var.K();
        com.tencent.mm.modelbase.o oVar = v5Var.f228198h;
        kotlin.jvm.internal.o.d(oVar);
        com.tencent.mm.protobuf.f fVar = oVar.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderOplogRequest");
        java.util.LinkedList list = ((r45.rn2) fVar).getList(2);
        kotlin.jvm.internal.o.f(list, "getCmdList(...)");
        if (i17 == 0 && i18 == 0 && kotlin.jvm.internal.o.b(this.f331587e, list)) {
            java.util.Iterator it = K.iterator();
            int i19 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i19 = -1;
                    break;
                }
                r45.ix0 ix0Var = (r45.ix0) it.next();
                if (ix0Var.getInteger(0) == 1 && ix0Var.getInteger(1) == 0) {
                    break;
                } else {
                    i19++;
                }
            }
            java.lang.String str2 = l0Var.f331603h;
            dn.h hVar = this.f331588f;
            if (i19 != -1) {
                com.tencent.mars.xlog.Log.i(str2, "update coverImg succ");
                java.lang.String field_fileUrl = hVar.field_fileUrl;
                kotlin.jvm.internal.o.f(field_fileUrl, "field_fileUrl");
                mv2.l0.e(l0Var, field_fileUrl, true);
                l0Var.b(fp0.u.f265290f);
                return;
            }
            com.tencent.mars.xlog.Log.i(str2, "update coverImg failed");
            java.lang.String field_fileUrl2 = hVar.field_fileUrl;
            kotlin.jvm.internal.o.f(field_fileUrl2, "field_fileUrl");
            mv2.l0.e(l0Var, field_fileUrl2, false);
            l0Var.b(fp0.u.f265291g);
        }
    }
}
