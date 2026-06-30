package mx0;

/* loaded from: classes5.dex */
public final class h8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.more_template.MoreTemplateFakeView f332032e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, com.tencent.mm.mj_publisher.finder.shoot_composing.more_template.MoreTemplateFakeView moreTemplateFakeView) {
        super(0);
        this.f332031d = shootComposingPluginLayout;
        this.f332032e = moreTemplateFakeView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.constraintlayout.widget.ConstraintLayout rootView;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332031d;
        rootView = shootComposingPluginLayout.getRootView();
        rootView.removeView(this.f332032e);
        shootComposingPluginLayout.Q = null;
        return jz5.f0.f302826a;
    }
}
