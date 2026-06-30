package com.tencent.mm.pluginsdk.ui.preference;

/* loaded from: classes9.dex */
public class HelperHeaderPreference extends com.tencent.mm.ui.base.preference.Preference {
    public final y35.b0 L;

    public HelperHeaderPreference(android.content.Context context) {
        super(context);
        this.L = new y35.b0();
    }

    public void M(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        y35.b0 b0Var = this.L;
        b0Var.f459188b = str;
        b0Var.f459187a = str2;
        b0Var.f459189c = str3;
        com.tencent.mm.ui.base.preference.q0 q0Var = this.f197771e;
        if (q0Var == null) {
            return;
        }
        q0Var.a(this, null);
    }

    public void N(int i17) {
        this.L.f459190d = i17;
        com.tencent.mm.ui.base.preference.q0 q0Var = this.f197771e;
        if (q0Var == null) {
            return;
        }
        q0Var.a(this, null);
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.a_4);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f487100ni2);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.kbq);
        android.widget.TextView textView3 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h0h);
        android.widget.TextView textView4 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.dy6);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.lal);
        textView4.setText(com.tencent.mm.R.string.ce_);
        y35.b0 b0Var = this.L;
        if (imageView != null) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, b0Var.f459188b, null);
        }
        if (textView != null) {
            int i17 = b0Var.f459190d;
            android.content.Context context = this.f197770d;
            if (i17 != 0) {
                if (i17 == 1) {
                    textView.setVisibility(0);
                    iz5.a.g(null, context != null);
                    textView.setTextColor(new com.tencent.mm.ui.tools.gd(context).f210448a[0]);
                    textView.setText(com.tencent.mm.R.string.iwo);
                } else if (i17 == 2) {
                    textView.setVisibility(8);
                }
            } else {
                textView.setVisibility(0);
                textView.setTextColor(com.tencent.mm.ui.tools.gd.a(context));
                textView.setText(com.tencent.mm.R.string.iwu);
            }
        }
        if (textView2 != null) {
            textView2.setText(b0Var.f459187a);
        }
        if (textView3 != null) {
            textView3.setText(b0Var.f459189c);
        }
        super.t(view);
        findViewById.getViewTreeObserver().addOnPreDrawListener(new y35.a0(this, findViewById));
    }

    public HelperHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = new y35.b0();
    }

    public HelperHeaderPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = new y35.b0();
    }
}
