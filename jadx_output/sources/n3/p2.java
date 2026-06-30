package n3;

/* loaded from: classes14.dex */
public class p2 extends android.view.WindowInsetsAnimation.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final n3.j2 f334385a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f334386b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f334387c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f334388d;

    public p2(n3.j2 j2Var) {
        super(j2Var.f334348b);
        this.f334388d = new java.util.HashMap();
        this.f334385a = j2Var;
    }

    public final n3.s2 a(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        n3.s2 s2Var = (n3.s2) this.f334388d.get(windowInsetsAnimation);
        if (s2Var != null) {
            return s2Var;
        }
        n3.s2 s2Var2 = new n3.s2(windowInsetsAnimation);
        this.f334388d.put(windowInsetsAnimation, s2Var2);
        return s2Var2;
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this.f334385a.b(a(windowInsetsAnimation));
        this.f334388d.remove(windowInsetsAnimation);
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this.f334385a.c(a(windowInsetsAnimation));
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List list) {
        java.util.ArrayList arrayList = this.f334387c;
        if (arrayList == null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
            this.f334387c = arrayList2;
            this.f334386b = java.util.Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                return this.f334385a.d(n3.g3.i(windowInsets, null), this.f334386b).h();
            }
            android.view.WindowInsetsAnimation windowInsetsAnimation = (android.view.WindowInsetsAnimation) list.get(size);
            n3.s2 a17 = a(windowInsetsAnimation);
            a17.f334406a.d(windowInsetsAnimation.getFraction());
            this.f334387c.add(a17);
        }
    }

    @Override // android.view.WindowInsetsAnimation.Callback
    public android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation windowInsetsAnimation, android.view.WindowInsetsAnimation.Bounds bounds) {
        n3.i2 e17 = this.f334385a.e(a(windowInsetsAnimation), new n3.i2(bounds));
        e17.getClass();
        return new android.view.WindowInsetsAnimation.Bounds(e17.f334343a.e(), e17.f334344b.e());
    }
}
