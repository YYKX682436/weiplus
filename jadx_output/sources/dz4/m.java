package dz4;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f245345a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f245346b;

    /* renamed from: c, reason: collision with root package name */
    public final android.net.Uri f245347c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f245348d;

    public m(int i17, java.lang.String text, android.net.Uri uri, java.lang.String str, int i18, kotlin.jvm.internal.i iVar) {
        text = (i18 & 2) != 0 ? "" : text;
        uri = (i18 & 4) != 0 ? null : uri;
        str = (i18 & 8) != 0 ? null : str;
        kotlin.jvm.internal.o.g(text, "text");
        this.f245345a = i17;
        this.f245346b = text;
        this.f245347c = uri;
        this.f245348d = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.m)) {
            return false;
        }
        dz4.m mVar = (dz4.m) obj;
        return this.f245345a == mVar.f245345a && kotlin.jvm.internal.o.b(this.f245346b, mVar.f245346b) && kotlin.jvm.internal.o.b(this.f245347c, mVar.f245347c) && kotlin.jvm.internal.o.b(this.f245348d, mVar.f245348d);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f245345a) * 31) + this.f245346b.hashCode()) * 31;
        android.net.Uri uri = this.f245347c;
        int hashCode2 = (hashCode + (uri == null ? 0 : uri.hashCode())) * 31;
        java.lang.String str = this.f245348d;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ClipBoardItemData(type=" + this.f245345a + ", text=" + this.f245346b + ", uri=" + this.f245347c + ", mimeType=" + this.f245348d + ')';
    }
}
