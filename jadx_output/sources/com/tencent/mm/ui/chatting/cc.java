package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class cc {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f198524e;

    /* renamed from: f, reason: collision with root package name */
    public static final char[] f198525f;

    /* renamed from: g, reason: collision with root package name */
    public static final java.lang.String[] f198526g;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f198527a;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f198529c;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f198528b = null;

    /* renamed from: d, reason: collision with root package name */
    public float f198530d = 1.0f;

    static {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<img id=\"%s\" src=\"%s\" height=\"100\" onclick=\"");
        com.tencent.mm.sdk.platformtools.i6 i6Var = com.tencent.mm.pluginsdk.ui.tools.e9.f191608a;
        if (com.tencent.mm.sdk.platformtools.t8.K0("weixin://img_onclick/") || com.tencent.mm.sdk.platformtools.t8.K0("this.id + '@@' + this.src")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebViewUtil", "genJsCode fail, invalid argument, scheme = %s, jsCode = %s", "weixin://img_onclick/", "this.id + '@@' + this.src");
            str = null;
        } else {
            str = "document.getElementById('_edw_iframe_').src = 'weixin://img_onclick/' + this.id + '@@' + this.src";
        }
        sb6.append(str);
        sb6.append("\"></img>");
        f198524e = sb6.toString();
        f198525f = new char[]{'<', '>', '\"', '\'', '&', '\n'};
        f198526g = new java.lang.String[]{"&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "<br />"};
    }

    public cc(android.content.Context context, java.util.List list, com.tencent.mm.storage.z3 z3Var) {
        this.f198529c = null;
        this.f198527a = context;
        this.f198529c = z3Var;
    }

    public static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return "";
        }
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        int length = str.length();
        for (int i17 = 0; i17 < length; i17++) {
            char charAt = str.charAt(i17);
            char[] cArr = f198525f;
            boolean z17 = true;
            int length2 = cArr.length - 1;
            while (true) {
                if (length2 < 0) {
                    break;
                }
                if (cArr[length2] == charAt) {
                    stringBuffer.append(f198526g[length2]);
                    z17 = false;
                    break;
                }
                length2--;
            }
            if (z17) {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    public final java.lang.String a(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        if (com.tencent.mm.storage.z3.R4(this.f198529c.d1())) {
            java.lang.String j17 = f9Var.j();
            int t17 = c01.w9.t(j17);
            if (t17 != -1) {
                java.lang.String trim = j17.substring(0, t17).trim();
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                str = c01.a2.e(trim);
            } else {
                str = null;
            }
        } else {
            java.lang.String Q0 = f9Var.Q0();
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            str = c01.a2.e(Q0);
        }
        if (f9Var.A0() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QQMailHistoryExporter", "isSend");
            str = c01.z1.l();
        }
        return "" + str + "  " + new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(f9Var.getCreateTime()));
    }

    public final java.lang.String c(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String format;
        int t17;
        boolean g37 = f9Var.g3();
        android.content.Context context = this.f198527a;
        if (g37) {
            format = java.lang.String.format("[%s]", context.getString(com.tencent.mm.R.string.buf));
        } else if (f9Var.k3()) {
            format = f9Var.A0() == 1 ? context.getString(com.tencent.mm.R.string.bud) : context.getString(com.tencent.mm.R.string.buc);
        } else if (f9Var.L2()) {
            com.tencent.mm.autogen.events.LocationServerEvent locationServerEvent = new com.tencent.mm.autogen.events.LocationServerEvent();
            am.ej ejVar = locationServerEvent.f54481g;
            ejVar.f6559a = 1;
            ejVar.f6561c = f9Var;
            locationServerEvent.e();
            format = java.lang.String.format("[%s]", locationServerEvent.f54482h.f6680a);
        } else if (f9Var.k2()) {
            java.lang.String j17 = f9Var.j();
            if (com.tencent.mm.storage.z3.R4(this.f198529c.d1()) && (t17 = c01.w9.t(f9Var.j())) != -1) {
                j17 = f9Var.j().substring(t17 + 1).trim();
            }
            ot0.q v17 = ot0.q.v(j17);
            if (v17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.QQMailHistoryExporter", "appmsg content is null");
                format = java.lang.String.format("[%s]", context.getString(com.tencent.mm.R.string.bu6));
            } else {
                lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                java.lang.String str = v17.f348646d;
                ((kt.c) i0Var).getClass();
                com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
                java.lang.String Vi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Vi(context, h17, (h17 == null || com.tencent.mm.sdk.platformtools.t8.K0(h17.field_appName)) ? v17.H : h17.field_appName);
                if (f9Var.q2()) {
                    format = com.tencent.mm.sdk.platformtools.t8.K0(Vi) ? b(v17.f348654f) : java.lang.String.format("[%s: %s]", Vi, b(v17.f348654f));
                } else {
                    boolean o27 = f9Var.o2();
                    java.lang.String str2 = f198524e;
                    if (o27) {
                        java.lang.String a17 = com.tencent.mm.ui.chatting.eb.a(f9Var, v17);
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(a17)) {
                            java.lang.String str3 = "file://" + a17;
                            com.tencent.mm.vfs.z7 a18 = com.tencent.mm.vfs.z7.a(a17);
                            java.lang.String str4 = a18.f213279f;
                            if (str4 != null) {
                                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str4, false, false);
                                if (!str4.equals(l17)) {
                                    a18 = new com.tencent.mm.vfs.z7(a18.f213277d, a18.f213278e, l17, a18.f213280g, a18.f213281h);
                                }
                            }
                            java.lang.String str5 = a18.f213279f;
                            int lastIndexOf = str5.lastIndexOf("/");
                            if (lastIndexOf >= 0) {
                                str5 = str5.substring(lastIndexOf + 1);
                            }
                            format = java.lang.String.format(str2, str5, str3, a17);
                        }
                        format = "";
                    } else {
                        int i17 = v17.f348666i;
                        if (i17 != 8) {
                            if (i17 != 130) {
                                switch (i17) {
                                    case 1:
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(Vi)) {
                                            format = java.lang.String.format("[%s: %s]", Vi, b(v17.f348654f));
                                            break;
                                        } else {
                                            format = b(v17.f348654f);
                                            break;
                                        }
                                    case 2:
                                        java.lang.String a19 = com.tencent.mm.ui.chatting.eb.a(f9Var, v17);
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(a19)) {
                                            java.lang.String str6 = "file://" + a19;
                                            com.tencent.mm.vfs.z7 a27 = com.tencent.mm.vfs.z7.a(a19);
                                            java.lang.String str7 = a27.f213279f;
                                            if (str7 != null) {
                                                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str7, false, false);
                                                if (!str7.equals(l18)) {
                                                    a27 = new com.tencent.mm.vfs.z7(a27.f213277d, a27.f213278e, l18, a27.f213280g, a27.f213281h);
                                                }
                                            }
                                            java.lang.String str8 = a27.f213279f;
                                            int lastIndexOf2 = str8.lastIndexOf("/");
                                            if (lastIndexOf2 >= 0) {
                                                str8 = str8.substring(lastIndexOf2 + 1);
                                            }
                                            format = java.lang.String.format(str2, str8, str6, a19);
                                            break;
                                        }
                                        format = "";
                                        break;
                                    case 3:
                                        if (!com.tencent.mm.sdk.platformtools.t8.K0(v17.f348658g)) {
                                            format = java.lang.String.format("[%s: %s-%s]", context.getString(com.tencent.mm.R.string.bub), b(v17.f348654f), b(v17.f348658g));
                                            break;
                                        } else {
                                            format = java.lang.String.format("[%s: %s]", context.getString(com.tencent.mm.R.string.bub), b(v17.f348654f));
                                            break;
                                        }
                                    case 4:
                                    case 5:
                                        format = java.lang.String.format("[%s: %s]", b(v17.f348654f), b(v17.f348674k));
                                        break;
                                    case 6:
                                        break;
                                    default:
                                        format = java.lang.String.format("[%s]", context.getString(com.tencent.mm.R.string.bu6));
                                        break;
                                }
                            }
                            format = com.tencent.mm.sdk.platformtools.t8.K0(v17.f348658g) ? java.lang.String.format("[%s: %s]", context.getString(com.tencent.mm.R.string.bu_), b(v17.n())) : java.lang.String.format("[%s: %s-%s(%s)]", context.getString(com.tencent.mm.R.string.bu_), b(v17.n()), b(v17.f348658g), context.getString(com.tencent.mm.R.string.bu7));
                        } else {
                            format = java.lang.String.format("[%s]", context.getString(com.tencent.mm.R.string.bu9));
                        }
                    }
                }
            }
        } else if (f9Var.E2()) {
            format = java.lang.String.format("[%s: %s]", context.getString(com.tencent.mm.R.string.bu8), ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(f9Var.j()).f196359b);
        } else if (f9Var.isVideo()) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.bue);
            com.tencent.mm.vfs.z7 a28 = com.tencent.mm.vfs.z7.a(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false));
            java.lang.String str9 = a28.f213279f;
            if (str9 != null) {
                java.lang.String l19 = com.tencent.mm.vfs.e8.l(str9, false, false);
                if (!str9.equals(l19)) {
                    a28 = new com.tencent.mm.vfs.z7(a28.f213277d, a28.f213278e, l19, a28.f213280g, a28.f213281h);
                }
            }
            java.lang.String str10 = a28.f213279f;
            int lastIndexOf3 = str10.lastIndexOf("/");
            if (lastIndexOf3 >= 0) {
                str10 = str10.substring(lastIndexOf3 + 1);
            }
            format = java.lang.String.format("[%s: %s(%s)]", string, str10, context.getString(com.tencent.mm.R.string.bu7));
        } else {
            format = (f9Var.C2() || f9Var.m2()) ? java.lang.String.format("[%s]", context.getString(com.tencent.mm.R.string.bu9)) : null;
        }
        return java.lang.String.format("<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", java.lang.Float.valueOf(this.f198530d), a(f9Var), java.lang.Float.valueOf(this.f198530d), format);
    }
}
