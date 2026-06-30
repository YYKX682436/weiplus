package v24;

/* loaded from: classes15.dex */
public abstract class o0 {
    public static void a(android.content.Context context, int i17, int i18, long j17, long j18, k14.u uVar, boolean z17) {
        k14.k kVar = z17 ? new k14.k(context, i17, i18, j17, j18, uVar, true) : new k14.k(context, i17, i18, j17, j18, uVar);
        kVar.f303346g = true;
        if (kVar.f303344e instanceof android.app.Activity) {
            k14.j jVar = new k14.j(kVar);
            kVar.f303349m = jVar;
            com.tencent.mm.sdk.platformtools.u3.i(jVar, 200L);
        }
        k14.h hVar = new k14.h(kVar);
        kVar.f303348i = hVar;
        com.tencent.mm.sdk.platformtools.u3.i(hVar, 60000L);
        gm0.j1.n().f273288b.a(4071, kVar);
        gm0.j1.n().f273288b.g(kVar.f303356t ? new k14.x(kVar.f303347h, kVar.f303351o, kVar.f303355s, kVar.f303354r, true) : new k14.x(kVar.f303347h, kVar.f303351o, kVar.f303353q, kVar.f303352p, false));
    }

    public static void b(android.content.Context context, long j17, boolean z17, wd0.p1 p1Var) {
        if (z17) {
            k(context, context.getString(e(j17)), new v24.a0(context, j17 | 0, j17, p1Var), true);
            return;
        }
        long j18 = j17 | 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.SafeSwitchTipDialog", "doSave. switchValue = 0, WhichExtFunctionSwitch= " + j18);
        a(context, 3, 2, j18, 0L, new v24.b0(p1Var), true);
    }

    public static java.util.List c(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ("zh_CN".equals(com.tencent.mm.sdk.platformtools.m2.f(context))) {
            arrayList.add(context.getResources().getString(com.tencent.mm.R.string.iog));
            arrayList.add(context.getResources().getString(com.tencent.mm.R.string.iob));
            arrayList.add(context.getResources().getString(com.tencent.mm.R.string.iod));
            arrayList.add(context.getResources().getString(com.tencent.mm.R.string.io9));
        } else {
            arrayList.add(context.getResources().getString(com.tencent.mm.R.string.iof));
            arrayList.add(context.getResources().getString(com.tencent.mm.R.string.ioa));
            arrayList.add(context.getResources().getString(com.tencent.mm.R.string.ioc));
            arrayList.add(context.getResources().getString(com.tencent.mm.R.string.io8));
        }
        return arrayList;
    }

