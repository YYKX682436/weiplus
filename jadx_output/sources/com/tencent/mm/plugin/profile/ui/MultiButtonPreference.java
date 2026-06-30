package com.tencent.mm.plugin.profile.ui;

/* loaded from: classes.dex */
public class MultiButtonPreference extends com.tencent.mm.ui.base.preference.Preference {
    public java.lang.String L;
    public java.lang.String M;
    public android.view.View.OnClickListener N;
    public android.view.View.OnClickListener P;

    public MultiButtonPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.G = com.tencent.mm.R.layout.f489367cb2;
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        java.lang.Integer num;
        java.lang.Integer num2;
        int i17;
        android.widget.Button button;
        int i18;
        android.widget.Button button2;
        java.lang.Integer num3;
        super.t(view);
        android.widget.Button button3 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.b38);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.b39);
        android.widget.Button button4 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.b3_);
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.b3a);
        android.widget.Button button5 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.b3b);
        view.setBackgroundColor(0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
            button3.setVisibility(8);
        } else {
            button3.setVisibility(0);
            button3.setText(this.L);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.M)) {
            num = 0;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            num2 = 8;
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            i17 = 8;
            button4.setVisibility(8);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.L)) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                num3 = 8;
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                num = 0;
            } else {
                num3 = 8;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
                arrayList3.add(0);
                java.util.Collections.reverse(arrayList3);
                num = 0;
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            button4.setVisibility(0);
            button4.setText(this.M);
            num2 = num3;
            i17 = 8;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(null)) {
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(num2);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(findViewById2, arrayList4.toArray(), "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            button = button5;
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            button.setVisibility(i17);
        } else {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.M)) {
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(num2);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                button2 = button5;
                i18 = 0;
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                i18 = 0;
                button2 = button5;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(num);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/profile/ui/MultiButtonPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            button2.setVisibility(i18);
            button2.setText((java.lang.CharSequence) null);
            button = button2;
        }
        button3.setOnClickListener(this.N);
        button4.setOnClickListener(this.P);
        button.setOnClickListener(null);
    }

    public MultiButtonPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.G = com.tencent.mm.R.layout.f489367cb2;
    }

    public MultiButtonPreference(android.content.Context context) {
        super(context);
        this.G = com.tencent.mm.R.layout.f489367cb2;
    }
}
