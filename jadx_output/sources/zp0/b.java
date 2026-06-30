package zp0;

/* loaded from: classes7.dex */
public final class b implements zp0.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f474927a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f474928b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f474929c;

    /* renamed from: d, reason: collision with root package name */
    public final int f474930d;

    public b(java.lang.String eggKey, java.lang.String eggId, java.lang.String sceneId, int i17) {
        kotlin.jvm.internal.o.g(eggKey, "eggKey");
        kotlin.jvm.internal.o.g(eggId, "eggId");
        kotlin.jvm.internal.o.g(sceneId, "sceneId");
        this.f474927a = eggKey;
        this.f474928b = eggId;
        this.f474929c = sceneId;
        this.f474930d = i17;
    }

    @Override // zp0.e
    public java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("eggKey", this.f474927a);
        hashMap.put("eggId", this.f474928b);
        hashMap.put("sceneId", this.f474929c);
        hashMap.put("stopReason", java.lang.Integer.valueOf(this.f474930d));
        return hashMap;
    }

    @Override // zp0.e
    public java.lang.String getName() {
        return "onEasterEggForceStop";
    }
}
