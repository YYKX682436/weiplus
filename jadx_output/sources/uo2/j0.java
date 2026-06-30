package uo2;

/* loaded from: classes2.dex */
public final class j0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f429627d;

    /* renamed from: e, reason: collision with root package name */
    public r45.zi2 f429628e;

    public j0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f429627d = context;
    }

    public final void a(com.tencent.mm.protocal.protobuf.FinderObject finderObject) {
        r45.zi2 zi2Var = this.f429628e;
        android.content.Context context = this.f429627d;
        if (zi2Var != null) {
            db5.t7.makeText(context, com.tencent.mm.R.string.f491286cn0, 0).show();
        } else {
            db5.t7.makeText(context, com.tencent.mm.R.string.cmz, 0).show();
        }
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).zk(context, 2, 4, finderObject != null ? java.lang.Integer.valueOf(finderObject.getFollow_feed_count()) : null);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17 = false;
        if (m1Var != null && m1Var.getType() == 7289) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.network.v0 reqResp = m1Var.getReqResp();
            com.tencent.mm.modelbase.o oVar = reqResp instanceof com.tencent.mm.modelbase.o ? (com.tencent.mm.modelbase.o) reqResp : null;
            com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70711b.f70700a : null;
            if (fVar instanceof r45.lk2) {
            }
        }
    }
}
