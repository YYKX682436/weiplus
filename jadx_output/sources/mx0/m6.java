package mx0;

/* loaded from: classes5.dex */
public final class m6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout) {
        super(0);
        this.f332154d = shootComposingPluginLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mx0.r1 micMutePlugin;
        wx0.g1 subtitlePlugin;
        com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = this.f332154d;
        micMutePlugin = shootComposingPluginLayout.getMicMutePlugin();
        yx0.b8 b8Var = shootComposingPluginLayout.f69557v;
        subtitlePlugin = shootComposingPluginLayout.getSubtitlePlugin();
        return new mx0.q2(shootComposingPluginLayout, micMutePlugin, shootComposingPluginLayout, b8Var, subtitlePlugin);
    }
}
