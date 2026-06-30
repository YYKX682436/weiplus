package com.tencent.mm.plugin.wallet_core.ui.view;

/* loaded from: classes8.dex */
public class SwitchPhoneItemView extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f180698d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f180699e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f180700f;

    /* renamed from: g, reason: collision with root package name */
    public final int f180701g;

    public SwitchPhoneItemView(android.content.Context context, int i17) {
        super(context);
        this.f180701g = 0;
        this.f180701g = i17;
        b(context);
    }

    public void a(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if (com.tencent.mm.sdk.platformtools.t8.J0(charSequence)) {
            this.f180698d.setVisibility(8);
        } else {
            this.f180698d.setText(charSequence);
        }
        if (com.tencent.mm.sdk.platformtools.t8.J0(charSequence2)) {
            this.f180699e.setVisibility(8);
            return;
        }
        this.f180699e.setMaxLines(2);
        this.f180699e.setSelected(true);
        this.f180699e.setEllipsize(android.text.TextUtils.TruncateAt.MIDDLE);
        this.f180699e.setText(charSequence2);
        this.f180699e.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
    }

    public final void b(android.content.Context context) {
        int i17 = this.f180701g;
        android.view.View inflate = i17 > 0 ? android.view.View.inflate(context, i17, this) : android.view.View.inflate(context, com.tencent.mm.R.layout.d8g, this);
        this.f180698d = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.kuu);
        this.f180699e = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f486296ku2);
        this.f180700f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.f486295ku1);
    }

    public SwitchPhoneItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f180701g = 0;
        b(context);
    }

    public SwitchPhoneItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f180701g = 0;
        b(context);
    }
}
