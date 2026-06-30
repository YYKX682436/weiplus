package mx0;

/* loaded from: classes5.dex */
public final class j5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332069d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332069d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup sideToolbar;
        androidx.constraintlayout.widget.ConstraintLayout rootView;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332069d;
        sideToolbar = shootComposingPluginLayout.getSideToolbar();
        yx0.b8 b8Var = shootComposingPluginLayout.f69557v;
        rootView = shootComposingPluginLayout.getRootView();
        return new wx0.v0(sideToolbar, b8Var, rootView);
    }
}
