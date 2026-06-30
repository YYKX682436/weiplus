package zy2;

/* loaded from: classes2.dex */
public final class n7 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f477484a;

    public n7(boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        this.f477484a = (i17 & 1) != 0 ? false : z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zy2.n7) && this.f477484a == ((zy2.n7) obj).f477484a;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f477484a);
    }

    public java.lang.String toString() {
        return "LongPressQuickReleaseTipsStatus(enableLongPressQuickReleaseItemHighlight=" + this.f477484a + ')';
    }
}
