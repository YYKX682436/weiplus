package mx0;

/* loaded from: classes5.dex */
public final class l8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332134d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l8(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332134d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f332134d.findViewById(com.tencent.mm.R.id.q0y);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new mx0.j3((android.widget.TextView) findViewById);
    }
}
