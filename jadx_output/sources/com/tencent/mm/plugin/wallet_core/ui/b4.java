package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class b4 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.wallet_core.ui.a4 f180146d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f180147e;

    /* renamed from: f, reason: collision with root package name */
    public final int f180148f;

    public b4(android.content.Context context) {
        this.f180147e = -1;
        this.f180148f = -1;
        this.f180147e = context.getResources().getColor(com.tencent.mm.R.color.a_w);
        this.f180148f = context.getResources().getColor(com.tencent.mm.R.color.a9e);
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.wallet_core.ui.a4 a4Var = this.f180146d;
        if (a4Var != null) {
            a4Var.onClick(view);
            com.tencent.mm.wallet_core.ui.b0.e(view);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletClickableSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setFakeBoldText(false);
        textPaint.setColor(this.f180147e);
        textPaint.setUnderlineText(false);
        textPaint.bgColor = this.f180148f;
    }
}
