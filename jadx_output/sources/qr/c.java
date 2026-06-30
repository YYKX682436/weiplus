package qr;

/* loaded from: classes9.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f366004d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qr.a f366005e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j17, qr.a aVar) {
        super(0);
        this.f366004d = j17;
        this.f366005e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashMap hashMap = qr.e.f366009b;
        long j17 = this.f366004d;
        java.util.HashSet hashSet = (java.util.HashSet) hashMap.get(java.lang.Long.valueOf(j17));
        if (hashSet == null) {
            hashSet = new java.util.HashSet();
            hashMap.put(java.lang.Long.valueOf(j17), hashSet);
        }
        hashSet.add(this.f366005e);
        com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureCallbackDispatcher", "registerCallback: " + hashSet.size());
        return jz5.f0.f302826a;
    }
}
