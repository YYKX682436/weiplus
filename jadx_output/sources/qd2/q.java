package qd2;

/* loaded from: classes8.dex */
public class q {
    public static final void a(qd2.q qVar, android.app.Activity context, int i17, r45.j41 j41Var, int i18) {
        qVar.getClass();
        int integer = j41Var.getInteger(3);
        if (integer != 2) {
            if (integer != 3) {
                qVar.f(i17, false, true);
                return;
            } else {
                qVar.f(i17, true, true);
                return;
            }
        }
        r45.m41 m41Var = (r45.m41) j41Var.getCustom(2);
        if (m41Var != null) {
            java.lang.String str = (java.lang.String) qVar.c(m41Var).f302834e;
            kotlin.jvm.internal.o.g(context, "context");
            if (str == null || str.length() == 0) {
                return;
            }
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.n(context, "webview", ".ui.tools.WebViewUI", intent, i18);
        }
    }

    public static /* synthetic */ void e(qd2.q qVar, android.app.Activity activity, int i17, java.lang.String str, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleJumpError");
        }
        if ((i19 & 8) != 0) {
            i18 = 0;
        }
        qVar.d(activity, i17, str, i18);
    }

    public static /* synthetic */ void l(qd2.q qVar, android.app.Activity activity, android.view.View view, java.lang.String str, int i17, int i18, int i19, java.lang.String str2, int i27, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: report");
        }
        qVar.k(activity, view, str, i17, i18, (i27 & 32) != 0 ? 8 : i19, (i27 & 64) != 0 ? null : str2);
    }

    public final ex2.a b(r45.j41 j41Var, com.tencent.mm.ui.widget.dialog.p3 p3Var) {
        return new ex2.a(j41Var.getString(0), j41Var.getInteger(1) == 0 ? 6 : 0, j41Var.getInteger(3) == 1, p3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[Catch: Exception -> 0x0068, TryCatch #0 {Exception -> 0x0068, blocks: (B:3:0x0006, B:5:0x000f, B:6:0x0015, B:8:0x0023, B:10:0x002a, B:12:0x0030, B:19:0x0050, B:22:0x0059, B:25:0x0062, B:31:0x0045, B:34:0x003b), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l c(r45.m41 r7) {
        /*
            r6 = this;
            java.lang.String r0 = "FinderJumpErrHelper"
            java.lang.String r1 = ""
            java.lang.String r2 = "[getExtConfig] ext_params:"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L68
            r3.<init>(r2)     // Catch: java.lang.Exception -> L68
            r2 = 0
            r4 = 1
            if (r7 == 0) goto L14
            java.lang.String r5 = r7.getString(r4)     // Catch: java.lang.Exception -> L68
            goto L15
        L14:
            r5 = r2
        L15:
            r3.append(r5)     // Catch: java.lang.Exception -> L68
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L68
            com.tencent.mars.xlog.Log.i(r0, r3)     // Catch: java.lang.Exception -> L68
            cl0.g r3 = new cl0.g     // Catch: java.lang.Exception -> L68
            if (r7 == 0) goto L29
            java.lang.String r5 = r7.getString(r4)     // Catch: java.lang.Exception -> L68
            if (r5 != 0) goto L2a
        L29:
            r5 = r1
        L2a:
            r3.<init>(r5)     // Catch: java.lang.Exception -> L68
            r5 = 0
            if (r7 == 0) goto L38
            int r7 = r7.getInteger(r5)     // Catch: java.lang.Exception -> L68
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> L68
        L38:
            if (r2 != 0) goto L3b
            goto L42
        L3b:
            int r7 = r2.intValue()     // Catch: java.lang.Exception -> L68
            if (r7 != r4) goto L42
            goto L4e
        L42:
            if (r2 != 0) goto L45
            goto L4d
        L45:
            int r7 = r2.intValue()     // Catch: java.lang.Exception -> L68
            r2 = 2
            if (r7 != r2) goto L4d
            goto L4e
        L4d:
            r4 = r5
        L4e:
            if (r4 == 0) goto L7e
            java.lang.String r7 = "h5_wording"
            java.lang.String r7 = r3.getString(r7)     // Catch: java.lang.Exception -> L68
            if (r7 != 0) goto L59
            r7 = r1
        L59:
            java.lang.String r2 = "h5_link"
            java.lang.String r2 = r3.getString(r2)     // Catch: java.lang.Exception -> L68
            if (r2 != 0) goto L62
            r2 = r1
        L62:
            jz5.l r3 = new jz5.l     // Catch: java.lang.Exception -> L68
            r3.<init>(r7, r2)     // Catch: java.lang.Exception -> L68
            return r3
        L68:
            r7 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "[getExtConfig] catch exception:"
            r2.<init>(r3)
            java.lang.String r7 = r7.getMessage()
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.tencent.mars.xlog.Log.e(r0, r7)
        L7e:
            jz5.l r7 = new jz5.l
            r7.<init>(r1, r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: qd2.q.c(r45.m41):jz5.l");
    }

    public final void d(android.app.Activity context, int i17, java.lang.String str, int i18) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("FinderJumpErrHelper", "[handleJumpError] errMsg: " + str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            f(2, true, false);
            return;
        }
        try {
            cl0.g gVar = new cl0.g(str);
            int optInt = gVar.optInt("show_type");
            if (optInt == 0) {
                cl0.g a17 = gVar.a("toast_config");
                kotlin.jvm.internal.o.d(a17);
                r45.l41 h17 = h(a17);
                if (h17 != null) {
                    j();
                    m(context, i17, h17, i18);
                    return;
                }
            } else if (optInt == 1) {
                az2.m.f16144a.a(context, str, i18);
                f(3, false, false);
                return;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderJumpErrHelper", "[handleJumpError] catch exception:" + e17.getMessage());
        }
        f(0, true, false);
    }

    public void f(int i17, boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("FinderJumpErrHelper", "[handleOnEndCheck] enterType:" + i17 + " confirm:" + z17 + " fromDialog:" + z18);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[Catch: Exception -> 0x004d, TryCatch #0 {Exception -> 0x004d, blocks: (B:3:0x0001, B:5:0x001d, B:10:0x0029, B:12:0x0042, B:13:0x0048), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final r45.j41 g(cl0.g r8) {
        /*
            r7 = this;
            r0 = 0
            java.lang.String r1 = "content"
            java.lang.String r1 = r8.optString(r1)     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = "button_style"
            int r2 = r8.optInt(r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r3 = "jump_type"
            int r3 = r8.optInt(r3)     // Catch: java.lang.Exception -> L4d
            java.lang.String r4 = "ext_config"
            cl0.g r8 = r8.b(r4)     // Catch: java.lang.Exception -> L4d
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L26
            int r6 = r1.length()     // Catch: java.lang.Exception -> L4d
            if (r6 != 0) goto L24
            goto L26
        L24:
            r6 = r4
            goto L27
        L26:
            r6 = r5
        L27:
            if (r6 != 0) goto L65
            r45.j41 r6 = new r45.j41     // Catch: java.lang.Exception -> L4d
            r6.<init>()     // Catch: java.lang.Exception -> L4d
            r6.set(r4, r1)     // Catch: java.lang.Exception -> L4d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> L4d
            r6.set(r5, r1)     // Catch: java.lang.Exception -> L4d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Exception -> L4d
            r2 = 3
            r6.set(r2, r1)     // Catch: java.lang.Exception -> L4d
            if (r8 == 0) goto L47
            r45.m41 r8 = r7.i(r8)     // Catch: java.lang.Exception -> L4d
            goto L48
        L47:
            r8 = r0
        L48:
            r1 = 2
            r6.set(r1, r8)     // Catch: java.lang.Exception -> L4d
            return r6
        L4d:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "[jsonToJumpButton] catch exception:"
            r1.<init>(r2)
            java.lang.String r8 = r8.getMessage()
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            java.lang.String r1 = "FinderJumpErrHelper"
            com.tencent.mars.xlog.Log.e(r1, r8)
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: qd2.q.g(cl0.g):r45.j41");
    }

    public final r45.l41 h(cl0.g gVar) {
        try {
            java.lang.String optString = gVar.optString("msg");
            java.lang.String optString2 = gVar.optString("cancel");
            java.lang.String optString3 = gVar.optString("confirm");
            cl0.g b17 = gVar.b("ext_config");
            cl0.e f17 = gVar.f("buttons");
            r45.l41 l41Var = new r45.l41();
            l41Var.set(0, optString);
            l41Var.set(1, optString2);
            l41Var.set(2, optString3);
            l41Var.set(3, b17 != null ? i(b17) : null);
            int length = f17 != null ? f17.length() : 0;
            for (int i17 = 0; i17 < length; i17++) {
                if (f17 != null) {
                    r45.j41 g17 = g(f17.k(i17));
                    if (g17 != null) {
                        l41Var.getList(4).add(g17);
                    }
                }
            }
            return l41Var;
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("FinderJumpErrHelper", "[jsonToToastConfig] catch exception:" + e17.getMessage());
            return null;
        }
    }

    public final r45.m41 i(cl0.g gVar) {
        try {
            int i17 = gVar.getInt("ext_type");
            byte[] decode = android.util.Base64.decode(gVar.getString("ext_params"), 0);
            kotlin.jvm.internal.o.f(decode, "decode(...)");
            java.lang.String str = new java.lang.String(decode, r26.c.f368865a);
            r45.m41 m41Var = new r45.m41();
            m41Var.set(0, java.lang.Integer.valueOf(i17));
            m41Var.set(1, str);
            return m41Var;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("FinderJumpErrHelper", "[jsonToToastExtConfig] catch exception:" + e17.getMessage());
            return null;
        }
    }

    public void j() {
    }

    public final void k(android.app.Activity activity, android.view.View view, java.lang.String str, int i17, int i18, int i19, java.lang.String str2) {
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(view, str);
        aVar.ik(view, i19, 25496);
        aVar.gk(view, str2 == null || str2.length() == 0 ? kz5.c1.k(new jz5.l("describe_type", java.lang.Integer.valueOf(i17)), new jz5.l("describe_reason", java.lang.Integer.valueOf(i18))) : kz5.c1.k(new jz5.l("behaviour_copywriting", str2), new jz5.l("describe_reason", java.lang.Integer.valueOf(i18))));
        zy2.ra Sj = ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Sj(activity);
        aVar.Ai(view, new qd2.m(Sj != null ? ((com.tencent.mm.plugin.finder.viewmodel.component.ny) Sj).V6() : null));
    }

    public final void m(android.app.Activity context, int i17, r45.l41 toastConfig, int i18) {
        android.view.View view;
        int i19;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(toastConfig, "toastConfig");
        com.tencent.mars.xlog.Log.i("FinderJumpErrHelper", "[showTipsDialog] buttons.size:" + toastConfig.getList(4).size());
        boolean z17 = toastConfig.getList(4).size() > 1;
        int i27 = z17 ? 2 : 1;
        int i28 = i17 != 1 ? i17 != 2 ? 0 : 2 : 1;
        java.lang.String string = toastConfig.getString(0);
        r45.m41 m41Var = (r45.m41) toastConfig.getCustom(3);
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.b8b, (android.view.ViewGroup) null, false);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g1s);
        if (textView != null) {
            textView.setText(string);
        }
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.g1r);
        if (textView2 != null) {
            jz5.l c17 = c(m41Var);
            java.lang.CharSequence charSequence = (java.lang.CharSequence) c17.f302833d;
            if (charSequence.length() > 0) {
                textView2.setText(charSequence);
            }
            if (((java.lang.CharSequence) c17.f302834e).length() > 0) {
                textView2.setOnClickListener(new qd2.l(context, c17, i18));
            }
            view = inflate;
            i19 = 0;
            l(this, context, textView2, "describe_standard", i27, i28, 0, null, 96, null);
        } else {
            view = inflate;
            i19 = 0;
        }
        l(this, context, view, "describe", i27, i28, 32, null, 64, null);
        r45.j41 j41Var = (r45.j41) toastConfig.getList(4).get(i19);
        ex2.e eVar = ex2.e.f257204a;
        if (!z17) {
            kotlin.jvm.internal.o.d(j41Var);
            android.widget.Button button = eVar.d(context, view, b(j41Var, new qd2.p(this, context, j41Var, i18)), null).f212072x;
            kotlin.jvm.internal.o.f(button, "getBtnSingle(...)");
            k(context, button, "describe_general_button", i27, i28, 40, j41Var.getString(i19));
            return;
        }
        kotlin.jvm.internal.o.d(j41Var);
        ex2.a b17 = b(j41Var, new qd2.n(this, context, j41Var, i18));
        r45.j41 j41Var2 = (r45.j41) toastConfig.getList(4).get(1);
        kotlin.jvm.internal.o.d(j41Var2);
        com.tencent.mm.ui.widget.dialog.z2 c18 = eVar.c(context, view, b17, b(j41Var2, new qd2.o(this, context, j41Var2, i18)), null);
        android.widget.Button button2 = c18.f212068t;
        kotlin.jvm.internal.o.f(button2, "getBtnLeft(...)");
        int i29 = i27;
        int i37 = i28;
        k(context, button2, "describe_general_button", i29, i37, 40, j41Var.getString(i19));
        android.widget.Button button3 = c18.f212069u;
        kotlin.jvm.internal.o.f(button3, "getBtnRight(...)");
        k(context, button3, "describe_general_button", i29, i37, 40, j41Var2.getString(i19));
    }
}
