package lc3;

/* loaded from: classes7.dex */
public final class d extends lc3.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.res.AssetFileDescriptor f317893a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.res.AssetFileDescriptor assetFileDescriptor) {
        super(null);
        kotlin.jvm.internal.o.g(assetFileDescriptor, "assetFileDescriptor");
        this.f317893a = assetFileDescriptor;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc3.d) && kotlin.jvm.internal.o.b(this.f317893a, ((lc3.d) obj).f317893a);
    }

    public int hashCode() {
        return this.f317893a.hashCode();
    }

    public java.lang.String toString() {
        return "MBAssetFileScriptDescriptor(assetFileDescriptor=" + this.f317893a + ')';
    }
}
