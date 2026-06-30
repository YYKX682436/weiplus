package cw2;

/* loaded from: classes10.dex */
public final class ab implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f223573d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.ViewGroup f223574e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f223575f;

    /* renamed from: g, reason: collision with root package name */
    public final cw2.za f223576g;

    public ab(android.view.ViewGroup layout, ju3.d0 status) {
        kotlin.jvm.internal.o.g(layout, "layout");
        kotlin.jvm.internal.o.g(status, "status");
        this.f223573d = status;
        android.view.View findViewById = layout.findViewById(com.tencent.mm.R.id.cjo);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f223574e = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = layout.findViewById(com.tencent.mm.R.id.cju);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f223575f = (android.widget.TextView) findViewById2;
        this.f223576g = new cw2.za(this);
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
    }
}
