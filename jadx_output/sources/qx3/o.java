package qx3;

/* loaded from: classes10.dex */
public final class o extends androidx.lifecycle.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f367374d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f367375e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f367376f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f367377g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f367378h;

    /* renamed from: i, reason: collision with root package name */
    public long f367379i;

    /* renamed from: m, reason: collision with root package name */
    public kk4.v f367380m;

    /* renamed from: n, reason: collision with root package name */
    public co4.b f367381n;

    /* renamed from: o, reason: collision with root package name */
    public vx3.i f367382o;

    /* renamed from: p, reason: collision with root package name */
    public kotlinx.coroutines.r2 f367383p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f367384q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f367385r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f367386s;

    public o(kotlinx.coroutines.y0 lifeCycleScope) {
        kotlin.jvm.internal.o.g(lifeCycleScope, "lifeCycleScope");
        this.f367374d = lifeCycleScope;
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(new qx3.e(0L, 3));
        this.f367375e = a17;
        this.f367376f = a17;
        kotlinx.coroutines.flow.j2 a18 = kotlinx.coroutines.flow.i3.a(new qx3.f(0L, null, 1));
        this.f367377g = a18;
        this.f367378h = a18;
    }

    public final void N6() {
        k6.a aVar;
        kk4.v vVar = this.f367380m;
        if (vVar != null) {
            try {
                vVar.R();
                kk4.v vVar2 = this.f367380m;
                if (vVar2 != null) {
                    kk4.b.e(vVar2, null, 1, null);
                }
                kk4.v vVar3 = this.f367380m;
                if (vVar3 != null) {
                    vVar3.P();
                }
                co4.b bVar = this.f367381n;
                if (bVar != null && (aVar = bVar.f43802a) != null) {
                    p6.f fVar = aVar.f304477a;
                    if (fVar != null) {
                        fVar.pause();
                    }
                    if (fVar != null) {
                        fVar.c();
                    }
                    if (fVar != null) {
                        fVar.release();
                    }
                }
                kk4.v vVar4 = this.f367380m;
                if (vVar4 != null) {
                    vVar4.recycle();
                }
                this.f367380m = null;
                com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayerFlow", "Player destroyed");
            } catch (java.lang.Exception unused) {
            } catch (java.lang.Throwable th6) {
                this.f367380m = null;
                throw th6;
            }
            this.f367380m = null;
        }
    }

    public final void O6(vx3.i tpMediaInfo) {
        kotlin.jvm.internal.o.g(tpMediaInfo, "tpMediaInfo");
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayerFlow", "initPlayer is ".concat(tpMediaInfo.n()));
        this.f367382o = tpMediaInfo;
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f367380m = new kk4.v(context);
        dk4.a aVar = tpMediaInfo.f441284a;
        boolean z17 = true;
        if (aVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayerFlow", "setMediaInfo to play " + vx3.i.D.b(aVar) + ", ringWithLoop:" + this.f367385r);
            kk4.v vVar = this.f367380m;
            if (vVar != null) {
                vVar.B(aVar);
            }
            kk4.v vVar2 = this.f367380m;
            if (vVar2 != null) {
                vVar2.A(this.f367385r);
            }
            kk4.v vVar3 = this.f367380m;
            if (vVar3 != null) {
                vVar3.f308585j = true;
            }
            if (vVar3 != null) {
                vVar3.P = tpMediaInfo.f441285b;
            }
            if (vVar3 != null) {
                vVar3.H(tpMediaInfo.f441285b, tpMediaInfo.f441286c);
            }
        }
        kk4.v vVar4 = this.f367380m;
        if (vVar4 != null) {
            vVar4.f308595t = new qx3.i(this);
        }
        if (vVar4 != null) {
            vVar4.f308591p = new qx3.j(this);
            if (vVar4.s()) {
                pm0.v.X(new kk4.m(vVar4));
            }
        }
        kk4.v vVar5 = this.f367380m;
        k6.a aVar2 = null;
        kk4.h hVar = vVar5 != null ? vVar5.f308580e : null;
        if (hVar != null) {
            hVar.f308551m = new qx3.k(tpMediaInfo, this);
        }
        if (this.f367384q) {
            this.f367381n = new co4.b();
        }
        vx3.i iVar = this.f367382o;
        if ((iVar != null ? iVar.i().f257603a : null) == null) {
            t45.d1 d1Var = new t45.d1();
            t45.f fVar = new t45.f();
            fVar.f415549d = tpMediaInfo.f441298o;
            fVar.f415550e = tpMediaInfo.f441299p;
            d1Var.f415543f = fVar;
            t45.e0 e0Var = new t45.e0();
            e0Var.f415547d = tpMediaInfo.f441300q;
            d1Var.f415542e = e0Var;
            kotlinx.coroutines.l.d(kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c), null, null, new eo4.a(d1Var, null), 3, null);
        }
        vx3.i iVar2 = this.f367382o;
        if (iVar2 != null) {
            ey3.a i17 = iVar2.i();
            co4.b bVar = this.f367381n;
            boolean z18 = false;
            if (bVar != null) {
                android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                qx3.l lVar = new qx3.l(this);
                java.lang.String a17 = ym1.f.f463134h.a();
                if (kotlin.jvm.internal.o.b(a17, "vibrate") || kotlin.jvm.internal.o.b(a17, "normal")) {
                    if (fp.h.c(26)) {
                        if (co4.c.a() ? false : ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ringtone_preview_can_vibrate, true)) {
                            java.lang.String str = i17.f257603a;
                            java.lang.String str2 = i17.f257604b;
                            if (str != null && str2 != null) {
                                k6.a b17 = k6.a.b(context2);
                                if (b17 != null) {
                                    java.io.File file = new java.io.File(co4.c.e(str, str2, false));
                                    co4.a aVar3 = new co4.a(lVar);
                                    p6.f fVar2 = b17.f304477a;
                                    if (fVar2 != null) {
                                        fVar2.d(file, 255, 50, aVar3);
                                    }
                                    if (fVar2 != null) {
                                        fVar2.prepare();
                                    }
                                    if (fVar2 != null) {
                                        fVar2.b(true);
                                    }
                                    if (fVar2 != null) {
                                        fVar2.start();
                                    }
                                    aVar2 = b17;
                                }
                                bVar.f43802a = aVar2;
                            }
                            z18 = z17;
                        }
                    }
                    z17 = false;
                    z18 = z17;
                } else {
                    com.tencent.mars.xlog.Log.e("MicroMsg.VibratePlayer", "forbidden vibrate cause system setting no vibrate");
                }
            }
            this.f367386s = z18;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayerFlow", com.tencent.tav.core.AssetExtension.SCENE_PLAY);
        try {
            kk4.v vVar6 = this.f367380m;
            if (vVar6 != null) {
                kk4.b.f(vVar6, 0, false, null, 6, null);
            }
            kk4.v vVar7 = this.f367380m;
            if (vVar7 != null) {
                vVar7.O();
            }
        } catch (java.lang.Exception unused) {
            N6();
        }
    }

    public final void P6(vx3.i iVar, long j17, boolean z17, boolean z18, boolean z19) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestPlayFlow, id:");
        sb6.append(j17);
        sb6.append(", play:");
        sb6.append(z17);
        sb6.append(", withVibrate:");
        sb6.append(z18);
        sb6.append(", info:");
        sb6.append(iVar != null ? iVar.f441284a : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayerFlow", sb6.toString());
        this.f367384q = z18;
        this.f367385r = z19;
        ((kotlinx.coroutines.flow.h3) this.f367377g).k(new qx3.f(j17, iVar, z17 ? 2 : 3));
    }

    public final void Q6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayerFlow", "requestStopPlay");
        R6();
        ((kotlinx.coroutines.flow.h3) this.f367377g).k(new qx3.f(0L, null, 3));
    }

    public final void R6() {
        k6.a aVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stop play sync id is");
        sb6.append(this.f367379i);
        sb6.append(" and ");
        vx3.i iVar = this.f367382o;
        sb6.append(iVar != null ? iVar.n() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.RingtonePlayerFlow", sb6.toString());
        kk4.v vVar = this.f367380m;
        if (vVar != null) {
            vVar.f308591p = null;
            vVar.s();
        }
        kk4.v vVar2 = this.f367380m;
        if (vVar2 != null) {
            vVar2.f308595t = null;
        }
        if (vVar2 != null) {
            vVar2.D(null);
        }
        co4.b bVar = this.f367381n;
        if (bVar != null && (aVar = bVar.f43802a) != null) {
            p6.f fVar = aVar.f304477a;
            if (fVar != null) {
                fVar.pause();
            }
            if (fVar != null) {
                fVar.c();
            }
            if (fVar != null) {
                fVar.release();
            }
        }
        kk4.v vVar3 = this.f367380m;
        if (vVar3 != null) {
            vVar3.R();
        }
        kk4.v vVar4 = this.f367380m;
        if (vVar4 != null) {
            kk4.b.e(vVar4, null, 1, null);
        }
        kk4.v vVar5 = this.f367380m;
        if (vVar5 != null) {
            vVar5.stop();
        }
        kk4.v vVar6 = this.f367380m;
        if (vVar6 != null) {
            vVar6.recycle();
        }
    }
}
