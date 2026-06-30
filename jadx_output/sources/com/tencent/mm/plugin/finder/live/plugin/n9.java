package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class n9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.o9 f113599d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f113600e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(com.tencent.mm.plugin.finder.live.plugin.o9 o9Var, int i17) {
        super(0);
        this.f113599d = o9Var;
        this.f113600e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = this.f113599d;
        int i17 = this.f113600e;
        int x17 = o9Var.x1(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "switchCamera cameraRotate: " + x17 + ", contextRotate: " + i17);
        in0.q B1 = o9Var.B1();
        if (B1 != null) {
            B1.y0(x17);
        }
        return jz5.f0.f302826a;
    }
}
