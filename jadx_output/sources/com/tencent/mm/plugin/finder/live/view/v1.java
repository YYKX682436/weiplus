package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public class v1 extends fm2.a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f116726h;

    /* renamed from: i, reason: collision with root package name */
    public final yz5.a f116727i;

    /* renamed from: m, reason: collision with root package name */
    public final yz5.a f116728m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.tencent.mm.ui.MMActivity context, androidx.fragment.app.Fragment fragment, android.util.AttributeSet attributeSet) {
        super(context, fragment, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f116726h = "Finder.LiveAnchorPluginLayout";
        this.f116727i = new com.tencent.mm.plugin.finder.live.view.s1(this);
        this.f116728m = new com.tencent.mm.plugin.finder.live.view.t1(this);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void activate(km2.m data, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(data, "data");
        super.activate(data, z17, z18);
        com.tencent.mars.xlog.Log.i(this.f116726h, "liveFinish:" + ((mm2.c1) business(mm2.c1.class)).G1 + ",isFromFloat:" + z17 + ", restart:" + z18 + ",liveId:" + ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0) + ",objectId:" + ((mm2.e1) business(mm2.e1.class)).f328983m + ",nonceId:" + ((mm2.e1) business(mm2.e1.class)).f328992v + ",username:" + ((mm2.c1) business(mm2.c1.class)).f328852o);
        sm2.k9 livePrepareUIC = getLivePrepareUIC();
        if (((mm2.e1) livePrepareUIC.c(mm2.e1.class)).f328988r.getLong(0) == 0) {
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f327583i;
            y4Var.U = false;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            y4Var.V = false;
            fm2.a aVar = livePrepareUIC.f19595c;
            if (aVar != null) {
                qo0.c.a(aVar, qo0.b.f365363i, null, 2, null);
            }
        } else if (!z17) {
            if (!dk2.ef.S) {
                ((mm2.c1) livePrepareUIC.c(mm2.c1.class)).a9(((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Ni(((mm2.e1) livePrepareUIC.c(mm2.e1.class)).f328983m).getFinderObject());
            }
            ((mm2.f6) livePrepareUIC.c(mm2.f6.class)).f329033g = true;
            fm2.a aVar2 = livePrepareUIC.f19595c;
            if (aVar2 != null) {
                aVar2.prepareToStart(false);
            }
        } else if (((mm2.c1) livePrepareUIC.c(mm2.c1.class)).G1) {
            fm2.a aVar3 = livePrepareUIC.f19595c;
            if (aVar3 != null) {
                qo0.c.a(aVar3, qo0.b.H, null, 2, null);
            }
        } else {
            fm2.a aVar4 = livePrepareUIC.f19595c;
            if (aVar4 != null) {
                aVar4.prepareToStart(true);
            }
        }
        android.content.Intent intent = livePrepareUIC.f19594b.getIntent();
        if (intent.hasExtra("KEY_PARAMS_POST_CREATE_LIVE")) {
            r45.sm1 sm1Var = new r45.sm1();
            byte[] byteArrayExtra = intent.getByteArrayExtra("KEY_PARAMS_POST_CREATE_LIVE");
            if (byteArrayExtra != null) {
                try {
                    sm1Var.parseFrom(byteArrayExtra);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            r45.Cdo cdo = (r45.Cdo) sm1Var.getCustom(6);
            if (cdo != null && pm0.v.z((int) cdo.getLong(0), 256)) {
                if (((int) cdo.getLong(1)) == 0) {
                    ((mm2.c1) livePrepareUIC.c(mm2.c1.class)).p8(((int) ((mm2.c1) livePrepareUIC.c(mm2.c1.class)).f328866q) & (-257));
                    ((mm2.c1) livePrepareUIC.c(mm2.c1.class)).D8(0);
                    fm2.a aVar5 = livePrepareUIC.f19595c;
                    if (aVar5 != null) {
                        qo0.b bVar = qo0.b.f365366i4;
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", false);
                        aVar5.statusChange(bVar, bundle);
                    }
                } else if (((int) cdo.getLong(1)) == 256) {
                    ((mm2.c1) livePrepareUIC.c(mm2.c1.class)).p8(((int) ((mm2.c1) livePrepareUIC.c(mm2.c1.class)).f328866q) | 256);
                    ((mm2.c1) livePrepareUIC.c(mm2.c1.class)).D8(1);
                    fm2.a aVar6 = livePrepareUIC.f19595c;
                    if (aVar6 != null) {
                        qo0.b bVar2 = qo0.b.f365366i4;
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        bundle2.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", true);
                        aVar6.statusChange(bVar2, bundle2);
                    }
                }
            }
        }
        dk2.jf.f233665a.a(name(), new com.tencent.mm.plugin.finder.live.view.r1(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void applyState(int i17, boolean z17, int i18, boolean z18, android.os.Bundle bundle) {
        android.view.ViewGroup viewGroup;
        yz5.l lVar;
        java.util.LinkedList linkedList = null;
        if (((mm2.c1) business(mm2.c1.class)).T7()) {
            com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(this, false, 1, null);
            com.tencent.mm.plugin.finder.live.plugin.qa qaVar = getLivePrepareUIC().f409544g;
            if (qaVar != null) {
                qaVar.K0(0);
            }
            sm2.o4 liveStartUIC = getLiveStartUIC();
            com.tencent.mm.plugin.finder.live.plugin.o9 o9Var = liveStartUIC.f409616i;
            if (o9Var != null) {
                o9Var.K0(0);
            }
            com.tencent.mm.plugin.finder.live.plugin.j90 j90Var = liveStartUIC.f409618j;
            if (j90Var != null) {
                j90Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = liveStartUIC.f409620k;
            if (nd0Var != null) {
                nd0Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.kh khVar = liveStartUIC.f409622l;
            if (khVar != null) {
                khVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.mg mgVar = liveStartUIC.f409628o;
            if (mgVar != null) {
                mgVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.k5 k5Var = liveStartUIC.f409631q;
            if (k5Var != null) {
                k5Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ty tyVar = liveStartUIC.f409632r;
            if (tyVar != null) {
                tyVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.iv ivVar = liveStartUIC.f409633s;
            if (ivVar != null) {
                ivVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = liveStartUIC.f409634t;
            if (w00Var != null) {
                w00Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = liveStartUIC.f409636v;
            if (r60Var != null) {
                r60Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var = liveStartUIC.f409637w;
            if (ga0Var != null) {
                ga0Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.v5 v5Var = liveStartUIC.f409614h;
            if (v5Var != null) {
                v5Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ow owVar = liveStartUIC.f409635u;
            if (owVar != null) {
                owVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.v6 v6Var = liveStartUIC.f409639y;
            if (v6Var != null) {
                v6Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.bn bnVar = liveStartUIC.H;
            if (bnVar != null) {
                bnVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.kn knVar = liveStartUIC.I;
            if (knVar != null) {
                knVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ap apVar = liveStartUIC.f409604J;
            if (apVar != null) {
                apVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.dq dqVar = liveStartUIC.K;
            if (dqVar != null) {
                dqVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.de0 de0Var = liveStartUIC.f409638x;
            if (de0Var != null) {
                de0Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.a5 a5Var = liveStartUIC.f409640z;
            if (a5Var != null) {
                a5Var.K0(8);
            }
            pn2.f fVar = liveStartUIC.B;
            if (fVar != null) {
                fVar.K0(8);
            }
            my2.e eVar = liveStartUIC.D;
            if (eVar != null) {
                eVar.K0(8);
            }
            my2.k0 k0Var = liveStartUIC.E;
            if (k0Var != null) {
                k0Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.d1 d1Var = liveStartUIC.F;
            if (d1Var != null) {
                d1Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.f1 f1Var = liveStartUIC.G;
            if (f1Var != null) {
                f1Var.K0(8);
            }
            qn2.n nVar = liveStartUIC.C;
            if (nVar != null) {
                nVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = liveStartUIC.L;
            if (v70Var != null) {
                v70Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = liveStartUIC.M;
            if (x7Var != null) {
                x7Var.K0(8);
            }
            zi2.w wVar = liveStartUIC.P;
            if (wVar != null) {
                wVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = liveStartUIC.N;
            if (c4Var != null) {
                c4Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.t20 t20Var = liveStartUIC.f409613g0;
            if (t20Var != null) {
                t20Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.ww wwVar = liveStartUIC.O;
            if (wwVar != null) {
                wwVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.bb0 bb0Var = liveStartUIC.Q;
            if (bb0Var != null) {
                bb0Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.na naVar = liveStartUIC.W;
            if (naVar != null) {
                naVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.r30 r30Var = liveStartUIC.X;
            if (r30Var != null) {
                r30Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.f8 f8Var = liveStartUIC.f409605a0;
            if (f8Var != null) {
                f8Var.K0(8);
            }
            if (((mm2.c1) liveStartUIC.c(mm2.c1.class)).l7()) {
                com.tencent.mm.plugin.finder.live.plugin.fa faVar = liveStartUIC.R;
                if (faVar != null) {
                    faVar.K0(0);
                }
            } else {
                com.tencent.mm.plugin.finder.live.plugin.fa faVar2 = liveStartUIC.R;
                if (faVar2 != null) {
                    faVar2.K0(8);
                }
            }
            com.tencent.mm.plugin.finder.live.plugin.q5 q5Var = liveStartUIC.Y;
            if (q5Var != null) {
                q5Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.x5 x5Var = liveStartUIC.Z;
            if (x5Var != null) {
                x5Var.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.wh whVar = liveStartUIC.f409606b0;
            if (whVar != null) {
                whVar.K0(8);
            }
            com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = getLiveEndUIC().f409449g;
            if (v3Var != null) {
                v3Var.K0(8);
            }
        } else if (!((mm2.c1) business(mm2.c1.class)).X7()) {
            if (((mm2.c1) business(mm2.c1.class)).U7()) {
                com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(this, false, 1, null);
                com.tencent.mm.plugin.finder.live.plugin.qa qaVar2 = getLivePrepareUIC().f409544g;
                if (qaVar2 != null) {
                    qaVar2.K0(8);
                }
                sm2.o4 liveStartUIC2 = getLiveStartUIC();
                com.tencent.mm.plugin.finder.live.plugin.j90 j90Var2 = liveStartUIC2.f409618j;
                if (j90Var2 != null) {
                    j90Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var2 = liveStartUIC2.f409620k;
                if (nd0Var2 != null) {
                    nd0Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.kh khVar2 = liveStartUIC2.f409622l;
                if (khVar2 != null) {
                    khVar2.K0(8);
                }
                xu2.u uVar = liveStartUIC2.f409626n;
                if (uVar != null) {
                    uVar.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.mg mgVar2 = liveStartUIC2.f409628o;
                if (mgVar2 != null) {
                    mgVar2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.a80 a80Var = liveStartUIC2.f409630p;
                if (a80Var != null) {
                    a80Var.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.ow owVar2 = liveStartUIC2.f409635u;
                if (owVar2 != null) {
                    owVar2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.v6 v6Var2 = liveStartUIC2.f409639y;
                if (v6Var2 != null) {
                    v6Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.r60 r60Var2 = liveStartUIC2.f409636v;
                if (r60Var2 != null) {
                    r60Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var2 = liveStartUIC2.f409637w;
                if (ga0Var2 != null) {
                    ga0Var2.K0(8);
                }
                if (((mm2.t2) liveStartUIC2.c(mm2.t2.class)).f329433o) {
                    java.lang.String str = liveStartUIC2.f409610f;
                    com.tencent.mars.xlog.Log.i(str, "onLiveEnd: isLiveEndByForceQuit = true");
                    r45.qp1 qp1Var = ((mm2.t2) liveStartUIC2.c(mm2.t2.class)).f329434p;
                    java.lang.Integer num = ((mm2.t2) liveStartUIC2.c(mm2.t2.class)).f329435q;
                    if (qp1Var == null || num == null) {
                        com.tencent.mars.xlog.Log.i(str, "onLiveEnd: isLiveEndByForceQuit, but no cache errorPage");
                        com.tencent.mm.plugin.finder.live.plugin.v5 v5Var2 = liveStartUIC2.f409614h;
                        if (v5Var2 != null) {
                            v5Var2.K0(8);
                        }
                    } else {
                        com.tencent.mm.plugin.finder.live.plugin.v5 v5Var3 = liveStartUIC2.f409614h;
                        if (v5Var3 != null) {
                            v5Var3.K0(0);
                        }
                        com.tencent.mm.plugin.finder.live.plugin.v5 v5Var4 = liveStartUIC2.f409614h;
                        if (v5Var4 != null) {
                            v5Var4.u1(((mm2.c1) liveStartUIC2.c(mm2.c1.class)).f328852o, qp1Var, num.intValue());
                        }
                    }
                } else {
                    com.tencent.mm.plugin.finder.live.plugin.v5 v5Var5 = liveStartUIC2.f409614h;
                    if (v5Var5 != null) {
                        v5Var5.K0(8);
                    }
                }
                com.tencent.mm.plugin.finder.live.plugin.w00 w00Var2 = liveStartUIC2.f409634t;
                if (w00Var2 != null) {
                    w00Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.bn bnVar2 = liveStartUIC2.H;
                if (bnVar2 != null) {
                    bnVar2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.kn knVar2 = liveStartUIC2.I;
                if (knVar2 != null) {
                    knVar2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.ap apVar2 = liveStartUIC2.f409604J;
                if (apVar2 != null) {
                    apVar2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.dq dqVar2 = liveStartUIC2.K;
                if (dqVar2 != null) {
                    dqVar2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.de0 de0Var2 = liveStartUIC2.f409638x;
                if (de0Var2 != null) {
                    de0Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.a5 a5Var2 = liveStartUIC2.f409640z;
                if (a5Var2 != null) {
                    a5Var2.K0(8);
                }
                pn2.f fVar2 = liveStartUIC2.B;
                if (fVar2 != null) {
                    fVar2.K0(8);
                }
                qn2.n nVar2 = liveStartUIC2.C;
                if (nVar2 != null) {
                    nVar2.K0(8);
                }
                my2.e eVar2 = liveStartUIC2.D;
                if (eVar2 != null) {
                    eVar2.K0(8);
                }
                my2.k0 k0Var2 = liveStartUIC2.E;
                if (k0Var2 != null) {
                    k0Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.d1 d1Var2 = liveStartUIC2.F;
                if (d1Var2 != null) {
                    d1Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.f1 f1Var2 = liveStartUIC2.G;
                if (f1Var2 != null) {
                    f1Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.v70 v70Var2 = liveStartUIC2.L;
                if (v70Var2 != null) {
                    v70Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.x7 x7Var2 = liveStartUIC2.M;
                if (x7Var2 != null) {
                    x7Var2.K0(8);
                }
                zi2.w wVar2 = liveStartUIC2.P;
                if (wVar2 != null) {
                    wVar2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.h8 h8Var = liveStartUIC2.S;
                if (h8Var != null) {
                    h8Var.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.l8 l8Var = liveStartUIC2.f409608d0;
                if (l8Var != null) {
                    l8Var.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.c6 c6Var = liveStartUIC2.f409609e0;
                if (c6Var != null) {
                    c6Var.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.r9 r9Var = liveStartUIC2.T;
                if (r9Var != null) {
                    r9Var.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.t8 t8Var = liveStartUIC2.U;
                if (t8Var != null) {
                    t8Var.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.b9 b9Var = liveStartUIC2.V;
                if (b9Var != null) {
                    b9Var.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.c4 c4Var2 = liveStartUIC2.N;
                if (c4Var2 != null) {
                    c4Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.t20 t20Var2 = liveStartUIC2.f409613g0;
                if (t20Var2 != null) {
                    t20Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.w60 w60Var = liveStartUIC2.f409615h0;
                if (w60Var != null) {
                    w60Var.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.ww wwVar2 = liveStartUIC2.O;
                if (wwVar2 != null) {
                    wwVar2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.bb0 bb0Var2 = liveStartUIC2.Q;
                if (bb0Var2 != null) {
                    bb0Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.fa faVar3 = liveStartUIC2.R;
                if (faVar3 != null) {
                    faVar3.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.na naVar2 = liveStartUIC2.W;
                if (naVar2 != null) {
                    naVar2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.r30 r30Var2 = liveStartUIC2.X;
                if (r30Var2 != null) {
                    r30Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.q5 q5Var2 = liveStartUIC2.Y;
                if (q5Var2 != null) {
                    q5Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.x5 x5Var2 = liveStartUIC2.Z;
                if (x5Var2 != null) {
                    x5Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.f8 f8Var2 = liveStartUIC2.f409605a0;
                if (f8Var2 != null) {
                    f8Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.wh whVar2 = liveStartUIC2.f409606b0;
                if (whVar2 != null) {
                    whVar2.K0(8);
                }
                sm2.f liveEndUIC = getLiveEndUIC();
                if (((mm2.t2) liveEndUIC.c(mm2.t2.class)).f329433o) {
                    com.tencent.mars.xlog.Log.i(liveEndUIC.f409448f, "finish live by force quit, hide normal end page");
                    com.tencent.mm.plugin.finder.live.plugin.v3 v3Var2 = liveEndUIC.f409449g;
                    if (v3Var2 != null) {
                        v3Var2.K0(8);
                    }
                    com.tencent.mm.plugin.finder.assist.u8.f102599a.b(liveEndUIC.f19609a, com.tencent.mm.plugin.finder.assist.u8.f102604f > 0 ? 1 : 0, 0, "anchorEndByForceQuit", "0-vBitrate:" + hn0.v.f282442c);
                    com.tencent.mars.xlog.Log.i("Finder.LiveStatisticsReport", "anchorStatisticsReport reset");
                    com.tencent.mm.plugin.finder.assist.u8.f102600b = 0L;
                    com.tencent.mm.plugin.finder.assist.u8.f102601c = 0L;
                    com.tencent.mm.plugin.finder.assist.u8.f102602d = 0L;
                    com.tencent.mm.plugin.finder.assist.u8.f102603e = 0L;
                    com.tencent.mm.plugin.finder.assist.u8.f102604f = 0L;
                    com.tencent.mm.plugin.finder.assist.u8.f102606h = 0;
                    com.tencent.mm.plugin.finder.assist.u8.f102605g = 1;
                } else {
                    com.tencent.mm.plugin.finder.live.plugin.v3 v3Var3 = liveEndUIC.f409449g;
                    if (v3Var3 != null) {
                        v3Var3.I1(new sm2.a(liveEndUIC));
                    }
                    ((ku5.t0) ku5.t0.f312615d).q(new sm2.b(liveEndUIC));
                }
                un0.h hVar = un0.s.f429418b;
                if (hVar != null && (lVar = hVar.f429365n) != null) {
                    lVar.invoke("FinderLiveAnchorPluginLayout-applyState");
                }
            } else if (((mm2.c1) business(mm2.c1.class)).a8()) {
                if ((((mm2.c1) business(mm2.c1.class)).f328824j2 != 2 && ((mm2.c1) business(mm2.c1.class)).f328813h2 == 2) || !(!pm0.v.z(((mm2.c1) business(mm2.c1.class)).f328819i2, 32) || pm0.v.z(((mm2.c1) business(mm2.c1.class)).f328807g2, 32) || ((mm2.t2) business(mm2.t2.class)).f329428g)) {
                    com.tencent.mm.plugin.finder.live.view.k0.hideLoadingLayer$default(this, false, 1, null);
                }
                com.tencent.mm.plugin.finder.live.plugin.qa qaVar3 = getLivePrepareUIC().f409544g;
                if (qaVar3 != null) {
                    qaVar3.K0(8);
                }
                sm2.o4 liveStartUIC3 = getLiveStartUIC();
                liveStartUIC3.getClass();
                ae2.in inVar = ae2.in.f3688a;
                if (((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3896v).getValue()).r()).intValue() == 1 && !liveStartUIC3.f409612g) {
                    liveStartUIC3.f409612g = true;
                    fm2.a aVar = liveStartUIC3.f19595c;
                    if (aVar != null) {
                        sm2.l9 l9Var = new sm2.l9(aVar);
                        l9Var.a(new sm2.m9(null, 8, new sm2.x7(liveStartUIC3, aVar), sm2.b7.f409380d));
                        sm2.l9.b(l9Var, 8, null, new sm2.t8(liveStartUIC3, aVar), 2, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.z8(liveStartUIC3, aVar), 2, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.tqx, 8, null, new sm2.b9(liveStartUIC3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.f484534tg1, 8, null, new sm2.d9(liveStartUIC3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.f484535tg2, 8, null, new sm2.f9(liveStartUIC3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.tg_, null, null, new sm2.h9(liveStartUIC3, aVar), 6, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.fnv, 8, null, new sm2.j9(liveStartUIC3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.f484717tl5, 8, null, new sm2.g6(liveStartUIC3, aVar), 4, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.j6(aVar, liveStartUIC3), 2, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.f9c, 8, null, new sm2.l6(liveStartUIC3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.tit, 8, null, new sm2.n6(liveStartUIC3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.f2s, 8, null, new sm2.q6(aVar, liveStartUIC3), 4, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.s6(liveStartUIC3, aVar), 2, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.f1i, 8, null, new sm2.u6(liveStartUIC3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.tg7, 8, null, new sm2.w6(liveStartUIC3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.to7, 8, null, new sm2.y6(liveStartUIC3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.f_u, 8, null, new sm2.a7(liveStartUIC3, aVar), 4, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.e7(liveStartUIC3, aVar), 2, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.f484822tp5, 8, null, new sm2.g7(liveStartUIC3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.tgg, 8, null, new sm2.i7(liveStartUIC3, aVar), 4, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.tqy, 8, null, new sm2.k7(liveStartUIC3, aVar), 4, null);
                        sm2.l9.b(l9Var, null, null, new sm2.m7(liveStartUIC3, aVar), 3, null);
                        sm2.l9.b(l9Var, null, null, new sm2.o7(liveStartUIC3, aVar), 3, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.q7(liveStartUIC3, aVar), 2, null);
                        sm2.l9.b(l9Var, null, null, new sm2.s7(liveStartUIC3, aVar), 3, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.u7(liveStartUIC3, aVar), 2, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.w7(liveStartUIC3, aVar), 2, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.tga, 8, null, new sm2.a8(liveStartUIC3, aVar), 4, null);
                        sm2.l9.b(l9Var, null, null, new sm2.c8(liveStartUIC3, aVar), 3, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.eww, 8, null, new sm2.e8(liveStartUIC3, aVar), 4, null);
                        sm2.l9.b(l9Var, null, null, new sm2.g8(liveStartUIC3, aVar), 3, null);
                        sm2.l9.b(l9Var, null, null, new sm2.i8(liveStartUIC3, aVar), 3, null);
                        sm2.l9.b(l9Var, null, null, new sm2.k8(liveStartUIC3, aVar), 3, null);
                        sm2.l9.b(l9Var, null, null, new sm2.m8(liveStartUIC3, aVar), 3, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.euu, null, null, new sm2.o8(liveStartUIC3, aVar), 6, null);
                        sm2.l9.b(l9Var, null, null, new sm2.q8(liveStartUIC3, aVar), 3, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.tqs, null, null, new sm2.s8(liveStartUIC3, aVar), 6, null);
                        sm2.l9.c(l9Var, com.tencent.mm.R.id.ff8, 8, null, new sm2.w8(liveStartUIC3, aVar), 4, null);
                        sm2.l9.b(l9Var, 8, null, new sm2.y8(liveStartUIC3, aVar), 2, null);
                        java.util.List<com.tencent.mm.plugin.finder.live.plugin.l> S0 = kz5.n0.S0(l9Var.f409558b);
                        fm2.a aVar2 = liveStartUIC3.f19595c;
                        if (aVar2 != null) {
                            aVar2.mo133getLifecycle();
                        }
                        for (com.tencent.mm.plugin.finder.live.plugin.l lVar2 : S0) {
                            try {
                                lVar2.z0();
                            } catch (java.lang.Throwable unused) {
                                lVar2.getClass();
                            }
                        }
                        if (((mm2.c1) liveStartUIC3.c(mm2.c1.class)).a8()) {
                            S0.size();
                            for (com.tencent.mm.plugin.finder.live.plugin.l lVar3 : S0) {
                                try {
                                    if (lVar3 instanceof com.tencent.mm.plugin.finder.live.plugin.l) {
                                        lVar3.M0(qo0.b.f365386n, bundle);
                                        android.os.Bundle bundle2 = new android.os.Bundle();
                                        bundle2.putBoolean("PARAM_FINDER_LIVE_AUDIO_MODE", ((mm2.c1) liveStartUIC3.c(mm2.c1.class)).l7());
                                        bundle2.putBoolean("PARAM_FINDER_LIVE_IS_SHARE_MODE", ((ct2.j) liveStartUIC3.c(ct2.j.class)).f222272p);
                                        lVar3.M0(qo0.b.f365366i4, bundle2);
                                    }
                                } catch (java.lang.Throwable unused2) {
                                    lVar3.getClass();
                                }
                            }
                        }
                    }
                }
                com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var3 = liveStartUIC3.f409620k;
                if (nd0Var3 != null) {
                    com.tencent.mm.plugin.finder.live.plugin.nd0.P1(nd0Var3, null, false, 3, null);
                }
                com.tencent.mm.plugin.finder.live.plugin.o9 o9Var2 = liveStartUIC3.f409616i;
                if (o9Var2 != null) {
                    o9Var2.K0(0);
                }
                com.tencent.mm.plugin.finder.live.plugin.j90 j90Var3 = liveStartUIC3.f409618j;
                if (j90Var3 != null) {
                    j90Var3.t1();
                }
                com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var4 = liveStartUIC3.f409620k;
                if (nd0Var4 != null) {
                    nd0Var4.K0(0);
                }
                com.tencent.mm.plugin.finder.live.plugin.kh khVar3 = liveStartUIC3.f409622l;
                if (khVar3 != null) {
                    khVar3.K0(0);
                }
                com.tencent.mm.plugin.finder.live.plugin.mg mgVar3 = liveStartUIC3.f409628o;
                if (mgVar3 != null) {
                    mgVar3.K0(0);
                }
                if (pm0.v.z((int) ((mm2.c1) liveStartUIC3.c(mm2.c1.class)).f328866q, 512)) {
                    com.tencent.mm.plugin.finder.live.plugin.v6 v6Var3 = liveStartUIC3.f409639y;
                    if (v6Var3 != null) {
                        v6Var3.K0(8);
                    }
                } else {
                    com.tencent.mm.plugin.finder.live.plugin.v6 v6Var4 = liveStartUIC3.f409639y;
                    if (v6Var4 != null) {
                        v6Var4.K0(0);
                    }
                }
                com.tencent.mm.plugin.finder.live.plugin.v70 v70Var3 = liveStartUIC3.L;
                if (v70Var3 != null) {
                    v70Var3.K0(0);
                }
                com.tencent.mm.plugin.finder.live.plugin.a80 a80Var2 = liveStartUIC3.f409630p;
                if (a80Var2 != null) {
                    a80Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.a5 a5Var3 = liveStartUIC3.f409640z;
                if (a5Var3 != null) {
                    a5Var3.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.v5 v5Var6 = liveStartUIC3.f409614h;
                if (v5Var6 != null) {
                    v5Var6.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.ow owVar3 = liveStartUIC3.f409635u;
                if (owVar3 != null) {
                    owVar3.K0(0);
                }
                com.tencent.mm.plugin.finder.live.plugin.k5 k5Var2 = liveStartUIC3.f409631q;
                if (k5Var2 != null) {
                    k5Var2.K0(0);
                }
                com.tencent.mm.plugin.finder.live.plugin.kh khVar4 = liveStartUIC3.f409622l;
                if (khVar4 != null && (viewGroup = khVar4.f365323d) != null) {
                    viewGroup.post(new sm2.u3(liveStartUIC3));
                }
                if (((mm2.o4) liveStartUIC3.c(mm2.o4.class)).Z != null) {
                    com.tencent.mm.plugin.finder.live.plugin.na naVar3 = liveStartUIC3.W;
                    if (naVar3 != null) {
                        naVar3.K0(0);
                    }
                } else {
                    com.tencent.mm.plugin.finder.live.plugin.na naVar4 = liveStartUIC3.W;
                    if (naVar4 != null) {
                        naVar4.K0(8);
                    }
                }
                com.tencent.mm.plugin.finder.live.plugin.f10 f10Var = liveStartUIC3.f409617i0;
                if (f10Var != null) {
                    f10Var.K0(0);
                }
                com.tencent.mm.plugin.finder.live.plugin.c4 c4Var3 = liveStartUIC3.N;
                if (c4Var3 != null) {
                    c4Var3.F1();
                }
                com.tencent.mm.plugin.finder.live.plugin.t8 t8Var2 = liveStartUIC3.U;
                if (t8Var2 != null) {
                    t8Var2.t1();
                }
                if (pm0.v.z(((mm2.c1) liveStartUIC3.c(mm2.c1.class)).f328807g2, 32)) {
                    fm2.a aVar3 = liveStartUIC3.f19595c;
                    if (aVar3 != null) {
                        java.lang.String str2 = ((mm2.c1) liveStartUIC3.c(mm2.c1.class)).f328852o;
                        java.lang.String string = liveStartUIC3.f19594b.getResources().getString(com.tencent.mm.R.string.dod);
                        kotlin.jvm.internal.o.f(string, "getString(...)");
                        aVar3.showTipWithBlurBg(str2, string);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.t8 t8Var3 = liveStartUIC3.U;
                    if (t8Var3 != null) {
                        com.tencent.mars.xlog.Log.i(t8Var3.f114355q, "hide!");
                        t8Var3.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.v6 v6Var5 = liveStartUIC3.f409639y;
                    if (v6Var5 != null) {
                        v6Var5.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var3 = liveStartUIC3.f409637w;
                    if (ga0Var3 != null) {
                        ga0Var3.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.r60 r60Var3 = liveStartUIC3.f409636v;
                    if (r60Var3 != null) {
                        r60Var3.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.ow owVar4 = liveStartUIC3.f409635u;
                    if (owVar4 != null) {
                        owVar4.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.mg mgVar4 = liveStartUIC3.f409628o;
                    if (mgVar4 != null) {
                        mgVar4.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.w00 w00Var3 = liveStartUIC3.f409634t;
                    if (w00Var3 != null) {
                        w00Var3.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.a5 a5Var4 = liveStartUIC3.f409640z;
                    if (a5Var4 != null) {
                        a5Var4.K0(8);
                    }
                    qn2.n nVar3 = liveStartUIC3.C;
                    if (nVar3 != null) {
                        nVar3.K0(8);
                    }
                    my2.k0 k0Var3 = liveStartUIC3.E;
                    if (k0Var3 != null) {
                        k0Var3.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.c4 c4Var4 = liveStartUIC3.N;
                    if (c4Var4 != null) {
                        c4Var4.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.t20 t20Var3 = liveStartUIC3.f409613g0;
                    if (t20Var3 != null) {
                        t20Var3.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.w60 w60Var2 = liveStartUIC3.f409615h0;
                    if (w60Var2 != null) {
                        w60Var2.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.v70 v70Var4 = liveStartUIC3.L;
                    if (v70Var4 != null) {
                        v70Var4.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.na naVar5 = liveStartUIC3.W;
                    if (naVar5 != null) {
                        naVar5.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.r30 r30Var3 = liveStartUIC3.X;
                    if (r30Var3 != null) {
                        r30Var3.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.f8 f8Var3 = liveStartUIC3.f409605a0;
                    if (f8Var3 != null) {
                        f8Var3.K0(8);
                    }
                    fm2.a aVar4 = liveStartUIC3.f19595c;
                    if (aVar4 != null) {
                        qo0.c.a(aVar4, qo0.b.P3, null, 2, null);
                    }
                } else if (pm0.v.z(((mm2.c1) liveStartUIC3.c(mm2.c1.class)).f328807g2, 65536)) {
                    com.tencent.mm.plugin.finder.live.plugin.c4 c4Var5 = liveStartUIC3.N;
                    java.lang.String w17 = c4Var5 != null ? c4Var5.w1(15) : null;
                    r45.xm1 xm1Var = (r45.xm1) ((mm2.c1) liveStartUIC3.c(mm2.c1.class)).f328821i4.get(15);
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).Xj(ml2.h5.f327524e, "", 0, w17, xm1Var != null ? xm1Var.getString(2) : null, xm1Var != null ? xm1Var.getString(1) : null);
                    java.lang.String string2 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_SING_SONG_NAME") : null;
                    java.lang.String string3 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_LINK_USERNAME") : null;
                    java.lang.String string4 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_LINK_NICKNAME") : null;
                    java.lang.String string5 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_LINK_AVATAR") : null;
                    com.tencent.mars.xlog.Log.i(liveStartUIC3.f409610f, "UI_STATE_GIFT targetUsername:" + string3 + " targetNickname:" + string4 + " targetAvatar:" + string5);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(string3)) {
                        com.tencent.mm.plugin.finder.live.plugin.lj ljVar = new com.tencent.mm.plugin.finder.live.plugin.lj(string3, string4, string5);
                        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = liveStartUIC3.f409607c0;
                        if (hmVar != null) {
                            com.tencent.mm.plugin.finder.live.plugin.hm.T1(hmVar, ljVar, string2, null, 4, null);
                        }
                    } else if (com.tencent.mm.sdk.platformtools.t8.K0(string2)) {
                        com.tencent.mm.plugin.finder.live.plugin.hm hmVar2 = liveStartUIC3.f409607c0;
                        if (hmVar2 != null) {
                            com.tencent.mm.plugin.finder.live.plugin.hm.T1(hmVar2, null, null, null, 7, null);
                        }
                    } else {
                        com.tencent.mm.plugin.finder.live.plugin.hm hmVar3 = liveStartUIC3.f409607c0;
                        if (hmVar3 != null) {
                            com.tencent.mm.plugin.finder.live.plugin.hm.T1(hmVar3, null, string2, null, 5, null);
                        }
                    }
                }
                rl2.i iVar = (rl2.i) ((jz5.n) ((com.tencent.mm.feature.finder.live.v4) i95.n0.c(com.tencent.mm.feature.finder.live.v4.class)).f66997u).getValue();
                java.lang.String liveId = java.lang.String.valueOf(((mm2.e1) liveStartUIC3.c(mm2.e1.class)).f328988r.getLong(0));
                iVar.getClass();
                kotlin.jvm.internal.o.g(liveId, "liveId");
                android.database.Cursor B = iVar.f397198e.B("select *, rowid from FinderLiveLastRewardInfo where liveId = '" + liveId + '\'', null);
                ce2.j jVar = new ce2.j();
                if (B.moveToFirst()) {
                    jVar.convertFrom(B);
                }
                B.close();
                if (!(jVar.systemRowid != -1)) {
                    jVar = null;
                }
                if (jVar != null) {
                    r45.s62 s62Var = new r45.s62();
                    s62Var.parseFrom(jVar.field_lastRewardInfo);
                    java.util.LinkedList list = s62Var.getList(0);
                    if (list != null) {
                        linkedList = list;
                    }
                }
                if (linkedList != null) {
                    ((mm2.c1) liveStartUIC3.c(mm2.c1.class)).f328832k5.clear();
                    ((mm2.c1) liveStartUIC3.c(mm2.c1.class)).f328832k5.addAll(linkedList);
                }
                com.tencent.mm.plugin.finder.live.plugin.v3 v3Var4 = getLiveEndUIC().f409449g;
                if (v3Var4 != null) {
                    v3Var4.K0(8);
                }
            }
        }
        super.applyState(i17, z17, i18, z18, bundle);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void bindData(km2.m data) {
        kotlin.jvm.internal.o.g(data, "data");
        super.bindData(data);
        java.lang.String str = this.f116726h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindData liveData.isLiveStarted():");
        sb6.append(((mm2.c1) business(mm2.c1.class)).a8());
        sb6.append(" liveMicSetting:");
        ya2.b2 b2Var = ((mm2.c1) business(mm2.c1.class)).J4;
        sb6.append(b2Var != null ? java.lang.Long.valueOf(b2Var.field_liveMicSetting) : null);
        sb6.append(" liveMicSettingSwitch:");
        ya2.b2 b2Var2 = ((mm2.c1) business(mm2.c1.class)).J4;
        sb6.append(b2Var2 != null ? java.lang.Long.valueOf(b2Var2.field_liveMicSettingSwitch) : null);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        if (in0.q.f292769b2 == null) {
            in0.q.f292769b2 = new in0.q(rn0.a.f397609a.a());
        }
        in0.q qVar = in0.q.f292769b2;
        kotlin.jvm.internal.o.d(qVar);
        setLiveCore(qVar);
        in0.q liveCore = getLiveCore();
        if (liveCore != null) {
            liveCore.z0(1);
        }
        getLivePrepareUIC().i(this);
        getLiveStartUIC().i(this);
        getLiveEndUIC().i(this);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void callbackSEIData(int i17, r45.fa4 fa4Var) {
        fm2.a aVar;
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        ch2.o2 o2Var;
        sm2.o4 liveStartUIC = getLiveStartUIC();
        if (liveStartUIC == null || i17 != 35 || fa4Var == null || (aVar = liveStartUIC.f19595c) == null || (data = aVar.getData()) == null || (liveRoomControllerStore = data.f309131f) == null || (o2Var = (ch2.o2) liveRoomControllerStore.controller(ch2.o2.class)) == null) {
            return;
        }
        o2Var.A7(fa4Var);
    }

    @Override // fm2.a, com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    public int getLiveRole() {
        return 1;
    }

    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    public int getRelativeLayoutId() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3896v).getValue()).r()).intValue() == 0 ? com.tencent.mm.R.layout.anh : com.tencent.mm.R.layout.f488852er1;
    }

    public final java.lang.String getTAG() {
        return this.f116726h;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public tn0.w0 getTRTCLiveCore() {
        return getLiveCore();
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void mount() {
        super.mount();
        kotlin.jvm.internal.o.e(getLiveCore(), "null cannot be cast to non-null type com.tencent.mm.live.core.core.anchor.LiveAnchorTRTCCore");
        no0.h hVar = no0.h.f338720a;
        hVar.c(name(), this.f116727i);
        hVar.d(name(), this.f116728m);
        gm0.j1.n().f273288b.a(3582, this);
        gm0.j1.n().f273288b.a(3917, this);
        gm0.j1.n().f273288b.a(3861, this);
        gm0.j1.n().f273288b.a(3603, this);
        ((we2.s) business(we2.s.class)).O6();
    }

    @Override // to0.a
    public java.lang.String name() {
        return com.tencent.mm.plugin.finder.live.view.v1.class.getSimpleName();
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public boolean notifySEIMicUserChange(org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, org.json.JSONObject jSONObject3, boolean z17, jz5.l lVar) {
        boolean notifySEIMicUserChange = super.notifySEIMicUserChange(jSONObject, jSONObject2, jSONObject3, z17, lVar);
        if (notifySEIMicUserChange) {
            pm0.v.X(new com.tencent.mm.plugin.finder.live.view.u1(this));
        }
        return notifySEIMicUserChange;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void onAcceptBattleTimeout() {
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, no0.g
    public void onAcceptLiveMic(no0.a info) {
        kotlin.jvm.internal.o.g(info, "info");
        getLiveStartUIC().getClass();
        if (info.f338714o) {
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            ml2.k1 k1Var = ml2.k1.f327638e;
            j0Var.Bj(13, info.f338701b);
        }
        com.tencent.mars.xlog.Log.i(this.f116726h, "onAcceptLiveMic info:" + info);
    }

    @Override // mk2.a
    public void onAcceptMicNewPkTimeout(java.lang.String str) {
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        qf2.v0 v0Var;
        com.tencent.mars.xlog.Log.i(this.f116726h, "accept new pk mic timeout, will auto cancel. curLinkUser:" + ((mm2.o4) business(mm2.o4.class)).l7() + ", userName: " + str);
        sm2.o4 liveStartUIC = getLiveStartUIC();
        fm2.a aVar = liveStartUIC.f19595c;
        if (aVar == null || (data = aVar.getData()) == null || (liveRoomControllerStore = data.f309131f) == null || (v0Var = (qf2.v0) liveRoomControllerStore.controller(qf2.v0.class)) == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        qf2.v0.e7(v0Var, str, false, false, new sm2.a3(liveStartUIC), 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x005d, code lost:
    
        r1 = r3.getValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
    
        if (r3.m() == true) goto L20;
     */
    @Override // com.tencent.mm.plugin.finder.live.view.k0, mk2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAcceptMicTimeout(java.lang.String r11) {
        /*
            r10 = this;
            java.lang.String r0 = r10.f116726h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "accept mic timeout, will auto cancel. curLinkUser:"
            r1.<init>(r2)
            java.lang.Class<mm2.o4> r2 = mm2.o4.class
            androidx.lifecycle.c1 r2 = r10.business(r2)
            mm2.o4 r2 = (mm2.o4) r2
            km2.q r2 = r2.l7()
            r1.append(r2)
            java.lang.String r2 = " micId:"
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            sm2.o4 r2 = r10.getLiveStartUIC()
            java.lang.Class<mm2.o4> r0 = mm2.o4.class
            androidx.lifecycle.c1 r0 = r2.c(r0)
            mm2.o4 r0 = (mm2.o4) r0
            java.util.Map r0 = r0.f329328w
            java.lang.String r1 = "<get-audienceLinkMicUserTempMap>(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            monitor-enter(r0)
            java.util.Set r1 = r0.entrySet()     // Catch: java.lang.Throwable -> Lb0
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Lb0
        L43:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> Lb0
            if (r3 == 0) goto L63
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> Lb0
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r4 = r3.getValue()     // Catch: java.lang.Throwable -> Lb0
            km2.q r4 = (km2.q) r4     // Catch: java.lang.Throwable -> Lb0
            java.lang.String r4 = r4.f309175f     // Catch: java.lang.Throwable -> Lb0
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.D0(r4, r11)     // Catch: java.lang.Throwable -> Lb0
            if (r4 == 0) goto L43
            java.lang.Object r1 = r3.getValue()     // Catch: java.lang.Throwable -> Lb0
            monitor-exit(r0)
            goto L65
        L63:
            monitor-exit(r0)
            r1 = 0
        L65:
            r3 = r1
            km2.q r3 = (km2.q) r3
            java.lang.String r0 = r2.f409610f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "onAcceptMicTimeout micId: "
            r1.<init>(r4)
            r1.append(r11)
            java.lang.String r11 = " micUser: "
            r1.append(r11)
            r1.append(r3)
            java.lang.String r11 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r11)
            r11 = 0
            if (r3 == 0) goto L8e
            boolean r0 = r3.m()
            r1 = 1
            if (r0 != r1) goto L8e
            goto L8f
        L8e:
            r1 = r11
        L8f:
            if (r1 == 0) goto Laf
            androidx.appcompat.app.AppCompatActivity r0 = r2.f19594b
            r1 = 2131764206(0x7f1023ee, float:1.9159539E38)
            java.lang.String r1 = r0.getString(r1)
            android.widget.Toast r11 = db5.t7.makeText(r0, r1, r11)
            r11.show()
            r4 = 3
            r5 = 0
            r6 = 0
            sm2.b3 r7 = new sm2.b3
            r7.<init>(r2)
            r8 = 12
            r9 = 0
            sm2.o4.H(r2, r3, r4, r5, r6, r7, r8, r9)
        Laf:
            return
        Lb0:
            r11 = move-exception
            monitor-exit(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.v1.onAcceptMicTimeout(java.lang.String):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 1005) {
            if (i18 == -1) {
                ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
                ml2.k5 k5Var = ml2.j0.f327583i.T;
                if (intent == null) {
                    k5Var.f327667n++;
                    return;
                }
                k5Var.getClass();
                java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("SendMsgUsernames");
                if (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) {
                    k5Var.f327667n++;
                    return;
                } else {
                    k5Var.f327667n += stringArrayListExtra.size();
                    return;
                }
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

    @Override // com.tencent.mm.plugin.finder.live.view.k0, mk2.a
    public void onApplyBattleTimeout() {
        sm2.o4 liveStartUIC = getLiveStartUIC();
        fm2.a aVar = liveStartUIC.f19595c;
        if (aVar != null) {
            qo0.c.a(aVar, qo0.b.f365446z4, null, 2, null);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.G;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.k1 k1Var = ml2.k1.f327638e;
        jSONObject.putOpt("type", 6);
        dk2.u4 u4Var = ((mm2.o4) liveStartUIC.c(mm2.o4.class)).Z;
        jSONObject.putOpt("result", u4Var != null ? u4Var.f234154a : null);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
    }

    @Override // mk2.a
    public void onApplyMicNewPkTimeout(java.lang.String str) {
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        qf2.v0 v0Var;
        com.tencent.mars.xlog.Log.i(this.f116726h, "apply new pk mic timeout, will auto cancel. curLinkUser:" + ((mm2.o4) business(mm2.o4.class)).l7() + ", userName: " + str);
        fm2.a aVar = getLiveStartUIC().f19595c;
        if (aVar == null || (data = aVar.getData()) == null || (liveRoomControllerStore = data.f309131f) == null || (v0Var = (qf2.v0) liveRoomControllerStore.controller(qf2.v0.class)) == null) {
            return;
        }
        if (str == null) {
            str = "";
        }
        qf2.v0.e7(v0Var, str, false, false, null, 14, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public boolean onBackPress() {
        org.json.JSONObject jSONObject;
        boolean onBackPress = super.onBackPress();
        if (!onBackPress) {
            int i17 = ((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) business(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117047h;
            long j17 = ((com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice) business(com.tencent.mm.plugin.finder.live.viewmodel.data.business.LiveAnchorSlice.class)).f117048i;
            if (i17 == 0 || j17 == 0) {
                jSONObject = null;
            } else {
                jSONObject = new org.json.JSONObject();
                jSONObject.put("entrance_type", i17);
                jSONObject.put("entrance_id", j17);
                mm2.g1 g1Var = (mm2.g1) business(mm2.g1.class);
                java.lang.Integer num = g1Var.f329082w;
                java.lang.Long l17 = g1Var.f329083x;
                java.lang.String str = g1Var.f329084y;
                if (num != null && l17 != null && str != null) {
                    long longValue = l17.longValue();
                    jSONObject.put("strategy_id", num.intValue());
                    jSONObject.put("guide_live_id", longValue);
                    jSONObject.put("guide_finderusername", str);
                }
            }
            if (jSONObject != null) {
                jSONObject.put("display_mode", ((r45.aa0) ((kotlinx.coroutines.flow.h3) ((mm2.e1) business(mm2.e1.class)).E).getValue()).f369868d);
            }
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f327325e;
            zy2.zb.j5(zbVar, 13L, jSONObject != null ? jSONObject.toString() : null, null, 4, null);
            ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            j0Var.nj(ml2.j0.f327583i.f328285J);
        }
        return onBackPress;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r1.g() == true) goto L13;
     */
    @Override // no0.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBattleApply() {
        /*
            r5 = this;
            sm2.o4 r0 = r5.getLiveStartUIC()
            fm2.a r1 = r0.f19595c
            if (r1 == 0) goto Lf
            qo0.b r2 = qo0.b.f365417t4
            r3 = 2
            r4 = 0
            qo0.c.a(r1, r2, r4, r3, r4)
        Lf:
            com.tencent.mm.plugin.finder.live.plugin.x7 r0 = r0.M
            if (r0 == 0) goto L33
            java.lang.Class<mm2.o4> r1 = mm2.o4.class
            androidx.lifecycle.c1 r1 = r0.P0(r1)
            mm2.o4 r1 = (mm2.o4) r1
            dk2.u4 r1 = r1.Z
            if (r1 == 0) goto L27
            boolean r1 = r1.g()
            r2 = 1
            if (r1 != r2) goto L27
            goto L28
        L27:
            r2 = 0
        L28:
            if (r2 == 0) goto L33
            int r1 = r0.w0()
            if (r1 != 0) goto L33
            r0.C1()
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.v1.onBattleApply():void");
    }

    @Override // no0.g
    public void onBattleClose() {
        fm2.a aVar = getLiveStartUIC().f19595c;
        if (aVar != null) {
            qo0.c.a(aVar, qo0.b.f365429w4, null, 2, null);
        }
    }

    @Override // no0.g
    public void onBattleDismiss() {
        com.tencent.mm.plugin.finder.live.plugin.na naVar = getLiveStartUIC().W;
        if (naVar != null) {
            naVar.B1();
        }
    }

    @Override // no0.g
    public void onBattleEnd() {
        sm2.o4 liveStartUIC = getLiveStartUIC();
        fm2.a aVar = liveStartUIC.f19595c;
        if (aVar != null) {
            qo0.c.a(aVar, qo0.b.f365425v4, null, 2, null);
        }
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.z4 z4Var = ml2.z4.G;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.k1 k1Var = ml2.k1.f327638e;
        jSONObject.putOpt("type", 7);
        dk2.u4 u4Var = ((mm2.o4) liveStartUIC.c(mm2.o4.class)).Z;
        jSONObject.putOpt("result", u4Var != null ? u4Var.f234154a : null);
        zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
    }

    @Override // no0.g
    public void onBattleStart() {
        sm2.o4 liveStartUIC = getLiveStartUIC();
        liveStartUIC.getClass();
        mk2.h hVar = mk2.h.f327133a;
        com.tencent.mars.xlog.Log.i("Finder.LinkMicTimeoutTimer", "stopApplyBattleTimer");
        com.tencent.mm.sdk.platformtools.u3.l(mk2.h.f327138f);
        fm2.a aVar = liveStartUIC.f19595c;
        if (aVar != null) {
            qo0.c.a(aVar, qo0.b.f365421u4, null, 2, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00af, code lost:
    
        if (pm0.v.F(r1) == false) goto L24;
     */
    @Override // com.tencent.mm.live.view.BaseLivePluginLayout
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCallStateChanged(int r24, java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 658
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.v1.onCallStateChanged(int, java.lang.String):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, no0.g
    public void onCloseLiveMic(no0.f info) {
        kotlin.jvm.internal.o.g(info, "info");
        sm2.o4 liveStartUIC = getLiveStartUIC();
        liveStartUIC.getClass();
        km2.q l76 = ((mm2.o4) liveStartUIC.c(mm2.o4.class)).l7();
        java.lang.String str = liveStartUIC.f409610f;
        if (l76 == null || !com.tencent.mm.sdk.platformtools.t8.D0(l76.f309175f, info.f338717c)) {
            com.tencent.mars.xlog.Log.i(str, "close mic. info:" + info + " liveData.business(LiveCommonSlice::class.java).audienceLinkMicUserList:" + ((mm2.o4) liveStartUIC.c(mm2.o4.class)).f329327v);
            java.util.List list = ((mm2.o4) liveStartUIC.c(mm2.o4.class)).f329327v;
            kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
            pm0.v.G(list, new sm2.e3(info));
            java.util.List list2 = ((mm2.o4) liveStartUIC.c(mm2.o4.class)).f329335z;
            kotlin.jvm.internal.o.f(list2, "<get-linkMicUserInfoList>(...)");
            pm0.v.G(list2, new sm2.f3(info));
            fm2.a aVar = liveStartUIC.f19595c;
            if (aVar != null) {
                in0.q qVar = liveStartUIC.f19597e;
                cl0.g gVar = qVar != null ? qVar.T1 : null;
                org.json.JSONObject J2 = qVar != null ? qVar.J() : null;
                in0.q qVar2 = liveStartUIC.f19597e;
                com.tencent.mm.plugin.finder.live.view.k0.notifySEIMicUserChange$default(aVar, gVar, J2, qVar2 != null ? qVar2.W0() : null, false, null, 24, null);
            }
            com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = liveStartUIC.N;
            if (c4Var != null) {
                c4Var.E1();
            }
        } else {
            com.tencent.mars.xlog.Log.i(str, "close mic pk. curLinkUser:" + l76);
            if (l76.f309177h) {
                java.util.List list3 = ((mm2.o4) liveStartUIC.c(mm2.o4.class)).f329324s;
                kotlin.jvm.internal.o.d(list3);
                kz5.h0.C(list3);
                zn0.x.f474414a.i(null);
                ((mm2.o4) liveStartUIC.c(mm2.o4.class)).X6();
                com.tencent.mars.xlog.Log.i(str, "notifyUIAfterCloseLinkPk audienceLinkMicUserList=" + ((mm2.o4) liveStartUIC.c(mm2.o4.class)).f329327v);
                kotlin.jvm.internal.o.f(((mm2.o4) liveStartUIC.c(mm2.o4.class)).f329327v, "<get-audienceLinkMicUserList>(...)");
                if (!r1.isEmpty()) {
                    fm2.a aVar2 = liveStartUIC.f19595c;
                    if (aVar2 != null) {
                        aVar2.setLastPkMicUser(null);
                    }
                    fm2.a aVar3 = liveStartUIC.f19595c;
                    if (aVar3 != null) {
                        in0.q qVar3 = liveStartUIC.f19597e;
                        cl0.g gVar2 = qVar3 != null ? qVar3.T1 : null;
                        org.json.JSONObject J3 = qVar3 != null ? qVar3.J() : null;
                        in0.q qVar4 = liveStartUIC.f19597e;
                        com.tencent.mm.plugin.finder.live.view.k0.notifySEIMicUserChange$default(aVar3, gVar2, J3, qVar4 != null ? qVar4.W0() : null, false, null, 24, null);
                    }
                }
                com.tencent.mm.plugin.finder.live.plugin.c4 c4Var2 = liveStartUIC.N;
                if (c4Var2 != null) {
                    c4Var2.E1();
                }
                ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(ml2.q2.f327832s, "", -1, -1);
                i95.m c17 = i95.n0.c(ml2.j0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                zy2.zb zbVar = (zy2.zb) c17;
                ml2.z4 z4Var = ml2.z4.G;
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                ml2.k1 k1Var = ml2.k1.f327638e;
                jSONObject.putOpt("type", 8);
                jSONObject.putOpt("result", 0);
                zy2.zb.y6(zbVar, z4Var, jSONObject.toString(), null, 4, null);
            }
        }
        com.tencent.mars.xlog.Log.i(this.f116726h, "onCloseLiveMic info:" + info);
    }

    @Override // no0.g
    public void onCloseLiveMicNotify() {
        com.tencent.mm.plugin.finder.live.plugin.na naVar = getLiveStartUIC().W;
        if (naVar != null) {
            naVar.v1();
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0
    public void onLiveEventCallback(int i17, android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(this.f116726h, "sdk callback errorCode:" + i17);
        getLiveStartUIC().F(i17, bundle);
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, mk2.a
    public void onRandomMatchTimeout() {
        com.tencent.mars.xlog.Log.i(this.f116726h, "random match mic timeout, will auto cancel. curLinkState:" + ((mm2.o4) business(mm2.o4.class)).D);
        sm2.o4 liveStartUIC = getLiveStartUIC();
        if (((mm2.o4) liveStartUIC.c(mm2.o4.class)).D) {
            liveStartUIC.q(new sm2.v3(liveStartUIC));
        }
    }

    @Override // no0.g
    public void onRandomMicAccept(r45.ch1 appMsg, r45.ij1 info) {
        r45.xn1 xn1Var;
        kotlin.jvm.internal.o.g(appMsg, "appMsg");
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.i(this.f116726h, "onRandomNewMicAccept info:" + info);
        sm2.o4 liveStartUIC = getLiveStartUIC();
        liveStartUIC.getClass();
        r45.yt4 yt4Var = (r45.yt4) info.getCustom(0);
        if (yt4Var == null || (xn1Var = (r45.xn1) yt4Var.getCustom(0)) == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRandomMicAccept: new accept anchor link mic pk. nickName: ");
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
        sb6.append(finderContact != null ? finderContact.getNickname() : null);
        com.tencent.mars.xlog.Log.i(liveStartUIC.f409610f, sb6.toString());
        ((mm2.o4) liveStartUIC.c(mm2.o4.class)).R7(false);
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = liveStartUIC.L;
        if (v70Var != null) {
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
            v70Var.y1(finderContact2 != null ? finderContact2.getHeadUrl() : null);
        }
        mk2.h.f327133a.f();
        pm0.v.V(4000L, new sm2.w3(liveStartUIC, xn1Var));
    }

    @Override // no0.g
    public void onRandomMicApply(r45.kj1 info) {
        km2.m data;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore;
        qf2.v0 v0Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        kotlin.jvm.internal.o.g(info, "info");
        sm2.o4 liveStartUIC = getLiveStartUIC();
        liveStartUIC.getClass();
        r45.xn1 xn1Var = (r45.xn1) info.getCustom(0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRandomMicApply: apply anchor link mic pk. toContact.username:");
        sb6.append((xn1Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact2.getUsername());
        sb6.append(", toContact.nickname:");
        sb6.append((xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getNickname());
        com.tencent.mars.xlog.Log.i(liveStartUIC.f409610f, sb6.toString());
        if (xn1Var != null) {
            ((mm2.o4) liveStartUIC.c(mm2.o4.class)).R7(false);
            com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = liveStartUIC.L;
            if (v70Var != null) {
                com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
                v70Var.y1(finderContact3 != null ? finderContact3.getHeadUrl() : null);
            }
            mk2.h.f327133a.f();
            fm2.a aVar = liveStartUIC.f19595c;
            if (aVar == null || (data = aVar.getData()) == null || (liveRoomControllerStore = data.f309131f) == null || (v0Var = (qf2.v0) liveRoomControllerStore.controller(qf2.v0.class)) == null) {
                return;
            }
            qf2.v0.c7(v0Var, xn1Var, info, 1, null, null, null, 56, null);
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i(this.f116726h, "onSceneEnd errType:" + i17 + ", errCode:" + i18 + ", scene:" + m1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    @Override // com.tencent.mm.plugin.finder.live.view.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void release() {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.v1.release():void");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void resume() {
        com.tencent.mm.plugin.finder.live.plugin.ep0 ep0Var;
        super.resume();
        sm2.o4 liveStartUIC = getLiveStartUIC();
        ((we2.w) liveStartUIC.c(we2.w.class)).N6();
        com.tencent.mm.plugin.finder.live.plugin.c6 c6Var = liveStartUIC.f409609e0;
        if (c6Var != null) {
            c6Var.onResume();
        }
        com.tencent.mm.plugin.finder.live.plugin.r60 r60Var = liveStartUIC.f409636v;
        if (r60Var == null || (ep0Var = r60Var.f114100u) == null) {
            return;
        }
        ep0Var.onResume();
    }

    public final void setTAG(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.f116726h = str;
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void start() {
        super.start();
        sm2.o4 liveStartUIC = getLiveStartUIC();
        liveStartUIC.f409623l0 = ((mm2.c1) liveStartUIC.c(mm2.c1.class)).f328925z2;
        liveStartUIC.O(false);
        if (((mm2.c1) liveStartUIC.c(mm2.c1.class)).a8()) {
            com.tencent.mm.sdk.platformtools.b4 b4Var = liveStartUIC.f409621k0;
            b4Var.d();
            b4Var.c(1000L, 1000L);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        if (r3 != 122) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout, qo0.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void statusChange(qo0.b r21, android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.view.v1.statusChange(qo0.b, android.os.Bundle):void");
    }

    @Override // com.tencent.mm.plugin.finder.live.view.k0, com.tencent.mm.live.view.BaseLivePluginLayout
    public void stop() {
        super.stop();
        getLiveStartUIC().t();
    }
}
