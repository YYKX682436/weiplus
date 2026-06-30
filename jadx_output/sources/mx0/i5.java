package mx0;

/* loaded from: classes5.dex */
public final class i5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332045d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332045d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.ViewGroup sideToolbar;
        androidx.constraintlayout.widget.ConstraintLayout rootView;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332045d;
        sideToolbar = shootComposingPluginLayout.getSideToolbar();
        rootView = shootComposingPluginLayout.getRootView();
        android.view.View findViewById = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.rbs);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new wx0.s0(sideToolbar, rootView, findViewById, shootComposingPluginLayout, shootComposingPluginLayout.f69557v);
    }
}
