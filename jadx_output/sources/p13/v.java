package p13;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final p13.u f351156a;

    /* renamed from: b, reason: collision with root package name */
    public p13.c f351157b;

    /* renamed from: c, reason: collision with root package name */
    public int f351158c;

    /* renamed from: d, reason: collision with root package name */
    public p13.r f351159d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f351160e = new java.util.ArrayList();

    public v(p13.u uVar) {
        this.f351156a = uVar;
    }

    public java.lang.String toString() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Integer.valueOf(this.f351158c);
        java.util.List list = this.f351160e;
        objArr[1] = java.lang.Integer.valueOf(list != null ? list.size() : 0);
        return java.lang.String.format("{resultCode: %d, resultSize: %d}", objArr);
    }
}
