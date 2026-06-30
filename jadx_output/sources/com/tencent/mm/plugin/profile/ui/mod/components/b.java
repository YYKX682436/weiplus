package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes8.dex */
public final class b extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f153878d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f153879e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.a f153880f;

    /* renamed from: g, reason: collision with root package name */
    public final uc0.p f153881g;

    public b(android.content.Context context, java.lang.String remark, yz5.a currentDescOnClick, uc0.p callback) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(remark, "remark");
        kotlin.jvm.internal.o.g(currentDescOnClick, "currentDescOnClick");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f153878d = context;
        this.f153879e = remark;
        this.f153880f = currentDescOnClick;
        this.f153881g = callback;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/mod/components/ModDescriptionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        kotlin.jvm.internal.o.g(widget, "widget");
        int e17 = com.tencent.mm.ui.tools.v4.e(((java.lang.CharSequence) this.f153880f.invoke()).toString(), com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2);
        android.content.Context context = widget.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (context instanceof com.tencent.mm.ui.vas.VASActivity) {
            context = ((com.tencent.mm.ui.vas.VASActivity) context).getContainerActivity();
        }
        hw3.a.a(context, this.f153879e, e17, 400, this.f153881g);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/mod/components/ModDescriptionUI$WriteRemarkSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        kotlin.jvm.internal.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setColor(this.f153878d.getColor(com.tencent.mm.R.color.f478724ff));
        ds6.setUnderlineText(false);
    }
}
