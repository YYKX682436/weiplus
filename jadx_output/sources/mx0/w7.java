package mx0;

/* loaded from: classes.dex */
public final class w7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332423d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332423d;
        android.view.View findViewById = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.puh);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.pze);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.pzf);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        return new mx0.v2(findViewById, findViewById2, findViewById3, shootComposingPluginLayout);
    }
}
