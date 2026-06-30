package zp0;

/* loaded from: classes7.dex */
public final class c implements zp0.e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f474931a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f474932b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f474933c;

    public c(java.lang.String eggKey, java.lang.String eggId, java.lang.String sceneId) {
        kotlin.jvm.internal.o.g(eggKey, "eggKey");
        kotlin.jvm.internal.o.g(eggId, "eggId");
        kotlin.jvm.internal.o.g(sceneId, "sceneId");
        this.f474931a = eggKey;
        this.f474932b = eggId;
        this.f474933c = sceneId;
    }

    @Override // zp0.e
    public java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("eggKey", this.f474931a);
        hashMap.put("eggId", this.f474932b);
        hashMap.put("sceneId", this.f474933c);
        return hashMap;
    }

    @Override // zp0.e
    public java.lang.String getName() {
        return "onEasterEggGiftClick";
    }
}
