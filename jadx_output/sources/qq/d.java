package qq;

/* loaded from: classes.dex */
public final class d extends qq.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f365862a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f365863b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.l f365864c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String title, java.lang.String key, yz5.l action) {
        super(null);
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(action, "action");
        this.f365862a = title;
        this.f365863b = key;
        this.f365864c = action;
    }

    @Override // qq.f
    public java.lang.String a() {
        return this.f365863b;
    }

    @Override // qq.f
    public java.lang.String b() {
        return this.f365862a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq.d)) {
            return false;
        }
        qq.d dVar = (qq.d) obj;
        return kotlin.jvm.internal.o.b(this.f365862a, dVar.f365862a) && kotlin.jvm.internal.o.b(this.f365863b, dVar.f365863b) && kotlin.jvm.internal.o.b(this.f365864c, dVar.f365864c);
    }

    public int hashCode() {
        return (((this.f365862a.hashCode() * 31) + this.f365863b.hashCode()) * 31) + this.f365864c.hashCode();
    }

    public java.lang.String toString() {
        return "EcsSettingButton(title=" + this.f365862a + ", key=" + this.f365863b + ", action=" + this.f365864c + ')';
    }
}
