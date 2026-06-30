package w0;

/* loaded from: classes14.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final w0.i f441839d = new w0.i();

    public i() {
        super(2);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        w0.c0 Saver = (w0.c0) obj;
        w0.p it = (w0.p) obj2;
        kotlin.jvm.internal.o.g(Saver, "$this$Saver");
        kotlin.jvm.internal.o.g(it, "it");
        java.util.Map t17 = kz5.c1.t(it.f441856a);
        for (w0.l lVar : ((java.util.LinkedHashMap) it.f441857b).values()) {
            lVar.getClass();
            if (lVar.f441843b) {
                t17.put(lVar.f441842a, ((w0.u) lVar.f441844c).a());
            }
        }
        return t17;
    }
}
