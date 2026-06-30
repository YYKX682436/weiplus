package pm3;

/* loaded from: classes10.dex */
public final class b extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final r45.oc5 f356870b;

    public b(r45.oc5 previewDataObj) {
        kotlin.jvm.internal.o.g(previewDataObj, "previewDataObj");
        this.f356870b = previewDataObj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pm3.b) && kotlin.jvm.internal.o.b(this.f356870b, ((pm3.b) obj).f356870b);
    }

    public int hashCode() {
        return this.f356870b.hashCode();
    }

    public java.lang.String toString() {
        return "InitAction(previewDataObj=" + this.f356870b + ')';
    }
}
