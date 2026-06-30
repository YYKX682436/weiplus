package v5;

/* loaded from: classes14.dex */
public final class i implements v5.g {

    /* renamed from: a, reason: collision with root package name */
    public static final v5.i f433284a = new v5.i();

    /* renamed from: b, reason: collision with root package name */
    public static final v5.e f433285b = new v5.e(new android.graphics.drawable.ColorDrawable(), false);

    /* renamed from: c, reason: collision with root package name */
    public static final x36.f0 f433286c = new x36.h();

    @Override // v5.g
    public boolean a(x36.m source, java.lang.String str) {
        kotlin.jvm.internal.o.g(source, "source");
        return false;
    }

    @Override // v5.g
    public java.lang.Object b(s5.a aVar, x36.m mVar, coil.size.Size size, v5.k kVar, kotlin.coroutines.Continuation continuation) {
        try {
            mVar.P0(f433286c);
            vz5.b.a(mVar, null);
            return f433285b;
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(mVar, th6);
                throw th7;
            }
        }
    }
}
