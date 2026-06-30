package lc3;

/* loaded from: classes7.dex */
public final class m0 extends lc3.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f317910a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(java.lang.String wxaPath) {
        super(null);
        kotlin.jvm.internal.o.g(wxaPath, "wxaPath");
        this.f317910a = wxaPath;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lc3.m0) && kotlin.jvm.internal.o.b(this.f317910a, ((lc3.m0) obj).f317910a);
    }

    public int hashCode() {
        return this.f317910a.hashCode();
    }

    public java.lang.String toString() {
        return "FilePkgFsDescriptor(wxaPath=" + this.f317910a + ')';
    }
}
