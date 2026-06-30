package ef0;

@j95.b
/* loaded from: classes8.dex */
public final class k2 extends i95.w implements qk.n8 {

    /* renamed from: d, reason: collision with root package name */
    public bw5.lp0 f252252d;

    /* renamed from: e, reason: collision with root package name */
    public qk.m8 f252253e = qk.m8.f364250d;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f252254f = jz5.h.b(ef0.i2.f252231d);

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f252255g = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f252256h = jz5.h.b(ef0.h2.f252223d);

    public k2() {
        bw5.v70 d17;
        ef0.j2 j2Var = new ef0.j2(this);
        if (Bi()) {
            ((ef0.j3) ((qk.u8) i95.n0.c(qk.u8.class))).wi(j2Var);
            qk.ia Ri = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Ri();
            bw5.lp0 uj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).uj();
            this.f252252d = uj6;
            boolean z17 = false;
            if (uj6 != null) {
                boolean ij6 = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).ij(uj6.d().f34189e);
                if (ij6 && Ri.h()) {
                    Ri(qk.m8.f364252f, false, this.f252252d);
                }
                z17 = ij6;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("init enableTingEntryWithPlayState: ");
            sb6.append(Bi());
            sb6.append(", isTypeShowPlayStateView: ");
            sb6.append(z17);
            sb6.append(", playState: ");
            sb6.append(Ri);
            sb6.append(", mCurrentShowMode: ");
            sb6.append(this.f252253e);
            sb6.append(", listenType: ");
            bw5.lp0 lp0Var = this.f252252d;
            sb6.append((lp0Var == null || (d17 = lp0Var.d()) == null) ? null : java.lang.Integer.valueOf(d17.f34189e));
            com.tencent.mars.xlog.Log.i("MicroMsg.TingDiscoverEntryService", sb6.toString());
        }
    }

    public static final void wi(ef0.k2 k2Var, qk.m8 m8Var, bw5.lp0 lp0Var) {
        bw5.v70 d17;
        bw5.v70 d18;
        bw5.v70 d19;
        bw5.v70 d27;
        k2Var.getClass();
        boolean z17 = false;
        boolean ij6 = ((ef0.y2) ((qk.o8) i95.n0.c(qk.o8.class))).ij((lp0Var == null || (d27 = lp0Var.d()) == null) ? 0 : d27.f34189e);
        com.tencent.mars.xlog.Log.i("MicroMsg.TingDiscoverEntryService", "switchPlayShowMode mode: " + m8Var + ", isTypeShowPlayStateView: " + ij6);
        java.lang.String str = null;
        if (!ij6) {
            k2Var.Ri(qk.m8.f364250d, false, null);
            k2Var.f252252d = null;
            return;
        }
        bw5.lp0 lp0Var2 = k2Var.f252252d;
        if (!kotlin.jvm.internal.o.b((lp0Var2 == null || (d19 = lp0Var2.d()) == null) ? null : d19.getListenId(), (lp0Var == null || (d18 = lp0Var.d()) == null) ? null : d18.getListenId())) {
            if (lp0Var != null && (d17 = lp0Var.d()) != null) {
                str = d17.getListenId();
            }
            if (!(str == null || str.length() == 0)) {
                z17 = true;
            }
        }
        k2Var.Ri(m8Var, z17, lp0Var);
        k2Var.f252252d = lp0Var;
    }

    public void Ai(java.util.Map data) {
        bw5.lp0 lp0Var;
        bw5.v70 d17;
        kotlin.jvm.internal.o.g(data, "data");
        boolean Di = Di();
        bw5.lp0 lp0Var2 = this.f252252d;
        if (lp0Var2 != null && (d17 = lp0Var2.d()) != null) {
            d17.getListenId();
        }
        data.put("tde_play_status", java.lang.Integer.valueOf(Di ? 1 : 0));
        if (!Di || (lp0Var = this.f252252d) == null) {
            return;
        }
        bw5.v70 d18 = lp0Var.d();
        java.lang.String str = d18.hasFieldNumber(9) ? d18.f34196o : "";
        kotlin.jvm.internal.o.f(str, "getBaseListenId(...)");
        data.put("tde_play_base_listenid", str);
        java.lang.String listenId = lp0Var.d().getListenId();
        kotlin.jvm.internal.o.f(listenId, "getListenId(...)");
        data.put("tde_play_listenid", listenId);
        data.put("tde_play_listenid_type", java.lang.Integer.valueOf(lp0Var.d().f34189e));
    }

    public final boolean Bi() {
        return ((java.lang.Boolean) this.f252256h.getValue()).booleanValue();
    }

    public boolean Di() {
        qk.m8 m8Var = this.f252253e;
        return m8Var == qk.m8.f364251e || m8Var == qk.m8.f364252f;
    }

    public final void Ni(qk.m8 mode, bw5.lp0 lp0Var, qk.ia iaVar) {
        java.util.Iterator it = this.f252255g.iterator();
        while (it.hasNext()) {
            rg5.u uVar = (rg5.u) ((qk.l8) it.next());
            uVar.getClass();
            kotlin.jvm.internal.o.g(mode, "mode");
            rg5.x xVar = uVar.f395282a;
            xVar.f395292g = lp0Var;
            xVar.e(mode, iaVar);
        }
    }

    public final void Ri(qk.m8 m8Var, boolean z17, bw5.lp0 lp0Var) {
        java.util.Objects.toString(m8Var);
        java.util.Objects.toString(this.f252253e);
        if (this.f252253e != m8Var || z17) {
            if (m8Var == qk.m8.f364250d) {
                this.f252253e = m8Var;
                Ni(m8Var, lp0Var, null);
            } else if (Bi()) {
                if (m8Var == qk.m8.f364251e || m8Var == qk.m8.f364252f) {
                    this.f252253e = m8Var;
                    Ni(m8Var, lp0Var, ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).Ri());
                }
            }
        }
    }
}
