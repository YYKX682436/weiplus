package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes3.dex */
public final class y0 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.EditText f154009d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f154010e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f154011f;

    /* renamed from: g, reason: collision with root package name */
    public final gr3.m f154012g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f154013h;

    public y0(android.widget.EditText editText, android.view.View tooltip, java.lang.String remark, gr3.m reporter, yz5.a onClick) {
        kotlin.jvm.internal.o.g(editText, "editText");
        kotlin.jvm.internal.o.g(tooltip, "tooltip");
        kotlin.jvm.internal.o.g(remark, "remark");
        kotlin.jvm.internal.o.g(reporter, "reporter");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        this.f154009d = editText;
        this.f154010e = tooltip;
        this.f154011f = remark;
        this.f154012g = reporter;
        this.f154013h = onClick;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components/ModRemarkUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        com.tencent.mars.xlog.Log.i("MicroMsg.WriteRemarkSpan", "oncreate WriteRemarkSpan");
        java.lang.String str = this.f154011f;
        android.widget.EditText editText = this.f154009d;
        editText.setText(str);
        editText.setSelection(editText.getText().length());
        android.view.View view = this.f154010e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/profile/ui/mod/components/ModRemarkUI$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/mod/components/ModRemarkUI$WriteRemarkSpan", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f154013h.invoke();
        this.f154012g.a();
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components/ModRemarkUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        ds6.setColor(this.f154009d.getContext().getColor(com.tencent.mm.R.color.f478724ff));
        ds6.setUnderlineText(false);
    }
}
