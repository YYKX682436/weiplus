package um2;

/* loaded from: classes3.dex */
public final class e4 implements com.tencent.mm.plugin.finder.live.view.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f428779c;

    public e4(um2.x5 x5Var, fm2.c cVar, r45.qt2 qt2Var) {
        this.f428777a = x5Var;
        this.f428778b = cVar;
        this.f428779c = qt2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.plugin.finder.live.view.g
    public void a(qo0.b status, android.os.Bundle bundle) {
        int i17;
        java.lang.String str;
        fm2.c cVar;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        jz5.f0 f0Var = null;
        if (ordinal != 41) {
            if (ordinal == 48) {
                um2.x5 x5Var = this.f428777a;
                com.tencent.mm.plugin.finder.live.plugin.w00 w00Var = x5Var.R0;
                if (w00Var == null) {
                    w00Var = new com.tencent.mm.plugin.finder.live.plugin.w00((android.view.ViewGroup) x5Var.e(com.tencent.mm.R.id.f9c, this.f428778b), this.f428778b, this.f428779c);
                }
                x5Var.R0 = w00Var;
                com.tencent.mm.plugin.finder.live.plugin.w00 w00Var2 = this.f428777a.R0;
                if (w00Var2 != null) {
                    w00Var2.K0(8);
                }
                com.tencent.mm.plugin.finder.live.plugin.w00 w00Var3 = this.f428777a.R0;
                if (w00Var3 != null) {
                    w00Var3.z0();
                    return;
                }
                return;
            }
            if (ordinal == 82) {
                um2.x5 x5Var2 = this.f428777a;
                fm2.c cVar2 = x5Var2.f19606c;
                if (cVar2 != null) {
                    com.tencent.mm.plugin.finder.live.plugin.ty tyVar = x5Var2.f429087x0;
                    androidx.appcompat.app.AppCompatActivity appCompatActivity = x5Var2.f19605b;
                    if (tyVar == null) {
                        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type android.app.Activity");
                        android.view.ViewGroup viewGroup = (android.view.ViewGroup) (((com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) appCompatActivity.findViewById(com.tencent.mm.R.id.f484854fq1)).getIsPresentedInTimeLineUI() ? appCompatActivity.findViewById(com.tencent.mm.R.id.fs6) : appCompatActivity.findViewById(com.tencent.mm.R.id.evz));
                        zl2.u4 u4Var = !com.tencent.mm.ui.bk.C() ? zl2.u4.f473989e : zl2.u4.f473988d;
                        zl2.w4 w4Var = zl2.w4.f474017a;
                        android.view.LayoutInflater layoutInflater = appCompatActivity.getLayoutInflater();
                        kotlin.jvm.internal.o.f(layoutInflater, "getLayoutInflater(...)");
                        i17 = com.tencent.mm.R.id.f484854fq1;
                        str = "getLayoutInflater(...)";
                        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) w4Var.b(com.tencent.mm.R.layout.dam, viewGroup, false, u4Var, appCompatActivity, layoutInflater);
                        if (viewGroup != null) {
                            viewGroup.addView(viewGroup2);
                        }
                        com.tencent.mm.plugin.finder.live.plugin.ty tyVar2 = new com.tencent.mm.plugin.finder.live.plugin.ty(viewGroup2, u4Var, cVar2);
                        x5Var2.f429087x0 = tyVar2;
                        tyVar2.K0(8);
                        com.tencent.mm.plugin.finder.live.plugin.ty tyVar3 = x5Var2.f429087x0;
                        if (tyVar3 != null) {
                            tyVar3.z0();
                        }
                    } else {
                        i17 = com.tencent.mm.R.id.f484854fq1;
                        str = "getLayoutInflater(...)";
                    }
                    if (x5Var2.f429089y0 == null && ((mm2.e1) x5Var2.c(mm2.e1.class)).b7()) {
                        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type android.app.Activity");
                        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) appCompatActivity.findViewById(((com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) appCompatActivity.findViewById(i17)).getIsPresentedInTimeLineUI() ? com.tencent.mm.R.id.fs6 : com.tencent.mm.R.id.evz);
                        zl2.u4 u4Var2 = !com.tencent.mm.ui.bk.C() ? zl2.u4.f473989e : zl2.u4.f473988d;
                        zl2.w4 w4Var2 = zl2.w4.f474017a;
                        android.view.LayoutInflater layoutInflater2 = appCompatActivity.getLayoutInflater();
                        kotlin.jvm.internal.o.f(layoutInflater2, str);
                        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) w4Var2.b(com.tencent.mm.R.layout.dxu, viewGroup3, false, u4Var2, appCompatActivity, layoutInflater2);
                        if (viewGroup3 != null) {
                            viewGroup3.addView(viewGroup4);
                        }
                        com.tencent.mm.plugin.finder.live.plugin.iv ivVar = new com.tencent.mm.plugin.finder.live.plugin.iv(viewGroup4, u4Var2, cVar2);
                        x5Var2.f429089y0 = ivVar;
                        ivVar.K0(8);
                        com.tencent.mm.plugin.finder.live.plugin.iv ivVar2 = x5Var2.f429089y0;
                        if (ivVar2 != null) {
                            ivVar2.z0();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (ordinal == 84 || ordinal == 88) {
                um2.x5 x5Var3 = this.f428777a;
                androidx.appcompat.app.AppCompatActivity appCompatActivity2 = x5Var3.f19605b;
                kotlin.jvm.internal.o.e(appCompatActivity2, "null cannot be cast to non-null type android.app.Activity");
                fm2.c cVar3 = this.f428778b;
                if (!(cVar3 instanceof com.tencent.mm.plugin.finder.live.view.k0)) {
                    cVar3 = null;
                }
                um2.h6.b(x5Var3, appCompatActivity2, cVar3 != null ? (android.view.ViewGroup) cVar3.findViewById(com.tencent.mm.R.id.f484853fq0) : null);
                return;
            }
            if (ordinal != 127) {
                if (ordinal == 145) {
                    um2.x5 x5Var4 = this.f428777a;
                    if (x5Var4.f429030e0 == null) {
                        boolean z17 = ((mm2.c1) x5Var4.c(mm2.c1.class)).T;
                        boolean z18 = ((mm2.n0) this.f428777a.c(mm2.n0.class)).f329273r;
                        um2.x5 x5Var5 = this.f428777a;
                        x5Var5.f429030e0 = (z17 || z18) ? new qn2.n((android.view.ViewGroup) x5Var5.e(com.tencent.mm.R.id.enm, this.f428778b), this.f428778b) : new qn2.i0((android.view.ViewGroup) x5Var5.e(com.tencent.mm.R.id.fpn, this.f428778b), this.f428778b);
                        qn2.z zVar = this.f428777a.f429030e0;
                        if (zVar != null) {
                            zVar.K0(8);
                        }
                        qn2.z zVar2 = this.f428777a.f429030e0;
                        if (zVar2 != null) {
                            zVar2.z0();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (ordinal == 188) {
                    um2.x5 x5Var6 = this.f428777a;
                    if (x5Var6.J0 != null || (cVar = this.f428778b) == null) {
                        return;
                    }
                    com.tencent.mm.plugin.finder.live.plugin.oc ocVar = (com.tencent.mm.plugin.finder.live.plugin.oc) x5Var6.X(new um2.d4(cVar));
                    x5Var6.J0 = ocVar;
                    if (ocVar != null) {
                        ocVar.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.oc ocVar2 = x5Var6.J0;
                    if (ocVar2 != null) {
                        ocVar2.z0();
                        return;
                    }
                    return;
                }
                if (ordinal == 212) {
                    um2.x5 x5Var7 = this.f428777a;
                    if (x5Var7.Q0 == null) {
                        x5Var7.Q0 = new com.tencent.mm.plugin.finder.live.plugin.oi((android.view.ViewGroup) x5Var7.e(com.tencent.mm.R.id.ey7, this.f428778b), this.f428778b, null, 4, null);
                        com.tencent.mm.plugin.finder.live.plugin.oi oiVar = this.f428777a.Q0;
                        if (oiVar != null) {
                            oiVar.K0(8);
                        }
                        com.tencent.mm.plugin.finder.live.plugin.oi oiVar2 = this.f428777a.Q0;
                        if (oiVar2 != null) {
                            oiVar2.z0();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (ordinal == 70) {
                    um2.x5 x5Var8 = this.f428777a;
                    if (x5Var8.S == null) {
                        x5Var8.S = new com.tencent.mm.plugin.finder.live.plugin.hm((android.view.ViewGroup) this.f428777a.e(com.tencent.mm.R.id.f1i, this.f428778b), this.f428778b, null, 4, null);
                        com.tencent.mm.plugin.finder.live.plugin.hm hmVar = this.f428777a.S;
                        if (hmVar != null) {
                            hmVar.K0(8);
                        }
                        com.tencent.mm.plugin.finder.live.plugin.hm hmVar2 = this.f428777a.S;
                        if (hmVar2 != null) {
                            hmVar2.z0();
                            return;
                        }
                        return;
                    }
                    return;
                }
                if (ordinal != 71) {
                    return;
                }
                um2.x5 x5Var9 = this.f428777a;
                if (x5Var9.S == null) {
                    x5Var9.S = new com.tencent.mm.plugin.finder.live.plugin.hm((android.view.ViewGroup) this.f428777a.e(com.tencent.mm.R.id.f1i, this.f428778b), this.f428778b, null, 4, null);
                    com.tencent.mm.plugin.finder.live.plugin.hm hmVar3 = this.f428777a.S;
                    if (hmVar3 != null) {
                        hmVar3.K0(8);
                    }
                    com.tencent.mm.plugin.finder.live.plugin.hm hmVar4 = this.f428777a.S;
                    if (hmVar4 != null) {
                        hmVar4.z0();
                    }
                }
                java.lang.String string = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_SING_SONG_MID") : null;
                java.lang.Boolean valueOf = bundle != null ? java.lang.Boolean.valueOf(bundle.getBoolean("PARAM_FINDER_LIVE_SING_SONG_ONLY_SEGMENT")) : null;
                java.lang.String string2 = bundle != null ? bundle.getString("PARAM_FINDER_LIVE_SING_SONG_UNIQUE_ADD_ID") : null;
                if ((string == null || string.length() == 0) != false && valueOf == null) {
                    if (string2 == null || string2.length() == 0) {
                        return;
                    }
                }
                com.tencent.mm.plugin.finder.live.plugin.hm hmVar5 = this.f428777a.S;
                if (hmVar5 != null) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    if (string != null) {
                        bundle2.putString("PARAM_FINDER_LIVE_SING_SONG_MID", string);
                    }
                    if (valueOf != null) {
                        bundle2.putBoolean("PARAM_FINDER_LIVE_SING_SONG_ONLY_SEGMENT", valueOf.booleanValue());
                    }
                    if (string2 != null) {
                        bundle2.putString("PARAM_FINDER_LIVE_SING_SONG_UNIQUE_ADD_ID", string2);
                    }
                    hmVar5.E1 = bundle2;
                    return;
                }
                return;
            }
        }
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f428777a.f429086x;
        if (etVar != null) {
            etVar.U1();
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.w(this.f428777a.f429032f, "cannot get inputPlugin");
        }
    }
}
