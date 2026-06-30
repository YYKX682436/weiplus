package mx0;

/* loaded from: classes5.dex */
public final class n9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332175d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332175d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332175d;
        android.view.View findViewById = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.o1f);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.vd7);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = shootComposingPluginLayout.findViewById(com.tencent.mm.R.id.vio);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        return new mx0.ja((androidx.recyclerview.widget.RecyclerView) findViewById, (android.widget.TextView) findViewById2, (android.widget.TextView) findViewById3, shootComposingPluginLayout);
    }
}
