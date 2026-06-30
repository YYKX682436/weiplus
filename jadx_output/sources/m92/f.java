package m92;

/* loaded from: classes10.dex */
public final class f extends m92.e implements java.lang.Cloneable {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f324978e = new java.util.concurrent.atomic.AtomicLong(1);

    /* renamed from: d, reason: collision with root package name */
    public final long f324979d = f324978e.get();

    public f() {
        parseFrom(g92.b.f269769e.k2().toByteArray());
    }

    public java.lang.Object clone() {
        m92.e eVar = new m92.e();
        eVar.parseFrom(toByteArray());
        return eVar;
    }
}
