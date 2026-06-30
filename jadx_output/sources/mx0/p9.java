package mx0;

/* loaded from: classes5.dex */
public final class p9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f332221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332222e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(boolean z17, com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332221d = z17;
        this.f332222e = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wx0.s0 flashControlPlugin;
        wx0.s0 flashControlPlugin2;
        wx0.s0 flashControlPlugin3;
        boolean z17 = this.f332221d;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332222e;
        if (!z17) {
            flashControlPlugin = shootComposingPluginLayout.getFlashControlPlugin();
            flashControlPlugin.b(false);
            shootComposingPluginLayout.k1(false);
            bs0.j jVar = shootComposingPluginLayout.f69552q;
            if (jVar != null) {
                jVar.setLightTorch(false);
            }
        } else if (shootComposingPluginLayout.getCurrentCameraIsFront()) {
            flashControlPlugin3 = shootComposingPluginLayout.getFlashControlPlugin();
            flashControlPlugin3.b(true);
            shootComposingPluginLayout.k1(true);
            bs0.j jVar2 = shootComposingPluginLayout.f69552q;
            if (jVar2 != null) {
                jVar2.setLightTorch(false);
            }
        } else {
            flashControlPlugin2 = shootComposingPluginLayout.getFlashControlPlugin();
            flashControlPlugin2.b(false);
            shootComposingPluginLayout.k1(false);
            bs0.j jVar3 = shootComposingPluginLayout.f69552q;
            if (jVar3 != null) {
                jVar3.setLightTorch(true);
            }
        }
        return jz5.f0.f302826a;
    }
}