    public static java.util.List d(android.content.Context context) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (f(context)) {
            arrayList.add(context.getString(com.tencent.mm.R.string.ioe));
            arrayList.add(context.getString(com.tencent.mm.R.string.io_));
            arrayList.add(context.getString(com.tencent.mm.R.string.ijn));
            arrayList.add(context.getString(com.tencent.mm.R.string.ijm));
        } else {
            arrayList.add(context.getString(com.tencent.mm.R.string.n18));
            arrayList.add(context.getString(com.tencent.mm.R.string.n17));
            arrayList.add(context.getString(com.tencent.mm.R.string.f492982n10));
            arrayList.add(context.getString(com.tencent.mm.R.string.n0z));
        }
        return arrayList;
    }

    public static int e(long j17) {
        return j17 == 34359738368L ? com.tencent.mm.R.string.ijj : j17 == 67108864 ? com.tencent.mm.R.string.iji : j17 == 2097152 ? com.tencent.mm.R.string.ijk : j17 == 16777216 ? com.tencent.mm.R.string.ijg : j17 == 8 ? com.tencent.mm.R.string.ijl : j17 == 256 ? com.tencent.mm.R.string.ijh : j17 == 8388608 ? com.tencent.mm.R.string.lxp : j17 == 9007199254740992L ? com.tencent.mm.R.string.phf : com.tencent.mm.R.string.ijp;
    }

    public static boolean f(android.content.Context context) {
        java.lang.String f17 = com.tencent.mm.sdk.platformtools.m2.f(context);
        return "zh_TW".equals(f17) || "zh_HK".equals(f17) || "zh_CN".equals(f17) || "en".equals(f17);
    }

    public static void g(android.content.Context context, java.lang.String str, java.lang.String str2, java.lang.String str3, wd0.o1 o1Var) {
        v24.w wVar = new v24.w(o1Var);
        v24.q qVar = new v24.q(context);
        android.widget.TextView textView = qVar.L;
        if (textView != null) {
            textView.setText(str);
        }
        android.widget.TextView textView2 = qVar.M;
        if (textView2 != null) {
            textView2.setText(str2);
        }
        v24.i0 i0Var = new v24.i0(qVar);
        android.widget.Button button = qVar.N;
        if (button != null) {
            button.setOnClickListener(i0Var);
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).sj(context, c(context), str2, d(context), qVar.M);
        v24.j0 j0Var = new v24.j0(qVar);
        android.widget.Button button2 = qVar.P;
        if (button2 != null) {
            button2.setOnClickListener(j0Var);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.ijc);
            if (button != null) {
                button.setText(string);
            }
        } else if (button != null) {
            button.setText(str3);
        }
        qVar.l(new v24.k0(wVar, qVar));
        if (button2 != null) {
            button2.setTextColor(button2.getResources().getColor(com.tencent.mm.R.color.FG_0));
        }
        if (button != null) {
            button.setBackground(button.getResources().getDrawable(com.tencent.mm.R.drawable.f481067jw));
        }
        if (button != null) {
            button.setTextColor(button.getResources().getColor(com.tencent.mm.R.color.f478763gj));
        }
        if (textView2 != null) {
            textView2.setTextSize(1, 14.0f);
        }
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479729dl);
        android.widget.LinearLayout linearLayout = qVar.S;
        if (linearLayout != null && (linearLayout.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams)) {
            ((android.widget.LinearLayout.LayoutParams) linearLayout.getLayoutParams()).bottomMargin = dimensionPixelSize;
        }
        v24.l0 l0Var = new v24.l0(qVar);
        qVar.K = l0Var;
        com.tencent.mm.ui.widget.dialog.o3 o3Var = qVar.f212056e;
        if (o3Var != null) {
            o3Var.f211939b.f211813j = l0Var;
        }
        android.view.View view = qVar.T;
        if (view != null) {
            qVar.j(view);
        }
        qVar.C();
    }

    public static void h(android.content.Context context, long j17, com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference, wd0.p1 p1Var, int i17) {
        j(context, j17, new v24.m0(checkBoxPreference), p1Var, i17, false);
    }

    public static void i(android.content.Context context, long j17, v24.n0 n0Var, wd0.p1 p1Var, int i17) {
        j(context, j17, n0Var, p1Var, i17, false);
    }

    public static void j(android.content.Context context, long j17, v24.n0 n0Var, wd0.p1 p1Var, int i17, boolean z17) {
        k(context, context.getString(e(j17)), new v24.y(context, i17, j17 | 0, n0Var, p1Var, z17), i17 == 3);
    }

    public static void k(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.setting.ui.setting.tg tgVar, boolean z17) {
        java.lang.String string = f(context) ? context.getString(com.tencent.mm.R.string.ijo) : context.getString(com.tencent.mm.R.string.f492983n11);
        v24.q qVar = new v24.q(context);
        android.widget.TextView textView = qVar.L;
        if (textView != null) {
            textView.setText(str);
        }
        android.widget.TextView textView2 = qVar.M;
        if (textView2 != null) {
            textView2.setText(string);
        }
        v24.e0 e0Var = new v24.e0(qVar);
        android.widget.Button button = qVar.N;
        if (button != null) {
            button.setOnClickListener(e0Var);
        }
        android.widget.TextView textView3 = qVar.Q;
        if (textView3 != null) {
            textView3.setVisibility(8);
        }
        ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).sj(context, c(context), string, d(context), qVar.M);
        v24.f0 f0Var = new v24.f0(qVar);
        android.widget.Button button2 = qVar.P;
        if (button2 != null) {
            button2.setOnClickListener(f0Var);
        }
        java.lang.String string2 = context.getResources().getString(com.tencent.mm.R.string.ijd);
        if (button != null) {
            button.setText(string2);
        }
        qVar.l(new v24.g0(tgVar, qVar));
        v24.h0 h0Var = new v24.h0(qVar);
        qVar.K = h0Var;
        com.tencent.mm.ui.widget.dialog.o3 o3Var = qVar.f212056e;
        if (o3Var != null) {
            o3Var.f211939b.f211813j = h0Var;
        }
        android.view.View view = qVar.T;
        if (view != null) {
            qVar.j(view);
        }
        qVar.C();
    }

    public static void l(android.content.Context context) {
        db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.ije), com.tencent.mm.R.raw.icons_filled_error);
    }

    public static void m(android.content.Context context) {
        db5.t7.i(context, context.getResources().getString(com.tencent.mm.R.string.ijf), com.tencent.mm.R.raw.icons_filled_done);
    }
}
