package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class jf {

    /* renamed from: a, reason: collision with root package name */
    public final oa.i f174016a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f174017b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f174018c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f174019d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.textstatus.ui.ff f174020e;

    public jf(oa.i tab) {
        kotlin.jvm.internal.o.g(tab, "tab");
        this.f174016a = tab;
        this.f174017b = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.hf(this));
        this.f174018c = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.gf(this));
        this.f174019d = jz5.h.b(new com.tencent.mm.plugin.textstatus.ui.Cif(this));
        tab.c(com.tencent.mm.R.layout.d0g);
        tab.f343778a = this;
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f174017b).getValue();
        if (textView != null) {
            if (z17) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView.getPaint().setFakeBoldText(false);
                textView.getPaint().setStrokeWidth(0.0f);
            }
        }
    }

    public final void b(int i17) {
        android.widget.TextView textView = (android.widget.TextView) ((jz5.n) this.f174017b).getValue();
        if (textView != null) {
            android.view.View view = this.f174016a.f343783f;
            kotlin.jvm.internal.o.d(view);
            textView.setTextColor(view.getContext().getResources().getColor(i17));
        }
    }
}
