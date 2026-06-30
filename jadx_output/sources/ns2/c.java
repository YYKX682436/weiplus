package ns2;

/* loaded from: classes3.dex */
public final class c implements i50.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ns2.b f339371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ns2.j f339372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f339373c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f339374d;

    public c(ns2.b bVar, ns2.j jVar, boolean z17, boolean z18) {
        this.f339371a = bVar;
        this.f339372b = jVar;
        this.f339373c = z17;
        this.f339374d = z18;
    }

    @Override // i50.n
    public void a(boolean z17) {
        ns2.b bVar = this.f339371a;
        if (zl2.t.a(bVar.f339357c) != null) {
            return;
        }
        android.content.Context context = bVar.f339355a;
        this.f339372b.getClass();
        if (this.f339373c) {
            db5.t7.m(context, context.getString(com.tencent.mm.R.string.e0o));
            return;
        }
        java.lang.String string = this.f339374d ? context.getString(com.tencent.mm.R.string.e0k) : context.getString(com.tencent.mm.R.string.e0j);
        kotlin.jvm.internal.o.d(string);
        db5.t7.m(context, string);
    }
}
