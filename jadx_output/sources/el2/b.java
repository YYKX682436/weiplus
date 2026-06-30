package el2;

/* loaded from: classes3.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f253747d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.gb f253748e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(el2.i0 i0Var, com.tencent.mm.plugin.finder.live.view.gb gbVar) {
        super(2);
        this.f253747d = i0Var;
        this.f253748e = gbVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj2;
        el2.i0 i0Var = this.f253747d;
        if (finderJumpInfo != null) {
            i0Var.getClass();
            com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
            cl0.g gVar = new cl0.g();
            gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "mmfinderlive");
            android.content.Context context = i0Var.f118183e;
            gVar.h("finderUserName", xy2.c.e(context));
            sVar.d(kz5.b1.e(new jz5.l("nativeData", gVar)));
            sVar.f144167d = new el2.e0(i0Var, sVar);
            ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Oj(context, finderJumpInfo, sVar);
        } else if (intValue > 0) {
            com.tencent.mm.plugin.finder.live.view.gb gbVar = this.f253748e;
            com.tencent.mm.plugin.finder.live.view.ka kaVar = (com.tencent.mm.plugin.finder.live.view.ka) ((jz5.n) i0Var.X).getValue();
            wt2.a aVar = i0Var.I;
            if (aVar == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            kaVar.j0(7, intValue, aVar, gbVar, new el2.f0(i0Var));
        } else {
            el2.i0.h0(i0Var, 2, this.f253748e);
        }
        return jz5.f0.f302826a;
    }
}
