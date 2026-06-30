package p01;

/* loaded from: classes12.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final p01.d f350362d = new p01.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = pu5.h.f358472b;
        android.os.HandlerThread a17 = pu5.f.a("NewInitThread", 5);
        a17.setPriority(10);
        a17.start();
        p01.f.f350366c = true;
        return a17;
    }
}
