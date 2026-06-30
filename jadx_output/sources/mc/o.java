package mc;

/* loaded from: classes.dex */
public final class o implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return ((java.lang.Integer) ((java.util.Map.Entry) obj2).getValue()).compareTo((java.lang.Integer) ((java.util.Map.Entry) obj).getValue());
    }
}
