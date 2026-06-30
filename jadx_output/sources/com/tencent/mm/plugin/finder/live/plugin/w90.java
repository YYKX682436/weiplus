package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w90 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ea0 f114897d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w90(com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var) {
        super(0);
        this.f114897d = ea0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ea0 ea0Var = this.f114897d;
        if (ea0Var.f112387q.getLiveRole() == 2) {
            ea0Var.C1();
        } else {
            ea0Var.x1(null);
        }
        return jz5.f0.f302826a;
    }
}
