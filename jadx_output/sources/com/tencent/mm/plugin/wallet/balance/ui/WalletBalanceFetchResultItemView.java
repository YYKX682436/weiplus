package com.tencent.mm.plugin.wallet.balance.ui;

/* loaded from: classes8.dex */
public class WalletBalanceFetchResultItemView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f177767d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f177768e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f177769f;

    public WalletBalanceFetchResultItemView(android.content.Context context, boolean z17) {
        super(context);
        this.f177769f = false;
        this.f177769f = z17;
        a();
    }

    public final void a() {
        if (this.f177769f) {
            android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488181jr, this);
        } else {
            android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488180jq, this);
        }
        this.f177767d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.axa);
        this.f177768e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ax_);
    }

    public void b(int i17, java.lang.CharSequence charSequence) {
        c(getContext().getString(i17), charSequence, "", "", false);
    }

    public void c(java.lang.String str, java.lang.CharSequence charSequence, java.lang.String str2, java.lang.String str3, boolean z17) {
        this.f177767d.setText(str);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            this.f177767d.setTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(str2, true));
        }
        if (z17) {
            android.widget.TextView textView = this.f177768e;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = getContext();
            float textSize = this.f177768e.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, charSequence, textSize));
        } else {
            this.f177768e.setText(charSequence);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            return;
        }
        this.f177768e.setTextColor(com.tencent.mm.plugin.wallet_core.utils.z1.b(str3, true));
    }

    public void d(java.lang.String str, java.lang.CharSequence charSequence, int i17, int i18, boolean z17) {
        this.f177767d.setText(str);
        if (i17 != -1) {
            this.f177767d.setTextColor(i17);
        }
        if (z17) {
            android.widget.TextView textView = this.f177768e;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context = getContext();
            float textSize = this.f177768e.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, charSequence, textSize));
        } else {
            this.f177768e.setText(charSequence);
        }
        if (i18 != -1) {
            this.f177768e.setTextColor(i18);
        }
    }

    public WalletBalanceFetchResultItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f177769f = false;
        a();
    }

    public WalletBalanceFetchResultItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f177769f = false;
        a();
    }
}
