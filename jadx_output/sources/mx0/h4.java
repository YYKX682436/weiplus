package mx0;

/* loaded from: classes5.dex */
public final class h4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332024d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332024d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup sideToolbar;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332024d;
        sideToolbar = shootComposingPluginLayout.getSideToolbar();
        return new wx0.e0(sideToolbar, shootComposingPluginLayout);
    }
}
