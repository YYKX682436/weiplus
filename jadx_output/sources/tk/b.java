package tk;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f419859a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f419860b;

    public b(android.view.View bizPublishView, java.lang.String bizCntWording) {
        kotlin.jvm.internal.o.g(bizPublishView, "bizPublishView");
        kotlin.jvm.internal.o.g(bizCntWording, "bizCntWording");
        this.f419859a = bizPublishView;
        this.f419860b = bizCntWording;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk.b)) {
            return false;
        }
        tk.b bVar = (tk.b) obj;
        return kotlin.jvm.internal.o.b(this.f419859a, bVar.f419859a) && kotlin.jvm.internal.o.b(this.f419860b, bVar.f419860b);
    }

    public int hashCode() {
        return (this.f419859a.hashCode() * 31) + this.f419860b.hashCode();
    }

    public java.lang.String toString() {
        return "BizPublishedInfo(bizPublishView=" + this.f419859a + ", bizCntWording=" + this.f419860b + ')';
    }
}
