package g4;

/* loaded from: classes5.dex */
public final class x0 extends g4.y0 {

    /* renamed from: b, reason: collision with root package name */
    public static final g4.x0 f268604b = new g4.x0(true);

    /* renamed from: c, reason: collision with root package name */
    public static final g4.x0 f268605c = new g4.x0(false);

    public x0(boolean z17) {
        super(z17, null);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof g4.x0) {
            if (this.f268627a == ((g4.x0) obj).f268627a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f268627a);
    }

    public java.lang.String toString() {
        return "NotLoading(endOfPaginationReached=" + this.f268627a + ')';
    }
}
