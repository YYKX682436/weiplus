package k13;

/* loaded from: classes10.dex */
public abstract class g implements android.view.View.OnKeyListener {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f303211e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f303212f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f303213g;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f303210d = jz5.h.b(k13.b.f303193d);

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f303214h = jz5.h.b(new k13.d(this));

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f303215i = jz5.h.b(new k13.f(this));

    public final android.content.Context b() {
        java.lang.Object value = ((jz5.n) this.f303210d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.content.Context) value;
    }

    public void c() {
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(b())) {
            ((ku5.t0) ku5.t0.f312615d).B(new k13.e(this));
        }
    }
}
