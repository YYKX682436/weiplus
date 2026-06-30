package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes5.dex */
public final class j7 {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f191736a;

    /* renamed from: b, reason: collision with root package name */
    public final int f191737b;

    /* renamed from: c, reason: collision with root package name */
    public final int f191738c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f191739d;

    public j7(android.content.Context context, oa.i tab, int i17, int i18, java.lang.String titleName) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tab, "tab");
        kotlin.jvm.internal.o.g(titleName, "titleName");
        this.f191736a = tab;
        this.f191737b = i17;
        this.f191738c = i18;
        tab.f343778a = this;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.aq9, (android.view.ViewGroup) null);
        tab.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.nuw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f191739d = textView;
        textView.setText(titleName);
        inflate.setContentDescription(titleName);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
    }

    public final void a(boolean z17) {
        int i17 = z17 ? com.tencent.mm.R.color.FG_0 : com.tencent.mm.R.color.FG_1;
        android.widget.TextView textView = this.f191739d;
        textView.setTextColor(i65.a.d(textView.getContext(), i17));
    }

    public java.lang.String toString() {
        return "TabItem(tabType=" + this.f191738c + ", tabIndex=" + this.f191737b + ')';
    }
}
