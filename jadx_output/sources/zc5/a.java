package zc5;

/* loaded from: classes12.dex */
public final class a extends zc5.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f471439a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(java.lang.String localPath) {
        super(null);
        kotlin.jvm.internal.o.g(localPath, "localPath");
        this.f471439a = localPath;
    }

    @Override // zc5.f
    public java.lang.String a() {
        return this.f471439a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc5.a) && kotlin.jvm.internal.o.b(this.f471439a, ((zc5.a) obj).f471439a);
    }

    public int hashCode() {
        return this.f471439a.hashCode();
    }

    public java.lang.String toString() {
        return "AlreadyExists(localPath=" + this.f471439a + ')';
    }
}
