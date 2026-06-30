package jh5;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final jh5.b f299866d = new jh5.b("", "", "");

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f299867a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f299868b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f299869c;

    public b(java.lang.String eggKey, java.lang.String eggId, java.lang.String sceneId) {
        kotlin.jvm.internal.o.g(eggKey, "eggKey");
        kotlin.jvm.internal.o.g(eggId, "eggId");
        kotlin.jvm.internal.o.g(sceneId, "sceneId");
        this.f299867a = eggKey;
        this.f299868b = eggId;
        this.f299869c = sceneId;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jh5.b)) {
            return false;
        }
        jh5.b bVar = (jh5.b) obj;
        return kotlin.jvm.internal.o.b(this.f299867a, bVar.f299867a) && kotlin.jvm.internal.o.b(this.f299868b, bVar.f299868b) && kotlin.jvm.internal.o.b(this.f299869c, bVar.f299869c);
    }

    public int hashCode() {
        return (((this.f299867a.hashCode() * 31) + this.f299868b.hashCode()) * 31) + this.f299869c.hashCode();
    }

    public java.lang.String toString() {
        return "MagicEmojiEggMeta(eggKey=" + this.f299867a + ", eggId=" + this.f299868b + ", sceneId=" + this.f299869c + ')';
    }
}
