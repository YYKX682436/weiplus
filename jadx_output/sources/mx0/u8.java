package mx0;

/* loaded from: classes5.dex */
public final class u8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f332384f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332383e = shootComposingPluginLayout;
        this.f332384f = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.u8(this.f332383e, this.f332384f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.u8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        mx0.l1 materialImportPreviewUIPlugin;
        mx0.c closePlugin;
        mx0.l1 materialImportPreviewUIPlugin2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f332382d;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332383e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            shootComposingPluginLayout.z0();
            if (!this.f332384f) {
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = shootComposingPluginLayout.getContext().getString(com.tencent.mm.R.string.oi9);
                e4Var.c();
                shootComposingPluginLayout.u0();
                return jz5.f0.f302826a;
            }
            yx0.b8 b8Var = shootComposingPluginLayout.f69557v;
            this.f332382d = 1;
            obj = b8Var.X(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        materialImportPreviewUIPlugin = shootComposingPluginLayout.getMaterialImportPreviewUIPlugin();
        materialImportPreviewUIPlugin.d(booleanValue);
        closePlugin = shootComposingPluginLayout.getClosePlugin();
        closePlugin.setVisibility(0);
        materialImportPreviewUIPlugin2 = shootComposingPluginLayout.getMaterialImportPreviewUIPlugin();
        materialImportPreviewUIPlugin2.e();
        return jz5.f0.f302826a;
    }
}
