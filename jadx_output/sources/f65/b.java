package f65;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f259865d;

    /* renamed from: e, reason: collision with root package name */
    public final f65.a f259866e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f259867f;

    public b(long j17, java.util.Map sdkParams, f65.a callback) {
        kotlin.jvm.internal.o.g(sdkParams, "sdkParams");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f259865d = j17;
        this.f259866e = callback;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.putAll(sdkParams);
        this.f259867f = linkedHashMap;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f259866e.a(this.f259865d, this.f259867f);
    }
}
