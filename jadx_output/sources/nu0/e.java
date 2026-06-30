package nu0;

/* loaded from: classes5.dex */
public abstract class e extends du0.g {

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f339915i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f339916m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f339917n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f339915i = jz5.h.b(new nu0.b(this));
        this.f339916m = jz5.h.b(new nu0.c(this));
        this.f339917n = jz5.h.b(new nu0.a(this));
        jz5.h.b(new nu0.d(this));
    }

    public final nu0.q0 U6() {
        return (nu0.q0) ((jz5.n) this.f339915i).getValue();
    }

    public final nu0.d4 V6() {
        return (nu0.d4) ((jz5.n) this.f339916m).getValue();
    }
}
