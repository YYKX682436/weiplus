package um2;

/* loaded from: classes3.dex */
public final class u5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428982d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(um2.x5 x5Var) {
        super(0);
        this.f428982d = x5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f428982d;
        co0.s E = x5Var.E();
        if (E != null) {
            zl2.r4 r4Var = zl2.r4.f473950a;
            E.R0(x5Var.f429034f1 ? 5 : 2);
        }
        com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var = x5Var.f429041i;
        if (dk0Var != null) {
            dk0Var.v1();
        }
        com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var2 = x5Var.f429041i;
        if (dk0Var2 == null) {
            return null;
        }
        com.tencent.mm.live.core.trtc.TRTCVideoRatioLayout tRTCVideoRatioLayout = dk0Var2.f112299p.renderRatioLayout;
        tRTCVideoRatioLayout.getClass();
        tRTCVideoRatioLayout.f68576o.d(false);
        return jz5.f0.f302826a;
    }
}
