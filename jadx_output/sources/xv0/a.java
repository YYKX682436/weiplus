package xv0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final xv0.b f457370a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f457371b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f457372c;

    /* renamed from: d, reason: collision with root package name */
    public float f457373d;

    public a(xv0.b type, float f17, android.view.View rootView, android.widget.TextView valueTv) {
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(rootView, "rootView");
        kotlin.jvm.internal.o.g(valueTv, "valueTv");
        this.f457370a = type;
        this.f457371b = rootView;
        this.f457372c = valueTv;
        this.f457373d = f17;
        a(f17);
    }

    public final void a(float f17) {
        this.f457373d = f17;
        if (java.lang.Math.abs(f17) <= 0.01d) {
            this.f457373d = 0.0f;
        }
        int compare = java.lang.Float.compare(this.f457373d, 0);
        android.widget.TextView textView = this.f457372c;
        if (compare == 0) {
            textView.setText("");
            return;
        }
        java.lang.String format = java.lang.String.format("%+d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) (this.f457373d * 100))}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        textView.setText(format);
    }
}
