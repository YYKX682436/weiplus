package mx0;

/* loaded from: classes5.dex */
public final class s8 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f332324e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, boolean z17) {
        super(1);
        this.f332323d = shootComposingPluginLayout;
        this.f332324e = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        mx0.l1 materialImportPreviewUIPlugin;
        mx0.l1 materialImportPreviewUIPlugin2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332323d;
        if (booleanValue) {
            materialImportPreviewUIPlugin2 = shootComposingPluginLayout.getMaterialImportPreviewUIPlugin();
            materialImportPreviewUIPlugin2.d(this.f332324e);
        }
        materialImportPreviewUIPlugin = shootComposingPluginLayout.getMaterialImportPreviewUIPlugin();
        materialImportPreviewUIPlugin.b();
        return jz5.f0.f302826a;
    }
}
