package mx0;

/* loaded from: classes.dex */
public final class l6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332132d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332132d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332132d;
        android.view.View findViewById = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.qhg);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.f485980qm0);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.f485981qm1);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        return new mx0.w1(findViewById, findViewById2, findViewById3, shootComposingPluginLayout);
    }
}
