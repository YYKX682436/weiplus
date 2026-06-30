package g4;

/* loaded from: classes5.dex */
public final class z4 extends g4.b5 {

    /* renamed from: e, reason: collision with root package name */
    public final int f268658e;

    /* renamed from: f, reason: collision with root package name */
    public final int f268659f;

    public z4(int i17, int i18, int i19, int i27, int i28, int i29) {
        super(i19, i27, i28, i29, null);
        this.f268658e = i17;
        this.f268659f = i18;
    }

    @Override // g4.b5
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.z4)) {
            return false;
        }
        g4.z4 z4Var = (g4.z4) obj;
        if (this.f268658e == z4Var.f268658e && this.f268659f == z4Var.f268659f) {
            if (this.f268215a == z4Var.f268215a) {
                if (this.f268216b == z4Var.f268216b) {
                    if (this.f268217c == z4Var.f268217c) {
                        if (this.f268218d == z4Var.f268218d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // g4.b5
    public int hashCode() {
        return super.hashCode() + java.lang.Integer.hashCode(this.f268658e) + java.lang.Integer.hashCode(this.f268659f);
    }

    public java.lang.String toString() {
        return r26.b0.c("ViewportHint.Access(\n            |    pageOffset=" + this.f268658e + ",\n            |    indexInPage=" + this.f268659f + ",\n            |    presentedItemsBefore=" + this.f268215a + ",\n            |    presentedItemsAfter=" + this.f268216b + ",\n            |    originalPageOffsetFirst=" + this.f268217c + ",\n            |    originalPageOffsetLast=" + this.f268218d + ",\n            |)", null, 1, null);
    }
}
