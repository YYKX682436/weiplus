package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class e9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.o9 f112380d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e9(com.tencent.mm.plugin.finder.live.plugin.o9 o9Var) {
        super(0);
        this.f112380d = o9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiveCoreAnchor", "onTouchUp");
        this.f112380d.f113723x = false;
        return jz5.f0.f302826a;
    }
}
