package mx0;

/* loaded from: classes5.dex */
public final class h6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332027d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332027d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332027d;
        android.view.View findViewById = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.f483496hr1);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.f485423qu1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        return new mx0.o1(findViewById, (android.widget.ImageView) findViewById2, shootComposingPluginLayout);
    }
}
