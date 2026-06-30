package e06;

/* loaded from: classes5.dex */
public class i implements java.lang.Iterable, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f246209d;

    /* renamed from: e, reason: collision with root package name */
    public final int f246210e;

    /* renamed from: f, reason: collision with root package name */
    public final int f246211f;

    public i(int i17, int i18, int i19) {
        if (i19 == 0) {
            throw new java.lang.IllegalArgumentException("Step must be non-zero.");
        }
        if (i19 == Integer.MIN_VALUE) {
            throw new java.lang.IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        this.f246209d = i17;
        this.f246210e = sz5.b.a(i17, i18, i19);
        this.f246211f = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof e06.i) {
            if (!isEmpty() || !((e06.i) obj).isEmpty()) {
                e06.i iVar = (e06.i) obj;
                if (this.f246209d != iVar.f246209d || this.f246210e != iVar.f246210e || this.f246211f != iVar.f246211f) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f246209d * 31) + this.f246210e) * 31) + this.f246211f;
    }

    public boolean isEmpty() {
        int i17 = this.f246211f;
        int i18 = this.f246210e;
        int i19 = this.f246209d;
        if (i17 > 0) {
            if (i19 > i18) {
                return true;
            }
        } else if (i19 < i18) {
            return true;
        }
        return false;
    }

    public final int j() {
        return this.f246209d;
    }

    public final int k() {
        return this.f246210e;
    }

    @Override // java.lang.Iterable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public kz5.x0 iterator() {
        return new e06.j(this.f246209d, this.f246210e, this.f246211f);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6;
        int i17 = this.f246210e;
        int i18 = this.f246209d;
        int i19 = this.f246211f;
        if (i19 > 0) {
            sb6 = new java.lang.StringBuilder();
            sb6.append(i18);
            sb6.append("..");
            sb6.append(i17);
            sb6.append(" step ");
            sb6.append(i19);
        } else {
            sb6 = new java.lang.StringBuilder();
            sb6.append(i18);
            sb6.append(" downTo ");
            sb6.append(i17);
            sb6.append(" step ");
            sb6.append(-i19);
        }
        return sb6.toString();
    }
}
