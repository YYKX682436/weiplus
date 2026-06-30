package um;

/* loaded from: classes8.dex */
public final class l implements um.m {

    /* renamed from: d, reason: collision with root package name */
    public int f428686d;

    /* renamed from: e, reason: collision with root package name */
    public float f428687e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f428688f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f428689g;

    public l() {
        oj0.c cVar = oj0.c.f345726a;
        java.util.List list = oj0.c.f345727b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new xk0.g(((oj0.a) it.next()).f345721a));
        }
        this.f428688f = arrayList;
    }

    @Override // um.m
    public int A3(boolean z17) {
        return 0;
    }

    @Override // um.m
    public void M(android.graphics.Canvas canvas, boolean z17) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Bitmap bitmap = this.f428689g;
        if (bitmap != null) {
            ((xk0.g) ((java.util.ArrayList) this.f428688f).get(this.f428686d)).a(canvas, bitmap, this.f428687e);
        }
    }

    @Override // um.m
    public void O3(android.graphics.Canvas canvas) {
        kotlin.jvm.internal.o.g(canvas, "canvas");
        android.graphics.Bitmap bitmap = this.f428689g;
        if (bitmap != null) {
            ((xk0.g) ((java.util.ArrayList) this.f428688f).get(this.f428686d)).a(canvas, bitmap, this.f428687e);
        }
    }

    @Override // um.m
    public void R2(boolean z17) {
        this.f428686d = 0;
        this.f428687e = 0.0f;
    }

    @Override // um.m
    public /* bridge */ /* synthetic */ void add(java.lang.Object obj) {
    }

    @Override // um.m
    public void clear() {
    }

    public java.lang.Object clone() {
        return new java.lang.Object();
    }

    @Override // um.m
    public void f3(boolean z17) {
    }

    @Override // um.m
    public void o5() {
    }

    @Override // um.m
    public void onCreate() {
    }

    @Override // um.m
    public void onDestroy() {
    }

    @Override // um.m
    public java.lang.Object pop() {
        return new xk0.g(1);
    }
}
