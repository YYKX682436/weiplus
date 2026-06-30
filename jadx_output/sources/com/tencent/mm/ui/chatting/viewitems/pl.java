package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class pl {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.chatting.viewitems.pl f205277a = new com.tencent.mm.ui.chatting.viewitems.pl();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f205278b;

    public static final void a(com.tencent.mm.ui.chatting.viewitems.v1 holder, ot0.q qVar, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.String str = qVar != null ? qVar.f348654f : null;
        if (str == null || r26.n0.N(str)) {
            holder.H.setText("");
            holder.H.setVisibility(8);
            return;
        }
        holder.H.setText(str);
        holder.H.setVisibility(0);
        android.widget.TextView textView = holder.H;
        if (android.text.TextUtils.isEmpty(str) || textView == null) {
            return;
        }
        textView.post(new com.tencent.mm.ui.chatting.viewitems.ol(textView, str));
    }

    public static final boolean e(ot0.q qVar, k91.v5 v5Var, int i17) {
        boolean z17;
        boolean z18;
        int i18;
        if (qVar == null) {
            return false;
        }
        if (v5Var == null) {
            ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
            if (aVar != null && (i18 = aVar.f348362r) > 0) {
                int i19 = i18 & 1;
                int i27 = (i18 >> i17) & 1;
                if (i19 == 1 && i27 == 1) {
                    z17 = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[isShowFlagshipTag] attrs is null, get showFlagshipFlag from AppContentAppBrandPiece showFlagshipFlag:%b", java.lang.Boolean.valueOf(z17));
                }
            }
            z17 = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[isShowFlagshipTag] attrs is null, get showFlagshipFlag from AppContentAppBrandPiece showFlagshipFlag:%b", java.lang.Boolean.valueOf(z17));
        } else {
            ot0.a aVar2 = (ot0.a) qVar.y(ot0.a.class);
            if (v5Var.w0() == null || qVar.A2 <= v5Var.w0().f77444d || aVar2 == null) {
                int i28 = v5Var.u0() != null ? v5Var.u0().f305643r : 0;
                if (i28 > 0) {
                    int i29 = i28 & 1;
                    int i37 = (i28 >> i17) & 1;
                    if (i29 == 1 && i37 == 1) {
                        z17 = true;
                    }
                }
                z17 = false;
            } else {
                int i38 = aVar2.f348362r;
                if (i38 > 0) {
                    int i39 = (i38 >> i17) & 1;
                    if ((i38 & 1) == 1 && i39 == 1) {
                        z18 = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[isShowFlagshipTag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(qVar.A2), java.lang.Integer.valueOf(v5Var.w0().f77444d));
                        z17 = z18;
                    }
                }
                z18 = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[isShowFlagshipTag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(qVar.A2), java.lang.Integer.valueOf(v5Var.w0().f77444d));
                z17 = z18;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[isShowFlagshipTag] use attrs:%b", java.lang.Boolean.valueOf(z17));
        }
        if (z17) {
            return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.wxapp_flagship_store, 0) == 1;
        }
        return false;
    }

    public static final void f() {
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_fake_native_profile, 0) == 1) || f205278b) {
            return;
        }
        ((com.tencent.mm.plugin.appbrand.service.s6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.s6.class)).P4(null, "wx27a2b9eea2cf1a62", "pages/index/index.html", 16);
        f205278b = true;
    }

    public static final boolean g(ot0.q qVar, k91.v5 v5Var, int i17) {
        com.tencent.mm.ui.chatting.viewitems.pl plVar = f205277a;
        return plVar.b(qVar, v5Var, 2) || plVar.b(qVar, v5Var, i17);
    }

    public static final boolean i(ot0.q qVar, k91.v5 v5Var, int i17) {
        ot0.a aVar = qVar != null ? (ot0.a) qVar.y(ot0.a.class) : null;
        boolean z17 = aVar != null && aVar.f348361q;
        return f205277a.h(qVar != null ? qVar.A2 : 0, aVar != null ? aVar.f348360p : 0, z17, v5Var, i17);
    }

    public final boolean b(ot0.q qVar, k91.v5 v5Var, int i17) {
        int i18;
        boolean z17 = false;
        if (qVar == null) {
            return false;
        }
        if (v5Var == null) {
            ot0.a aVar = (ot0.a) qVar.y(ot0.a.class);
            if (aVar != null && (i18 = aVar.f348363s) > 0) {
                int i19 = i18 & 1;
                int i27 = (i18 >> i17) & 1;
                if (i19 == 1 && i27 == 1) {
                    z17 = true;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowFinancialLicenseFlag] attrs is null, get showFinancialLicenseFlag flag from AppContentAppBrandPiece showFinancialLicenseFlag:%b", java.lang.Boolean.valueOf(z17));
        } else {
            ot0.a aVar2 = (ot0.a) qVar.y(ot0.a.class);
            if (v5Var.w0() == null || qVar.A2 <= v5Var.w0().f77444d || aVar2 == null) {
                int i28 = v5Var.u0() != null ? v5Var.u0().f305644s : 0;
                if (i28 > 0) {
                    int i29 = i28 & 1;
                    int i37 = (i28 >> i17) & 1;
                    if (i29 == 1 && i37 == 1) {
                        z17 = true;
                    }
                }
            } else {
                int i38 = aVar2.f348363s;
                if (i38 > 0) {
                    int i39 = (i38 >> i17) & 1;
                    if ((i38 & 1) == 1 && i39 == 1) {
                        z17 = true;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowFinancialLicenseFlag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(qVar.A2), java.lang.Integer.valueOf(v5Var.w0().f77444d));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowFinancialLicenseFlag] use attrs:%b", java.lang.Boolean.valueOf(z17));
        }
        return z17;
    }

    public final boolean c(s05.d dVar, k91.v5 v5Var, int i17) {
        boolean z17 = false;
        if (v5Var == null) {
            int u17 = dVar != null ? dVar.u() : 0;
            if (u17 > 0) {
                int i18 = u17 & 1;
                int i19 = (u17 >> i17) & 1;
                if (i18 == 1 && i19 == 1) {
                    z17 = true;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowFinancialLicenseFlag] attrs is null, get showFinancialLicenseFlag flag from AppContentAppBrandPiece showFinancialLicenseFlag:%b", java.lang.Boolean.valueOf(z17));
        } else {
            int version = dVar != null ? dVar.getVersion() : 0;
            if (v5Var.w0() == null || version <= v5Var.w0().f77444d) {
                k91.j5 u07 = v5Var.u0();
                int i27 = u07 != null ? u07.f305644s : 0;
                if (i27 > 0) {
                    int i28 = i27 & 1;
                    int i29 = (i27 >> i17) & 1;
                    if (i28 == 1 && i29 == 1) {
                        z17 = true;
                    }
                }
            } else {
                int u18 = dVar != null ? dVar.u() : 0;
                if (u18 > 0) {
                    int i37 = u18 & 1;
                    int i38 = (u18 >> i17) & 1;
                    if (i37 == 1 && i38 == 1) {
                        z17 = true;
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowFinancialLicenseFlag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(version), java.lang.Integer.valueOf(v5Var.w0().f77444d));
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowFinancialLicenseFlag] use attrs:%b", java.lang.Boolean.valueOf(z17));
        }
        return z17;
    }

    public final boolean d(int i17, int i18, k91.v5 v5Var, int i19) {
        boolean z17;
        boolean z18;
        if (v5Var == null) {
            if (i18 > 0) {
                int i27 = i18 & 1;
                int i28 = (i18 >> i19) & 1;
                if (i27 == 1 && i28 == 1) {
                    z17 = true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowRelievedBuyFlag] attrs is null, get showRelievedBuy flag from AppContentAppBrandPiece showRelievedBuy:%b", java.lang.Boolean.valueOf(z17));
                }
            }
            z17 = false;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowRelievedBuyFlag] attrs is null, get showRelievedBuy flag from AppContentAppBrandPiece showRelievedBuy:%b", java.lang.Boolean.valueOf(z17));
        } else {
            if (v5Var.w0() == null || i17 <= v5Var.w0().f77444d) {
                int i29 = v5Var.u0() != null ? v5Var.u0().f305642q : 0;
                if (i29 > 0) {
                    int i37 = i29 & 1;
                    int i38 = (i29 >> i19) & 1;
                    if (i37 == 1 && i38 == 1) {
                        z17 = true;
                    }
                }
                z17 = false;
            } else {
                if (i18 > 0) {
                    int i39 = i18 & 1;
                    int i47 = (i18 >> i19) & 1;
                    if (i39 == 1 && i47 == 1) {
                        z18 = true;
                        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowRelievedBuyFlag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(v5Var.w0().f77444d));
                        z17 = z18;
                    }
                }
                z18 = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowRelievedBuyFlag] appbrandVersion:%d, appVersion:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(v5Var.w0().f77444d));
                z17 = z18;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemForAppBrandUtilsKt", "[wantShowRelievedBuyFlag] use attrs:%b", java.lang.Boolean.valueOf(z17));
        }
        return z17 & (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.relievedbuy, 0) == 1);
    }

    public final boolean h(int i17, int i18, boolean z17, k91.v5 v5Var, int i19) {
        boolean d17 = d(i17, i18, v5Var, 2);
        boolean d18 = d(i17, i18, v5Var, i19);
        boolean z18 = i19 == 16;
        if (d17) {
            return true;
        }
        return d18 && (!z18 || z17);
    }
}
