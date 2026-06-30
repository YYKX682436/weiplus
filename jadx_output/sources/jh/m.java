package jh;

/* loaded from: classes13.dex */
public class m {

    /* renamed from: h, reason: collision with root package name */
    public static volatile jh.p f299724h;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f299726b;

    /* renamed from: c, reason: collision with root package name */
    public jh.l f299727c;

    /* renamed from: d, reason: collision with root package name */
    public jh.k f299728d;

    /* renamed from: e, reason: collision with root package name */
    public jh.t f299729e;

    /* renamed from: f, reason: collision with root package name */
    public jh.c0 f299730f;

    /* renamed from: a, reason: collision with root package name */
    public boolean f299725a = false;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f299731g = {false};

    public static jh.n a(jh.m mVar) {
        if (!mVar.f299725a) {
            return new jh.i(null);
        }
        jh.j jVar = new jh.j(mVar.f299726b);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("enable-logger", mVar.f299730f.f299684l);
        bundle.putString("path-of-xlog-so", mVar.f299730f.f299685m);
        if (jVar.b(mVar.f299730f.f299673a, bundle)) {
            return jVar;
        }
        return null;
    }

    public static boolean b(jh.m mVar, java.lang.String str, int i17) {
        boolean z17 = !(jh.z.a(mVar.f299730f.f299673a, jh.a0.k(str, i17)) < 3);
        if (z17) {
            oj.j.f("Matrix.WarmUpDelegate", "Elf file %s:%s has blocked and will not do warm-up.", str, java.lang.Integer.valueOf(i17));
        }
        return z17;
    }

    public static void c(jh.m mVar, jh.n nVar) {
        if (mVar.f299725a) {
            ((jh.j) nVar).f299713a.a(mVar.f299730f.f299673a);
        }
    }
}
