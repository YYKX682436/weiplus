package mx0;

/* loaded from: classes5.dex */
public final class g6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332004d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332004d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332004d;
        android.view.View findViewById = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.u4k);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new mx0.l1((android.view.ViewGroup) findViewById, shootComposingPluginLayout);
    }
}
