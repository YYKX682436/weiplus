package gr2;

/* loaded from: classes2.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f274816a;

    /* renamed from: b, reason: collision with root package name */
    public final oa.i f274817b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f274818c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f274819d;

    /* renamed from: e, reason: collision with root package name */
    public int f274820e;

    public q0(android.content.Context context, oa.i tab) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tab, "tab");
        this.f274816a = context;
        this.f274817b = tab;
        tab.f343778a = this;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.c6k, (android.view.ViewGroup) tab.f343785h, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f274819d = inflate;
        this.f274818c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.o5c);
        tab.d(inflate);
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f274818c;
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
