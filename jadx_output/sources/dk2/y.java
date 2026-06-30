package dk2;

/* loaded from: classes3.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.g0 f234361d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(dk2.g0 g0Var) {
        super(0);
        this.f234361d = g0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = this.f234361d.f233469b;
        if (k0Var != null) {
            com.tencent.mm.plugin.finder.live.view.k0.showProgressWithBlurBg$default(k0Var, null, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
