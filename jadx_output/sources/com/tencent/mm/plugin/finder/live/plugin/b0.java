package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.q0 f111956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f111957e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.plugin.finder.live.plugin.q0 q0Var, kotlin.jvm.internal.h0 h0Var) {
        super(0);
        this.f111956d = q0Var;
        this.f111957e = h0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.q0 q0Var = this.f111956d;
        mm2.h v17 = q0Var.v1();
        kotlin.jvm.internal.h0 h0Var = this.f111957e;
        if (v17 != null) {
            v17.setOnVideoComplete(new com.tencent.mm.plugin.finder.live.plugin.y(q0Var, h0Var));
        }
        mm2.h v18 = q0Var.v1();
        if (v18 != null) {
            v18.setOnVideoError(new com.tencent.mm.plugin.finder.live.plugin.z(q0Var, h0Var));
        }
        mm2.h v19 = q0Var.v1();
        if (v19 != null) {
            v19.setOnFirstFrameRendered(new com.tencent.mm.plugin.finder.live.plugin.a0(q0Var));
        }
        return jz5.f0.f302826a;
    }
}
