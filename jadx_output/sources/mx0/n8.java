package mx0;

/* loaded from: classes3.dex */
public final class n8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332174d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n8(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332174d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return (androidx.constraintlayout.widget.ConstraintLayout) this.f332174d.findViewById(com.tencent.mm.R.id.root_view);
    }
}
