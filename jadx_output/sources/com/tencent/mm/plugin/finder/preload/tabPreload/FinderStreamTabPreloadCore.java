package com.tencent.mm.plugin.finder.preload.tabPreload;

/* loaded from: classes2.dex */
public final class FinderStreamTabPreloadCore extends pf5.o0 implements androidx.lifecycle.k0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f122543e;

    /* renamed from: f, reason: collision with root package name */
    public final bs2.w f122544f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f122545g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore$mainUiIndexChangeListener$1 f122546h;

    /* renamed from: i, reason: collision with root package name */
    public int f122547i;

    /* JADX WARN: Type inference failed for: r1v3, types: [com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore$mainUiIndexChangeListener$1] */
    public FinderStreamTabPreloadCore() {
        cq.k1.a();
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        java.util.ArrayList d17 = kz5.c0.d(new bs2.t(this), new bs2.p(this), new bs2.q(this));
        if (t70Var.W2() && ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Qg).getValue()).r()).booleanValue()) {
            d17.add(new bs2.a0(this));
        }
        this.f122543e = d17;
        this.f122544f = ((((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127680ed).getValue()).r()).booleanValue() || ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127661dd).getValue()).r()).booleanValue()) && ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127699fd).getValue()).r()).booleanValue()) ? new bs2.w(this) : null;
        this.f122545g = jz5.h.b(bs2.h.f23845d);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f122546h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HomeUITabChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore$mainUiIndexChangeListener$1
            {
                this.__eventId = -1095690568;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HomeUITabChangeEvent homeUITabChangeEvent) {
                com.tencent.mm.autogen.events.HomeUITabChangeEvent event = homeUITabChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                int i17 = event.f54438g.f7425a;
                com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore finderStreamTabPreloadCore = com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.this;
                if (i17 == 2) {
                    for (bs2.n1 n1Var : finderStreamTabPreloadCore.f122543e) {
                        boolean n17 = n1Var.n();
                        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = n1Var.f23913g;
                        java.lang.String str = n1Var.f23909c;
                        if (n17) {
                            com.tencent.mars.xlog.Log.i(str, "performEnterFindMoreFriendTab: foreground prefetch open");
                            atomicBoolean.set(true);
                        }
                        boolean compareAndSet = n1Var.f23914h.compareAndSet(false, true);
                        if ((atomicBoolean.compareAndSet(false, true) || n17) && !n1Var.f23910d) {
                            int T6 = n1Var.f23908b.T6();
                            int i18 = n1Var.f23907a;
                            if (i18 == T6) {
                                long f17 = n1Var.f();
                                boolean z17 = n1Var.j().I0(com.tencent.mm.plugin.finder.extension.reddot.ba.a(i18)) != null;
                                if (!n17) {
                                    com.tencent.mars.xlog.Log.i(str, "performEnterFindMoreFriendTab: case2, hasRedDot=" + z17 + ", delay=" + f17);
                                    bs2.c.b(n1Var.f23911e, n1Var.f23921o, f17, "performEnterFindMoreFriendTab#2", null, 8, null);
                                } else if (compareAndSet) {
                                    bs2.s0 s0Var = n1Var.f23921o;
                                    long c17 = (s0Var.f23803e + s0Var.f23802d) - c01.id.c();
                                    com.tencent.mars.xlog.Log.i(str, "performEnterFindMoreFriendTab: case1, hasRedDot=" + z17 + ", delay=" + f17 + ", postDelayDelta=" + c17 + ", lastTriggerSource=" + s0Var.f23804f);
                                    if (c17 < 0 || c17 > f17) {
                                        bs2.c.b(n1Var.f23911e, n1Var.f23921o, f17, "performEnterFindMoreFriendTab#1", null, 8, null);
                                    }
                                }
                                n1Var.s("performEnterFindMoreFriendTab");
                            }
                        }
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        new org.libpag.PAGView(com.tencent.mm.sdk.platformtools.x2.f193071a);
                        com.tencent.mars.xlog.Log.i(str, "preload PAGView: " + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " ms ");
                        pm0.v.O("FinderObjectWordingConfig", new bs2.x0(n1Var));
                    }
                } else {
                    for (bs2.n1 n1Var2 : finderStreamTabPreloadCore.f122543e) {
                        n1Var2.f23914h.set(false);
                        boolean n18 = n1Var2.n();
                        java.util.concurrent.atomic.AtomicBoolean atomicBoolean2 = n1Var2.f23913g;
                        java.lang.String str2 = n1Var2.f23909c;
                        if (n18) {
                            com.tencent.mars.xlog.Log.i(str2, "performExitFindMoreFriendTab: foreground prefetch open, runnable triggerSource=" + n1Var2.f23921o.f23804f);
                            atomicBoolean2.set(true);
                            if (n1Var2.f23907a == n1Var2.f23908b.T6()) {
                                long f18 = n1Var2.f();
                                boolean z18 = n1Var2.f23912f.get();
                                com.tencent.mars.xlog.Log.i(str2, "performExitFindMoreFriendTab: delay=" + f18 + ", isBackground=" + z18);
                                if (!z18) {
                                    n1Var2.f23911e.a(n1Var2.f23921o, f18, "performExitFindMoreFriendTab", bs2.a.f23797e);
                                }
                            }
                        } else if (atomicBoolean2.compareAndSet(true, false)) {
                            com.tencent.mars.xlog.Log.i(str2, "performExitFindMoreFriendTab:");
                            n1Var2.f23911e.c("performExitFindMoreFriendTab");
                            c01.id.c();
                        }
                    }
                }
                return false;
            }
        };
        this.f122547i = -1;
    }

    public final void N6() {
        java.util.Iterator it = this.f122543e.iterator();
        while (it.hasNext()) {
            ((bs2.n1) it.next()).e(true, "clearAllCache");
        }
        bs2.w wVar = this.f122544f;
        if (wVar != null) {
            java.util.concurrent.locks.ReentrantLock reentrantLock = wVar.f23965c;
            reentrantLock.lock();
            try {
                wVar.f23970h = true;
                db2.o4 o4Var = wVar.f23966d;
                if (o4Var != null) {
                    o4Var.j();
                }
                wVar.f23966d = null;
                wVar.a("clearAllCache");
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final long O6(int i17) {
        int integer;
        int intValue;
        long j17;
        if (i17 == 1) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.f127889q2;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue();
                j17 = intValue;
            } else {
                integer = S6().getInteger(25);
                j17 = integer * 1000;
            }
        } else if (i17 != 2) {
            if (i17 != 3) {
                if (i17 == 4) {
                    com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    jz5.g gVar2 = com.tencent.mm.plugin.finder.storage.t70.f127907r2;
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue() >= 0) {
                        intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue();
                        j17 = intValue;
                    } else {
                        integer = S6().getInteger(26);
                        j17 = integer * 1000;
                    }
                } else if (i17 != 35) {
                    j17 = 0;
                }
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var3 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            jz5.g gVar3 = com.tencent.mm.plugin.finder.storage.t70.f127871p2;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).getValue()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).getValue()).r()).intValue();
                j17 = intValue;
            } else {
                integer = S6().getInteger(24);
                j17 = integer * 1000;
            }
        } else {
            com.tencent.mm.plugin.finder.storage.t70 t70Var4 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            jz5.g gVar4 = com.tencent.mm.plugin.finder.storage.t70.f127924s2;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).getValue()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).getValue()).r()).intValue();
                j17 = intValue;
            } else {
                integer = S6().getInteger(27);
                j17 = integer * 1000;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.StreamTabPreloadCore", "[getCacheValidTime] tabType=" + i17 + " time=" + j17 + "ms ");
        return j17 <= 0 ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : j17;
    }

    public final long P6(int i17, boolean z17) {
        int integer;
        int intValue;
        long j17;
        if (i17 != 1) {
            if (i17 != 2) {
                if (i17 != 3) {
                    if (i17 != 4) {
                        if (i17 != 35) {
                            j17 = Long.MAX_VALUE;
                        }
                    } else if (z17) {
                        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                        jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.f127669e2;
                        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() >= 0) {
                            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue();
                            j17 = intValue;
                        } else {
                            integer = S6().getInteger(10);
                            j17 = integer * 1000;
                        }
                    } else {
                        com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                        jz5.g gVar2 = com.tencent.mm.plugin.finder.storage.t70.f127745i2;
                        if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue() >= 0) {
                            intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue();
                            j17 = intValue;
                        } else {
                            integer = S6().getInteger(14);
                            j17 = integer * 1000;
                        }
                    }
                }
                if (z17) {
                    com.tencent.mm.plugin.finder.storage.t70 t70Var3 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    jz5.g gVar3 = com.tencent.mm.plugin.finder.storage.t70.f127631c2;
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).getValue()).r()).intValue() >= 0) {
                        intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).getValue()).r()).intValue();
                        j17 = intValue;
                    } else {
                        integer = S6().getInteger(8);
                        j17 = integer * 1000;
                    }
                } else {
                    com.tencent.mm.plugin.finder.storage.t70 t70Var4 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    jz5.g gVar4 = com.tencent.mm.plugin.finder.storage.t70.f127707g2;
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).getValue()).r()).intValue() >= 0) {
                        intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).getValue()).r()).intValue();
                        j17 = intValue;
                    } else {
                        integer = S6().getInteger(12);
                        j17 = integer * 1000;
                    }
                }
            } else if (z17) {
                com.tencent.mm.plugin.finder.storage.t70 t70Var5 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                jz5.g gVar5 = com.tencent.mm.plugin.finder.storage.t70.f127688f2;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar5).getValue()).r()).intValue() >= 0) {
                    intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar5).getValue()).r()).intValue();
                    j17 = intValue;
                } else {
                    integer = S6().getInteger(11);
                    j17 = integer * 1000;
                }
            } else {
                com.tencent.mm.plugin.finder.storage.t70 t70Var6 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                jz5.g gVar6 = com.tencent.mm.plugin.finder.storage.t70.f127763j2;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar6).getValue()).r()).intValue() >= 0) {
                    intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar6).getValue()).r()).intValue();
                    j17 = intValue;
                } else {
                    integer = S6().getInteger(15);
                    j17 = integer * 1000;
                }
            }
        } else if (z17) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var7 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            jz5.g gVar7 = com.tencent.mm.plugin.finder.storage.t70.f127650d2;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar7).getValue()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar7).getValue()).r()).intValue();
                j17 = intValue;
            } else {
                integer = S6().getInteger(9);
                j17 = integer * 1000;
            }
        } else {
            com.tencent.mm.plugin.finder.storage.t70 t70Var8 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            jz5.g gVar8 = com.tencent.mm.plugin.finder.storage.t70.f127726h2;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar8).getValue()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar8).getValue()).r()).intValue();
                j17 = intValue;
            } else {
                integer = S6().getInteger(13);
                j17 = integer * 1000;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.StreamTabPreloadCore", "[getInnerTime] tabType=" + i17 + " withRedDot=" + z17 + " time=" + j17 + 's');
        return j17 <= 0 ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : j17;
    }

    public final long Q6(int i17, boolean z17, boolean z18) {
        long U6;
        int integer;
        int intValue;
        if (z17) {
            if (i17 == 1) {
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.f127817m2;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() >= 0) {
                    intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue();
                    U6 = intValue;
                } else {
                    integer = S6().getInteger(21);
                    U6 = integer * 1000;
                }
            } else if (i17 == 2) {
                com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                jz5.g gVar2 = com.tencent.mm.plugin.finder.storage.t70.f127853o2;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue() >= 0) {
                    intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue();
                    U6 = intValue;
                } else {
                    integer = S6().getInteger(23);
                    U6 = integer * 1000;
                }
            } else if (i17 == 3) {
                com.tencent.mm.plugin.finder.storage.t70 t70Var3 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                jz5.g gVar3 = com.tencent.mm.plugin.finder.storage.t70.f127799l2;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).getValue()).r()).intValue() >= 0) {
                    intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).getValue()).r()).intValue();
                    U6 = intValue;
                } else {
                    integer = S6().getInteger(20);
                    U6 = integer * 1000;
                }
            } else if (i17 != 4) {
                U6 = 0;
            } else {
                com.tencent.mm.plugin.finder.storage.t70 t70Var4 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                jz5.g gVar4 = com.tencent.mm.plugin.finder.storage.t70.f127835n2;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).getValue()).r()).intValue() >= 0) {
                    intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).getValue()).r()).intValue();
                    U6 = intValue;
                } else {
                    integer = S6().getInteger(22);
                    U6 = integer * 1000;
                }
            }
            if (U6 > 0 && z18) {
                long O6 = O6(i17);
                com.tencent.mars.xlog.Log.i("Finder.StreamTabPreloadCore", "getNewRedDotPreloadInterval: get cache valid time, tabType=" + i17 + " prefetchInterval=" + U6 + "ms cacheValidTime=" + O6 + "ms");
                if (O6 > 0 && O6 > U6) {
                    U6 = O6;
                }
            }
            com.tencent.mars.xlog.Log.i("Finder.StreamTabPreloadCore", "getNewRedDotPreloadInterval: tabType=" + i17 + " time=" + U6 + "ms ");
            if (U6 <= 0) {
                U6 = Long.MAX_VALUE;
            }
        } else {
            U6 = U6(i17, z18);
        }
        if (z17 && U6 == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
            com.tencent.mars.xlog.Log.e("Finder.StreamTabPreloadCore", "getOutsideIntervalTime: redDotInterval is 0, tabType=" + i17);
            U6 = U6(i17, z18);
        }
        com.tencent.mars.xlog.Log.i("Finder.StreamTabPreloadCore", "getOutsideIntervalTime: tabType=" + i17 + " isRedDotPreload=" + z17 + " hasCache = " + z18 + ", time=" + U6 + "ms ");
        return U6 <= 0 ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : U6;
    }

    public final bs2.n1 R6(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f122543e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((bs2.n1) obj).f23907a == i17) {
                break;
            }
        }
        return (bs2.n1) obj;
    }

    public final r45.fx2 S6() {
        r45.fx2 fx2Var = new r45.fx2();
        try {
            java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CONFIG_STRING_SYNC, "");
            kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
            fx2Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h((java.lang.String) m17));
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.Q9).getValue()).r()).intValue() > 0) {
                fx2Var.set(32, java.lang.Boolean.TRUE);
                fx2Var.set(33, 30);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Finder.StreamTabPreloadCore", e17, "", new java.lang.Object[0]);
        }
        return fx2Var;
    }

    public final int T6() {
        return ((ey2.t0) ((jz5.n) this.f122545g).getValue()).Q6();
    }

    public final long U6(int i17, boolean z17) {
        int integer;
        int intValue;
        long j17;
        if (i17 == 1) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            jz5.g gVar = com.tencent.mm.plugin.finder.storage.t70.Z1;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).getValue()).r()).intValue();
                j17 = intValue;
            } else {
                integer = S6().getInteger(5);
                j17 = integer * 1000;
            }
        } else if (i17 != 2) {
            if (i17 != 3) {
                if (i17 == 4) {
                    com.tencent.mm.plugin.finder.storage.t70 t70Var2 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                    jz5.g gVar2 = com.tencent.mm.plugin.finder.storage.t70.f127593a2;
                    if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue() >= 0) {
                        intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar2).getValue()).r()).intValue();
                        j17 = intValue;
                    } else {
                        integer = S6().getInteger(6);
                        j17 = integer * 1000;
                    }
                } else if (i17 != 35) {
                    j17 = 0;
                }
            }
            com.tencent.mm.plugin.finder.storage.t70 t70Var3 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            jz5.g gVar3 = com.tencent.mm.plugin.finder.storage.t70.Y1;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).getValue()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar3).getValue()).r()).intValue();
                j17 = intValue;
            } else {
                integer = S6().getInteger(4);
                j17 = integer * 1000;
            }
        } else {
            com.tencent.mm.plugin.finder.storage.t70 t70Var4 = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            jz5.g gVar4 = com.tencent.mm.plugin.finder.storage.t70.f127612b2;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).getValue()).r()).intValue() >= 0) {
                intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) gVar4).getValue()).r()).intValue();
                j17 = intValue;
            } else {
                integer = S6().getInteger(7);
                j17 = integer * 1000;
            }
        }
        if (j17 > 0 && z17) {
            long O6 = O6(i17);
            com.tencent.mars.xlog.Log.i("Finder.StreamTabPreloadCore", "getTimeOutPreloadInterval: get cache valid time, tabType=" + i17 + " prefetchInterval=" + j17 + "ms cacheValidTime=" + O6 + "ms");
            if (O6 > 0 && O6 > j17) {
                j17 = O6;
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.StreamTabPreloadCore", "getTimeOutPreloadInterval: tabType=" + i17 + " originInterval=" + j17 + "ms ");
        return j17 <= 0 ? com.tencent.wcdb.core.Database.DictDefaultMatchValue : j17;
    }

    public final boolean V6(bs2.h0 source) {
        kotlin.jvm.internal.o.g(source, "source");
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        if (((java.lang.Boolean) ((nb2.a) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127739hf).getValue()).r()).booleanValue()) {
            com.tencent.mars.xlog.Log.w("Finder.StreamTabPreloadCore", "isEnable return for FINDER_FIND_PAGE_PRELOAD_ONE");
            return false;
        }
        if (!((c61.l7) i95.n0.c(c61.l7.class)).el()) {
            com.tencent.mars.xlog.Log.i("Finder.StreamTabPreloadCore", "finder entry close then return");
            return false;
        }
        if (source == bs2.h0.f23851n) {
            return ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127819m4).getValue()).r()).intValue() == 1;
        }
        if ((c01.z1.j() & 34359738368L) != 0) {
            com.tencent.mars.xlog.Log.i("Finder.StreamTabPreloadCore", "finder find more ui entry close then return");
            return false;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_preload_tab_refresh_enable, 1) == 1;
        com.tencent.mars.xlog.Log.i("FinderConfig", "[GET] isEnablePreloadStreamRefresh=" + z17);
        if (z17) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("Finder.StreamTabPreloadCore", "isEnablePreloadStreamRefresh false then return");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6(com.tencent.mm.plugin.finder.extension.reddot.jb r13, boolean r14) {
        /*
            r12 = this;
            java.lang.String r0 = "ctrInfo"
            kotlin.jvm.internal.o.g(r13, r0)
            int r13 = r13.getType()
            r0 = 7
            r1 = 0
            r2 = 1
            if (r13 == r0) goto L26
            r0 = 8
            if (r13 == r0) goto L24
            r0 = 17
            if (r13 == r0) goto L26
            r0 = 1003(0x3eb, float:1.406E-42)
            if (r13 == r0) goto L22
            r0 = 1004(0x3ec, float:1.407E-42)
            if (r13 == r0) goto L20
            r13 = r1
            goto L27
        L20:
            r13 = 4
            goto L27
        L22:
            r13 = 2
            goto L27
        L24:
            r13 = 3
            goto L27
        L26:
            r13 = r2
        L27:
            bs2.n1 r0 = r12.R6(r13)
            if (r0 == 0) goto L43
            if (r14 == 0) goto L36
            boolean r14 = r0.f23910d
            if (r14 == 0) goto L34
            goto L36
        L34:
            r14 = r1
            goto L37
        L36:
            r14 = r2
        L37:
            if (r14 == 0) goto L3a
            goto L3b
        L3a:
            r0 = 0
        L3b:
            if (r0 == 0) goto L43
            java.lang.String r14 = "RedDotRevoke"
            boolean r1 = r0.e(r2, r14)
        L43:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "[onRedDotRevoke] tabType="
            r14.<init>(r0)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            java.lang.String r14 = "Finder.StreamTabPreloadCore"
            com.tencent.mars.xlog.Log.i(r14, r13)
            if (r1 == 0) goto L67
            bs2.g r2 = bs2.g.f23841a
            r3 = 0
            r4 = 0
            r5 = 3
            r6 = 3
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 115(0x73, float:1.61E-43)
            r11 = 0
            bs2.g.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.W6(com.tencent.mm.plugin.finder.extension.reddot.jb, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d3  */
    @Override // androidx.lifecycle.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onChanged(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.onChanged(java.lang.Object):void");
    }
}
