package vb2;

/* loaded from: classes3.dex */
public final class u implements x4.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.RelativeLayout f434729a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.CheckBox f434730b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f434731c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f434732d;

    public u(android.widget.RelativeLayout relativeLayout, android.widget.CheckBox checkBox, android.widget.TextView textView, android.widget.TextView textView2) {
        this.f434729a = relativeLayout;
        this.f434730b = checkBox;
        this.f434731c = textView;
        this.f434732d = textView2;
    }

    public static vb2.u a(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, boolean z17) {
        android.view.View inflate = layoutInflater.inflate(com.tencent.mm.R.layout.b5l, viewGroup, false);
        if (z17) {
            viewGroup.addView(inflate);
        }
        int i17 = com.tencent.mm.R.id.f484905fw1;
        android.widget.CheckBox checkBox = (android.widget.CheckBox) x4.b.a(inflate, com.tencent.mm.R.id.f484905fw1);
        if (checkBox != null) {
            i17 = com.tencent.mm.R.id.fw9;
            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.fw9);
            if (textView != null) {
                i17 = com.tencent.mm.R.id.obc;
                android.widget.TextView textView2 = (android.widget.TextView) x4.b.a(inflate, com.tencent.mm.R.id.obc);
                if (textView2 != null) {
                    return new vb2.u((android.widget.RelativeLayout) inflate, checkBox, textView, textView2);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // x4.a
    public android.view.View h() {
        return this.f434729a;
    }
}
