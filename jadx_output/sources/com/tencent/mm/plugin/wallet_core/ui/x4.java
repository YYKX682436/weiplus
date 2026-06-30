package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public abstract class x4 {
    public static android.app.Dialog a(android.content.Context context, com.tencent.mm.plugin.wallet_core.model.ECardInfo eCardInfo, int i17) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d6w, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.close_icon);
        int d17 = com.tencent.mm.sdk.platformtools.j.d(context, 50.0f);
        com.tencent.mm.sdk.platformtools.t8.q(imageView, d17, d17, d17, d17);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j96);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485835j90);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.otp);
        android.widget.TextView textView3 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j8x);
        android.widget.CheckBox checkBox = (android.widget.CheckBox) inflate.findViewById(com.tencent.mm.R.id.btf);
        android.widget.TextView textView4 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.btm);
        textView.setText(eCardInfo.f179638p);
        if (com.tencent.mm.sdk.platformtools.t8.K0(eCardInfo.f179645w)) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(eCardInfo.f179645w);
            textView2.setVisibility(0);
        }
        int length = eCardInfo.f179642t.length();
        int length2 = (eCardInfo.f179642t + eCardInfo.f179643u).length();
        android.text.SpannableString spannableString = new android.text.SpannableString(eCardInfo.f179642t + eCardInfo.f179643u);
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f479547aa4)), length, length2, 33);
        if (com.tencent.mm.sdk.platformtools.t8.J0(spannableString)) {
            textView3.setVisibility(8);
        } else {
            textView3.setText(spannableString);
            textView3.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.s4(eCardInfo, context, i17));
        }
        sp.b bVar = new sp.b(context, com.tencent.mm.R.style.f494791wd);
        bVar.setContentView(inflate);
        bVar.setTitle((java.lang.CharSequence) null);
        bVar.setOnCancelListener(new com.tencent.mm.plugin.wallet_core.ui.t4(bVar));
        imageView.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.u4(bVar));
        button.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.v4(eCardInfo, context, bVar));
        if (eCardInfo.f179631f == 1) {
            checkBox.setOnCheckedChangeListener(new com.tencent.mm.plugin.wallet_core.ui.w4(button));
            if (eCardInfo.f179632g == 1) {
                checkBox.setChecked(true);
            } else {
                checkBox.setChecked(false);
                button.setEnabled(false);
                button.setClickable(false);
            }
        } else {
            checkBox.setVisibility(8);
        }
        int length3 = eCardInfo.f179633h.length();
        int length4 = (eCardInfo.f179633h + eCardInfo.f179634i).length();
        android.text.SpannableString spannableString2 = new android.text.SpannableString(eCardInfo.f179633h + eCardInfo.f179634i);
        spannableString2.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f479547aa4)), length3, length4, 33);
        textView4.setText(spannableString2);
        textView4.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.n4(eCardInfo, context));
        bVar.show();
        db5.e1.a(context, bVar);
        return bVar;
    }

    public static void b(android.content.Context context) {
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d8i, (android.view.ViewGroup) null, false);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f487761pr0);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487762pr1);
        imageView.setImageResource(com.tencent.mm.R.drawable.f482216ci2);
        textView.setText(com.tencent.mm.R.string.gr8);
        aVar.B = true;
        aVar.A = false;
        aVar.L = inflate;
        aVar.f211709a = of5.b.a(context).getString(com.tencent.mm.R.string.l07);
        aVar.f211732v = of5.b.a(context).getString(com.tencent.mm.R.string.l_e);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }

    public static android.app.Dialog c(android.content.Context context, java.lang.String str, java.lang.String str2, java.util.List list, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d6u, (android.view.ViewGroup) null);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.close_icon);
        int d17 = com.tencent.mm.sdk.platformtools.j.d(context, 15.0f);
        com.tencent.mm.sdk.platformtools.t8.q(imageView, d17, d17, d17, d17);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) inflate.findViewById(com.tencent.mm.R.id.j96);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f485839j94);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f485840j95);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.otp);
        android.widget.TextView textView2 = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.j8x);
        mMNeat7extView.getPaint().setFakeBoldText(true);
        mMNeat7extView.b(str);
        textView.setText(str2);
        linearLayout.removeAllViews();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.String str8 = (java.lang.String) it.next();
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.d6v, (android.view.ViewGroup) null);
            ((android.widget.TextView) inflate2.findViewById(com.tencent.mm.R.id.po7)).setText(str8);
            linearLayout.addView(inflate2);
        }
        button.setText(str3);
        if (i17 > 0) {
            int length = str4.length();
            int length2 = (str4 + str5).length();
            android.text.SpannableString spannableString = new android.text.SpannableString(str4 + str5);
            spannableString.setSpan(new android.text.style.ForegroundColorSpan(context.getResources().getColor(com.tencent.mm.R.color.f479547aa4)), length, length2, 33);
            textView2.setText(spannableString);
        } else {
            textView2.setText("");
        }
        textView2.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.o4(str6, context));
        sp.b bVar = new sp.b(context, com.tencent.mm.R.style.f494791wd);
        bVar.setContentView(inflate);
        bVar.setTitle((java.lang.CharSequence) null);
        bVar.setOnCancelListener(new com.tencent.mm.plugin.wallet_core.ui.p4(bVar));
        imageView.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.q4(bVar));
        button.setOnClickListener(new com.tencent.mm.plugin.wallet_core.ui.r4(str7, context, bVar));
        bVar.show();
        android.view.Window window = bVar.getWindow();
        int b17 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 16);
        window.getDecorView().setPadding(b17, 0, b17, 0);
        android.view.WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        return bVar;
    }
}
