package hs3;

/* loaded from: classes8.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final int f284590a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f284591b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f284592c;

    public n(int i17, java.util.Map map, java.util.Map map2, hs3.p pVar) {
        this.f284590a = i17;
        this.f284591b = map;
        this.f284592c = map2;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Request method:");
        sb6.append(this.f284590a);
        sb6.append(", params:");
        java.lang.Object obj = this.f284591b;
        if (obj == null) {
            obj = "";
        }
        sb6.append(obj);
        sb6.append(", cookie:");
        java.util.Map map = this.f284592c;
        sb6.append(map != null ? map : "");
        return sb6.toString();
    }
}
