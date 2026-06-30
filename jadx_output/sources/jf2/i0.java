package jf2;

/* loaded from: classes3.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jf2.k0 f299375d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(jf2.k0 k0Var) {
        super(0);
        this.f299375d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ll0 ll0Var;
        com.tencent.mm.plugin.finder.live.plugin.ui uiVar;
        com.tencent.mm.plugin.finder.live.widget.dk dkVar;
        com.tencent.mm.plugin.finder.live.plugin.t20 t20Var;
        boolean booleanValue = ((java.lang.Boolean) ae2.in.f3706b7.r()).booleanValue();
        jf2.k0 k0Var = this.f299375d;
        if (booleanValue && (t20Var = (com.tencent.mm.plugin.finder.live.plugin.t20) k0Var.R6(com.tencent.mm.plugin.finder.live.plugin.t20.class)) != null) {
            t20Var.x1("test bubble", jf2.h0.f299374d);
        }
        if (((java.lang.Boolean) ae2.in.f3716c7.r()).booleanValue() && (uiVar = (com.tencent.mm.plugin.finder.live.plugin.ui) k0Var.R6(com.tencent.mm.plugin.finder.live.plugin.ui.class)) != null && (dkVar = uiVar.f114568p) != null) {
            dkVar.f();
        }
        if (((java.lang.Boolean) ae2.in.f3726d7.r()).booleanValue() && (ll0Var = (com.tencent.mm.plugin.finder.live.plugin.ll0) k0Var.R6(com.tencent.mm.plugin.finder.live.plugin.ll0.class)) != null) {
            ll0Var.u1(1, "test vr");
        }
        return jz5.f0.f302826a;
    }
}
