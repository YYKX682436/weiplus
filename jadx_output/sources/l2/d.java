package l2;

/* loaded from: classes14.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final l2.d f315111b = new l2.d(l2.c.f315109b, 17, null);

    /* renamed from: a, reason: collision with root package name */
    public final int f315112a;

    public d(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this.f315112a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2.d)) {
            return false;
        }
        int i17 = ((l2.d) obj).f315112a;
        int i18 = l2.c.f315108a;
        return this.f315112a == i17;
    }

    public int hashCode() {
        int i17 = l2.c.f315108a;
        return (java.lang.Integer.hashCode(this.f315112a) * 31) + java.lang.Integer.hashCode(17);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LineHeightStyle(alignment=");
        int i17 = this.f315112a;
        if (i17 == 0) {
            int i18 = l2.c.f315108a;
            str = "LineHeightStyle.Alignment.Top";
        } else if (i17 == l2.c.f315108a) {
            str = "LineHeightStyle.Alignment.Center";
        } else if (i17 == l2.c.f315109b) {
            str = "LineHeightStyle.Alignment.Proportional";
        } else if (i17 == l2.c.f315110c) {
            str = "LineHeightStyle.Alignment.Bottom";
        } else {
            str = "LineHeightStyle.Alignment(topPercentage = " + i17 + ')';
        }
        sb6.append((java.lang.Object) str);
        sb6.append(", trim=");
        sb6.append((java.lang.Object) "LineHeightStyle.Trim.Both");
        sb6.append(')');
        return sb6.toString();
    }
}
