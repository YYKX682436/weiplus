package lm2;

/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f319408a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f319409b;

    /* renamed from: c, reason: collision with root package name */
    public long f319410c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.qn f319411d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f319412e;

    public j0(java.lang.String boxId, java.util.ArrayList dataList, long j17, r45.qn bindBoxContext, java.lang.String str) {
        kotlin.jvm.internal.o.g(boxId, "boxId");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(bindBoxContext, "bindBoxContext");
        this.f319408a = boxId;
        this.f319409b = dataList;
        this.f319410c = j17;
        this.f319411d = bindBoxContext;
        this.f319412e = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm2.j0)) {
            return false;
        }
        lm2.j0 j0Var = (lm2.j0) obj;
        return kotlin.jvm.internal.o.b(this.f319408a, j0Var.f319408a) && kotlin.jvm.internal.o.b(this.f319409b, j0Var.f319409b) && this.f319410c == j0Var.f319410c && kotlin.jvm.internal.o.b(this.f319411d, j0Var.f319411d) && kotlin.jvm.internal.o.b(this.f319412e, j0Var.f319412e);
    }

    public int hashCode() {
        int hashCode = ((((((this.f319408a.hashCode() * 31) + this.f319409b.hashCode()) * 31) + java.lang.Long.hashCode(this.f319410c)) * 31) + this.f319411d.hashCode()) * 31;
        java.lang.String str = this.f319412e;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "BoxMsgInfo(boxId=" + this.f319408a + ", dataList=" + this.f319409b + ", lastEnterTimeStamp=" + this.f319410c + ", bindBoxContext=" + this.f319411d + ", boxName=" + this.f319412e + ')';
    }
}
