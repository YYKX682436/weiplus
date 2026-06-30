package hn0;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hn0.p f282389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f282390e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(hn0.p pVar, double d17) {
        super(0);
        this.f282389d = pVar;
        this.f282390e = d17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        p05.h1 h1Var = (p05.h1) this.f282389d.f282401c;
        double d17 = this.f282390e;
        h1Var.f350534i = d17;
        if (!h1Var.f350524a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MakeUpSuitEffect", "This effect is not attached!");
        }
        if (h1Var.f350524a) {
            long j17 = h1Var.f350529f;
            if (j17 > 0) {
                com.tencent.mm.xeffect.WeEffectRender.nSetFilterColorWeight(h1Var.f350526c, j17, (float) d17);
            }
        }
        return jz5.f0.f302826a;
    }
}
