package mx0;

/* loaded from: classes5.dex */
public final class e4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331944d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f331944d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup bottomMenuBarContainer;
        bottomMenuBarContainer = this.f331944d.getBottomMenuBarContainer();
        return bottomMenuBarContainer.findViewById(com.tencent.mm.R.id.pu7);
    }
}
