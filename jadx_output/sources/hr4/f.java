package hr4;

/* loaded from: classes8.dex */
public final class f implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f284253a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f284254b;

    public f(kotlin.jvm.internal.h0 h0Var, c01.o8 o8Var) {
        this.f284253a = h0Var;
        this.f284254b = o8Var;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("W1w.GetContactInterceptor", "[getContact] callback! succ=" + z17 + ", username=" + str + " talker=" + ((java.lang.String) this.f284253a.f310123d));
        c01.o8 o8Var = this.f284254b;
        if (o8Var != null) {
            o8Var.a(str, z17);
        }
    }
}
