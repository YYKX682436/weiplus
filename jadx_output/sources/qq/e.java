package qq;

/* loaded from: classes.dex */
public final class e extends qq.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f365865a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f365866b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String title, java.lang.String str, int i17, kotlin.jvm.internal.i iVar) {
        super(null);
        str = (i17 & 2) != 0 ? null : str;
        kotlin.jvm.internal.o.g(title, "title");
        this.f365865a = title;
        this.f365866b = str;
    }

    @Override // qq.f
    public java.lang.String a() {
        return this.f365866b;
    }

    @Override // qq.f
    public java.lang.String b() {
        return this.f365865a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qq.e)) {
            return false;
        }
        qq.e eVar = (qq.e) obj;
        return kotlin.jvm.internal.o.b(this.f365865a, eVar.f365865a) && kotlin.jvm.internal.o.b(this.f365866b, eVar.f365866b);
    }

    public int hashCode() {
        int hashCode = this.f365865a.hashCode() * 31;
        java.lang.String str = this.f365866b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "EcsSettingGroupTitle(title=" + this.f365865a + ", key=" + this.f365866b + ')';
    }
}
