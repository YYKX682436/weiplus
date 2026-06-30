package zk;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f473349a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.storage.f9 f473350b;

    public b(java.lang.String fileId, com.tencent.mm.storage.f9 msgInfo) {
        kotlin.jvm.internal.o.g(fileId, "fileId");
        kotlin.jvm.internal.o.g(msgInfo, "msgInfo");
        this.f473349a = fileId;
        this.f473350b = msgInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk.b)) {
            return false;
        }
        zk.b bVar = (zk.b) obj;
        return kotlin.jvm.internal.o.b(this.f473349a, bVar.f473349a) && kotlin.jvm.internal.o.b(this.f473350b, bVar.f473350b);
    }

    public int hashCode() {
        return (this.f473349a.hashCode() * 31) + this.f473350b.hashCode();
    }

    public java.lang.String toString() {
        return "FileIdWithMsg(fileId=" + this.f473349a + ", msgInfo=" + this.f473350b + ')';
    }
}
