package rq1;

/* loaded from: classes2.dex */
public class b0 implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        r45.gb7 gb7Var = (r45.gb7) obj;
        r45.gb7 gb7Var2 = (r45.gb7) obj2;
        try {
            int i17 = gb7Var2.f375077e - gb7Var.f375077e;
            return i17 == 0 ? gb7Var2.f375076d.length() - gb7Var.f375076d.length() : i17;
        } catch (java.lang.Exception unused) {
            return 0;
        }
    }
}
