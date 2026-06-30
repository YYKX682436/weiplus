package hq0;

/* loaded from: classes7.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f283069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iq0.e f283070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f283071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double f283072g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(hq0.b0 b0Var, iq0.e eVar, double d17, double d18) {
        super(0);
        this.f283069d = b0Var;
        this.f283070e = eVar;
        this.f283071f = d17;
        this.f283072g = d18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        for (com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer : hq0.b0.J1(this.f283069d, this.f283070e, wq0.b.f448494d)) {
            magicSclViewContainer.getLocationInWindow(new int[2]);
            double c17 = i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) (r2[1] - this.f283071f));
            fq0.x frameSet = magicSclViewContainer.getFrameSet();
            if (frameSet != null) {
                frameSet.g(this.f283072g, c17);
            }
        }
        return jz5.f0.f302826a;
    }
}
