package ey2;

/* loaded from: classes2.dex */
public final class z1 extends pf5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public ey2.d3 f257592e;

    /* renamed from: f, reason: collision with root package name */
    public r45.ym5 f257593f;

    /* renamed from: g, reason: collision with root package name */
    public r45.um5 f257594g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f257595h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f257596i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f257597m;

    public z1() {
        this.f257595h = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_SYNC_RED_DOT_SESSION_REPORT_SWITCH_INT, 0) > 0;
        com.tencent.matrix.lifecycle.owners.ProcessUIStartedStateOwner.INSTANCE.addLifecycleCallback(new ey2.s1(this));
    }

    public final ey2.d3 N6() {
        if (this.f257592e == null) {
            ey2.d3 d3Var = new ey2.d3(null, 1, null);
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            d3Var.f257342a.set(1, b52.b.b());
            this.f257592e = d3Var;
        }
        ey2.d3 d3Var2 = this.f257592e;
        kotlin.jvm.internal.o.d(d3Var2);
        return d3Var2;
    }

    public final r45.um5 O6(r45.um5 um5Var) {
        if (um5Var == null) {
            return null;
        }
        r45.um5 um5Var2 = new r45.um5();
        um5Var2.set(2, um5Var.getByteString(2));
        um5Var2.set(1, java.lang.Integer.valueOf(um5Var.getInteger(1)));
        um5Var2.set(3, java.lang.Long.valueOf(um5Var.getLong(3)));
        um5Var2.set(0, java.lang.Long.valueOf(um5Var.getLong(0)));
        return um5Var2;
    }

    public final ey2.d3 P6(int i17) {
        r45.ym5 ym5Var;
        r45.ym5 ym5Var2;
        if (!this.f257595h) {
            return null;
        }
        ey2.d3 d3Var = this.f257592e;
        if (d3Var != null && (ym5Var2 = d3Var.f257342a) != null) {
            ym5Var2.set(0, java.lang.Integer.valueOf(i17));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[consumeRedDotSession] ");
        sb6.append((d3Var == null || (ym5Var = d3Var.f257342a) == null) ? null : ey2.a2.b(ym5Var));
        com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", sb6.toString());
        this.f257592e = null;
        return d3Var;
    }

    public final void Q6() {
        r45.vs2 vs2Var;
        ey2.d3 N6 = N6();
        if (N6.f257348g) {
            java.util.LinkedList list = N6.f257342a.getList(6);
            r45.um5 um5Var = new r45.um5();
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = N6.f257350i;
            um5Var.set(2, (jbVar == null || (vs2Var = jbVar.field_ctrInfo) == null) ? null : vs2Var.f388502w);
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = N6.f257350i;
            um5Var.set(1, java.lang.Integer.valueOf(jbVar2 != null ? jbVar2.field_ctrType : 0));
            um5Var.set(3, java.lang.Long.valueOf(N6.f257351j));
            um5Var.set(0, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - N6.f257349h) / 1000));
            list.add(um5Var);
            N6.f257348g = false;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dismissLeft] tipsId=");
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 = N6.f257350i;
            sb6.append(jbVar3 != null ? jbVar3.field_tipsId : null);
            com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", sb6.toString());
        }
    }

    public final void R6(int i17) {
        r45.vs2 vs2Var;
        ey2.d3 N6 = N6();
        if (N6.f257344c) {
            N6.f257344c = false;
            r45.um5 um5Var = new r45.um5();
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = N6.f257346e;
            um5Var.set(2, (jbVar == null || (vs2Var = jbVar.field_ctrInfo) == null) ? null : vs2Var.f388502w);
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = N6.f257346e;
            um5Var.set(1, java.lang.Integer.valueOf(jbVar2 != null ? jbVar2.field_ctrType : 0));
            um5Var.set(0, java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - N6.f257345d) / 1000));
            N6.f257342a.getList(7).add(um5Var);
            if (i17 == 2) {
                V6(O6(um5Var));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[dismissRight] scene=");
            sb6.append(i17);
            sb6.append(", tipsId=");
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 = N6.f257346e;
            sb6.append(jbVar3 != null ? jbVar3.field_tipsId : null);
            sb6.append('}');
            com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", sb6.toString());
        }
    }

    public final void S6(ey2.d3 d3Var) {
        r45.ym5 ym5Var;
        r45.ym5 ym5Var2;
        if (this.f257595h) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doSync] pendingClickSceneRedDot=");
            r45.um5 um5Var = this.f257594g;
            boolean z17 = false;
            sb6.append(um5Var != null ? um5Var.hashCode() : 0);
            sb6.append(' ');
            sb6.append((d3Var == null || (ym5Var2 = d3Var.f257342a) == null) ? null : ey2.a2.b(ym5Var2));
            com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", sb6.toString());
            if (d3Var != null && (ym5Var = d3Var.f257342a) != null && ym5Var.getInteger(0) == 3) {
                z17 = true;
            }
            if (z17) {
                r45.um5 um5Var2 = this.f257594g;
                if (um5Var2 != null) {
                    d3Var.f257342a.getList(7).add(O6(um5Var2));
                    com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", "[FinderReddotDoSync] insert right_reddot_info=" + ey2.a2.a(um5Var2));
                }
                V6(null);
            }
            r45.ym5 ym5Var3 = d3Var != null ? d3Var.f257342a : null;
            this.f257593f = ym5Var3;
            if (ym5Var3 != null) {
                ((ku5.t0) ku5.t0.f312615d).B(ey2.y1.f257582d);
            }
        }
    }

    public final void T6(int i17) {
        if (this.f257595h) {
            com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", "[fallback] scene=" + i17);
            if (i17 != 1) {
                com.tencent.mm.plugin.finder.extension.reddot.aa aaVar = com.tencent.mm.plugin.finder.extension.reddot.aa.f105353a;
                com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = (com.tencent.mm.plugin.finder.extension.reddot.z9) com.tencent.mm.plugin.finder.extension.reddot.aa.U.getValue();
                if (z9Var != null && z9Var.f105329c != null && z9Var.f105327a) {
                    W6(z9Var);
                }
                com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var2 = (com.tencent.mm.plugin.finder.extension.reddot.z9) com.tencent.mm.plugin.finder.extension.reddot.aa.f105359d.getValue();
                if (z9Var2 != null && z9Var2.f105329c != null && z9Var2.f105327a) {
                    X6("[fallback] scene=" + i17, z9Var2);
                }
            }
            R6(i17);
            Q6();
        }
    }

    public final r45.ym5 U6(int i17) {
        if (!this.f257595h) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getRedDotSession] syncLocalScene=");
        sb6.append(i17);
        sb6.append(' ');
        r45.ym5 ym5Var = this.f257593f;
        sb6.append(ym5Var != null ? ey2.a2.b(ym5Var) : null);
        com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", sb6.toString());
        r45.ym5 ym5Var2 = this.f257593f;
        this.f257593f = null;
        return ym5Var2;
    }

    public final void V6(r45.um5 um5Var) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderReddotDoSync] save clickScenePendingRedDot=");
        sb6.append(um5Var != null ? ey2.a2.a(um5Var) : null);
        com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", sb6.toString());
        this.f257594g = um5Var;
    }

    public final void W6(com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var) {
        ey2.d3 N6 = N6();
        if (N6.f257348g) {
            return;
        }
        N6.f257348g = true;
        N6.f257349h = java.lang.System.currentTimeMillis();
        N6.f257350i = z9Var.f105329c;
        r45.f03 f03Var = z9Var.f105328b;
        N6.f257351j = f03Var != null ? f03Var.f373888e : 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[showLeft] tipsId=");
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = N6.f257350i;
        sb6.append(jbVar != null ? jbVar.field_tipsId : null);
        com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", sb6.toString());
    }

    public final void X6(java.lang.String str, com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var) {
        com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", str + " showRight (" + z9Var.hashCode() + ") " + z9Var + ",pendingRedDotSessionEx=" + this.f257592e);
        ey2.d3 N6 = N6();
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar = N6.f257346e;
        java.lang.String str2 = jbVar != null ? jbVar.field_tipsId : null;
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar2 = z9Var.f105329c;
        if (!kotlin.jvm.internal.o.b(str2, jbVar2 != null ? jbVar2.field_tipsId : null)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[showLeft] change ");
            com.tencent.mm.plugin.finder.extension.reddot.jb jbVar3 = N6.f257346e;
            sb6.append(jbVar3 != null ? jbVar3.field_tipsId : null);
            sb6.append(" -> ");
            sb6.append(jbVar2 != null ? jbVar2.field_tipsId : null);
            com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", sb6.toString());
            R6(-1);
        }
        if (N6.f257344c) {
            return;
        }
        N6.f257344c = true;
        N6.f257345d = java.lang.System.currentTimeMillis();
        N6.f257346e = jbVar2;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[showRight] tipsId=");
        com.tencent.mm.plugin.finder.extension.reddot.jb jbVar4 = N6.f257346e;
        sb7.append(jbVar4 != null ? jbVar4.field_tipsId : null);
        com.tencent.mars.xlog.Log.i("Finder.RedDotSessionVM", sb7.toString());
    }
}
