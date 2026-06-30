package mx0;

/* loaded from: classes5.dex */
public final class a9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f331837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f331838e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, boolean z17) {
        super(0);
        this.f331837d = shootComposingPluginLayout;
        this.f331838e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        wx0.g1 subtitlePlugin;
        subtitlePlugin = this.f331837d.getSubtitlePlugin();
        subtitlePlugin.setVisibility(this.f331838e ? 0 : 8);
        return jz5.f0.f302826a;
    }
}
