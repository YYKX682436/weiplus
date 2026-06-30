package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u80 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.x80 f114535d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f114536e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u80(com.tencent.mm.plugin.finder.live.plugin.x80 x80Var, android.view.MotionEvent motionEvent) {
        super(0);
        this.f114535d = x80Var;
        this.f114536e = motionEvent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.x80 x80Var = this.f114535d;
        if (!x80Var.f115059z) {
            com.tencent.mm.plugin.finder.live.plugin.x80.A1(x80Var, null, this.f114536e, 1, null);
        }
        x80Var.w1();
        return jz5.f0.f302826a;
    }
}
