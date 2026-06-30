package yz1;

/* loaded from: classes15.dex */
public abstract class n {
    public static java.lang.String a(yz1.g gVar, java.lang.String str) {
        java.util.ArrayList arrayList = gVar.f468502a;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (str.equals(arrayList.get(i17))) {
                return (java.lang.String) gVar.f468503b.get(i17);
            }
        }
        return null;
    }
}
