package px2;

/* loaded from: classes2.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f358910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout f358911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f358912f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(float f17, com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout, in5.s0 s0Var) {
        super(0);
        this.f358910d = f17;
        this.f358911e = finderVideoLandscapePreviewLayout;
        this.f358912f = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        float f17 = this.f358910d;
        boolean z17 = f17 == 1.0f;
        com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout finderVideoLandscapePreviewLayout = this.f358911e;
        if (z17) {
            ow2.h hVar = finderVideoLandscapePreviewLayout.W;
            if (hVar != null) {
                hVar.f(this.f358912f, true);
            }
        } else {
            ow2.h hVar2 = finderVideoLandscapePreviewLayout.W;
            if (hVar2 != null) {
                hVar2.h(f17);
            }
        }
        return jz5.f0.f302826a;
    }
}
