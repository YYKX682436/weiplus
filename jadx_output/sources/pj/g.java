package pj;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f354905a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.a f354906b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f354907c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f354908d;

    public g(int i17, yz5.a createObject, yz5.l lVar) {
        kotlin.jvm.internal.o.g(createObject, "createObject");
        this.f354905a = i17;
        this.f354906b = createObject;
        this.f354907c = lVar;
        this.f354908d = jz5.h.a(jz5.i.f302829d, pj.f.f354904d);
    }

    public final java.util.List a() {
        return (java.util.List) this.f354908d.getValue();
    }

    public final java.lang.Object b() {
        java.lang.Object invoke;
        synchronized (a()) {
            invoke = a().isEmpty() ? this.f354906b.invoke() : a().remove(kz5.c0.h(a()));
        }
        return invoke;
    }
}
