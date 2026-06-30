package qq;

/* loaded from: classes.dex */
public final class g extends qq.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f365867a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f365868b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f365869c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f365870d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f365871e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String title, java.lang.String key, java.util.List options, java.lang.Object defaultValue, java.lang.String storageKey) {
        super(null);
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(options, "options");
        kotlin.jvm.internal.o.g(defaultValue, "defaultValue");
        kotlin.jvm.internal.o.g(storageKey, "storageKey");
        this.f365867a = title;
        this.f365868b = key;
        this.f365869c = options;
        this.f365870d = defaultValue;
        this.f365871e = storageKey;
    }

    @Override // qq.f
    public java.lang.String a() {
        return this.f365868b;
    }

    @Override // qq.f
    public java.lang.String b() {
        return this.f365867a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq.g)) {
            return false;
        }
        qq.g gVar = (qq.g) obj;
        return kotlin.jvm.internal.o.b(this.f365867a, gVar.f365867a) && kotlin.jvm.internal.o.b(this.f365868b, gVar.f365868b) && kotlin.jvm.internal.o.b(this.f365869c, gVar.f365869c) && kotlin.jvm.internal.o.b(this.f365870d, gVar.f365870d) && kotlin.jvm.internal.o.b(this.f365871e, gVar.f365871e);
    }

    public int hashCode() {
        return (((((((this.f365867a.hashCode() * 31) + this.f365868b.hashCode()) * 31) + this.f365869c.hashCode()) * 31) + this.f365870d.hashCode()) * 31) + this.f365871e.hashCode();
    }

    public java.lang.String toString() {
        return "EcsSettingSwitch(title=" + this.f365867a + ", key=" + this.f365868b + ", options=" + this.f365869c + ", defaultValue=" + this.f365870d + ", storageKey=" + this.f365871e + ')';
    }
}
