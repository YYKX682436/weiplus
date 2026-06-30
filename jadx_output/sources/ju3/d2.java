package ju3;

/* loaded from: classes10.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout f301930d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mu3.b f301931e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f301932f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.tencent.mm.plugin.recordvideo.plugin.parent.RecordPluginLayout recordPluginLayout, mu3.b bVar, boolean z17) {
        super(0);
        this.f301930d = recordPluginLayout;
        this.f301931e = bVar;
        this.f301932f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        p05.l4 l4Var;
        com.tencent.mm.plugin.xlabeffect.XEffectConfig xEffectConfig;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider = this.f301930d.getConfigProvider();
        mu3.b bVar = this.f301931e;
        if (configProvider != null && (xEffectConfig = configProvider.Q) != null && bVar != null) {
            bVar.f331400x = xEffectConfig;
            p05.l4 l4Var2 = bVar.f331398v;
            if (l4Var2 != null) {
                l4Var2.F(xEffectConfig);
            }
        }
        if (bVar != null && (l4Var = bVar.f331398v) != null) {
            l4Var.C(this.f301932f);
        }
        return jz5.f0.f302826a;
    }
}
