package r35;

/* loaded from: classes9.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f369144a = {com.tencent.mm.R.id.ocd, com.tencent.mm.R.id.oce, com.tencent.mm.R.id.ocf, com.tencent.mm.R.id.ocg, com.tencent.mm.R.id.och, com.tencent.mm.R.id.oci, com.tencent.mm.R.id.ocj, com.tencent.mm.R.id.ock, com.tencent.mm.R.id.ocl};

    public static java.lang.String a(android.view.View view) {
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(com.tencent.mm.R.id.c_l);
        if (editText == null) {
            return null;
        }
        return editText.getText().toString();
    }

    public static int b(android.view.View view) {
        android.widget.EditText editText = (android.widget.EditText) view.findViewById(com.tencent.mm.R.id.c_l);
        if (editText instanceof com.tencent.mm.ui.widget.edittext.PasterEditText) {
            return ((com.tencent.mm.ui.widget.edittext.PasterEditText) editText).getPasterLen();
        }
        return 0;
    }

    public static void c(android.view.View view, com.tencent.mm.ui.widget.dialog.j jVar, db5.d5 d5Var) {
        ((android.widget.Button) view.findViewById(com.tencent.mm.R.id.c_6)).setOnClickListener(new r35.s0(jVar, view, d5Var));
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.c_7);
        if (button != null) {
            button.setOnClickListener(new r35.t0(jVar, d5Var));
        }
    }

    public static void d(android.content.Context context, com.tencent.mm.ui.widget.dialog.j0 j0Var, java.lang.String str, java.lang.String str2, com.tencent.mm.ui.widget.dialog.j jVar, com.tencent.mm.ui.widget.dialog.j jVar2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() == 0) {
            str = context.getResources().getString(com.tencent.mm.R.string.f490941bb3);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || str2.length() == 0) {
            str2 = context.getResources().getString(com.tencent.mm.R.string.f490347sg);
        }
        j0Var.A(str, true, new r35.d1(j0Var, jVar));
        j0Var.w(str2, true, new r35.e1(j0Var, jVar2));
    }

    public static void e(com.tencent.mm.ui.ga gaVar, com.tencent.mm.ui.widget.dialog.i0 i0Var, com.tencent.mm.ui.widget.dialog.j jVar, android.view.View view, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.length() == 0) {
            str = gaVar.x().getResources().getString(com.tencent.mm.R.string.f490941bb3);
        }
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.f211732v = str;
        aVar.E = new r35.o0(jVar, view);
        i0Var.e(com.tencent.mm.R.string.f490347sg);
        i0Var.f211821b.F = new r35.p0(jVar);
    }

    public static void f(android.view.View view, int i17, java.lang.String str, boolean z17, int i18) {
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(i17);
        iz5.a.g(null, textView != null);
        if (z17 && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            textView.setVisibility(i18);
        } else {
            textView.setText(str);
        }
    }

    public static void g(android.content.Context context, com.tencent.mm.ui.widget.dialog.i0 i0Var, java.lang.Object obj) {
        if (obj != null) {
            java.util.List<java.lang.String> P1 = obj instanceof java.lang.String ? com.tencent.mm.sdk.platformtools.t8.P1(((java.lang.String) obj).split(",")) : obj instanceof java.util.List ? (java.util.List) obj : null;
            if (com.tencent.mm.sdk.platformtools.t8.L0(P1)) {
                return;
            }
            if (P1.size() != 1) {
                android.view.View inflate = android.view.View.inflate(context, com.tencent.mm.R.layout.a09, null);
                int i17 = 0;
                for (java.lang.String str : P1) {
                    if (i17 <= 8 && inflate != null) {
                        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(f369144a[i17]);
                        if (str != null) {
                            imageView.setVisibility(0);
                            ng5.a.a(imageView, str);
                            i17++;
                        }
                    }
                }
                i0Var.f211821b.M = inflate;
                java.lang.String string = context.getString(com.tencent.mm.R.string.h0p);
                com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
                aVar.f211709a = string;
                aVar.S = 3;
                return;
            }
            java.lang.String str2 = (java.lang.String) P1.get(0);
            i65.a.b(context, (int) (i65.a.q(context) * 20.0f));
            android.text.SpannableString Ai = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, context.getString(com.tencent.mm.R.string.i27).toString());
            com.tencent.mm.ui.widget.dialog.a aVar2 = i0Var.f211821b;
            aVar2.f211709a = Ai;
            aVar2.S = 3;
            ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
            java.lang.String e17 = c01.a2.e(str2);
            i65.a.b(context, (int) (i65.a.q(context) * 14.0f));
            boolean R4 = com.tencent.mm.storage.z3.R4(str2);
            com.tencent.mm.ui.widget.dialog.a aVar3 = i0Var.f211821b;
            if (!R4) {
                i0Var.c(str2, ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, e17.toString()), java.lang.Boolean.FALSE, null, new r35.b1());
                aVar3.f211722l = new r35.c1(str2, context);
                return;
            }
            ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
            android.text.SpannableString Ai2 = ((h12.b) ((k12.r) i95.n0.c(k12.r.class))).Ai(context, (e17 + context.getString(com.tencent.mm.R.string.ifo, java.lang.Integer.valueOf(c01.v1.o(str2)))).toString());
            android.view.View inflate2 = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.a48, (android.view.ViewGroup) null);
            android.widget.GridView gridView = (android.widget.GridView) inflate2.findViewById(com.tencent.mm.R.id.bgk);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            ((c01.w1) ((rv1.e) i95.n0.c(rv1.e.class))).getClass();
            java.util.List m17 = c01.v1.m(str2);
            i0Var.c(str2, Ai2, java.lang.Boolean.TRUE, new r35.u0(inflate2, arrayList, str2, m17), new r35.y0());
            aVar3.f211723m = new r35.a1(i0Var, context, str2);
            gridView.setAdapter((android.widget.ListAdapter) new r35.n2(context, m17, arrayList));
            gridView.setSelector(new android.graphics.drawable.ColorDrawable(context.getResources().getColor(com.tencent.mm.R.color.a9e)));
            if (m17 != null) {
                if (((java.util.LinkedList) m17).size() > 16) {
                    gridView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, i65.a.h(context, com.tencent.mm.R.dimen.f479635ba)));
                    gridView.setPadding(i65.a.h(context, com.tencent.mm.R.dimen.f479632b7), 0, i65.a.h(context, com.tencent.mm.R.dimen.f479632b7), 0);
                } else {
                    gridView.setPadding(0, 0, 0, i65.a.h(context, com.tencent.mm.R.dimen.f479629b4));
                }
            }
            aVar3.N = inflate2;
        }
    }

    public static void h(com.tencent.mm.ui.ga gaVar, db5.d5 d5Var) {
        try {
            if (gaVar.x().isFinishing()) {
                return;
            }
            d5Var.setInputMethodMode(1);
            d5Var.setSoftInputMode(16);
            d5Var.setFocusable(true);
            d5Var.setTouchable(true);
            d5Var.showAtLocation(gaVar.x().getWindow().getDecorView(), 17, 0, 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "show dialog fail: %s", e17.getMessage());
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMConfirmDialog", e17, "", new java.lang.Object[0]);
        }
    }

    public static com.tencent.mm.ui.widget.dialog.j0 i(com.tencent.mm.ui.ga gaVar, java.lang.String str, android.view.View view, java.lang.String str2, com.tencent.mm.ui.widget.dialog.k kVar) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
            return null;
        }
        androidx.appcompat.app.AppCompatActivity x17 = gaVar.x();
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.A = false;
        aVar.B = false;
        androidx.appcompat.app.AppCompatActivity x18 = gaVar.x();
        aVar.f211709a = str;
        aVar.O = x18.getResources().getColor(com.tencent.mm.R.color.a0c);
        aVar.P = 2;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || str2.length() == 0) {
            str2 = gaVar.x().getResources().getString(com.tencent.mm.R.string.f490941bb3);
        }
        aVar.f211732v = str2;
        aVar.E = new r35.q0(kVar);
        aVar.f211733w = of5.b.a(x17).getString(com.tencent.mm.R.string.f490347sg);
        aVar.F = new r35.r0(kVar);
        aVar.L = view;
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(x17, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.B(gaVar.x().getResources().getColor(com.tencent.mm.R.color.f478734fp));
        j0Var.show();
        return j0Var;
    }

    public static com.tencent.mm.ui.widget.dialog.j0 j(com.tencent.mm.ui.ga gaVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5, com.tencent.mm.ui.widget.dialog.j jVar) {
        android.widget.EditText editText;
        if ((str == null || str.length() == 0) && (str3 == null || str3.length() == 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
            return null;
        }
        android.view.View inflate = android.view.View.inflate(gaVar.x(), com.tencent.mm.R.layout.f488674a03, null);
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(gaVar.x());
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.A = false;
        aVar.B = false;
        androidx.appcompat.app.AppCompatActivity x17 = gaVar.x();
        aVar.f211709a = str;
        aVar.O = x17.getResources().getColor(com.tencent.mm.R.color.a0c);
        aVar.P = 2;
        if (inflate != null && (editText = (android.widget.EditText) inflate.findViewById(com.tencent.mm.R.id.c_l)) != null) {
            editText.setVisibility(z17 ? 0 : 8);
        }
        e(gaVar, i0Var, jVar, inflate, str5);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c_k);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity x18 = gaVar.x();
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(x18, str3, textSize));
        if (str4 == null || str4.length() == 0) {
            android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.c_f);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog", "showDialogItem1", "(Lcom/tencent/mm/ui/MMActivityController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/mm/ui/widget/dialog/IConfirmDialog$IOnDialogClick;)Lcom/tencent/mm/ui/widget/dialog/MMAlertDialog;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog", "showDialogItem1", "(Lcom/tencent/mm/ui/MMActivityController;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/tencent/mm/ui/widget/dialog/IConfirmDialog$IOnDialogClick;)Lcom/tencent/mm/ui/widget/dialog/MMAlertDialog;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.c_f)).setText(str4);
        }
        int d17 = com.tencent.mm.sdk.platformtools.j.d(gaVar.x(), 120.0f);
        com.tencent.mm.pluginsdk.ui.applet.CdnImageView cdnImageView = (com.tencent.mm.pluginsdk.ui.applet.CdnImageView) inflate.findViewById(com.tencent.mm.R.id.c_m);
        if (cdnImageView != null) {
            cdnImageView.b(str2, d17, d17, -1);
        }
        aVar.L = inflate;
        com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
        a17.show();
        return a17;
    }

    public static com.tencent.mm.ui.widget.dialog.j0 k(com.tencent.mm.ui.ga gaVar, java.lang.String str, byte[] bArr, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4, com.tencent.mm.ui.widget.dialog.j jVar) {
        java.lang.String string = gaVar.x().getResources().getString(com.tencent.mm.R.string.f490589za);
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem1 fail, title message both are empty");
            return null;
        }
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(gaVar.x());
        java.lang.String string2 = gaVar.x().getIntent().getExtras().getString("Select_Conv_User", null);
        if (string2 != null) {
            g(gaVar.x(), i0Var, com.tencent.mm.sdk.platformtools.t8.P1(string2.split(",")));
        }
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.C = true;
        aVar.f211730t = string + str;
        aVar.A = false;
        aVar.B = false;
        if (z17) {
            aVar.f211716f = true;
        }
        com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
        d(gaVar.x(), a17, str4, null, jVar, jVar);
        a17.show();
        return a17;
    }

    public static com.tencent.mm.ui.widget.dialog.j0 l(com.tencent.mm.ui.ga gaVar, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, com.tencent.mm.ui.widget.dialog.j jVar) {
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem2 fail, message is empty");
            return null;
        }
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(gaVar.x());
        java.lang.String string = gaVar.x().getIntent().getExtras().getString("Select_Conv_User", null);
        if (string != null) {
            g(gaVar.x(), i0Var, com.tencent.mm.sdk.platformtools.t8.P1(string.split(",")));
        }
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.C = true;
        aVar.f211730t = str;
        aVar.A = false;
        aVar.B = false;
        if (z17) {
            aVar.f211716f = true;
        }
        com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
        d(gaVar.x(), a17, str3, null, jVar, jVar);
        a17.show();
        return a17;
    }

    public static com.tencent.mm.ui.widget.dialog.j0 m(com.tencent.mm.ui.ga gaVar, java.lang.String str, java.lang.String str2, boolean z17, java.lang.String str3, com.tencent.mm.ui.widget.dialog.j jVar) {
        if (str == null || !com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem3 fail, img does not exist");
            return null;
        }
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(gaVar.x());
        java.lang.String string = gaVar.x().getIntent().getExtras().getString("Select_Conv_User", null);
        if (string != null) {
            g(gaVar.x(), i0Var, com.tencent.mm.sdk.platformtools.t8.P1(string.split(",")));
        }
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.C = true;
        aVar.A = false;
        aVar.B = false;
        if (z17) {
            aVar.f211716f = true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            android.graphics.Bitmap i07 = com.tencent.mm.sdk.platformtools.x.i0(str);
            int a17 = com.tencent.mm.sdk.platformtools.l.a(str);
            if (i07 != null) {
                if (a17 != 0) {
                    i07 = com.tencent.mm.sdk.platformtools.x.w0(i07, a17);
                }
                aVar.f211727q = i07;
                aVar.D = true;
                aVar.T = 3;
                aVar.H = new r35.w0(i07);
                aVar.C = false;
            }
        }
        com.tencent.mm.ui.widget.dialog.j0 a18 = i0Var.a();
        d(gaVar.x(), a18, str3, null, jVar, jVar);
        a18.show();
        return a18;
    }

    public static com.tencent.mm.ui.widget.dialog.j0 n(com.tencent.mm.ui.ga gaVar, byte[] bArr, java.lang.String str, boolean z17, java.lang.String str2, com.tencent.mm.ui.widget.dialog.j jVar) {
        if (bArr == null || bArr.length == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem3 fail, imgData is null");
            return null;
        }
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(gaVar.x());
        java.lang.String string = gaVar.x().getIntent().getExtras().getString("Select_Conv_User", null);
        if (string != null) {
            g(gaVar.x(), i0Var, com.tencent.mm.sdk.platformtools.t8.P1(string.split(",")));
        }
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.C = true;
        aVar.A = false;
        aVar.B = false;
        if (z17) {
            aVar.f211716f = true;
        }
        if (bArr.length > 0) {
            int length = bArr.length;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(length));
            arrayList.add(0);
            arrayList.add(bArr);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog", "showDialogItem3", "(Lcom/tencent/mm/ui/MMActivityController;[BLjava/lang/String;ZLjava/lang/String;Lcom/tencent/mm/ui/widget/dialog/IConfirmDialog$IOnDialogClick;)Lcom/tencent/mm/ui/widget/dialog/MMAlertDialog;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap decodeByteArray = android.graphics.BitmapFactory.decodeByteArray((byte[]) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue());
            yj0.a.e(obj, decodeByteArray, "com/tencent/mm/pluginsdk/ui/applet/ConfirmDialog", "showDialogItem3", "(Lcom/tencent/mm/ui/MMActivityController;[BLjava/lang/String;ZLjava/lang/String;Lcom/tencent/mm/ui/widget/dialog/IConfirmDialog$IOnDialogClick;)Lcom/tencent/mm/ui/widget/dialog/MMAlertDialog;", "android/graphics/BitmapFactory_EXEC_", "decodeByteArray", "([BII)Landroid/graphics/Bitmap;");
            com.tencent.mm.compatible.util.Exif exif = new com.tencent.mm.compatible.util.Exif();
            exif.parseFrom(bArr);
            int orientationInDegree = exif.getOrientationInDegree();
            if (decodeByteArray != null) {
                if (orientationInDegree != 0) {
                    decodeByteArray = com.tencent.mm.sdk.platformtools.x.w0(decodeByteArray, orientationInDegree);
                }
                aVar.f211727q = decodeByteArray;
                aVar.D = true;
                aVar.T = 3;
                aVar.H = new r35.w0(decodeByteArray);
                aVar.C = false;
            }
        }
        com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
        d(gaVar.x(), a17, str2, null, jVar, jVar);
        a17.show();
        return a17;
    }

    public static com.tencent.mm.ui.widget.dialog.j0 o(com.tencent.mm.ui.ga gaVar, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, com.tencent.mm.ui.widget.dialog.j jVar) {
        return p(gaVar, i17, str, str2, str3, z17, "", jVar);
    }

    public static com.tencent.mm.ui.widget.dialog.j0 p(com.tencent.mm.ui.ga gaVar, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, java.lang.String str4, com.tencent.mm.ui.widget.dialog.j jVar) {
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(gaVar.x());
        java.lang.String string = gaVar.x().getIntent().getExtras().getString("Select_Conv_User", null);
        if (string != null) {
            g(gaVar.x(), i0Var, com.tencent.mm.sdk.platformtools.t8.P1(string.split(",")));
        }
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.C = true;
        aVar.f211730t = (i17 == com.tencent.mm.R.raw.app_attach_file_icon_file ? gaVar.x().getResources().getString(com.tencent.mm.R.string.f490430uv) : i17 == com.tencent.mm.R.raw.music_default ? gaVar.x().getResources().getString(com.tencent.mm.R.string.f490494wn) : i17 == com.tencent.mm.R.raw.app_attach_file_icon_video ? gaVar.x().getResources().getString(com.tencent.mm.R.string.f490596zi) : gaVar.x().getResources().getString(com.tencent.mm.R.string.f490009ic)) + str;
        aVar.A = false;
        aVar.B = false;
        if (z17) {
            aVar.f211716f = true;
        }
        com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
        d(gaVar.x(), a17, str4, null, jVar, jVar);
        a17.show();
        return a17;
    }

    public static com.tencent.mm.ui.widget.dialog.j0 q(com.tencent.mm.ui.ga gaVar, byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, com.tencent.mm.ui.widget.dialog.j jVar) {
        return r(gaVar, bArr, str, str2, str3, z17, i17, "", jVar);
    }

    public static com.tencent.mm.ui.widget.dialog.j0 r(com.tencent.mm.ui.ga gaVar, byte[] bArr, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z17, int i17, java.lang.String str4, com.tencent.mm.ui.widget.dialog.j jVar) {
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(gaVar.x());
        java.lang.String string = gaVar.x().getIntent().getExtras().getString("Select_Conv_User", null);
        g(gaVar.x(), i0Var, string != null ? com.tencent.mm.sdk.platformtools.t8.P1(string.split(",")) : null);
        com.tencent.mm.ui.widget.dialog.a aVar = i0Var.f211821b;
        aVar.C = true;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(i17 != 1 ? i17 != 2 ? gaVar.x().getResources().getString(com.tencent.mm.R.string.f490009ic) : gaVar.x().getResources().getString(com.tencent.mm.R.string.f490494wn) : gaVar.x().getResources().getString(com.tencent.mm.R.string.f490596zi));
        stringBuffer.append(str);
        aVar.f211730t = stringBuffer.toString();
        aVar.A = false;
        aVar.B = false;
        if (z17) {
            aVar.f211716f = true;
        }
        com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
        d(gaVar.x(), a17, str4, null, jVar, jVar);
        a17.show();
        return a17;
    }

    public static db5.d5 s(com.tencent.mm.ui.ga gaVar, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.ui.widget.dialog.j jVar) {
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        android.view.View inflate = ((android.view.LayoutInflater) gaVar.x().getSystemService("layout_inflater")).inflate(com.tencent.mm.R.layout.f488676a06, (android.view.ViewGroup) null);
        db5.d5 d5Var = new db5.d5(inflate, -1, -1);
        c(inflate, jVar, d5Var);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MMConfirmDialog", "showDialogItem8 fail,title or  message is empty");
            return null;
        }
        f(inflate, com.tencent.mm.R.id.c_o, str, false, 0);
        com.tencent.mm.ui.base.NoMeasuredTextView noMeasuredTextView = (com.tencent.mm.ui.base.NoMeasuredTextView) inflate.findViewById(com.tencent.mm.R.id.c_k);
        noMeasuredTextView.setShouldEllipsize(true);
        noMeasuredTextView.i(0, gaVar.x().getResources().getDimension(com.tencent.mm.R.dimen.f479568k) * i65.a.q(gaVar.x()));
        noMeasuredTextView.setTextColor(i65.a.e(gaVar.x(), com.tencent.mm.R.color.a0c));
        ((c01.y) ((qk.l6) i95.n0.c(qk.l6.class))).getClass();
        s01.h z07 = r01.q3.Ui().z0(j17);
        if (z07.y0()) {
            str5 = z07.field_chatName;
            str6 = z07.field_headImageUrl;
            str7 = z07.field_brandUserName;
        } else {
            qk.m6 m6Var = (qk.m6) i95.n0.c(qk.m6.class);
            java.lang.String str8 = z07.field_bizChatServId;
            ((c01.d0) m6Var).getClass();
            s01.a0 y07 = r01.q3.Vi().y0(str8);
            if (y07 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MMConfirmDialog", "showDialogItem8 userInfo is null");
                return null;
            }
            str5 = y07.field_userName;
            str6 = y07.field_headImageUrl;
            str7 = y07.field_brandUserName;
        }
        if (str5 == null) {
            str5 = str2;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity x17 = gaVar.x();
            float textSize = noMeasuredTextView.getTextSize();
            ((ke0.e) xVar).getClass();
            noMeasuredTextView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(x17, str2, textSize));
        } else {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            androidx.appcompat.app.AppCompatActivity x18 = gaVar.x();
            float textSize2 = noMeasuredTextView.getTextSize();
            ((ke0.e) xVar2).getClass();
            noMeasuredTextView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(x18, str5, textSize2));
        }
        f(inflate, com.tencent.mm.R.id.c_g, str3, true, 8);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.c_6);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
            button.setText(str4);
        }
        button.setOnClickListener(new r35.g1(jVar, inflate, d5Var));
        o11.f fVar = new o11.f();
        fVar.f342083g = qk.b.a(str7);
        fVar.f342078b = true;
        fVar.f342095s = true;
        fVar.f342091o = com.tencent.mm.R.raw.default_avatar;
        o11.g a17 = fVar.a();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str6)) {
            n11.a.b().h(str6, (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.c_m), a17);
        }
        h(gaVar, d5Var);
        return d5Var;
    }
}
