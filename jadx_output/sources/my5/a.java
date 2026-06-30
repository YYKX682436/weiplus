package my5;

/* loaded from: classes10.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f332852a;

    public a(int i17, int i18, java.util.ArrayList arrayList) {
        this.f332852a = arrayList;
    }

    public int[] a() {
        java.util.ArrayList arrayList = this.f332852a;
        if (arrayList == null || arrayList.size() == 0) {
            return null;
        }
        int size = arrayList.size();
        int[] iArr = new int[size * 2];
        for (int i17 = 0; i17 < size; i17++) {
            my5.c cVar = (my5.c) arrayList.get(i17);
            if (cVar != null) {
                int i18 = i17 * 2;
                long j17 = cVar.f332858b;
                iArr[i18] = (int) j17;
                iArr[i18 + 1] = (int) (j17 + cVar.f332859c);
            } else {
                int i19 = i17 * 2;
                iArr[i19] = 0;
                iArr[i19 + 1] = 0;
            }
        }
        return iArr;
    }

    public int b() {
        java.util.ArrayList arrayList = this.f332852a;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.ArrayList arrayList = this.f332852a;
        if (arrayList == null) {
            return null;
        }
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            my5.c cVar = (my5.c) arrayList.get(i17);
            sb6.append(i17);
            sb6.append(":");
            sb6.append(cVar.f332858b);
            sb6.append(":");
            sb6.append(cVar.f332857a);
            sb6.append(":");
            sb6.append(cVar.f332859c + cVar.f332858b);
            sb6.append("\n");
        }
        return sb6.toString();
    }
}
