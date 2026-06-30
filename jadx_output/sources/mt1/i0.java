package mt1;

/* loaded from: classes12.dex */
public final class i0 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public static final mt1.i0 f331229d = new mt1.i0();

    public i0() {
        super(3);
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        ot1.j storage = (ot1.j) obj2;
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = (com.tencent.wcdb.support.CancellationSignal) obj3;
        kotlin.jvm.internal.o.g(storage, "storage");
        if (intValue >= 1) {
            storage.G2(new int[]{54, 55, 64, 65}, cancellationSignal);
        }
        return jz5.f0.f302826a;
    }
}
