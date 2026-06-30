package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class a2 extends fm2.b implements com.tencent.mm.modelbase.u0 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f116171h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f116172i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f116173m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.ui.MMActivity context, androidx.fragment.app.Fragment fragment, android.util.AttributeSet attributeSet) {
        super(context, fragment, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f116171h = "FinderLiveAnchorSecondaryPluginLayout";
        this.f116172i = new com.tencent.mm.plugin.finder.live.view.y1(this);
        this.f116173m = new com.tencent.mm.plugin.finder.live.view.z1(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c2, code lost:
    
        if ((r10 != null && r10.getId() == 0) != false) goto L21;
     */
    @Override // com.tencent.mm.plugin.finder.live.view.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void activate(km2.m r9, boolean r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.a2.activate(km2.m, boolean, boolean):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void applyState(int i17, boolean z17, int i18, boolean z18, android.os.Bundle bundle) {
        android.view.ViewGroup viewGroup;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var;
        if (((mm2.c1) business(mm2.c1.class)).U7()) {
            com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(this, false, 1, null);
            getLivePrepareUIC().getClass();
            tm2.s2 liveStartUIC = getLiveStartUIC();
            com.tencent.mm.plugin.finder.live.plugin.j90 j90Var = liveStartUIC.f420593j;
            if (j90Var != null) {
                j90Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = liveStartUIC.f420595k;
            if (nd0Var != null) {
                nd0Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.kh khVar = liveStartUIC.f420597l;
            if (khVar != null) {
                khVar.K0(8);
            }
            xu2.u uVar = liveStartUIC.f420601n;
            if (uVar != null) {
                uVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.mg mgVar = liveStartUIC.f420603o;
            if (mgVar != null) {
                mgVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.a80 a80Var = liveStartUIC.f420605p;
            if (a80Var != null) {
                a80Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ow owVar = liveStartUIC.f420610u;
            if (owVar != null) {
                owVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.v6 v6Var = liveStartUIC.f420614y;
            if (v6Var != null) {
                v6Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = liveStartUIC.f420611v;
            if (r60Var != null) {
                r60Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var = liveStartUIC.f420612w;
            if (ga0Var != null) {
                ga0Var.K0(8);
            }
            if (((mm2.t2) liveStartUIC.c(mm2.t2.class)).f329433o) {
                java.lang.String str = liveStartUIC.f420587g;
                com.tencent.mars.xlog.Log.i(str, "onLiveEnd: isLiveEndByForceQuit = true");
                r45.qp1 qp1Var = ((mm2.t2) liveStartUIC.c(mm2.t2.class)).f329434p;
                java.lang.Integer num = ((mm2.t2) liveStartUIC.c(mm2.t2.class)).f329435q;
                if (qp1Var == null || num == null) {
                    com.tencent.mars.xlog.Log.i(str, "onLiveEnd: isLiveEndByForceQuit, but no cache errorPage");
                    com.tencent.mm.plugin.finder.live.plugin.v5 v5Var = liveStartUIC.f420591i;
                    if (v5Var != null) {
                        v5Var.K0(8);
                    }
                } else {
                    com.tencent.mm.plugin.finder.live.plugin.v5 v5Var2 = liveStartUIC.f420591i;
                    if (v5Var2 != null) {
                        v5Var2.K0(0);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.v5 v5Var3 = liveStartUIC.f420591i;
                    if (v5Var3 != null) {
                        v5Var3.u1(((mm2.c1) liveStartUIC.c(mm2.c1.class)).f328852o, qp1Var, num.intValue());
                    }
                }
            } else {
                com.tencent.mm.plugin.finder.live.plugin.v5 v5Var4 = liveStartUIC.f420591i;
                if (v5Var4 != null) {
                    v5Var4.K0(8);
                }
            }
            com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = liveStartUIC.f420609t;
            if (w00Var != null) {
                w00Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.de0 de0Var = liveStartUIC.f420613x;
            if (de0Var != null) {
                de0Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.vw vwVar = liveStartUIC.E;
            if (vwVar != null) {
                vwVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.sw swVar = liveStartUIC.F;
            if (swVar != null) {
                swVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.sw swVar2 = liveStartUIC.G;
            if (swVar2 != null) {
                swVar2.K0(8);
            }
            pn2.f fVar = liveStartUIC.H;
            if (fVar != null) {
                fVar.K0(8);
            }
            qn2.n nVar = liveStartUIC.I;
            if (nVar != null) {
                nVar.K0(8);
            }
            my2.e eVar = liveStartUIC.f420580J;
            if (eVar != null) {
                eVar.K0(8);
            }
            my2.k0 k0Var = liveStartUIC.K;
            if (k0Var != null) {
                k0Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.d1 d1Var = liveStartUIC.L;
            if (d1Var != null) {
                d1Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.f1 f1Var = liveStartUIC.M;
            if (f1Var != null) {
                f1Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.fj fjVar = liveStartUIC.U;
            if (fjVar != null) {
                fjVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.bn bnVar = liveStartUIC.O;
            if (bnVar != null) {
                bnVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.kn knVar = liveStartUIC.P;
            if (knVar != null) {
                knVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ap apVar = liveStartUIC.S;
            if (apVar != null) {
                apVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.dq dqVar = liveStartUIC.T;
            if (dqVar != null) {
                dqVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = liveStartUIC.V;
            if (c4Var != null) {
                c4Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.t20 t20Var = liveStartUIC.W;
            if (t20Var != null) {
                t20Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.fa faVar = liveStartUIC.Y;
            if (faVar != null) {
                faVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.r30 r30Var = liveStartUIC.Z;
            if (r30Var != null) {
                r30Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.f8 f8Var = liveStartUIC.f420582b0;
            if (f8Var != null) {
                f8Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.r9 r9Var = liveStartUIC.f420588g0;
            if (r9Var != null) {
                r9Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.w60 w60Var = liveStartUIC.f420596k0;
            if (w60Var != null) {
                w60Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ww wwVar = liveStartUIC.X;
            if (wwVar != null) {
                wwVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.q5 q5Var = liveStartUIC.f420581a0;
            if (q5Var != null) {
                q5Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.x5 x5Var = liveStartUIC.f420583c0;
            if (x5Var != null) {
                x5Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.wh whVar = liveStartUIC.f420584d0;
            if (whVar != null) {
                whVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.h8 h8Var = liveStartUIC.f420594j0;
            if (h8Var != null) {
                h8Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.l8 l8Var = liveStartUIC.Q;
            if (l8Var != null) {
                l8Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.c6 c6Var = liveStartUIC.R;
            if (c6Var != null) {
                c6Var.K0(8);
            }
            tm2.g liveEndUIC = getLiveEndUIC();
            if ((bundle == null || ((mm2.c1) liveEndUIC.c(mm2.c1.class)).Y4 || bundle.getBoolean("PARAM_FINDER_LIVE_LIVE_FINISH_IF_CLOSE_LIVE")) && (v3Var = liveEndUIC.f420510h) != null) {
                v3Var.I1(new tm2.a(liveEndUIC));
            }
        } else if (((mm2.c1) business(mm2.c1.class)).a8()) {
            if (zl2.r4.f473950a.B2()) {
                com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(this, false, 1, null);
            }
            getLivePrepareUIC().getClass();
            tm2.s2 liveStartUIC2 = getLiveStartUIC();
            com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var2 = liveStartUIC2.f420595k;
            if (nd0Var2 != null) {
                com.tencent.mm.plugin.finder.live.plugin.nd0.P1(nd0Var2, null, false, 3, null);
            }
            com.tencent.mm.plugin.finder.live.plugin.j90 j90Var2 = liveStartUIC2.f420593j;
            if (j90Var2 != null) {
                j90Var2.t1();
            }
            com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var3 = liveStartUIC2.f420595k;
            if (nd0Var3 != null) {
                nd0Var3.K0(0);
            }
            com.tencent.mm.plugin.finder.live.plugin.kh khVar2 = liveStartUIC2.f420597l;
            if (khVar2 != null) {
                khVar2.K0(0);
            }
            if (((mm2.o4) liveStartUIC2.c(mm2.o4.class)).Z != null) {
                com.tencent.mm.plugin.finder.live.plugin.na naVar = liveStartUIC2.f420592i0;
                if (naVar != null) {
                    naVar.K0(0);
                }
            } else {
                com.tencent.mm.plugin.finder.live.plugin.na naVar2 = liveStartUIC2.f420592i0;
                if (naVar2 != null) {
                    naVar2.K0(8);
                }
            }
            com.tencent.mm.plugin.finder.live.plugin.mg mgVar2 = liveStartUIC2.f420603o;
            if (mgVar2 != null) {
                mgVar2.K0(0);
            }
            if (pm0.v.z((int) ((mm2.c1) liveStartUIC2.c(mm2.c1.class)).f328866q, 512)) {
                com.tencent.mm.plugin.finder.live.plugin.v6 v6Var2 = liveStartUIC2.f420614y;
                if (v6Var2 != null) {
                    v6Var2.K0(8);
                }
            } else {
                com.tencent.mm.plugin.finder.live.plugin.v6 v6Var3 = liveStartUIC2.f420614y;
                if (v6Var3 != null) {
                    v6Var3.K0(0);
                }
            }
            com.tencent.mm.plugin.finder.live.plugin.a80 a80Var2 = liveStartUIC2.f420605p;
            if (a80Var2 != null) {
                a80Var2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.v5 v5Var5 = liveStartUIC2.f420591i;
            if (v5Var5 != null) {
                v5Var5.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ow owVar2 = liveStartUIC2.f420610u;
            if (owVar2 != null) {
                owVar2.K0(0);
            }
            com.tencent.mm.plugin.finder.live.plugin.kh khVar3 = liveStartUIC2.f420597l;
            if (khVar3 != null && (viewGroup = khVar3.f365323d) != null) {
                viewGroup.post(new tm2.m2(liveStartUIC2));
            }
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var2 = liveStartUIC2.V;
            if (c4Var2 != null) {
                c4Var2.F1();
            }
            com.tencent.mm.plugin.finder.live.plugin.f10 f10Var = liveStartUIC2.A;
            if (f10Var != null) {
                f10Var.K0(0);
            }
            if (pm0.v.z(((mm2.c1) liveStartUIC2.c(mm2.c1.class)).f328807g2, 524288)) {
                fm2.b bVar = liveStartUIC2.f19601c;
                if (bVar != null) {
                    bVar.forceScreenToPortrait();
                }
                liveStartUIC2.n(false);
            } else if (pm0.v.z(((mm2.c1) liveStartUIC2.c(mm2.c1.class)).f328807g2, 32)) {
                fm2.b bVar2 = liveStartUIC2.f19601c;
                if (bVar2 != null) {
                    java.lang.String str2 = ((mm2.c1) liveStartUIC2.c(mm2.c1.class)).f328852o;
                    java.lang.String string = liveStartUIC2.f19600b.getResources().getString(com.tencent.mm.R.string.dod);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    bVar2.showTipWithBlurBg(str2, string);
                }
                com.tencent.mm.plugin.finder.live.plugin.v6 v6Var4 = liveStartUIC2.f420614y;
                if (v6Var4 != null) {
                    v6Var4.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var2 = liveStartUIC2.f420612w;
                if (ga0Var2 != null) {
                    ga0Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.r60 r60Var2 = liveStartUIC2.f420611v;
                if (r60Var2 != null) {
                    r60Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.ow owVar3 = liveStartUIC2.f420610u;
                if (owVar3 != null) {
                    owVar3.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.mg mgVar3 = liveStartUIC2.f420603o;
                if (mgVar3 != null) {
                    mgVar3.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.w00 w00Var2 = liveStartUIC2.f420609t;
                if (w00Var2 != null) {
                    w00Var2.K0(8);
                }
                qn2.n nVar2 = liveStartUIC2.I;
                if (nVar2 != null) {
                    nVar2.K0(8);
                }
                my2.k0 k0Var2 = liveStartUIC2.K;
                if (k0Var2 != null) {
                    k0Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.c4 c4Var3 = liveStartUIC2.V;
                if (c4Var3 != null) {
                    c4Var3.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.t20 t20Var2 = liveStartUIC2.W;
                if (t20Var2 != null) {
                    t20Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.fa faVar2 = liveStartUIC2.Y;
                if (faVar2 != null) {
                    faVar2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.r30 r30Var2 = liveStartUIC2.Z;
                if (r30Var2 != null) {
                    r30Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.q5 q5Var2 = liveStartUIC2.f420581a0;
                if (q5Var2 != null) {
                    q5Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.x5 x5Var2 = liveStartUIC2.f420583c0;
                if (x5Var2 != null) {
                    x5Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.f8 f8Var2 = liveStartUIC2.f420582b0;
                if (f8Var2 != null) {
                    f8Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.na naVar3 = liveStartUIC2.f420592i0;
                if (naVar3 != null) {
                    naVar3.K0(8);
                }
            } else if (pm0.v.z(((mm2.c1) liveStartUIC2.c(mm2.c1.class)).f328807g2, 65536)) {
                com.tencent.mm.plugin.finder.live.plugin.c4 c4Var4 = liveStartUIC2.V;
                java.lang.String w17 = c4Var4 != null ? c4Var4.w1(15) : null;
                r45.xm1 xm1Var = (r45.xm1) ((mm2.c1) liveStartUIC2.c(mm2.c1.class)).f328821i4.get(15);
                ((ml2.r0) i95.n0.c(ml2.r0.class)).Xj(ml2.h5.f327524e, "", 0, w17, xm1Var != null ? xm1Var.getString(2) : null, xm1Var != null ? xm1Var.getString(1) : null);
                java.lang.String string2 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_SING_SONG_NAME") : null;
                java.lang.String string3 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_LINK_USERNAME") : null;
                java.lang.String string4 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_LINK_NICKNAME") : null;
                java.lang.String string5 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_LINK_AVATAR") : null;
                com.tencent.mars.xlog.Log.i(liveStartUIC2.f420587g, "UI_STATE_GIFT targetUsername:" + string3 + " targetNickname:" + string4 + " targetAvatar:" + string5);
                if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                    com.tencent.mm.plugin.finder.live.plugin.lj ljVar = new com.tencent.mm.plugin.finder.live.plugin.lj(string3, string4, string5);
                    com.tencent.mm.plugin.finder.live.plugin.hm hmVar = liveStartUIC2.N;
                    if (hmVar != null) {
                        com.tencent.mm.plugin.finder.live.plugin.hm.T1(hmVar, ljVar, string2, null, 4, null);
                    }
                } else if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                    com.tencent.mm.plugin.finder.live.plugin.hm hmVar2 = liveStartUIC2.N;
                    if (hmVar2 != null) {
                        com.tencent.mm.plugin.finder.live.plugin.hm.T1(hmVar2, null, null, null, 7, null);
                    }
                } else {
                    com.tencent.mm.plugin.finder.live.plugin.hm hmVar3 = liveStartUIC2.N;
                    if (hmVar3 != null) {
                        com.tencent.mm.plugin.finder.live.plugin.hm.T1(hmVar3, null, string2, null, 5, null);
                    }
                }
            }
            com.tencent.mm.plugin.finder.live.plugin.v3 v3Var2 = getLiveEndUIC().f420510h;
            if (v3Var2 != null) {
                v3Var2.K0(8);
            }
        } else if (((mm2.c1) business(mm2.c1.class)).X7()) {
            com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(this, false, 1, null);
            getLivePrepareUIC().getClass();
            tm2.s2 liveStartUIC3 = getLiveStartUIC();
            com.tencent.mm.plugin.finder.live.plugin.j90 j90Var3 = liveStartUIC3.f420593j;
            if (j90Var3 != null) {
                j90Var3.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var4 = liveStartUIC3.f420595k;
            if (nd0Var4 != null) {
                nd0Var4.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.kh khVar4 = liveStartUIC3.f420597l;
            if (khVar4 != null) {
                khVar4.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.mg mgVar4 = liveStartUIC3.f420603o;
            if (mgVar4 != null) {
                mgVar4.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.k5 k5Var = liveStartUIC3.f420606q;
            if (k5Var != null) {
                k5Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.a80 a80Var3 = liveStartUIC3.f420605p;
            if (a80Var3 != null) {
                a80Var3.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ty tyVar = liveStartUIC3.f420607r;
            if (tyVar != null) {
                tyVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.iv ivVar = liveStartUIC3.f420608s;
            if (ivVar != null) {
                ivVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.w00 w00Var3 = liveStartUIC3.f420609t;
            if (w00Var3 != null) {
                w00Var3.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.r60 r60Var3 = liveStartUIC3.f420611v;
            if (r60Var3 != null) {
                r60Var3.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var3 = liveStartUIC3.f420612w;
            if (ga0Var3 != null) {
                ga0Var3.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.v5 v5Var6 = liveStartUIC3.f420591i;
            if (v5Var6 != null) {
                v5Var6.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ow owVar4 = liveStartUIC3.f420610u;
            if (owVar4 != null) {
                owVar4.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.v6 v6Var5 = liveStartUIC3.f420614y;
            if (v6Var5 != null) {
                v6Var5.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.de0 de0Var2 = liveStartUIC3.f420613x;
            if (de0Var2 != null) {
                de0Var2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.vw vwVar2 = liveStartUIC3.E;
            if (vwVar2 != null) {
                vwVar2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.sw swVar3 = liveStartUIC3.F;
            if (swVar3 != null) {
                swVar3.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.sw swVar4 = liveStartUIC3.G;
            if (swVar4 != null) {
                swVar4.K0(8);
            }
            pn2.f fVar2 = liveStartUIC3.H;
            if (fVar2 != null) {
                fVar2.K0(8);
            }
            qn2.n nVar3 = liveStartUIC3.I;
            if (nVar3 != null) {
                nVar3.K0(8);
            }
            my2.e eVar2 = liveStartUIC3.f420580J;
            if (eVar2 != null) {
                eVar2.K0(8);
            }
            my2.k0 k0Var3 = liveStartUIC3.K;
            if (k0Var3 != null) {
                k0Var3.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.d1 d1Var2 = liveStartUIC3.L;
            if (d1Var2 != null) {
                d1Var2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.f1 f1Var2 = liveStartUIC3.M;
            if (f1Var2 != null) {
                f1Var2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.fj fjVar2 = liveStartUIC3.U;
            if (fjVar2 != null) {
                fjVar2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.bn bnVar2 = liveStartUIC3.O;
            if (bnVar2 != null) {
                bnVar2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.kn knVar2 = liveStartUIC3.P;
            if (knVar2 != null) {
                knVar2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ap apVar2 = liveStartUIC3.S;
            if (apVar2 != null) {
                apVar2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.dq dqVar2 = liveStartUIC3.T;
            if (dqVar2 != null) {
                dqVar2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var5 = liveStartUIC3.V;
            if (c4Var5 != null) {
                c4Var5.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.t20 t20Var3 = liveStartUIC3.W;
            if (t20Var3 != null) {
                t20Var3.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.fa faVar3 = liveStartUIC3.Y;
            if (faVar3 != null) {
                faVar3.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.r30 r30Var3 = liveStartUIC3.Z;
            if (r30Var3 != null) {
                r30Var3.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.f8 f8Var3 = liveStartUIC3.f420582b0;
            if (f8Var3 != null) {
                f8Var3.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.r9 r9Var2 = liveStartUIC3.f420588g0;
            if (r9Var2 != null) {
                r9Var2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.w60 w60Var2 = liveStartUIC3.f420596k0;
            if (w60Var2 != null) {
                w60Var2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ww wwVar2 = liveStartUIC3.X;
            if (wwVar2 != null) {
                wwVar2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.q5 q5Var3 = liveStartUIC3.f420581a0;
            if (q5Var3 != null) {
                q5Var3.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.x5 x5Var3 = liveStartUIC3.f420583c0;
            if (x5Var3 != null) {
                x5Var3.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.wh whVar2 = liveStartUIC3.f420584d0;
            if (whVar2 != null) {
                whVar2.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.v3 v3Var3 = getLiveEndUIC().f420510h;
            if (v3Var3 != null) {
                v3Var3.K0(8);
            }
        }
        super.applyState(i17, z17, i18, z18, bundle);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void bindData(km2.m data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.bindData(data);
        if (sn0.b.f409964e2 == null) {
            com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.LiveCoreSecondaryDevice", "createInstance", new java.lang.Object[0]);
            sn0.b.f409964e2 = new sn0.b();
        }
        sn0.b bVar = sn0.b.f409964e2;
        kotlin.jvm.internal.o.d(bVar);
        setLiveCore(bVar);
        tn0.w0 liveCore = getLiveCore();
        if (liveCore != null) {
            liveCore.z0(1);
        }
        getLivePrepareUIC().e(this);
        getLiveStartUIC().e(this);
        getLiveEndUIC().e(this);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void callbackSEIData(int i17, r45.fa4 fa4Var) {
        fm2.b bVar;
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        ch2.o2 o2Var;
        tm2.s2 liveStartUIC = getLiveStartUIC();
        if (liveStartUIC == null || i17 != 35 || fa4Var == null || (bVar = liveStartUIC.f19601c) == null || (data = bVar.getData()) == null || (liveRoomControllerStore = data.f309131f) == null || (o2Var = (ch2.o2) liveRoomControllerStore.controller(ch2.o2.class)) == null) {
            return;
        }
        o2Var.A7(fa4Var);
    }

    public final yz5.a getLiveMessageCallback() {
        return this.f116172i;
    }

    @Override // fm2.b, com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public int getLiveRole() {
        return 1;
    }

    public final yz5.a getLiveSlowMessageCallback() {
        return this.f116173m;
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public int getRelativeLayoutId() {
        return com.tencent.mm.R.layout.amz;
    }

    public final java.lang.String getTAG() {
        return this.f116171h;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public tn0.w0 getTRTCLiveCore() {
        return getLiveCore();
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void mount() {
        super.mount();
        no0.h hVar = no0.h.f338720a;
        hVar.c(name(), this.f116172i);
        hVar.d(name(), this.f116173m);
        gm0.j1.n().f273288b.a(3861, this);
        gm0.j1.n().f273288b.a(3603, this);
        ((we2.s) business(we2.s.class)).O6();
    }

    @Override // to0.a
    public java.lang.String name() {
        return com.tencent.mm.plugin.finder.live.view.a2.class.getSimpleName();
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, no0.g
    public void onAcceptLiveMic(no0.a info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i(this.f116171h, "onAcceptLiveMic acceptInfo:" + info);
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = getLiveStartUIC().V;
        if (c4Var != null) {
            c4Var.E1();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1005) {
            if (i18 == -1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.j0.f327583i.T.f327667n++;
                return;
            }
            return;
        }
        if (i17 == 1006) {
            if (i18 == -1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.j0.f327583i.T.f327666m++;
                return;
            }
            return;
        }
        if (i17 != 1012) {
            if (i17 == 1013 && i18 == 1000) {
                java.lang.String stringExtra = intent != null ? intent.getStringExtra("ACTIVITY_RESULT_REMOVE_NOTICE_KEY") : null;
                qo0.b bVar = qo0.b.I2;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("KEY_FINDER_NOTICE_DELED_ID", stringExtra);
                statusChange(bVar, bundle);
                return;
            }
            return;
        }
        if (i18 == -1) {
            qo0.b bVar2 = qo0.b.I2;
            android.os.Bundle bundle2 = new android.os.Bundle();
            byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("KEY_FINDER_LIVE_NOTICE_INFO") : null;
            r45.a52 a52Var = new r45.a52();
            a52Var.set(0, 1);
            a52Var.set(1, 1);
            a52Var.set(2, new com.tencent.mm.protobuf.g(byteArrayExtra));
            bundle2.putByteArray("KEY_FINDER_NOTICE_ITEM", a52Var.toByteArray());
            statusChange(bVar2, bundle2);
            qo0.c.a(this, qo0.b.H2, null, 2, null);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public boolean onBackPress() {
        boolean onBackPress = super.onBackPress();
        if (!onBackPress) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 13L, "", null, 4, null);
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            j0Var.nj(ml2.j0.f327583i.f328285J);
        }
        return onBackPress;
    }

    @Override // no0.g
    public void onBattleApply() {
    }

    @Override // no0.g
    public void onBattleClose() {
    }

    @Override // no0.g
    public void onBattleDismiss() {
        com.tencent.mm.plugin.finder.live.plugin.na naVar = getLiveStartUIC().f420592i0;
        if (naVar != null) {
            naVar.B1();
        }
    }

    @Override // no0.g
    public void onBattleEnd() {
        fm2.b bVar = getLiveStartUIC().f19601c;
        if (bVar != null) {
            qo0.c.a(bVar, qo0.b.f365425v4, null, 2, null);
        }
    }

    @Override // no0.g
    public void onBattleStart() {
        fm2.b bVar = getLiveStartUIC().f19601c;
        if (bVar != null) {
            qo0.c.a(bVar, qo0.b.f365421u4, null, 2, null);
        }
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public void onCallStateChanged(int i17, java.lang.String incomingNumber) {
        kn0.p pVar;
        kotlin.jvm.internal.o.g(incomingNumber, "incomingNumber");
        java.lang.String str = this.f116171h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCallStateChanged state:");
        sb6.append(i17);
        sb6.append(", isFloatMode:");
        tn0.w0 liveCore = getLiveCore();
        sb6.append((liveCore == null || (pVar = liveCore.D) == null) ? null : java.lang.Boolean.valueOf(pVar.f()));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (i17 != 2) {
            return;
        }
        setManualClosed(true);
        qo0.c.a(this, qo0.b.f365391o, null, 2, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, no0.g
    public void onCloseLiveMic(no0.f info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i(this.f116171h, "onCloseLiveMic closeInfo:" + info + " curLinkMicUser:" + ((mm2.o4) business(mm2.o4.class)).l7() + " audienceLinkMicUserList:" + ((mm2.o4) business(mm2.o4.class)).f329327v);
    }

    /* JADX WARN: Removed duplicated region for block: B:301:0x04a4 A[Catch: all -> 0x06f8, TryCatch #4 {, blocks: (B:286:0x0473, B:287:0x0477, B:289:0x047d, B:292:0x048b, B:294:0x0494, B:296:0x0498, B:301:0x04a4, B:303:0x04aa, B:305:0x04af, B:308:0x04b8, B:311:0x04be), top: B:285:0x0473 }] */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0763  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.live.view.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLiveEventCallback(int r26, android.os.Bundle r27) {
        /*
            Method dump skipped, instructions count: 2075
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.a2.onLiveEventCallback(int, android.os.Bundle):void");
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i(this.f116171h, "onSceneEnd errType:" + i17 + ", errCode:" + i18 + ", scene:" + m1Var);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void pause() {
        super.pause();
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void release() {
        kn0.p pVar;
        kn0.p pVar2;
        com.tencent.mars.xlog.Log.i(this.f116171h, "release");
        mk2.h.f327140h = null;
        tm2.s2 liveStartUIC = getLiveStartUIC();
        liveStartUIC.h();
        liveStartUIC.f420604o0.d();
        boolean z17 = false;
        liveStartUIC.f420598l0 = false;
        liveStartUIC.f420600m0 = false;
        no0.h.f338720a.e();
        dk2.jf.f233665a.b();
        gm0.j1.n().f273288b.q(3861, this);
        gm0.j1.n().f273288b.q(3603, this);
        if (!((mm2.c1) business(mm2.c1.class)).Y4) {
            tn0.w0 liveCore = getLiveCore();
            if (liveCore != null && (pVar = liveCore.D) != null && !pVar.f()) {
                z17 = true;
            }
            if (!z17 || getMiniWinPermission() || getFinishActivityNotReleaseLive()) {
                return;
            }
            if (!((mm2.c1) business(mm2.c1.class)).f328911x2) {
                dk2.ef.S(dk2.ef.f233372a, "secRelease_2", false, getMiniWinPermission(), java.lang.Boolean.FALSE, getFinishActivityNotReleaseLive(), 2, null);
            }
            tn0.w0 liveCore2 = getLiveCore();
            if (liveCore2 != null) {
                liveCore2.p0();
                return;
            }
            return;
        }
        if (((mm2.c1) business(mm2.c1.class)).G1) {
            if (((mm2.c1) business(mm2.c1.class)).f328793d5) {
                h63.s1 s1Var = (h63.s1) i95.n0.c(h63.s1.class);
                android.content.Context context = getContext();
                java.lang.String str = ((mm2.c1) business(mm2.c1.class)).f328783b5;
                if (str == null && (str = ((mm2.e1) business(mm2.e1.class)).f328988r.getString(22)) == null) {
                    str = "";
                }
                int i17 = ((mm2.c1) business(mm2.c1.class)).f328788c5;
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                ((h63.g1) s1Var).Di(context, str, i17, bool, bool, java.lang.Long.valueOf(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0)));
            }
            dk2.ef.S(dk2.ef.f233372a, "secRelease_1", false, getMiniWinPermission(), null, getFinishActivityNotReleaseLive(), 10, null);
            tn0.w0 liveCore3 = getLiveCore();
            if (((liveCore3 == null || (pVar2 = liveCore3.D) == null || pVar2.f()) ? false : true) && !getMiniWinPermission() && !getFinishActivityNotReleaseLive()) {
                no0.k.f338729a = null;
                tn0.w0 liveCore4 = getLiveCore();
                if (liveCore4 != null) {
                    liveCore4.p0();
                }
            }
        }
        tn0.w0 liveCore5 = getLiveCore();
        co0.s sVar = liveCore5 instanceof co0.s ? (co0.s) liveCore5 : null;
        if (sVar != null) {
            sVar.T0(false);
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void resume() {
        kn0.p pVar;
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var;
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        kn0.p pVar2;
        super.resume();
        tm2.s2 liveStartUIC = getLiveStartUIC();
        tn0.w0 w0Var = liveStartUIC.f19603e;
        if ((w0Var == null || (pVar2 = w0Var.D) == null || pVar2.f309581a) ? false : true) {
            ((ku5.t0) ku5.t0.f312615d).h(dk2.mg.f233782d, "Finder.LiveExceptionMonitor");
            tn0.w0 w0Var2 = liveStartUIC.f19603e;
            if (w0Var2 != null) {
                w0Var2.h0();
            }
            fm2.b bVar = liveStartUIC.f19601c;
            if (bVar != null && (data = bVar.getData()) != null && (liveRoomControllerStore = data.f309131f) != null) {
                if2.z.f291153a.e(liveRoomControllerStore);
            }
        } else if (w0Var != null && (pVar = w0Var.D) != null) {
            pVar.f309581a = false;
        }
        com.tencent.mm.plugin.finder.live.plugin.fj fjVar = liveStartUIC.U;
        if (fjVar != null) {
            fjVar.onResume();
        }
        com.tencent.mm.plugin.finder.live.plugin.c6 c6Var = liveStartUIC.R;
        if (c6Var != null) {
            c6Var.onResume();
        }
        com.tencent.mm.plugin.finder.live.plugin.sw swVar = liveStartUIC.F;
        if (swVar != null) {
            swVar.onResume();
        }
        com.tencent.mm.plugin.finder.live.plugin.sw swVar2 = liveStartUIC.G;
        if (swVar2 != null) {
            swVar2.onResume();
        }
        ((we2.w) liveStartUIC.c(we2.w.class)).N6();
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = liveStartUIC.f420611v;
        if (r60Var == null || (ep0Var = r60Var.f114100u) == null) {
            return;
        }
        ep0Var.onResume();
    }

    public final void setLiveMessageCallback(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.f116172i = aVar;
    }

    public final void setLiveSlowMessageCallback(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.f116173m = aVar;
    }

    public final void setTAG(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f116171h = str;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void start() {
        super.start();
        tm2.s2 liveStartUIC = getLiveStartUIC();
        com.tencent.mm.plugin.finder.live.plugin.kh khVar = liveStartUIC.f420597l;
        if (khVar != null && khVar.w0() == 0) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = liveStartUIC.f420604o0;
            b4Var.d();
            b4Var.c(1000L, 1000L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:334:0x0678, code lost:
    
        if (r4 != false) goto L337;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0167  */
    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void statusChange(qo0.b r52, android.os.Bundle r53) {
        /*
            Method dump skipped, instructions count: 2624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.a2.statusChange(qo0.b, android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void stop() {
        super.stop();
        getLiveStartUIC().h();
    }
}
