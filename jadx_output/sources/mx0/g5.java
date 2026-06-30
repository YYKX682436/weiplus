package mx0;

/* loaded from: classes5.dex */
public final class g5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332003d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g5(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332003d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332003d;
        android.view.View findViewById = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.t_f);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new mx0.l(findViewById, shootComposingPluginLayout.f69557v);
    }
}
