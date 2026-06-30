package com.tencent.mm.ui.contact;

/* loaded from: classes5.dex */
public class g6 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f206721d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.ModRemarkNameUI f206722e;

    public g6(com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI, java.lang.String str) {
        this.f206722e = modRemarkNameUI;
        this.f206721d = str;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/ModRemarkNameUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.ui.contact.ModRemarkNameUI modRemarkNameUI = this.f206722e;
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = modRemarkNameUI.f206468d;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = this.f206721d;
        if (str == null) {
            str = "";
        }
        float textSize = modRemarkNameUI.f206468d.getTextSize();
        ((ke0.e) xVar).getClass();
        mMLimitedClearEditText.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(modRemarkNameUI, str, textSize));
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText2 = modRemarkNameUI.f206468d;
        mMLimitedClearEditText2.setSelection(mMLimitedClearEditText2.getText().length());
        android.view.View view2 = modRemarkNameUI.f206487w;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/ModRemarkNameUI$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/contact/ModRemarkNameUI$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        yj0.a.h(this, "com/tencent/mm/ui/contact/ModRemarkNameUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f206722e.getResources().getColor(com.tencent.mm.R.color.f478724ff));
        textPaint.setUnderlineText(false);
    }
}
