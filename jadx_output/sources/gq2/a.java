package gq2;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f274543a;

    /* renamed from: b, reason: collision with root package name */
    public final oa.i f274544b;

    /* renamed from: c, reason: collision with root package name */
    public int f274545c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f274546d;

    public a(gq2.d dVar, android.content.Context context, oa.i tab, boolean z17) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tab, "tab");
        this.f274543a = context;
        this.f274544b = tab;
        tab.f343778a = this;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c7_, (android.view.ViewGroup) tab.f343785h, false);
        tab.d(inflate);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.nuw);
        this.f274546d = textView;
        if (textView != null) {
            android.view.View view = tab.f343783f;
            kotlin.jvm.internal.o.d(view);
            textView.setTextColor(view.getContext().getResources().getColor(z17 ? com.tencent.mm.R.color.BW_0_Alpha_0_5_Night_Mode : com.tencent.mm.R.color.f478873jj));
        }
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f274546d;
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
