package ws2;

/* loaded from: classes3.dex */
public final class u0 {
    public u0(kotlin.jvm.internal.i iVar) {
    }

    public final ws2.k1 a() {
        if (ws2.k1.f449067s == null) {
            synchronized (this) {
                if (ws2.k1.f449067s == null) {
                    ws2.k1.f449067s = new ws2.k1();
                }
            }
        }
        ws2.k1 k1Var = ws2.k1.f449067s;
        kotlin.jvm.internal.o.d(k1Var);
        return k1Var;
    }

    public final void b(boolean z17) {
        ws2.k1 k1Var = ws2.k1.f449067s;
        if (k1Var == null) {
            return;
        }
        if (!z17) {
            dt2.b0 b0Var = k1Var.f449073e;
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout = b0Var instanceof com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout ? (com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout) b0Var : null;
            if (finderLiveReplayPluginLayout != null) {
                finderLiveReplayPluginLayout.finish();
            }
            ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
            k1Var.l(9, jVar != null ? jVar.O6() : 0L, true);
            return;
        }
        dt2.b0 b0Var2 = k1Var.f449073e;
        com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout finderLiveReplayPluginLayout2 = b0Var2 instanceof com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout ? (com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout) b0Var2 : null;
        if (finderLiveReplayPluginLayout2 != null) {
            at2.u1 u1Var = (at2.u1) finderLiveReplayPluginLayout2.getPlugin(at2.u1.class);
            if (u1Var != null) {
                u1Var.x1();
            }
            com.tencent.mm.plugin.finder.replay.FinderLiveReplayPluginLayout.s(finderLiveReplayPluginLayout2, false, false, true, 3, null);
        }
    }

    public final boolean c() {
        ct2.j jVar;
        if (ws2.k1.f449067s == null) {
            return false;
        }
        ws2.k1 k1Var = ws2.k1.f449067s;
        if (k1Var == null) {
            return true;
        }
        ws2.k1 k1Var2 = ws2.k1.f449067s;
        k1Var.l(1, (k1Var2 == null || (jVar = (ct2.j) k1Var2.e(ct2.j.class)) == null) ? 0L : jVar.O6(), true);
        return true;
    }
}
