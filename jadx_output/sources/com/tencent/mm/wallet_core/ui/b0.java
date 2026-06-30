package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.autogen.mmdata.rpt.WalletAutoReportStruct f214112a = null;

    /* renamed from: b, reason: collision with root package name */
    public static java.lang.String f214113b = "";

    /* renamed from: c, reason: collision with root package name */
    public static int f214114c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f214115d = "";

    /* renamed from: e, reason: collision with root package name */
    public static java.util.Stack f214116e;

    public static java.lang.String a() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(f214113b)) {
            f214113b = java.util.UUID.randomUUID().toString();
        }
        return f214113b;
    }

    public static java.lang.CharSequence b(android.view.View view) {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        for (int i17 = 0; i17 < viewGroup.getChildCount(); i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            if (childAt instanceof android.view.ViewGroup) {
                java.lang.String charSequence = b((android.view.ViewGroup) childAt).toString();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) {
                    return charSequence;
                }
            } else if (childAt instanceof android.widget.TextView) {
                java.lang.String charSequence2 = ((android.widget.TextView) childAt).getText().toString();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(charSequence2)) {
                    return charSequence2;
                }
            } else if (childAt instanceof android.widget.Button) {
                java.lang.String charSequence3 = ((android.widget.Button) childAt).getText().toString();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(charSequence3)) {
                    return charSequence3;
                }
            } else {
                continue;
            }
        }
        return "";
    }

    public static void c(java.lang.String str) {
        if (f214116e == null) {
            f214116e = new java.util.Stack();
        }
        java.util.Stack stack = f214116e;
        if (stack.size() == 0) {
            f214113b = "";
            f214114c = 0;
            f214112a = null;
            f214116e.clear();
            f(1, 1, "[Begin]" + str, "");
        }
        stack.push(str);
        f(2, 1, str, "");
    }

    public static void d(java.lang.String str) {
        if (f214116e == null) {
            f214116e = new java.util.Stack();
        }
        java.util.Stack stack = f214116e;
        if (stack.size() > 0) {
            stack.pop();
        }
        if (stack.size() == 0) {
            f(1, 2, "[End]" + str, "");
            stack.clear();
        }
    }

    public static void e(android.view.View view) {
        if (view == null) {
            return;
        }
        java.lang.String charSequence = view instanceof android.widget.Button ? ((android.widget.Button) view).getText().toString() : view instanceof android.widget.TextView ? ((android.widget.TextView) view).getText().toString() : view instanceof android.widget.ImageView ? "ImageView" : view instanceof android.view.ViewGroup ? ((java.lang.String) b(view)).toString() : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(charSequence)) {
            return;
        }
        f(3, 1, charSequence, "");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void f(int i17, int i18, java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletAutoReportUtil", " isOpenAutoReport ：%s", java.lang.Boolean.TRUE);
        if ((str.equals("MallIndexUIv2") || str.equals("cgi_1679") || str.equals("cgi_4362") || str.equals("cgi_1501") || str.equals("WalletOfflineEntranceUI") || str.equals("WalletOfflineCoinPurseUI") || str.equals("cgi_1742") || str.equals("cgi_1645") || str.equals("cgi_568") || str.equals("cgi_571") || str.equals("cgi_385") || str.equals("cgi_1725")) ? false : true) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                if (str.contains(",")) {
                    str = str.replaceAll(",", "+").trim();
                }
                if (str.contains("，")) {
                    str = str.replaceAll("，", "+").trim();
                }
            }
            if (f214112a == null) {
                f214112a = new com.tencent.mm.autogen.mmdata.rpt.WalletAutoReportStruct();
            }
            com.tencent.mm.autogen.mmdata.rpt.WalletAutoReportStruct walletAutoReportStruct = f214112a;
            walletAutoReportStruct.f62211d = i17;
            walletAutoReportStruct.f62212e = walletAutoReportStruct.b("SessionId", a(), true);
            java.lang.String str4 = f214115d;
            f214115d = str;
            walletAutoReportStruct.f62214g = walletAutoReportStruct.b("URL", str4 + "/" + str, true);
            walletAutoReportStruct.f62215h = walletAutoReportStruct.b("ReportTimeStamp", java.lang.String.valueOf(java.lang.System.currentTimeMillis()), true);
            walletAutoReportStruct.f62216i = (long) i18;
            walletAutoReportStruct.f62217j = walletAutoReportStruct.b("ExtInfo", str2, true);
            int i19 = f214114c + 1;
            f214114c = i19;
            walletAutoReportStruct.f62213f = i19;
            walletAutoReportStruct.k();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("KindaNativeLog.type: ");
            java.lang.String str5 = "UseCase";
            switch (i17) {
                case 1:
                    str3 = "UseCase";
                    break;
                case 2:
                    str3 = "UIPage";
                    break;
                case 3:
                    str3 = "View";
                    break;
                case 4:
                    str3 = "Dialog";
                    break;
                case 5:
                    str3 = "Cgi";
                    break;
                case 6:
                    str3 = "SystemEvent";
                    break;
                default:
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletAutoReportUtil", "unknow type：%s", java.lang.Integer.valueOf(i17));
                    str3 = "UseCase";
                    break;
            }
            sb6.append(str3);
            sb6.append("\nKindaNativeLog.sessionID: ");
            sb6.append(f214113b);
            sb6.append("\nKindaNativeLog.url: ");
            sb6.append(str);
            sb6.append("\nKindaNativeLog.action: ");
            switch (i17) {
                case 1:
                    if (i18 == 1) {
                        str5 = "StartUseCase";
                        break;
                    } else if (i18 == 2) {
                        str5 = "EndUseCase";
                        break;
                    } else {
                        if (i18 != 3) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletAutoReportUtil", "unknow action：%s", java.lang.Integer.valueOf(i18));
                        }
                        str5 = "ClearedAllUseCase";
                        break;
                    }
                case 2:
                    if (i18 == 1) {
                        str5 = "ShowUIPage";
                        break;
                    } else {
                        if (i18 != 2) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletAutoReportUtil", "unknow action：%s", java.lang.Integer.valueOf(i18));
                        }
                        str5 = "DimissUIPage";
                        break;
                    }
                case 3:
                    if (i18 == 1) {
                        str5 = "ClicKView";
                        break;
                    } else {
                        if (i18 != 2) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletAutoReportUtil", "unknow action：%s", java.lang.Integer.valueOf(i18));
                        }
                        str5 = "ShowView";
                        break;
                    }
                case 4:
                    if (i18 == 1) {
                        str5 = "ShowDialog";
                        break;
                    } else {
                        if (i18 != 2) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletAutoReportUtil", "unknow action：%s", java.lang.Integer.valueOf(i18));
                        }
                        str5 = "ClickDialogButton";
                        break;
                    }
                case 5:
                    if (i18 == 1) {
                        str5 = "StartCgi";
                        break;
                    } else {
                        if (i18 != 2) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletAutoReportUtil", "unknow action：%s", java.lang.Integer.valueOf(i18));
                        }
                        str5 = "EndCgi";
                        break;
                    }
                case 6:
                    str5 = "Terminate";
                    switch (i18) {
                        case 1:
                            str5 = "EnterBackground";
                            break;
                        case 2:
                            str5 = "EnterForeground";
                            break;
                        case 3:
                            str5 = "BecomeActive";
                            break;
                        case 4:
                            str5 = "ResignActive";
                            break;
                        case 5:
                            str5 = "MemoryWarning";
                            break;
                        case 6:
                            break;
                        case 7:
                            str5 = "NetworkChange";
                            break;
                        default:
                            com.tencent.mars.xlog.Log.i("MicroMsg.WalletAutoReportUtil", "unknow action：%s", java.lang.Integer.valueOf(i18));
                            break;
                    }
                default:
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletAutoReportUtil", "unknow type：%s", java.lang.Integer.valueOf(i17));
                    break;
            }
            sb6.append(str5);
            sb6.append("\nKindaNativeLog.sequence: ");
            sb6.append(f214114c);
            sb6.append("\nKindaNativeLog.ext: ");
            sb6.append(str2);
            sb6.append("\n");
            com.tencent.mars.xlog.Log.i("MicroMsg.WalletAutoReportUtil", "KindaNativeLog reportString :%s", sb6.toString());
        }
    }

    public static void g(int i17) {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_auto_report_cgi_config, false);
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletAutoReportUtil", " isOpenCgiReport ：%s", java.lang.Boolean.valueOf(fj6));
        if (fj6) {
            f(5, 1, "cgi_" + i17, "");
        }
    }
}
