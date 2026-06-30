package cw1;

/* loaded from: classes3.dex */
public final class i7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.j7 f223005e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f223006f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223007g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f223008h;

    public i7(android.widget.TextView textView, cw1.j7 j7Var, int i17, android.widget.TextView textView2, int i18) {
        this.f223004d = textView;
        this.f223005e = j7Var;
        this.f223006f = i17;
        this.f223007g = textView2;
        this.f223008h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cw1.j7 j7Var = this.f223005e;
        java.lang.String format = java.lang.String.format(j7Var.f223047a, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f223006f)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        this.f223004d.setText(format);
        java.lang.String format2 = java.lang.String.format(j7Var.f223048b, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(this.f223008h)}, 1));
        kotlin.jvm.internal.o.f(format2, "format(...)");
        this.f223007g.setText(format2);
    }
}
