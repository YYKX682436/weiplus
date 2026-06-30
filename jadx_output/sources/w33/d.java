package w33;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public boolean f442713a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f442714b;

    public d(boolean z17, boolean z18, boolean z19) {
        this.f442713a = z18;
        this.f442714b = z19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w33.d)) {
            return false;
        }
        w33.d dVar = (w33.d) obj;
        dVar.getClass();
        return this.f442713a == dVar.f442713a && this.f442714b == dVar.f442714b;
    }

    public int hashCode() {
        return (((java.lang.Boolean.hashCode(true) * 31) + java.lang.Boolean.hashCode(this.f442713a)) * 31) + java.lang.Boolean.hashCode(this.f442714b);
    }

    public java.lang.String toString() {
        return "MyRoomFooterDataWrapper(isShowFooter=true, isExpanded=" + this.f442713a + ", hasUnreadMsg=" + this.f442714b + ')';
    }
}
