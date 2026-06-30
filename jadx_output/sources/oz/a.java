package oz;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f350138a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f350139b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f350140c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f350141d;

    public a(long j17, boolean z17, java.lang.String serialTag, java.lang.String storageKey) {
        kotlin.jvm.internal.o.g(serialTag, "serialTag");
        kotlin.jvm.internal.o.g(storageKey, "storageKey");
        this.f350138a = j17;
        this.f350139b = z17;
        this.f350140c = serialTag;
        this.f350141d = storageKey;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz.a)) {
            return false;
        }
        oz.a aVar = (oz.a) obj;
        return this.f350138a == aVar.f350138a && this.f350139b == aVar.f350139b && kotlin.jvm.internal.o.b(this.f350140c, aVar.f350140c) && kotlin.jvm.internal.o.b(this.f350141d, aVar.f350141d);
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f350138a) * 31) + java.lang.Boolean.hashCode(this.f350139b)) * 31) + this.f350140c.hashCode()) * 31) + this.f350141d.hashCode();
    }

    public java.lang.String toString() {
        return "SceneConfig(checkDelayMs=" + this.f350138a + ", requiresAutoSyncEnabled=" + this.f350139b + ", serialTag=" + this.f350140c + ", storageKey=" + this.f350141d + ')';
    }
}
