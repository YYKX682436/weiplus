package mx0;

/* loaded from: classes5.dex */
public final class x5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView f332432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout f332433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout) {
        super(1);
        this.f332431d = shootComposingPluginLayout;
        this.f332432e = cropView;
        this.f332433f = constraintLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.maas.camstudio.MJCamSpatialDesc desc = (com.tencent.maas.camstudio.MJCamSpatialDesc) obj;
        kotlin.jvm.internal.o.g(desc, "desc");
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332431d;
        yx0.b8 b8Var = shootComposingPluginLayout.f69557v;
        mx0.w5 w5Var = new mx0.w5(this.f332432e, this.f332433f, shootComposingPluginLayout);
        b8Var.getClass();
        mx0.e1 e1Var = b8Var.X1;
        if (e1Var != null) {
            if (e1Var.f331935b != mx0.d0.f331900n) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MaterialImportHelper", "exitImportCrop: importPreviewState " + e1Var.f331935b);
                w5Var.invoke(java.lang.Boolean.FALSE);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MaterialImportHelper", "exitImportCrop: importPreviewState " + e1Var.f331935b);
                e1Var.f(mx0.d0.f331901o);
                kotlinx.coroutines.l.d(e1Var.f331938e, null, null, new mx0.o0(e1Var, desc, w5Var, null), 3, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
