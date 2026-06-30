package t21;

/* loaded from: classes4.dex */
public final /* synthetic */ class d3$$a implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        t21.v2 v2Var = (t21.v2) obj2;
        java.lang.String str = ((t21.v2) obj).B;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = v2Var.B;
        return str.compareTo(str2 != null ? str2 : "");
    }
}
