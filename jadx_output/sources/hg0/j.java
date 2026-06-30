package hg0;

/* loaded from: classes12.dex */
public final class j implements java.util.function.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f281326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f281328c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f281329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f281330e;

    public j(kotlin.jvm.internal.c0 c0Var, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        this.f281326a = c0Var;
        this.f281327b = str;
        this.f281328c = z17;
        this.f281329d = z18;
        this.f281330e = z19;
    }

    @Override // java.util.function.Function
    public java.lang.Object apply(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        this.f281326a.f310112d = true;
        java.lang.String str = this.f281327b;
        boolean z17 = this.f281328c;
        boolean z18 = this.f281329d;
        boolean z19 = this.f281330e;
        boolean z27 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        return new hg0.g(str, z17, z18, z19, z19, android.os.SystemClock.elapsedRealtime(), null, 64, null);
    }
}
