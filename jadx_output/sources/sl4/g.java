package sl4;

/* loaded from: classes11.dex */
public abstract class g extends com.tencent.mm.plugin.ball.service.d implements sl4.a {

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f409259n;

    /* renamed from: o, reason: collision with root package name */
    public bl4.b f409260o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.unit_rc.WeakPtr f409261p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f409262q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f409263r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f409264s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f409265t;

    /* renamed from: u, reason: collision with root package name */
    public final qp1.v f409266u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f409267v;

    /* renamed from: w, reason: collision with root package name */
    public bl4.a f409268w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f409269x;

    /* renamed from: y, reason: collision with root package name */
    public final sl4.b f409270y;

    /* renamed from: z, reason: collision with root package name */
    public final sl4.e f409271z;

    public g(bw5.eq0 appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f409259n = "MicroMsg.TingBaseFloatBallHelper." + appId.name();
        this.f409262q = true;
        this.f409264s = true;
        this.f409266u = new qp1.v();
        this.f409267v = jz5.h.b(sl4.f.f409258d);
        this.f409269x = jz5.h.b(new sl4.d(this));
        this.f409270y = new sl4.b(this);
        this.f409271z = new sl4.e(this);
    }

    @Override // com.tencent.mm.plugin.ball.service.d
    public void I() {
        com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity = ((ef0.h3) ((qk.t8) i95.n0.c(qk.t8.class))).f252225e;
        boolean g17 = tingFlutterActivity == null ? false : ep1.m.g(tingFlutterActivity.getIntent());
        com.tencent.mars.xlog.Log.i(this.f409259n, "onReceivedFinishWhenSwitchBallEvent fromFloatBall: " + g17);
        if (g17) {
            ef0.h3 h3Var = (ef0.h3) ((qk.t8) i95.n0.c(qk.t8.class));
            com.tencent.mm.plugin.ting.TingFlutterActivity tingFlutterActivity2 = h3Var.f252225e;
            if (tingFlutterActivity2 != null) {
                tingFlutterActivity2.finish();
            }
            h3Var.Bi(null);
        }
    }

