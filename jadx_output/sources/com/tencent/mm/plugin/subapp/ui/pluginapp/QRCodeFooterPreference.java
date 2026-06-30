package com.tencent.mm.plugin.subapp.ui.pluginapp;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/subapp/ui/pluginapp/QRCodeFooterPreference;", "Lcom/tencent/mm/ui/base/preference/Preference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class QRCodeFooterPreference extends com.tencent.mm.ui.base.preference.Preference {
    public android.widget.ImageView L;
    public android.widget.TextView M;
    public android.view.View N;
    public android.widget.FrameLayout P;
    public android.view.View.OnClickListener Q;
    public yz5.a R;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRCodeFooterPreference(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static final float M(com.tencent.mm.plugin.subapp.ui.pluginapp.QRCodeFooterPreference qRCodeFooterPreference) {
        android.widget.TextView textView = qRCodeFooterPreference.M;
        if (textView == null) {
            return 0.0f;
        }
        int K = r26.n0.K(textView.getText().toString(), ':', 0, false, 6, null);
        android.text.SpannableString spannableString = new android.text.SpannableString(textView.getText());
        int i17 = K + 2;
        spannableString.setSpan(new android.text.style.BackgroundColorSpan(qRCodeFooterPreference.f197770d.getResources().getColor(com.tencent.mm.R.color.ahd)), i17, textView.getText().length(), 33);
        textView.setText(spannableString);
        return textView.getPaint().measureText(r26.n0.u0(spannableString.subSequence(i17, spannableString.length()).toString()).toString());
    }

    @Override // com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.L = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f484400tb1);
        this.M = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.taz);
        this.N = view.findViewById(com.tencent.mm.R.id.f484399tb0);
        this.P = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.tay);
        long j17 = c01.z1.j();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long j18 = 2 & j17;
        sb6.append(j18);
        sb6.append(",extstatus:");
        sb6.append(j17);
        com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeFooterPreference", sb6.toString());
        if (j18 != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeFooterPreference", "hide find_friends_bottom_qr_code_info");
            android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.taw);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/subapp/ui/pluginapp/QRCodeFooterPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/subapp/ui/pluginapp/QRCodeFooterPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.TextView textView = this.M;
            if (textView == null) {
                return;
            }
            textView.setVisibility(4);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.QRCodeFooterPreference", "setUpViewsShowing");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        h0Var.f310123d = "";
        kotlin.jvm.internal.h0 h0Var2 = new kotlin.jvm.internal.h0();
        h0Var2.f310123d = "";
        java.lang.String r17 = c01.z1.r();
        java.lang.String c17 = c01.z1.c();
        java.lang.String h17 = com.tencent.mm.sdk.platformtools.c5.h((java.lang.String) c01.d9.b().p().l(6, null));
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(c17);
        android.content.Context context = this.f197770d;
        if (!K0) {
            java.lang.String string = context.getString(com.tencent.mm.R.string.nhr, c17);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            h0Var.f310123d = string;
            kotlin.jvm.internal.o.d(c17);
            h0Var2.f310123d = c17;
        } else if (!com.tencent.mm.storage.z3.y3(r17)) {
            java.lang.String string2 = context.getString(com.tencent.mm.R.string.nhr, r17);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            h0Var.f310123d = string2;
            kotlin.jvm.internal.o.d(r17);
            h0Var2.f310123d = r17;
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(h17)) {
            java.lang.String string3 = context.getString(com.tencent.mm.R.string.nhs, com.tencent.mm.sdk.platformtools.c5.e(h17));
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            h0Var.f310123d = string3;
            h0Var2.f310123d = h17;
        }
        android.widget.TextView textView2 = this.M;
        if (textView2 != null) {
            textView2.setText((java.lang.CharSequence) h0Var.f310123d);
        }
        android.widget.TextView textView3 = this.M;
        if (textView3 != null) {
            textView3.setOnLongClickListener(new gg4.k0(this, h0Var2, h0Var));
        }
        yz5.a aVar = this.R;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public QRCodeFooterPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QRCodeFooterPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.G = com.tencent.mm.R.layout.f489278ek3;
    }
}
