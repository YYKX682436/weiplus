package i1;

/* loaded from: classes13.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final i1.z0 f287081d = new i1.z0();

    public z0() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        i1.g set = (i1.g) obj;
        float floatValue = ((java.lang.Number) obj2).floatValue();
        kotlin.jvm.internal.o.g(set, "$this$set");
        if (!(set.f286905m == floatValue)) {
            set.f286905m = floatValue;
            set.f286908p = true;
            set.c();
        }
        return jz5.f0.f302826a;
    }
}
