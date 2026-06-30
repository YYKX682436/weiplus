package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class l9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.o9 f113365d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f113366e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(com.tencent.mm.plugin.finder.live.plugin.o9 o9Var, int i17) {
        super(0);
        this.f113365d = o9Var;
        this.f113366e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = this.f113365d;
        int i17 = this.f113366e;
        int x17 = o9Var.x1(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "mini preview cameraRotate: " + x17 + ", contextRotate: " + i17);
        in0.q B1 = o9Var.B1();
        if (B1 != null) {
            B1.y0(x17);
        }
        return jz5.f0.f302826a;
    }
}
