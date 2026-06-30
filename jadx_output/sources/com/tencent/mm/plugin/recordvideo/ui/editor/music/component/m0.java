package com.tencent.mm.plugin.recordvideo.ui.editor.music.component;

/* loaded from: classes5.dex */
public final class m0 {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f156291a;

    /* renamed from: b, reason: collision with root package name */
    public final int f156292b;

    /* renamed from: c, reason: collision with root package name */
    public final int f156293c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f156294d;

    public m0(android.content.Context context, oa.i tab, int i17, int i18, java.lang.String titleName) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tab, "tab");
        kotlin.jvm.internal.o.g(titleName, "titleName");
        this.f156291a = tab;
        this.f156292b = i17;
        this.f156293c = i18;
        tab.f343778a = this;
        android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489328dd0, (android.view.ViewGroup) null);
        tab.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.nuw);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById;
        this.f156294d = textView;
        textView.setText(titleName);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
    }

    public final void a(boolean z17) {
        int i17 = z17 ? com.tencent.mm.R.color.aca : com.tencent.mm.R.color.acb;
        android.widget.TextView textView = this.f156294d;
        textView.setTextColor(i65.a.d(textView.getContext(), i17));
    }

    public java.lang.String toString() {
        return "MusicPickerTabItem(tabType=" + this.f156292b + ", tabIndex=" + this.f156293c + ')';
    }
}
