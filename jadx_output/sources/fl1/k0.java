package fl1;

/* loaded from: classes4.dex */
public class k0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f263797a;

    public k0(fl1.c1 c1Var) {
        this.f263797a = c1Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "updateEvaluateCgi, errType:%s, errCode:%s, errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        fl1.c1 c1Var = this.f263797a;
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f70711b.f70700a) != null && (fVar instanceof r45.ft6)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "updateEvaluateCgi, request success");
            if (c1Var.f263730b) {
                c1Var.c(3, 1);
                return;
            } else {
                c1Var.c(2, 1);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.Evaluate.AppBrandEvaluateDialogHelper", "updateEvaluateCgi, request fail");
        if (c1Var.f263730b) {
            c1Var.c(3, 2);
        } else {
            c1Var.c(2, 2);
        }
    }
}
