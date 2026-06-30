package zp0;

/* loaded from: classes7.dex */
public final class d implements zp0.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f474934a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f474935b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f474936c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f474937d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f474938e;

    public d(java.lang.String eggKey, java.lang.String eggId, java.lang.String sceneId, boolean z17, java.lang.String extString) {
        kotlin.jvm.internal.o.g(eggKey, "eggKey");
        kotlin.jvm.internal.o.g(eggId, "eggId");
        kotlin.jvm.internal.o.g(sceneId, "sceneId");
        kotlin.jvm.internal.o.g(extString, "extString");
        this.f474934a = eggKey;
        this.f474935b = eggId;
        this.f474936c = sceneId;
        this.f474937d = z17;
        this.f474938e = extString;
    }

    @Override // zp0.e
    public java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("eggKey", this.f474934a);
        hashMap.put("eggId", this.f474935b);
        hashMap.put("sceneId", this.f474936c);
        hashMap.put("animationType", java.lang.Integer.valueOf(this.f474937d ? 2 : 1));
        hashMap.put("extString", this.f474938e);
        return hashMap;
    }

    @Override // zp0.e
    public java.lang.String getName() {
        return "onEasterEggPlayAnimation";
    }
}
