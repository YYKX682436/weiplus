package kw2;

/* loaded from: classes5.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f313009a;

    /* renamed from: b, reason: collision with root package name */
    public int f313010b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f313011c;

    /* renamed from: d, reason: collision with root package name */
    public long f313012d;

    public f0(java.lang.String mediaId) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        this.f313009a = mediaId;
        this.f313011c = "";
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kw2.f0) && kotlin.jvm.internal.o.b(this.f313009a, ((kw2.f0) obj).f313009a);
    }

    public int hashCode() {
        return this.f313009a.hashCode();
    }

    public java.lang.String toString() {
        return "ReportTaskInfo(mediaId=" + this.f313009a + ')';
    }
}
