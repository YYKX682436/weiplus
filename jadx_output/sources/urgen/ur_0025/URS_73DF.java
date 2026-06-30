package urgen.ur_0025;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0007J\n\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010\r\u001a\u0004\u0018\u00010\u0004H\u0007J\n\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007¨\u0006\u000f"}, d2 = {"Lurgen/ur_0025/URS_73DF;", "", "()V", "UR_0832", "Lcom/tencent/unit_rc/BaseObjectDef;", "UR_5F0B", "config", "", "UR_7C3B", "UR_7D86", com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY, "", "UR_D7F3", "UR_DB60", "UR_FB8A", "plugin-ting_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class URS_73DF {
    public static final urgen.ur_0025.URS_73DF INSTANCE = new urgen.ur_0025.URS_73DF();

    private URS_73DF() {
    }

    public static final com.tencent.unit_rc.BaseObjectDef UR_0832() {
        bw5.eq0 eq0Var = bw5.eq0.FinderAudio;
        sl4.l lVar = new sl4.l(eq0Var, null);
        tl4.l lVar2 = new tl4.l(eq0Var);
        jm4.s2 s2Var = new jm4.s2();
        s2Var.aa(eq0Var);
        s2Var.pf("FinderAudio");
        s2Var.K(jm4.q3.f300408g);
        jm4.n2 a17 = jm4.p2.f300403e.a(s2Var);
        lVar.a(a17);
        lVar2.a(a17);
        if (a17 != null) {
            ((jm4.p2) a17).j(lVar);
        }
        if (a17 != null) {
            ((jm4.p2) a17).n(lVar2);
        }
        ul4.i iVar = new ul4.i(eq0Var, new com.tencent.unit_rc.WeakPtr(a17), null);
        if (a17 != null) {
            ((jm4.p2) a17).g(iVar);
        }
        return a17;
    }

    public static final com.tencent.unit_rc.BaseObjectDef UR_5F0B(byte[] config) {
        bw5.cq0 cq0Var = config != null ? (bw5.cq0) jm4.r5.b(config, new bw5.cq0()) : null;
        bw5.eq0 eq0Var = bw5.eq0.StandAlone;
        jm4.s2 s2Var = new jm4.s2();
        s2Var.aa(eq0Var);
        s2Var.pf("StandAlone");
        s2Var.K(jm4.q3.f300408g);
        b66.g a17 = jm4.p2.f300403e.a(s2Var);
        rl4.c a18 = wl4.w.f447104a.a(eq0Var, cq0Var);
        if (cq0Var != null) {
            if (cq0Var.f26196f) {
                sl4.l lVar = new sl4.l(eq0Var, a18);
                lVar.a(a17);
                if (a17 != null) {
                    ((jm4.p2) a17).j(lVar);
                }
            }
            if (a17 != null) {
                byte[] byteArray = cq0Var.toByteArray();
                long cppPointer = ((b66.i) a17).getCppPointer();
                kotlin.jvm.internal.o.d(byteArray);
                urgen.ur_2BA9.UR_882D.UR_09F6(cppPointer, byteArray);
            }
        }
        ul4.i iVar = new ul4.i(eq0Var, new com.tencent.unit_rc.WeakPtr(a17), null);
        if (a17 != null) {
            ((jm4.p2) a17).g(iVar);
        }
        return a17;
    }

    public static final com.tencent.unit_rc.BaseObjectDef UR_7C3B() {
        bw5.eq0 eq0Var = bw5.eq0.QuickPlay;
        rl4.c a17 = wl4.w.f447104a.a(eq0Var, null);
        sl4.l lVar = new sl4.l(eq0Var, a17);
        tl4.l lVar2 = new tl4.l(eq0Var);
        jm4.s2 s2Var = new jm4.s2();
        s2Var.aa(eq0Var);
        s2Var.pf("QuickPlay");
        s2Var.K(a17.f());
        s2Var.W5(true);
        jm4.n2 a18 = jm4.p2.f300403e.a(s2Var);
        lVar.a(a18);
        lVar2.a(a18);
        if (a18 != null) {
            ((jm4.p2) a18).j(lVar);
        }
        if (a18 != null) {
            ((jm4.p2) a18).n(lVar2);
        }
        ul4.i iVar = new ul4.i(eq0Var, new com.tencent.unit_rc.WeakPtr(a18), null);
        if (a18 != null) {
            ((jm4.p2) a18).g(iVar);
        }
        return a18;
    }

    public static final com.tencent.unit_rc.BaseObjectDef UR_7D86(int identifier) {
        jm4.n2 a17;
        bw5.eq0 a18 = bw5.eq0.a(identifier);
        kotlin.jvm.internal.o.d(a18);
        wl4.w wVar = wl4.w.f447104a;
        rl4.c a19 = wVar.a(a18, null);
        if (a19.f() == jm4.q3.f300411m) {
            rl4.c a27 = wVar.a(a18, null);
            jm4.s2 s2Var = new jm4.s2();
            s2Var.aa(a18);
            s2Var.pf(a18.name());
            s2Var.K(a27.f());
            a17 = jm4.p2.f300403e.a(s2Var);
            com.tencent.unit_rc.WeakPtr weakPtr = new com.tencent.unit_rc.WeakPtr(a17);
            sl4.l lVar = new sl4.l(a18, a27);
            lVar.a(a17);
            if (a17 != null) {
                ((jm4.p2) a17).j(lVar);
            }
            ul4.i iVar = new ul4.i(a18, weakPtr, null);
            if (a17 != null) {
                ((jm4.p2) a17).g(iVar);
            }
            tl4.l lVar2 = new tl4.l(a18);
            lVar2.a(a17);
            if (a17 != null) {
                ((jm4.p2) a17).n(lVar2);
            }
        } else {
            sl4.l lVar3 = new sl4.l(a18, a19);
            tl4.l lVar4 = new tl4.l(a18);
            jm4.s2 s2Var2 = new jm4.s2();
            s2Var2.aa(a18);
            s2Var2.pf(a18.name());
            s2Var2.K(a19.f());
            s2Var2.W5(true);
            a17 = jm4.p2.f300403e.a(s2Var2);
            lVar3.a(a17);
            lVar4.a(a17);
            if (a17 != null) {
                ((jm4.p2) a17).j(lVar3);
            }
            if (a17 != null) {
                ((jm4.p2) a17).n(lVar4);
            }
            ul4.i iVar2 = new ul4.i(a18, new com.tencent.unit_rc.WeakPtr(a17), null);
            if (a17 != null) {
                ((jm4.p2) a17).g(iVar2);
            }
        }
        return a17;
    }

    public static final com.tencent.unit_rc.BaseObjectDef UR_D7F3() {
        jm4.g3 f17;
        jm4.g3 f18;
        jm4.z1 z1Var;
        bw5.eq0 eq0Var = bw5.eq0.TingChatRoom;
        sl4.l lVar = new sl4.l(eq0Var, null);
        tl4.l lVar2 = new tl4.l(eq0Var);
        jm4.s2 s2Var = new jm4.s2();
        s2Var.aa(eq0Var);
        s2Var.pf("TingChatRoom");
        s2Var.K(jm4.q3.f300410i);
        s2Var.W5(true);
        jm4.n2 a17 = jm4.p2.f300403e.a(s2Var);
        lVar.a(a17);
        lVar2.a(a17);
        if (a17 != null && (f18 = ((jm4.p2) a17).f()) != null && (z1Var = (jm4.z1) urgen.ur_0025.UR_C8FE.UR_FA2F(((jm4.h3) f18).getCppPointer())) != null) {
            urgen.ur_0025.UR_CF17.UR_5356(((jm4.a2) z1Var).getCppPointer(), lVar2);
        }
        if (a17 != null && (f17 = ((jm4.p2) a17).f()) != null) {
            jm4.h3 h3Var = (jm4.h3) f17;
            urgen.ur_0025.UR_C8FE.UR_45D3(h3Var.getCppPointer());
            jm4.d1 p17 = h3Var.p();
            if (p17 != null) {
                jz5.g gVar = vl4.s.f437900f;
                urgen.ur_0025.UR_5D5A.UR_C203(((jm4.e1) p17).getCppPointer(), (vl4.s) ((jz5.n) vl4.s.f437900f).getValue());
            }
        }
        if (a17 != null) {
            ((jm4.p2) a17).j(lVar);
        }
        if (a17 != null) {
            ((jm4.p2) a17).n(lVar2);
        }
        ul4.i iVar = new ul4.i(eq0Var, new com.tencent.unit_rc.WeakPtr(a17), null);
        if (a17 != null) {
            ((jm4.p2) a17).g(iVar);
        }
        jz5.g gVar2 = vl4.s.f437900f;
        ((vl4.s) ((jz5.n) vl4.s.f437900f).getValue()).f437901d = iVar;
        return a17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final com.tencent.unit_rc.BaseObjectDef UR_DB60() {
        jm4.g3 f17;
        jm4.z1 z1Var;
        bw5.eq0 eq0Var = bw5.eq0.TingMusic;
        rl4.c a17 = wl4.w.f447104a.a(eq0Var, null);
        sl4.l lVar = new sl4.l(eq0Var, null);
        tl4.l lVar2 = new tl4.l(eq0Var);
        jm4.s2 s2Var = new jm4.s2();
        s2Var.aa(eq0Var);
        s2Var.pf("TingMusic");
        s2Var.K(a17.f());
        s2Var.W5(true);
        b66.g a18 = jm4.p2.f300403e.a(s2Var);
        lVar.a(a18);
        lVar2.a(a18);
        if (a18 != null && (f17 = ((jm4.p2) a18).f()) != null && (z1Var = (jm4.z1) urgen.ur_0025.UR_C8FE.UR_FA2F(((jm4.h3) f17).getCppPointer())) != null) {
            urgen.ur_0025.UR_CF17.UR_5356(((jm4.a2) z1Var).getCppPointer(), lVar2);
        }
        if (a18 != null) {
            ((jm4.p2) a18).j(lVar);
        }
        if (a18 != null) {
            ((jm4.p2) a18).n(lVar2);
        }
        ul4.i iVar = new ul4.i(eq0Var, new com.tencent.unit_rc.WeakPtr(a18), null);
        if (a18 != null) {
            ((jm4.p2) a18).g(iVar);
        }
        zk4.l lVar3 = zk4.l.f473538a;
        if (a18 != null) {
            jm4.g3 f18 = ((jm4.p2) a18).f();
            zk4.l.f473540c = f18;
            if (f18 != 0) {
                ((b66.q) f18).a(zk4.l.f473542e);
            }
            jm4.g3 g3Var = zk4.l.f473540c;
            if (g3Var != null) {
                urgen.ur_0025.UR_C8FE.UR_EC58(((jm4.h3) g3Var).getCppPointer(), zk4.l.f473543f);
            }
            urgen.ur_2BA9.UR_882D.UR_5E17(((b66.i) a18).getCppPointer(), zk4.l.f473541d);
        }
        return a18;
    }

    public static final com.tencent.unit_rc.BaseObjectDef UR_FB8A() {
        jm4.g3 f17;
        jm4.z1 z1Var;
        jm4.s2 s2Var = new jm4.s2();
        bw5.eq0 eq0Var = bw5.eq0.AudioRadio;
        s2Var.aa(eq0Var);
        s2Var.pf("AudioRadio");
        s2Var.K(jm4.q3.f300408g);
        jm4.n2 a17 = jm4.p2.f300403e.a(s2Var);
        sl4.l lVar = new sl4.l(eq0Var, null);
        tl4.l lVar2 = new tl4.l(eq0Var);
        lVar.a(a17);
        lVar2.a(a17);
        if (a17 != null && (f17 = ((jm4.p2) a17).f()) != null && (z1Var = (jm4.z1) urgen.ur_0025.UR_C8FE.UR_FA2F(((jm4.h3) f17).getCppPointer())) != null) {
            urgen.ur_0025.UR_CF17.UR_5356(((jm4.a2) z1Var).getCppPointer(), lVar2);
        }
        if (a17 != null) {
            ((jm4.p2) a17).j(lVar);
        }
        if (a17 != null) {
            ((jm4.p2) a17).n(lVar2);
        }
        ul4.i iVar = new ul4.i(eq0Var, new com.tencent.unit_rc.WeakPtr(a17), null);
        if (a17 != null) {
            ((jm4.p2) a17).g(iVar);
        }
        return a17;
    }
}