    @Override // sl4.a
    public void c(bl4.b info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f409260o = info;
        if (k0()) {
            s0();
        }
        if (this.f409263r) {
            if (k0()) {
                Z(info.f21735d);
                z0(info.f21734c);
                g();
                return;
            }
            if (this.f409268w == null) {
                this.f409268w = f0();
            }
            bl4.a aVar = this.f409268w;
            if (aVar != null) {
                aVar.a(info);
            }
            z0(info.f21734c);
            java.lang.String str = info.f21736e;
            this.f93132d.f93055p.f93068f = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478494f));
            if (kotlin.jvm.internal.o.b(this.f93132d.f93055p.f93066d, str)) {
                return;
            }
            com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo = this.f93132d.f93055p;
            ballBlurInfo.f93066d = str;
            R(ballBlurInfo);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean e0() {
        java.lang.String str;
        b66.a e17;
        b66.a e18;
        int i17 = 0;
        if (u() && this.f409263r) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addTingFloatBall type: ");
        bl4.b bVar = this.f409260o;
        sb6.append(bVar != null ? bVar.f21732a : null);
        com.tencent.mars.xlog.Log.i(this.f409259n, sb6.toString());
        if (k0()) {
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo = this.f93132d;
            bl4.b bVar2 = this.f409260o;
            ballInfo.f93063x = bVar2 != null ? bVar2.f21735d : null;
            ballInfo.H = 2;
            Q(2);
            com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = this.f93132d.f93054o;
            bl4.b bVar3 = this.f409260o;
            ballButtonInfo.f93069d = v0(bVar3 != null ? bVar3.f21734c : 0);
            ballButtonInfo.f93070e = this.f409262q;
            ballButtonInfo.f93081s = m0();
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo2 = this.f93132d;
            ballInfo2.f93045J = false;
            ballInfo2.I = true;
            ballInfo2.N = l0();
            this.f93132d.f93058s = this.f409264s;
        } else {
            Q(3);
            if (this.f409268w == null) {
                this.f409268w = f0();
            }
            bl4.a aVar = this.f409268w;
            if (aVar != 0) {
                this.f93132d.f93050h = (android.view.View) aVar;
                aVar.a(this.f409260o);
                aVar.setOnCoverClickListener((android.view.View.OnClickListener) ((jz5.n) this.f409269x).getValue());
            }
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo3 = this.f93132d;
            if (ballInfo3.f93051i == null) {
                ballInfo3.f93051i = new android.graphics.Point();
            }
            this.f93132d.f93051i.x = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480509zy);
            this.f93132d.f93051i.y = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f480508zx);
            com.tencent.mm.plugin.ball.model.BallInfo ballInfo4 = this.f93132d;
            ballInfo4.f93045J = false;
            ballInfo4.I = true;
            ballInfo4.F = true;
            ballInfo4.L = false;
            ballInfo4.f93058s = this.f409264s;
            ballInfo4.H = 2048;
            ballInfo4.f93053n = 2;
            bl4.b bVar4 = this.f409260o;
            boolean v07 = v0(bVar4 != null ? bVar4.f21734c : 0);
            com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo2 = ballInfo4.f93054o;
            ballButtonInfo2.f93069d = v07;
            ballButtonInfo2.f93070e = this.f409262q;
            ballButtonInfo2.f93073h = true;
            int a17 = com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.FG_0);
            ballButtonInfo2.f93072g = a17;
            ballButtonInfo2.f93075m = a17;
            com.tencent.mm.plugin.ball.model.BallInfo.BallBlurInfo ballBlurInfo = this.f93132d.f93055p;
            ballBlurInfo.f93068f = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f478494f));
            bl4.b bVar5 = this.f409260o;
            if (bVar5 == null || (str = bVar5.f21736e) == null) {
                str = "";
            }
            ballBlurInfo.f93066d = str;
            com.tencent.mm.plugin.ball.model.BallInfo.BallCollapseInfo ballCollapseInfo = this.f93132d.f93056q;
            ballCollapseInfo.f93082d = ((java.lang.Boolean) ((jz5.n) ((ef0.c3) ((qk.q8) i95.n0.c(qk.q8.class))).f252183d).getValue()).booleanValue();
            ballCollapseInfo.f93083e = ((java.lang.Number) ((jz5.n) ((ef0.c3) ((qk.q8) i95.n0.c(qk.q8.class))).f252184e).getValue()).intValue() * 1000;
        }
        j();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = this.f409263r;
        qp1.v vVar = this.f409266u;
        if (z17) {
            vVar.a(gp1.w.f274192m, java.lang.Long.valueOf(currentTimeMillis));
            vVar.a(gp1.w.f274190h, java.lang.Long.valueOf(currentTimeMillis));
            vVar.a(gp1.w.f274188f, java.lang.Long.valueOf(currentTimeMillis));
            vVar.a(gp1.w.f274187e, java.lang.Long.valueOf(currentTimeMillis));
        } else {
            vVar.a(gp1.w.f274186d, java.lang.Long.valueOf(currentTimeMillis));
            vVar.a(gp1.w.f274187e, java.lang.Long.valueOf(currentTimeMillis));
            bl4.b bVar6 = this.f409260o;
            if (bVar6 != null) {
                qk.r8 r8Var = (qk.r8) i95.n0.c(qk.r8.class);
                b66.n j07 = j0();
                int d17 = (j07 == null || (e18 = ((b66.q) j07).e()) == null) ? 0 : ((b66.c) e18).d();
                int i18 = bVar6.f21734c;
                bl4.b bVar7 = this.f409260o;
                bw5.lp0 lp0Var = bVar7 != null ? bVar7.f21737f : null;
                bw5.o50 o50Var = bVar7 != null ? bVar7.f21738g : null;
                ((ef0.e3) r8Var).getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                bm4.a.b(hashMap, null, d17, null, lp0Var, o50Var);
                bm4.a.a(hashMap, i18, lp0Var, o50Var);
                hashMap.toString();
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("tyt_floating_win_produce", null, hashMap, 5, false);
            }
        }
        bl4.b bVar8 = this.f409260o;
        if (bVar8 != null) {
            qk.r8 r8Var2 = (qk.r8) i95.n0.c(qk.r8.class);
            b66.n j08 = j0();
            if (j08 != null && (e17 = ((b66.q) j08).e()) != null) {
                i17 = ((b66.c) e17).d();
            }
            int i19 = i17;
            int i27 = bVar8.f21734c;
            bl4.b bVar9 = this.f409260o;
            bw5.lp0 lp0Var2 = bVar9 != null ? bVar9.f21737f : null;
            bw5.o50 o50Var2 = bVar9 != null ? bVar9.f21738g : null;
            ((ef0.e3) r8Var2).getClass();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("view_id", "tyt_interior_floating_win");
            bm4.a.b(hashMap2, bw5.ar0.TingScene_Minimization, i19, null, lp0Var2, o50Var2);
            bm4.a.a(hashMap2, i27, lp0Var2, o50Var2);
            hashMap2.toString();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_exp", null, hashMap2, 5, false);
        }
        this.f409263r = true;
        return true;
    }

    @Override // sl4.a
    public void f(com.tencent.unit_rc.WeakPtr weakPtr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate playAppRef: ");
        sb6.append(weakPtr != null ? weakPtr.hashCode() : 0);
        com.tencent.mars.xlog.Log.i(this.f409259n, sb6.toString());
        this.f409261p = weakPtr;
        b(h0(), g0());
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a0(h0(), this.f409271z);
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().e(h0(), this.f409270y);
    }

    public abstract bl4.a f0();

    public abstract java.lang.String g0();

    public void h() {
        w0(false, qk.z9.f364415g);
    }

    public abstract int h0();

    public void i(boolean z17) {
        if (this.f409260o == null) {
            return;
        }
        e0();
    }

    public final b66.g i0() {
        com.tencent.unit_rc.WeakPtr weakPtr = this.f409261p;
        if (weakPtr != null) {
            return (b66.g) weakPtr.lock();
        }
        return null;
    }

    public final b66.n j0() {
        b66.g i07 = i0();
        if (i07 != null) {
            return ((b66.i) i07).a();
        }
        return null;
    }

    public final boolean k0() {
        return ((java.lang.Boolean) ((jz5.n) this.f409267v).getValue()).booleanValue();
    }

    public boolean l0() {
        return true;
    }

    public boolean m0() {
        return false;
    }

    public void n0() {
    }

    public void o0(qp1.j0 permissionCheckResult) {
        kotlin.jvm.internal.o.g(permissionCheckResult, "permissionCheckResult");
    }

    public void p0() {
    }

    public void q0() {
    }

    public void r0() {
    }

    public void s0() {
    }

    public void t0() {
        bl4.b bVar = this.f409260o;
        if (bVar != null) {
            boolean a17 = il4.m.a(bVar.f21734c);
            java.lang.String str = this.f409259n;
            if (a17) {
                x0(qk.y9.f364383f);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("pause ");
                bl4.b bVar2 = this.f409260o;
                sb6.append(bVar2 != null ? bVar2.f21733b : null);
                sb6.append(", playApp: ");
                b66.g i07 = i0();
                sb6.append(i07 != null ? java.lang.Integer.valueOf(i07.hashCode()) : null);
                com.tencent.mars.xlog.Log.i(str, sb6.toString());
                b66.n j07 = j0();
                if (j07 != null) {
                    b66.m.a(j07, null, 1, null);
                    return;
                }
                return;
            }
            if (bVar.f21734c == 3) {
                x0(qk.y9.f364385h);
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("resume ");
                bl4.b bVar3 = this.f409260o;
                sb7.append(bVar3 != null ? bVar3.f21733b : null);
                sb7.append(", playApp: ");
                b66.g i08 = i0();
                sb7.append(i08 != null ? java.lang.Integer.valueOf(i08.hashCode()) : null);
                com.tencent.mars.xlog.Log.i(str, sb7.toString());
                b66.n j08 = j0();
                if (j08 != null) {
                    b66.m.b(j08, null, 1, null);
                    return;
                }
                return;
            }
            x0(qk.y9.f364385h);
            bl4.b bVar4 = this.f409260o;
            if (bVar4 != null) {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("play id: ");
                sb8.append(bVar4.f21733b);
                sb8.append(", playApp: ");
                b66.g i09 = i0();
                sb8.append(i09 != null ? java.lang.Integer.valueOf(i09.hashCode()) : null);
                com.tencent.mars.xlog.Log.i(str, sb8.toString());
                b66.n j09 = j0();
                if (j09 != null) {
                    java.lang.String clientId = bVar4.f21733b;
                    kotlin.jvm.internal.o.g(clientId, "clientId");
                    urgen.ur_2BA9.UR_C8FE.UR_9146(((b66.q) j09).getCppPointer(), clientId);
                }
            }
        }
    }

    public void u0(com.tencent.mm.plugin.ball.model.BallInfo ballInfo, com.tencent.mm.plugin.ball.model.BallInfo ballInfo2) {
    }

    public boolean v0(int i17) {
        return il4.m.a(i17);
    }

    public void w0(boolean z17, qk.z9 closeType) {
        b66.a e17;
        b66.g gVar;
        kotlin.jvm.internal.o.g(closeType, "closeType");
        com.tencent.mars.xlog.Log.i(this.f409259n, "removeTingFloatBall stop: " + z17 + ", closeType: " + closeType);
        d();
        if (z17) {
            y0();
            com.tencent.unit_rc.WeakPtr weakPtr = this.f409261p;
            if (weakPtr != null && (gVar = (b66.g) weakPtr.lock()) != null) {
                urgen.ur_2BA9.UR_882D.UR_07D7(((b66.i) gVar).getCppPointer());
            }
            gp1.w wVar = gp1.w.f274193n;
            qp1.v vVar = this.f409266u;
            vVar.a(wVar, null);
            java.util.Objects.toString(closeType);
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallTimeCollector", "dump currentAction: " + vVar.f365754i + ", createTime: " + vVar.f365746a + ", userCollapseTime: " + vVar.f365749d + ", autoCollapseTime: " + vVar.f365748c + ", expandTime: " + vVar.f365750e);
            bl4.b bVar = this.f409260o;
            if (bVar != null) {
                qk.r8 r8Var = (qk.r8) i95.n0.c(qk.r8.class);
                b66.n j07 = j0();
                int d17 = (j07 == null || (e17 = ((b66.q) j07).e()) == null) ? 0 : ((b66.c) e17).d();
                int i17 = bVar.f21734c;
                java.lang.Integer num = this.f409265t;
                bl4.b bVar2 = this.f409260o;
                bw5.lp0 lp0Var = bVar2 != null ? bVar2.f21737f : null;
                bw5.o50 o50Var = bVar2 != null ? bVar2.f21738g : null;
                ((ef0.e3) r8Var).getClass();
                java.util.HashMap hashMap = new java.util.HashMap();
                bm4.a.b(hashMap, bw5.ar0.TingScene_Minimization, d17, java.lang.Integer.valueOf(i17), lp0Var, o50Var);
                int i18 = closeType.f364417d;
                hashMap.put("close_type", java.lang.Integer.valueOf(i18));
                qk.z9 z9Var = qk.z9.f364413e;
                if (i18 == 4) {
                    hashMap.put("preempt_reason", java.lang.Integer.valueOf(num != null ? num.intValue() : 0));
                }
                hashMap.put("floating_win_stay_time", java.lang.Long.valueOf(vVar.f365746a));
                hashMap.put("voluntarily_welt_stay_time", java.lang.Long.valueOf(vVar.f365748c));
                hashMap.put("manual_welt_stay_time", java.lang.Long.valueOf(vVar.f365749d));
                hashMap.put("unfold_stay_time", java.lang.Long.valueOf(vVar.f365750e));
                hashMap.toString();
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("tyt_close_floating_window", null, hashMap, 5, false);
            }
            this.f409265t = null;
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallTimeCollector", "reset");
            vVar.f365754i = null;
            vVar.f365746a = 0L;
            vVar.f365747b = 0L;
            vVar.f365748c = 0L;
            vVar.f365749d = 0L;
            vVar.f365750e = 0L;
            vVar.f365751f = 0L;
            vVar.f365752g = 0L;
            vVar.f365753h = 0L;
            this.f409263r = false;
            this.f409260o = null;
            this.f409268w = null;
        }
    }

    public final void x0(qk.y9 clickPosition) {
        b66.a e17;
        java.util.Objects.toString(clickPosition);
        bl4.b bVar = this.f409260o;
        if (bVar != null) {
            qk.r8 r8Var = (qk.r8) i95.n0.c(qk.r8.class);
            b66.n j07 = j0();
            int d17 = (j07 == null || (e17 = ((b66.q) j07).e()) == null) ? 0 : ((b66.c) e17).d();
            int i17 = bVar.f21734c;
            bl4.b bVar2 = this.f409260o;
            bw5.lp0 lp0Var = bVar2 != null ? bVar2.f21737f : null;
            bw5.o50 o50Var = bVar2 != null ? bVar2.f21738g : null;
            ((ef0.e3) r8Var).getClass();
            kotlin.jvm.internal.o.g(clickPosition, "clickPosition");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "tyt_interior_floating_win");
            hashMap.put("click_location", java.lang.Integer.valueOf(clickPosition.f364387d));
            bm4.a.b(hashMap, bw5.ar0.TingScene_Minimization, d17, null, lp0Var, o50Var);
            bm4.a.a(hashMap, i17, lp0Var, o50Var);
            hashMap.toString();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, hashMap, 5, false);
        }
    }

    public final void y0() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop ");
        bl4.b bVar = this.f409260o;
        sb6.append(bVar != null ? bVar.f21733b : null);
        sb6.append(", playApp: ");
        b66.g i07 = i0();
        sb6.append(i07 != null ? java.lang.Integer.valueOf(i07.hashCode()) : null);
        com.tencent.mars.xlog.Log.i(this.f409259n, sb6.toString());
        b66.n j07 = j0();
        if (j07 != null) {
            ((b66.q) j07).stop();
        }
    }

    public final void z0(int i17) {
        com.tencent.mm.plugin.ball.model.BallInfo.BallButtonInfo ballButtonInfo = this.f93132d.f93054o;
        ballButtonInfo.f93069d = v0(i17);
        ballButtonInfo.f93070e = this.f409262q;
        ballButtonInfo.f93073h = true;
        int a17 = com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.FG_0);
        ballButtonInfo.f93072g = a17;
        ballButtonInfo.f93075m = a17;
        S(this.f93132d.f93054o);
    }
}
