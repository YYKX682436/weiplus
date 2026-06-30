package e04;

/* loaded from: classes2.dex */
public abstract class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f245896a = jz5.h.b(e04.d3.f245888d);

    public static final int a(int i17) {
        return (int) (i17 * 1.0f * ((java.lang.Number) ((jz5.n) f245896a).getValue()).floatValue());
    }

    public static final void b(android.content.Context context, android.widget.TextView textView, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        if (textView != null) {
            textView.setTextSize(0, ((java.lang.Float.valueOf(i65.a.f(context, i17)).floatValue() * 1.0f) * j65.f.g()) / 400.0f);
        }
    }
}
