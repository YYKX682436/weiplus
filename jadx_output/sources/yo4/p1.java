package yo4;

/* loaded from: classes10.dex */
public final class p1 implements zu3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f464297a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zu3.y f464298b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout f464299c;

    public p1(long j17, zu3.y yVar, com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout) {
        this.f464297a = j17;
        this.f464298b = yVar;
        this.f464299c = multiVideoPluginLayout;
    }

    @Override // zu3.r
    public void a() {
        so4.g gVar = so4.g.f410776a;
        com.tencent.mm.xeffect.effect.EffectManager effectManager = so4.g.f410781f;
        kotlin.jvm.internal.o.d(effectManager);
        effectManager.e(this.f464297a);
    }

    @Override // zu3.r
    public void b() {
        so4.g gVar = so4.g.f410776a;
        com.tencent.mm.xeffect.effect.EffectManager effectManager = so4.g.f410781f;
        kotlin.jvm.internal.o.d(effectManager);
        effectManager.n(this.f464297a);
    }

    @Override // zu3.r
    public void c(float f17, float f18, float f19, float f27) {
        so4.g gVar = so4.g.f410776a;
        com.tencent.mm.xeffect.effect.EffectManager effectManager = so4.g.f410781f;
        kotlin.jvm.internal.o.d(effectManager);
        effectManager.l(this.f464298b.f475866h);
        this.f464299c.getMultiPreviewPlugin().B();
    }
}
