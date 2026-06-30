package mx0;

/* loaded from: classes5.dex */
public final class a7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331832d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f331832d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mx0.l1 materialImportPreviewUIPlugin;
        if (this.f331832d.f69557v.f467192s == yx0.v.f467705s) {
            this.f331832d.X0();
            com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f331832d;
            if (!shootComposingPluginLayout.S1) {
                shootComposingPluginLayout.y0();
            }
        } else {
            this.f331832d.y0();
        }
        materialImportPreviewUIPlugin = this.f331832d.getMaterialImportPreviewUIPlugin();
        materialImportPreviewUIPlugin.e();
        return jz5.f0.f302826a;
    }
}
