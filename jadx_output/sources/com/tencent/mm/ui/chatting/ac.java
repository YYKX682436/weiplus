package com.tencent.mm.ui.chatting;

/* loaded from: classes8.dex */
public class ac {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f198373a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f198374b;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.storage.z3 f198376d;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f198375c = null;

    /* renamed from: e, reason: collision with root package name */
    public final java.text.SimpleDateFormat f198377e = new java.text.SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f198378f = null;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f198379g = new java.util.ArrayList();

    public ac(android.content.Context context, java.util.List list, com.tencent.mm.storage.z3 z3Var) {
        this.f198376d = null;
        this.f198373a = context;
        this.f198374b = list;
        this.f198376d = z3Var;
    }

    public final java.lang.String a(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String str;
        if (com.tencent.mm.storage.z3.R4(this.f198376d.d1())) {
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
            com.tencent.mars.xlog.Log.i("MicroMsg.OtherMailHistoryExporter", "isSend");
            str = c01.z1.l();
        }
        return "" + str + "  " + new java.text.SimpleDateFormat("HH:mm").format(new java.util.Date(f9Var.getCreateTime()));
    }

    public java.lang.String b() {
        java.lang.String f27;
        java.lang.String format;
        java.lang.String str;
        java.lang.String str2;
        int i17;
        java.lang.String str3;
        java.util.List<com.tencent.mm.storage.f9> list = this.f198374b;
        list.size();
        java.lang.String str4 = this.f198378f;
        if (str4 != null) {
            return str4;
        }
        java.util.ArrayList arrayList = this.f198379g;
        arrayList.clear();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.storage.z3 z3Var = this.f198376d;
        boolean R4 = com.tencent.mm.storage.z3.R4(z3Var.d1());
        android.content.Context context = this.f198373a;
        java.lang.String str5 = null;
        if (R4) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(z3Var.P0())) {
                qy.i iVar = (qy.i) i95.n0.c(qy.i.class);
                java.lang.String d17 = z3Var.d1();
                ((py.a) iVar).getClass();
                java.lang.String str6 = "";
                for (java.lang.String str7 : c01.v1.m(d17)) {
                    ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                    str6 = str6 + c01.a2.e(str7) + ", ";
                }
                f27 = str6.substring(0, str6.length() - 2);
            } else {
                f27 = z3Var.f2();
            }
            format = java.lang.String.format(context.getString(com.tencent.mm.R.string.ihx), f27);
        } else {
            format = java.lang.String.format(context.getString(com.tencent.mm.R.string.ihy), z3Var.f2(), c01.d9.b().p().l(4, null));
        }
        sb6.append(format);
        sb6.append("\n\n");
        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
        java.lang.String str8 = "share_mail_export";
        com.tencent.mm.vfs.r6 h07 = lp0.b.h0("share_mail_export");
        if (h07.m()) {
            com.tencent.mm.vfs.w6.f(h07.o());
        }
        h07.J();
        for (com.tencent.mm.storage.f9 f9Var : list) {
            java.lang.String str9 = this.f198375c;
            java.text.SimpleDateFormat simpleDateFormat = this.f198377e;
            if (str9 == null) {
                java.lang.String format2 = simpleDateFormat.format(new java.util.Date(f9Var.getCreateTime()));
                this.f198375c = format2;
                sb6.append(java.lang.String.format("—————  %s  —————\n\n", format2));
                sb6.append("\n");
            } else {
                java.lang.String format3 = simpleDateFormat.format(new java.util.Date(f9Var.getCreateTime()));
                if (!format3.equals(this.f198375c)) {
                    this.f198375c = format3;
                    sb6.append(java.lang.String.format("—————  %s  —————\n\n", format3));
                    sb6.append("\n");
                }
            }
            if (f9Var.b3()) {
                if (f9Var.b3()) {
                    if (f9Var.A0() == 1) {
                        str = java.lang.String.format("%s\n\n%s\n\n", a(f9Var), f9Var.j());
                    } else if (com.tencent.mm.storage.z3.R4(z3Var.d1())) {
                        int t17 = c01.w9.t(f9Var.j());
                        if (t17 != -1) {
                            str = java.lang.String.format("%s\n\n%s\n\n", a(f9Var), f9Var.j().substring(t17 + 1).trim());
                        }
                    } else {
                        str = java.lang.String.format("%s\n\n%s\n\n", a(f9Var), f9Var.j());
                    }
                    sb6.append(str);
                }
                str = str5;
                sb6.append(str);
            } else {
                if (f9Var.J2()) {
                    if (f9Var.J2()) {
                        long msgId = f9Var.getMsgId();
                        str2 = str8;
                        long I0 = f9Var.I0();
                        java.lang.String c17 = com.tencent.mm.ui.chatting.eb.c(f9Var.Q0(), msgId, true);
                        if (com.tencent.mm.sdk.platformtools.t8.K0(c17) || !com.tencent.mm.vfs.w6.j(c17)) {
                            c17 = com.tencent.mm.ui.chatting.eb.d(f9Var.Q0(), I0, true);
                        }
                        if (!com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(c17);
                            if (!r6Var.getName().endsWith(com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG)) {
                                com.tencent.mm.vfs.r7 r7Var2 = com.tencent.mm.vfs.q7.f213141a;
                                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(lp0.b.h0(str2), r6Var.getName() + com.tencent.kinda.framework.widget.tools.ResourcesUtils.JPG);
                                com.tencent.mm.vfs.w6.c(c17, r6Var2.o());
                                r6Var = r6Var2;
                            }
                            arrayList.add(com.tencent.mm.sdk.platformtools.i1.b(context, r6Var));
                            str3 = java.lang.String.format("%s\n\n%s\n\n", a(f9Var), java.lang.String.format("[%s: %s(%s)]", context.getString(com.tencent.mm.R.string.bua), r6Var.getName(), context.getString(com.tencent.mm.R.string.bu7)));
                            sb6.append(str3);
                        }
                    } else {
                        str2 = str8;
                    }
                    str3 = null;
                    sb6.append(str3);
                } else {
                    str2 = str8;
                    if (f9Var.k2()) {
                        ot0.q v17 = ot0.q.v(f9Var.j());
                        if (v17 == null || !((i17 = v17.f348666i) == 53 || i17 == 57)) {
                            sb6.append(c(f9Var));
                        } else {
                            sb6.append((i17 == 53 || i17 == 57) ? java.lang.String.format("%s\n\n%s\n\n", a(f9Var), v17.f348654f) : null);
                        }
                    } else {
                        sb6.append(c(f9Var));
                    }
                }
                str8 = str2;
                str5 = null;
            }
        }
        sb6.append("\n\n");
        java.lang.String sb7 = sb6.toString();
        this.f198378f = sb7;
        return sb7;
    }

    public final java.lang.String c(com.tencent.mm.storage.f9 f9Var) {
        java.lang.String format;
        com.tencent.mm.pluginsdk.model.app.d D0;
        boolean g37 = f9Var.g3();
        android.content.Context context = this.f198373a;
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
        } else {
            boolean k27 = f9Var.k2();
            java.util.ArrayList arrayList = this.f198379g;
            if (k27) {
                java.lang.String j17 = f9Var.j();
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                ot0.q v17 = ot0.q.v(j17);
                if (v17 != null) {
                    int i17 = v17.f348666i;
                    if ((i17 == 4 || i17 == 6 || i17 == 130) && (D0 = com.tencent.mm.pluginsdk.model.app.u5.wi().D0(v17.f348694p)) != null) {
                        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(D0.field_fileFullPath);
                        if (r6Var.m()) {
                            arrayList.add(com.tencent.mm.sdk.platformtools.i1.b(context, r6Var));
                        }
                    }
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    java.lang.String str = v17.f348646d;
                    ((kt.c) i0Var).getClass();
                    com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(str);
                    if (h17 == null) {
                        format = "";
                    } else {
                        java.lang.String str2 = h17.field_appName;
                        format = ez.v0.f257777a.j(java.lang.Integer.valueOf(v17.f348666i)) ? java.lang.String.format("[%s: %s(%s)]", context.getString(com.tencent.mm.R.string.bu6), str2, context.getString(com.tencent.mm.R.string.bu7)) : java.lang.String.format("[%s: %s]", context.getString(com.tencent.mm.R.string.bu6), str2);
                    }
                }
                format = null;
            } else if (f9Var.E2()) {
                format = java.lang.String.format("[%s: %s]", context.getString(com.tencent.mm.R.string.bu8), ((com.tencent.mm.storage.g9) c01.d9.b().u()).D3(f9Var.j()).f196359b);
            } else if (f9Var.isVideo()) {
                com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).rj(f9Var, bm5.f0.f22571s, f9Var.z0(), false));
                java.lang.String format2 = java.lang.String.format("[%s: %s(%s)]", context.getString(com.tencent.mm.R.string.bue), r6Var2.getName(), context.getString(com.tencent.mm.R.string.bu7));
                if (r6Var2.m()) {
                    java.lang.String o17 = r6Var2.o();
                    if (!r6Var2.getName().endsWith(".mp4")) {
                        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
                        com.tencent.mm.vfs.r6 r6Var3 = new com.tencent.mm.vfs.r6(lp0.b.h0("share_mail_export"), r6Var2.getName() + ".mp4");
                        com.tencent.mm.vfs.w6.c(o17, r6Var3.o());
                        r6Var2 = r6Var3;
                    }
                    arrayList.add(com.tencent.mm.sdk.platformtools.i1.b(context, r6Var2));
                }
                format = format2;
            } else {
                if (f9Var.C2() || f9Var.m2()) {
                    format = java.lang.String.format("[%s]", context.getString(com.tencent.mm.R.string.bu9));
                }
                format = null;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OtherMailHistoryExporter", "formatOtherMsg, msgStr = %s", format);
        return java.lang.String.format("%s\n\n%s\n\n", a(f9Var), format);
    }
}
