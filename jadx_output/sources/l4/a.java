package l4;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final p4.e f315703a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f315704b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f315705c;

    /* renamed from: d, reason: collision with root package name */
    public final l4.p f315706d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.Executor f315707e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.Executor f315708f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f315709g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f315710h;

    public a(android.content.Context context, java.lang.String str, p4.e eVar, l4.p pVar, java.util.List list, boolean z17, l4.o oVar, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, boolean z18, boolean z19, boolean z27, java.util.Set set, java.lang.String str2, java.io.File file) {
        this.f315703a = eVar;
        this.f315704b = context;
        this.f315705c = str;
        this.f315706d = pVar;
        this.f315707e = executor;
        this.f315708f = executor2;
        this.f315709g = z19;
        this.f315710h = z27;
    }

    public boolean a(int i17, int i18) {
        return !((i17 > i18) && this.f315710h) && this.f315709g;
    }
}
