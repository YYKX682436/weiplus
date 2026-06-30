package qb5;

/* loaded from: classes9.dex */
public class a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lo.m f361324e;

    public a(qb5.g gVar, java.lang.String str, lo.m mVar) {
        this.f361323d = str;
        this.f361324e = mVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChooseMsgFileCompat", "tryInitAttachInfo errType:%d errCode:%d, errMsg:%s type:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, java.lang.Integer.valueOf(m1Var.getType()));
        if (m1Var.getType() != 728) {
            return;
        }
        bt3.i0 i0Var = (bt3.i0) m1Var;
        com.tencent.mm.pluginsdk.model.app.d dVar = i0Var.f24286f;
        java.lang.String str2 = dVar != null ? dVar.field_mediaSvrId : "";
        java.lang.String str3 = this.f361323d;
        if (!str3.equals(str2)) {
            com.tencent.mm.pluginsdk.model.app.d dVar2 = i0Var.f24286f;
            com.tencent.mars.xlog.Log.w("MicroMsg.ChooseMsgFileCompat", "media:%s is not equal targetMedia:%s", str3, dVar2 != null ? dVar2.field_mediaSvrId : "");
            return;
        }
        c01.d9.e().q(728, this);
        lo.m mVar = this.f361324e;
        if (i17 == 0 && i18 == 0) {
            if (mVar != null) {
                ((vv1.g) mVar).a(0, "");
            }
        } else if (mVar != null) {
            ((vv1.g) mVar).a(i18, str);
        }
    }
}
