package ha3;

/* loaded from: classes11.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public int f279895a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.StringBuilder f279896b = new java.lang.StringBuilder();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f279897c = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f279898d = new java.util.LinkedHashMap();

    public final void a(java.lang.String str) {
        if (str.length() == 0) {
            return;
        }
        java.lang.StringBuilder sb6 = this.f279896b;
        sb6.append(str);
        sb6.append("\n");
    }

    public final ha3.m0 b(int i17) {
        if (i17 < 0) {
            return null;
        }
        java.util.List list = this.f279897c;
        if (i17 >= ((java.util.ArrayList) list).size()) {
            return null;
        }
        java.lang.String str = ((ha3.m0) ((java.util.ArrayList) list).get(i17)).f279902c;
        if (str == null) {
            str = "";
        }
        return (ha3.m0) ((java.util.LinkedHashMap) this.f279898d).get(str);
    }
}
