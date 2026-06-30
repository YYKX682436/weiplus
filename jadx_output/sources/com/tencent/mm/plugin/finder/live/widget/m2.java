package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes10.dex */
public final class m2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.s2 f119025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(com.tencent.mm.plugin.finder.live.widget.s2 s2Var) {
        super(0);
        this.f119025d = s2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.widget.s2 s2Var = this.f119025d;
        com.tencent.mm.plugin.finder.view.e3 e3Var = new com.tencent.mm.plugin.finder.view.e3(s2Var.f119699a);
        android.content.Context context = s2Var.f119699a;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e7v, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        s2Var.f119705g = inflate;
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9);
        int color = context.getColor(com.tencent.mm.R.color.f478491c);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColor(color);
        gradientDrawable.setCornerRadii(new float[]{dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, 0.0f, 0.0f, 0.0f, 0.0f});
        android.view.View view = s2Var.f119705g;
        if (view == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        view.setBackground(gradientDrawable);
        android.view.View view2 = s2Var.f119705g;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.u_a);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        s2Var.f119706h = (android.widget.TextView) findViewById;
        android.view.View view3 = s2Var.f119705g;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.view.View findViewById2 = view3.findViewById(com.tencent.mm.R.id.f485539i12);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        s2Var.f119707i = (android.widget.TextView) findViewById2;
        android.view.View view4 = s2Var.f119705g;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.view.View findViewById3 = view4.findViewById(com.tencent.mm.R.id.u_8);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        s2Var.f119708j = (android.widget.LinearLayout) findViewById3;
        android.view.View view5 = s2Var.f119705g;
        if (view5 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.view.View findViewById4 = view5.findViewById(com.tencent.mm.R.id.f485538i11);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        s2Var.f119709k = (android.widget.CheckBox) findViewById4;
        android.view.View view6 = s2Var.f119705g;
        if (view6 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.view.View findViewById5 = view6.findViewById(com.tencent.mm.R.id.u_9);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        s2Var.f119710l = (android.widget.TextView) findViewById5;
        android.view.View view7 = s2Var.f119705g;
        if (view7 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.view.View findViewById6 = view7.findViewById(com.tencent.mm.R.id.u__);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        s2Var.f119711m = (android.widget.TextView) findViewById6;
        android.view.View view8 = s2Var.f119705g;
        if (view8 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        android.view.View findViewById7 = view8.findViewById(com.tencent.mm.R.id.u_7);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        s2Var.f119712n = (android.widget.TextView) findViewById7;
        android.widget.CheckBox checkBox = s2Var.f119709k;
        if (checkBox == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        checkBox.setChecked(false);
        android.widget.LinearLayout linearLayout = s2Var.f119708j;
        if (linearLayout == null) {
            kotlin.jvm.internal.o.o("checkboxContainer");
            throw null;
        }
        linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.q2(s2Var));
        android.widget.CheckBox checkBox2 = s2Var.f119709k;
        if (checkBox2 == null) {
            kotlin.jvm.internal.o.o("checkBox");
            throw null;
        }
        checkBox2.setOnCheckedChangeListener(new com.tencent.mm.plugin.finder.live.widget.r2(s2Var));
        s2Var.c();
        if (s2Var.f119703e) {
            android.widget.TextView textView = s2Var.f119711m;
            if (textView == null) {
                kotlin.jvm.internal.o.o("confirmButton");
                throw null;
            }
            textView.setText(context.getString(com.tencent.mm.R.string.orp));
            android.widget.TextView textView2 = s2Var.f119711m;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("confirmButton");
                throw null;
            }
            textView2.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.n2(s2Var));
        } else {
            android.widget.TextView textView3 = s2Var.f119711m;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("confirmButton");
                throw null;
            }
            textView3.setText(context.getString(com.tencent.mm.R.string.orr));
            android.widget.TextView textView4 = s2Var.f119711m;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("confirmButton");
                throw null;
            }
            textView4.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.o2(s2Var));
        }
        android.widget.TextView textView5 = s2Var.f119712n;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("cancelButton");
            throw null;
        }
        textView5.setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.p2(s2Var));
        boolean z17 = context.getResources().getConfiguration().orientation == 2;
        android.widget.LinearLayout linearLayout2 = s2Var.f119708j;
        if (linearLayout2 == null) {
            kotlin.jvm.internal.o.o("checkboxContainer");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) layoutParams;
        if (z17) {
            layoutParams2.topMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        } else {
            layoutParams2.topMargin = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479727dj);
        }
        android.widget.LinearLayout linearLayout3 = s2Var.f119708j;
        if (linearLayout3 == null) {
            kotlin.jvm.internal.o.o("checkboxContainer");
            throw null;
        }
        linearLayout3.setLayoutParams(layoutParams2);
        yf2.h0 h0Var = s2Var.f119713o;
        if (h0Var != null) {
            s2Var.a(h0Var);
            s2Var.f119713o = null;
        }
        android.view.View view9 = s2Var.f119705g;
        if (view9 == null) {
            kotlin.jvm.internal.o.o("contentView");
            throw null;
        }
        e3Var.f131975y.addView(view9, 0);
        e3Var.f131968r = new com.tencent.mm.plugin.finder.live.widget.l2(s2Var);
        return e3Var;
    }
}
