package ru0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399655a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f399656b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f399657c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.VocalAdjustmentParams f399658d;

    public b(java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.maas.moviecomposing.VocalAdjustmentParams vocalAdjustmentParams) {
        this.f399655a = str;
        this.f399656b = str2;
        this.f399657c = str3;
        this.f399658d = vocalAdjustmentParams;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0.b)) {
            return false;
        }
        ru0.b bVar = (ru0.b) obj;
        return kotlin.jvm.internal.o.b(this.f399655a, bVar.f399655a) && kotlin.jvm.internal.o.b(this.f399656b, bVar.f399656b) && kotlin.jvm.internal.o.b(this.f399657c, bVar.f399657c) && kotlin.jvm.internal.o.b(this.f399658d, bVar.f399658d);
    }

    public int hashCode() {
        java.lang.String str = this.f399655a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f399656b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f399657c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        com.tencent.maas.moviecomposing.VocalAdjustmentParams vocalAdjustmentParams = this.f399658d;
        return hashCode3 + (vocalAdjustmentParams != null ? vocalAdjustmentParams.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MJAudioResult(recordId=" + this.f399655a + ", audioFilePath=" + this.f399656b + ", silkFilePath=" + this.f399657c + ", boostParams=" + this.f399658d + ')';
    }
}
