package mx0;

/* loaded from: classes5.dex */
public final class w5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView f332418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.constraintlayout.widget.ConstraintLayout f332419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332420f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5(com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView, androidx.constraintlayout.widget.ConstraintLayout constraintLayout, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(1);
        this.f332418d = cropView;
        this.f332419e = constraintLayout;
        this.f332420f = shootComposingPluginLayout;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        mx0.l1 materialImportPreviewUIPlugin;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.mj_publisher.finder.shoot_composing.crop.CropView cropView = this.f332418d;
        if (!booleanValue) {
            android.content.Context context = cropView.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.f211776c = j65.q.a(cropView.getContext()).getString(com.tencent.mm.R.string.jxm);
            e4Var.c();
        }
        this.f332419e.removeView(cropView);
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332420f;
        shootComposingPluginLayout.L1 = null;
        materialImportPreviewUIPlugin = shootComposingPluginLayout.getMaterialImportPreviewUIPlugin();
        materialImportPreviewUIPlugin.b();
        return jz5.f0.f302826a;
    }
}
