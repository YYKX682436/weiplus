package mx0;

/* loaded from: classes5.dex */
public final class k6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332099d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332099d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332099d;
        android.view.View findViewById = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.pug);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.r_t);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        return new mx0.r1(findViewById, (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById2, shootComposingPluginLayout);
    }
}
