package ec2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Boolean f250951a;

    public b(java.lang.Boolean bool) {
        this.f250951a = bool;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ec2.b) && kotlin.jvm.internal.o.b(this.f250951a, ((ec2.b) obj).f250951a);
    }

    public int hashCode() {
        java.lang.Boolean bool = this.f250951a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public java.lang.String toString() {
        return "FinderFeedFlowAdExtra(isHiddenAdsTag=" + this.f250951a + ')';
    }
}
