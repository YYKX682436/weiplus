package hz2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final hz2.d f286313a = new hz2.d();

    public final boolean a(java.lang.String business) {
        kotlin.jvm.internal.o.g(business, "business");
        int b17 = b(business);
        com.tencent.mars.xlog.Log.i("Finder.FinderSpamLogic", "checkFunctionSpam function spam action:" + b17 + " business:" + business);
        if (b17 == 0) {
            return false;
        }
        m(c(business));
        jx3.f.INSTANCE.idkeyStat(1264L, 3L, 1L, false);
        com.tencent.mars.xlog.Log.i("Finder.FinderSpamLogic", "function spam ".concat(business));
        return true;
    }

    public final int b(java.lang.String business) {
        kotlin.jvm.internal.o.g(business, "business");
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderSpamObject");
        com.tencent.mars.xlog.Log.i("Finder.FinderSpamLogic", "getFunctionSpamAction " + d17);
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            return 0;
        }
        try {
            return new cl0.g(d17).b(business).optInt("action", 0);
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("Finder.FinderSpamLogic", "getFunctionSpamAction spamValue " + d17);
            return 0;
        }
    }

    public final java.lang.String c(java.lang.String business) {
        kotlin.jvm.internal.o.g(business, "business");
        java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderSpamObject");
        if (com.tencent.mm.sdk.platformtools.t8.K0(d17)) {
            return "";
        }
        try {
            java.lang.String optString = new cl0.g(d17).b(business).optString("tip", "");
            kotlin.jvm.internal.o.f(optString, "optString(...)");
            return optString;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.i("Finder.FinderSpamLogic", "getFunctionSpamTip spamValue " + d17);
            return "";
        }
    }

    public final void d(int i17, int i18, java.lang.String str) {
        if (i17 == 4 && i18 == -4010) {
            if (str != null) {
                f286313a.m(str);
            }
            jx3.f.INSTANCE.idkeyStat(1264L, 4L, 1L, false);
        }
    }

    public final void e(int i17, int i18, java.lang.String str) {
        if (i17 == 4) {
            if ((i18 == -5300 || i18 == -5000) && str != null) {
                f286313a.m(str);
            }
        }
    }

    public final void f(int i17, int i18, java.lang.String str) {
        if (i17 == 4 && i18 == -4013 && str != null) {
            f286313a.m(str);
            com.tencent.mm.autogen.events.FinderCommentErrorEvent finderCommentErrorEvent = new com.tencent.mm.autogen.events.FinderCommentErrorEvent();
            am.ua uaVar = finderCommentErrorEvent.f54264g;
            uaVar.f8068a = i18;
            uaVar.f8069b = str;
            finderCommentErrorEvent.e();
        }
    }

    public final void g(int i17, int i18, java.lang.String str) {
        if (i17 == 4 && i18 == -4005) {
            if (str != null) {
                f286313a.m(str);
            }
            jx3.f.INSTANCE.idkeyStat(1264L, 5L, 1L, false);
        }
    }

    public final void h(int i17, int i18, java.lang.String str) {
        if (i17 == 4) {
            if (i18 == -5800) {
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.ctn);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                m(string);
                return;
            }
            hz2.d dVar = f286313a;
            if (i18 == -4017) {
                if (str != null) {
                    dVar.m(str);
                }
                jx3.f.INSTANCE.idkeyStat(1264L, 2L, 1L, false);
            } else if (i18 == -5002) {
                if (str != null) {
                    dVar.o(str);
                }
                jx3.f.INSTANCE.idkeyStat(1264L, 1L, 1L, false);
            } else if (i18 == -5001) {
                if (str != null) {
                    dVar.n(str);
                }
                jx3.f.INSTANCE.idkeyStat(1264L, 1L, 1L, false);
            } else if (i18 == -4007) {
                if (str != null) {
                    dVar.m(str);
                }
                jx3.f.INSTANCE.idkeyStat(1264L, 1L, 1L, false);
            } else if (i18 == -4006) {
                if (str != null) {
                    dVar.m(str);
                }
                jx3.f.INSTANCE.idkeyStat(1264L, 0L, 1L, false);
            }
        }
    }

    public final void i(int i17, int i18, java.lang.String str) {
        if (i17 == 4 && i18 == -4019) {
            if (str != null) {
                f286313a.m(str);
            }
            jx3.f.INSTANCE.idkeyStat(1264L, 6L, 1L, false);
        }
    }

    public final boolean j(int i17, int i18, r45.qp1 qp1Var) {
        if (i17 != 4) {
            return false;
        }
        if (i18 != -200046) {
            switch (i18) {
                case -200012:
                case -200011:
                case -200010:
                case -200009:
                case -200008:
                    break;
                default:
                    return false;
            }
        }
        if (qp1Var == null) {
            return false;
        }
        int integer = qp1Var.getInteger(0);
        if (integer == 1) {
            hz2.d dVar = f286313a;
            java.lang.String string = qp1Var.getString(1);
            dVar.m(string != null ? string : "");
        } else {
            if (integer != 3) {
                return false;
            }
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            java.lang.String string2 = qp1Var.getString(1);
            db5.t7.m(context, string2 != null ? string2 : "");
        }
        return true;
    }

    public final void k(android.content.Context context, int i17, int i18, cl0.g gVar) {
        if (i17 == 1) {
            return;
        }
        java.lang.String optString = gVar.a("link_h5").optString("link");
        cl0.g a17 = gVar.a("toast_config");
        java.lang.String optString2 = a17.optString("msg");
        java.lang.String optString3 = a17.optString("cancel");
        java.lang.String optString4 = a17.optString("confirm");
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
        u1Var.g(optString2);
        u1Var.a(true);
        u1Var.j(optString3);
        u1Var.n(optString4);
        u1Var.b(new hz2.a(optString, i18, context));
        u1Var.q(false);
    }

    public final void l(android.content.Context context, int i17, int i18, cl0.g gVar) {
        cl0.g b17 = gVar.b("link_lite_app");
        if (b17 == null) {
            return;
        }
        java.lang.String optString = b17.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID);
        java.lang.String optString2 = b17.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_PAGE);
        java.lang.String optString3 = b17.optString("query");
        java.lang.String optString4 = b17.optString("default_url");
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f460472a;
        kotlin.jvm.internal.o.d(optString);
        kotlin.jvm.internal.o.d(optString2);
        kotlin.jvm.internal.o.d(optString3);
        kotlin.jvm.internal.o.d(optString4);
        e1Var.K(context, optString, optString2, optString3, optString4);
    }

    public final void m(java.lang.String errMsg) {
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll());
        u1Var.g(errMsg);
        u1Var.m(com.tencent.mm.R.string.l_e);
        u1Var.a(true);
        u1Var.l(hz2.b.f286310a);
        u1Var.q(false);
    }

    public final void n(java.lang.String str) {
        android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
        try {
            com.tencent.mars.xlog.Log.i("Finder.FinderSpamLogic", "[showSpamDialogWithH5] json = " + str);
            cl0.g gVar = new cl0.g(str);
            java.lang.String optString = gVar.optString("msg");
            java.lang.String optString2 = gVar.optString("cancel");
            java.lang.String optString3 = gVar.optString("confirm");
            java.lang.String optString4 = gVar.optString("confirm_link");
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(ll6);
            u1Var.g(optString);
            u1Var.a(true);
            u1Var.j(optString2);
            u1Var.n(optString3);
            u1Var.b(new hz2.c(optString4, ll6));
            u1Var.q(false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderSpamLogic", "[showSpamDialogWithH5] catch exception:" + e17.getMessage());
        }
    }

    public final void o(java.lang.String str) {
        android.content.Context ll6 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).ll();
        try {
            com.tencent.mars.xlog.Log.i("Finder.FinderSpamLogic", "[showSpamDialogWithJumpErrMsg] json = " + str);
            cl0.g gVar = new cl0.g(str);
            int i17 = gVar.getInt("show_type");
            int i18 = gVar.getInt("link_type");
            hz2.d dVar = f286313a;
            if (i18 == 1) {
                dVar.k(ll6, i17, i18, gVar);
            } else if (i18 == 2) {
                dVar.l(ll6, i17, i18, gVar);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i("Finder.FinderSpamLogic", "[showSpamDialogWithJumpErrMsg] catch exception:" + e17.getMessage());
        }
    }
}
