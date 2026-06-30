package du2;

/* loaded from: classes2.dex */
public final class i {
    public i(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a() {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Mg).getValue()).r()).booleanValue();
    }

    public final boolean b() {
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Lg).getValue()).r()).booleanValue();
    }

    public final boolean c() {
        if (gm0.j1.a()) {
            return b() || a();
        }
        com.tencent.mars.xlog.Log.i("FinderSystemPlayerController", "[isHitExp], account not ready, return false!");
        return false;
    }

    public final boolean d(in5.s0 holder) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("FinderSystemPlayerController", "[isHitExp], account not ready, return false!");
            return false;
        }
        so2.j5 j5Var = (so2.j5) holder.f293125i;
        if (j5Var instanceof so2.u1) {
            return b();
        }
        if (j5Var instanceof so2.h1) {
            return a();
        }
        return false;
    }
}
