package com.tencent.mm.ui.base.preference;

/* loaded from: classes8.dex */
public class NormalIconTipPreference extends com.tencent.mm.ui.base.preference.NormalIconPreference {
    public android.widget.TextView Y1;
    public java.lang.String Z1;

    public NormalIconTipPreference(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void h0() {
        if (this.Y1 != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(this.Z1)) {
                this.Y1.setVisibility(8);
                this.Y1.setText("");
            } else {
                this.Y1.setVisibility(0);
                this.Y1.setText(this.Z1);
            }
        }
    }

    @Override // com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public void t(android.view.View view) {
        super.t(view);
        this.Y1 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.h7p);
        h0();
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.m4_);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/base/preference/NormalIconTipPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/base/preference/NormalIconTipPreference", "onBindView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    @Override // com.tencent.mm.ui.base.preference.NormalIconPreference, com.tencent.mm.ui.base.preference.IconPreference, com.tencent.mm.ui.base.preference.Preference
    public android.view.View u(android.view.ViewGroup viewGroup) {
        return super.u(viewGroup);
    }

    public NormalIconTipPreference(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.Y1 = null;
        this.Z1 = "";
    }
}
