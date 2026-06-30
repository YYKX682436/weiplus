package zc5;

/* loaded from: classes12.dex */
public final class d extends zc5.f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f471442a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(java.lang.String localPath) {
        super(null);
        kotlin.jvm.internal.o.g(localPath, "localPath");
        this.f471442a = localPath;
    }

    @Override // zc5.f
    public java.lang.String a() {
        return this.f471442a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zc5.d) && kotlin.jvm.internal.o.b(this.f471442a, ((zc5.d) obj).f471442a);
    }

    public int hashCode() {
        return this.f471442a.hashCode();
    }

    public java.lang.String toString() {
        return "Success(localPath=" + this.f471442a + ')';
    }
}
