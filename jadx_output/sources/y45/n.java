package y45;

/* loaded from: classes11.dex */
public class n implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m3.a f459378a;

    public n(m3.a aVar) {
        this.f459378a = aVar;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        java.lang.Integer num = (java.lang.Integer) obj;
        int intValue = num.intValue();
        if (intValue > 60 || intValue > 20) {
            d55.u.d("MicroMsg.recovery.operator", "Failed to get patch: %s", num);
        }
        this.f459378a.accept(num);
    }
}
