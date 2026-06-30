package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class h00 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.w00 f112746d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(com.tencent.mm.plugin.finder.live.plugin.w00 w00Var) {
        super(0);
        this.f112746d = w00Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = this.f112746d;
        java.lang.String str = w00Var.H;
        if (str == null) {
            str = "";
        }
        dk2.v4 v4Var = w00Var.S;
        v4Var.getClass();
        v4Var.f234233f = str;
        v4Var.f234234g = true;
        dk2.xf W0 = w00Var.W0();
        if (W0 != null) {
            ((dk2.r4) W0).j0(w00Var.H, true, v4Var);
        }
        return jz5.f0.f302826a;
    }
}
