package qr;

/* loaded from: classes9.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f366006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qr.a f366007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(long j17, qr.a aVar) {
        super(0);
        this.f366006d = j17;
        this.f366007e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = qr.e.f366009b;
        long j17 = this.f366006d;
        java.util.HashSet hashSet = (java.util.HashSet) hashMap.get(java.lang.Long.valueOf(j17));
        if (hashSet != null) {
            hashSet.remove(this.f366007e);
            if (hashSet.isEmpty()) {
                hashMap.remove(java.lang.Long.valueOf(j17));
            }
        }
        return jz5.f0.f302826a;
    }
}
