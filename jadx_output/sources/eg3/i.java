package eg3;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f252663a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f252664b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f252665c;

    public i(java.lang.String filePath, java.lang.String fileId, java.lang.String aesKey) {
        kotlin.jvm.internal.o.g(filePath, "filePath");
        kotlin.jvm.internal.o.g(fileId, "fileId");
        kotlin.jvm.internal.o.g(aesKey, "aesKey");
        this.f252663a = filePath;
        this.f252664b = fileId;
        this.f252665c = aesKey;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eg3.i)) {
            return false;
        }
        eg3.i iVar = (eg3.i) obj;
        return kotlin.jvm.internal.o.b(this.f252663a, iVar.f252663a) && kotlin.jvm.internal.o.b(this.f252664b, iVar.f252664b) && kotlin.jvm.internal.o.b(this.f252665c, iVar.f252665c);
    }

    public int hashCode() {
        return (((this.f252663a.hashCode() * 31) + this.f252664b.hashCode()) * 31) + this.f252665c.hashCode();
    }

    public java.lang.String toString() {
        return "TranslationParam(filePath=" + this.f252663a + ", fileId=" + this.f252664b + ", aesKey=" + this.f252665c + ')';
    }

    public /* synthetic */ i(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3);
    }
}
