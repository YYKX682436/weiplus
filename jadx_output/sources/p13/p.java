package p13;

/* loaded from: classes12.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f351123a = new java.util.ArrayList();

    public java.lang.String a() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f351123a).iterator();
        while (it.hasNext()) {
            p13.o oVar = (p13.o) it.next();
            if (!arrayList.contains(oVar.f351121b)) {
                arrayList.add(oVar.f351121b);
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            java.lang.String str = (java.lang.String) arrayList.get(i17);
            sb6.append("\"");
            sb6.append(str);
            char charAt = str.charAt(str.length() - 1);
            if (o13.s.b(charAt) || o13.s.f342263i.a(charAt)) {
                sb6.append("\"*");
            } else {
                sb6.append("\"");
            }
            if (i17 != arrayList.size() - 1) {
                sb6.append(" OR ");
            }
        }
        return sb6.toString();
    }
}
