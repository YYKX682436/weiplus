package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class sb0 implements qk.ba {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.dc0 f114238a;

    public sb0(com.tencent.mm.plugin.finder.live.plugin.dc0 dc0Var) {
        this.f114238a = dc0Var;
    }

    @Override // qk.ba
    public void a(java.lang.String listenId, bw5.g80 g80Var, boolean z17, bw5.i80 i80Var) {
        kotlin.jvm.internal.o.g(listenId, "listenId");
        if (z17) {
            boolean z18 = false;
            if (g80Var != null && !g80Var.f27725f) {
                z18 = true;
            }
            com.tencent.mm.plugin.finder.live.plugin.dc0.a(this.f114238a, "likeTingCallback", z18);
        }
    }
}
