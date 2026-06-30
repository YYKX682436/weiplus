package h5;

/* loaded from: classes13.dex */
public abstract class f {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f278986f = a5.a0.e("ConstraintTracker");

    /* renamed from: a, reason: collision with root package name */
    public final m5.a f278987a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f278988b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f278989c = new java.lang.Object();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f278990d = new java.util.LinkedHashSet();

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f278991e;

    public f(android.content.Context context, m5.a aVar) {
        this.f278988b = context.getApplicationContext();
        this.f278987a = aVar;
    }

    public abstract java.lang.Object a();

    public void b(java.lang.Object obj) {
        synchronized (this.f278989c) {
            java.lang.Object obj2 = this.f278991e;
            if (obj2 != obj && (obj2 == null || !obj2.equals(obj))) {
                this.f278991e = obj;
                java.util.ArrayList arrayList = new java.util.ArrayList(this.f278990d);
                ((m5.b) ((m5.c) this.f278987a).f323472c).execute(new h5.e(this, arrayList));
            }
        }
    }

    public abstract void c();

    public abstract void d();
}
