package mx0;

/* loaded from: classes5.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331824d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f331824d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.constraintlayout.widget.ConstraintLayout rootView;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f331824d;
        rootView = shootComposingPluginLayout.getRootView();
        return new wx0.c0(rootView, shootComposingPluginLayout.f69557v, shootComposingPluginLayout);
    }
}
