package com.tencent.mm.plugin.remittance.bankcard.ui;

/* loaded from: classes.dex */
public class BankRemitDetailItemView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f156498d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f156499e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f156500f;

    public BankRemitDetailItemView(android.content.Context context, boolean z17) {
        super(context);
        this.f156500f = false;
        this.f156500f = z17;
        a();
    }

    public final void a() {
        if (this.f156500f) {
            android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488181jr, this);
        } else {
            android.view.View.inflate(getContext(), com.tencent.mm.R.layout.f488180jq, this);
        }
        this.f156498d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.axa);
        this.f156499e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.ax_);
    }

    public void b(int i17, java.lang.CharSequence charSequence) {
        c(getContext().getString(i17), charSequence, false);
    }

    public void c(java.lang.String str, java.lang.CharSequence charSequence, boolean z17) {
        this.f156498d.setText(str);
        if (!z17) {
            this.f156499e.setText(charSequence);
            return;
        }
        android.widget.TextView textView = this.f156499e;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        float textSize = this.f156499e.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, charSequence, textSize));
    }

    public BankRemitDetailItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f156500f = false;
        a();
    }

    public BankRemitDetailItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f156500f = false;
        a();
    }
}
