package db5;

/* loaded from: classes13.dex */
public final class z9 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.WeAgreementCheckBox f228598d;

    public z9(com.tencent.mm.ui.base.WeAgreementCheckBox weAgreementCheckBox) {
        this.f228598d = weAgreementCheckBox;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/base/WeAgreementCheckBox$setTextView$clickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        db5.t9 t9Var = this.f228598d.f197733e;
        if (t9Var != null) {
            com.tencent.mm.plugin.account.ui.RegByMobileRegAIOUI regByMobileRegAIOUI = ((com.tencent.mm.plugin.account.ui.jf) t9Var).f73961a;
            java.lang.String d17 = u11.b.d(regByMobileRegAIOUI.f73571o);
            c71.b.c(regByMobileRegAIOUI, regByMobileRegAIOUI.getString(d17.equalsIgnoreCase("cn") ? com.tencent.mm.R.string.k4g : com.tencent.mm.R.string.k4h, com.tencent.mm.sdk.platformtools.m2.d(), d17), 0, false);
        }
        yj0.a.h(this, "com/tencent/mm/ui/base/WeAgreementCheckBox$setTextView$clickSpan$1", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f228598d.getContext().getColor(com.tencent.mm.R.color.f479308vo));
        ds6.setUnderlineText(false);
        ds6.clearShadowLayer();
    }
}
