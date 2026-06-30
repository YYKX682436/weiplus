package com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert;

/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f121908a;

    /* renamed from: b, reason: collision with root package name */
    public final oa.i f121909b;

    /* renamed from: c, reason: collision with root package name */
    public int f121910c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f121911d;

    public r0(com.tencent.mm.plugin.finder.nearby.newlivesquare.adapter.main.viewconvert.t0 t0Var, android.content.Context context, oa.i tab, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tab, "tab");
        this.f121908a = context;
        this.f121909b = tab;
        tab.f343778a = this;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c7_, (android.view.ViewGroup) tab.f343785h, false);
        tab.d(inflate);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nuw);
        this.f121911d = textView;
        if (textView != null) {
            android.view.View view = tab.f343783f;
            kotlin.jvm.internal.o.d(view);
            textView.setTextColor(view.getContext().getResources().getColor(z17 ? com.tencent.mm.R.color.BW_0_Alpha_0_5_Night_Mode : com.tencent.mm.R.color.f478873jj));
        }
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f121911d;
        if (textView != null) {
            if (z17) {
                com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView.getPaint().setFakeBoldText(false);
                textView.getPaint().setStrokeWidth(0.0f);
            }
        }
    }
}
