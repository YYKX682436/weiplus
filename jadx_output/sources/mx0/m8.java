package mx0;

/* loaded from: classes5.dex */
public final class m8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332159d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m8(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332159d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup sideToolbar;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332159d;
        sideToolbar = shootComposingPluginLayout.getSideToolbar();
        return new wx0.b1(sideToolbar, shootComposingPluginLayout.f69557v);
    }
}
