package fu5;

/* loaded from: classes15.dex */
public class d {

    /* renamed from: e, reason: collision with root package name */
    public static volatile fu5.d f266911e;

    /* renamed from: a, reason: collision with root package name */
    public boolean f266912a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f266913b = false;

    /* renamed from: c, reason: collision with root package name */
    public android.util.SparseArray f266914c = new android.util.SparseArray(10);

    /* renamed from: d, reason: collision with root package name */
    public android.content.SharedPreferences f266915d = null;

    public static fu5.d b() {
        fu5.d dVar;
        if (f266911e != null) {
            return f266911e;
        }
        synchronized (fu5.d.class) {
            if (f266911e == null) {
                f266911e = new fu5.d();
            }
            dVar = f266911e;
        }
        return dVar;
    }

    public android.util.SparseArray a() {
        android.util.SparseArray sparseArray;
        synchronized (fu5.d.class) {
            sparseArray = this.f266914c;
        }
        return sparseArray;
    }

    public android.content.SharedPreferences c() {
        android.content.SharedPreferences sharedPreferences;
        synchronized (fu5.d.class) {
            sharedPreferences = this.f266915d;
        }
        return sharedPreferences;
    }

    public boolean d() {
        boolean z17;
        synchronized (fu5.d.class) {
            z17 = this.f266912a;
        }
        return z17;
    }

    public boolean e() {
        boolean z17;
        synchronized (fu5.d.class) {
            z17 = this.f266913b;
        }
        return z17;
    }
}
