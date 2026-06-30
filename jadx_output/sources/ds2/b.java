package ds2;

/* loaded from: classes2.dex */
public final class b implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String string = ((r45.vf2) obj).getString(0);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(string != null ? string.hashCode() : 0);
        java.lang.String string2 = ((r45.vf2) obj2).getString(0);
        return mz5.a.b(valueOf, java.lang.Integer.valueOf(string2 != null ? string2.hashCode() : 0));
    }
}
