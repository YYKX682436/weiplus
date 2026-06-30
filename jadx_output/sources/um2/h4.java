package um2;

/* loaded from: classes3.dex */
public final class h4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(um2.x5 x5Var) {
        super(0);
        this.f428821d = x5Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um2.x5 x5Var = this.f428821d;
        if (((mm2.c1) x5Var.c(mm2.c1.class)).P6() == 1 && !((mm2.e1) x5Var.c(mm2.e1.class)).b7()) {
            com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var = x5Var.f429041i;
            if (dk0Var != null) {
                dk0Var.t1();
            }
            com.tencent.mm.plugin.finder.live.plugin.dk0 dk0Var2 = x5Var.f429041i;
            if (dk0Var2 != null) {
                dk0Var2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var = x5Var.f429038h;
            if (ob0Var != null) {
                ob0Var.K0(0);
            }
            com.tencent.mm.plugin.finder.live.plugin.ob0 ob0Var2 = x5Var.f429038h;
            if (ob0Var2 != null) {
                zl2.r4 r4Var = zl2.r4.f473950a;
                com.tencent.rtmp.TXLivePlayConfig d07 = r4Var.d0(x5Var.f429032f);
                gk2.e eVar = x5Var.f19609a;
                fm2.c cVar = x5Var.f19606c;
                com.tencent.mm.plugin.finder.live.plugin.ob0.G1(ob0Var2, 0, d07, r4Var.R0(eVar, cVar != null ? cVar.isLandscape() : false, false), false, false, null, null, 105, null);
            }
        }
        return jz5.f0.f302826a;
    }
}
