package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes8.dex */
public final class a extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f154020d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f154021e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f154022f;

    /* renamed from: g, reason: collision with root package name */
    public final uc0.p f154023g;

    public a(android.content.Context context, java.lang.String remark, yz5.a currentDescOnClick, uc0.p callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(remark, "remark");
        kotlin.jvm.internal.o.g(currentDescOnClick, "currentDescOnClick");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f154020d = context;
        this.f154021e = remark;
        this.f154022f = currentDescOnClick;
        this.f154023g = callback;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/ModDescriptionUIWxContact$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        int e17 = com.tencent.mm.ui.tools.v4.e(((java.lang.CharSequence) this.f154022f.invoke()).toString(), com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2);
        hw3.a.a(widget.getContext(), this.f154021e, e17, 400, this.f154023g);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components_wx_contact/ModDescriptionUIWxContact$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setColor(this.f154020d.getColor(com.tencent.mm.R.color.f478724ff));
        ds6.setUnderlineText(false);
    }
}
