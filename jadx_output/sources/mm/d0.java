package mm;

/* loaded from: classes11.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public static final mm.d0 f328475a = new mm.d0();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f328476b = jz5.h.b(mm.c0.f328473d);

    public final java.util.List a() {
        return (java.util.List) ((jz5.n) f328476b).getValue();
    }

    public final void b(mm.b0 apply) {
        kotlin.jvm.internal.o.g(apply, "apply");
        synchronized (a()) {
            f328475a.a().add(apply);
        }
    }
}
