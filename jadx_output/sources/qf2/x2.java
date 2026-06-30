package qf2;

/* loaded from: classes10.dex */
public final class x2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.o4 f362646e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(qf2.c3 c3Var, mm2.o4 o4Var) {
        super(0);
        this.f362645d = c3Var;
        this.f362646e = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f362645d.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null) {
            com.tencent.mm.plugin.finder.live.view.k0.fillBlurBg$default(k0Var, ((mm2.c1) this.f362646e.business(mm2.c1.class)).f328852o, false, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
