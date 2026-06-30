package hs3;

/* loaded from: classes8.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    public final int f284593a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f284594b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f284595c;

    public o(int i17, java.util.Map map, java.lang.String str) {
        this.f284593a = 0;
        this.f284593a = i17;
        this.f284594b = map;
        this.f284595c = str;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Response status:");
        sb6.append(this.f284593a);
        sb6.append(", cookie:");
        java.lang.Object obj = this.f284594b;
        if (obj == null) {
            obj = "";
        }
        sb6.append(obj);
        sb6.append(", content length :");
        java.lang.String str = this.f284595c;
        sb6.append(str != null ? str.length() : 0);
        return sb6.toString();
    }
}
