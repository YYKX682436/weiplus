package hr3;

/* loaded from: classes11.dex */
public class w extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f284122d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.AddDescriptionUI f284123e;

    public w(com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI, java.lang.String str) {
        this.f284123e = addDescriptionUI;
        this.f284122d = str;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/AddDescriptionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.profile.ui.AddDescriptionUI addDescriptionUI = this.f284123e;
        java.lang.CharSequence text = addDescriptionUI.f153629e.getText();
        int e17 = com.tencent.mm.ui.tools.v4.e(text.toString(), com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2);
        hw3.a.a(addDescriptionUI.getContext(), this.f284122d, e17, 400, new hr3.v(this, text));
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/AddDescriptionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f284123e.getResources().getColor(com.tencent.mm.R.color.f478724ff));
        textPaint.setUnderlineText(false);
    }
}
