package qr;

/* loaded from: classes9.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f366001d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f366002e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366003f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j17, boolean z17, java.lang.String str) {
        super(0);
        this.f366001d = j17;
        this.f366002e = z17;
        this.f366003f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = qr.e.f366009b;
        long j17 = this.f366001d;
        java.util.HashSet hashSet = (java.util.HashSet) hashMap.get(java.lang.Long.valueOf(j17));
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((qr.a) it.next()).a(j17, this.f366002e, this.f366003f);
            }
        }
        return jz5.f0.f302826a;
    }
}
