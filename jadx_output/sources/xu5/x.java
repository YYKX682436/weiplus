package xu5;

/* loaded from: classes12.dex */
public final class x extends xu5.o {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f457345h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(xu5.b serial) {
        super(serial, null);
        kotlin.jvm.internal.o.g(serial, "serial");
        this.f457345h = new java.lang.Object();
    }

    @Override // xu5.o
    public xu5.n a(android.os.Message message) {
        return new xu5.w(this, message);
    }
}
