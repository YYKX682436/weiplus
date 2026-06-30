package yg2;

/* loaded from: classes3.dex */
public class b implements kotlinx.coroutines.y0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.y f462317d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f462318e;

    /* renamed from: f, reason: collision with root package name */
    public final oz5.l f462319f;

    /* renamed from: g, reason: collision with root package name */
    public final im5.c f462320g;

    public b(androidx.lifecycle.y lifecycleOwner, java.lang.String str) {
        kotlin.jvm.internal.o.g(lifecycleOwner, "lifecycleOwner");
        this.f462317d = lifecycleOwner;
        this.f462318e = str;
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        this.f462319f = ((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a).plus(new kotlinx.coroutines.x0(str == null ? "LiveScope" : str));
        this.f462320g = new im5.c();
        pm0.v.X(new yg2.a(this));
    }

    @Override // kotlinx.coroutines.y0
    public oz5.l getCoroutineContext() {
        return this.f462319f;
    }
}
