package y53;

/* loaded from: classes8.dex */
public final class d0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f459480a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c01.o8 f459481b;

    public d0(kotlin.jvm.internal.h0 h0Var, c01.o8 o8Var) {
        this.f459480a = h0Var;
        this.f459481b = o8Var;
    }

    @Override // c01.o8
    public final void a(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("GameLife.GetContactInterceptor", "[getContact] callback! succ=" + z17 + ", username=" + str + " talker=" + ((java.lang.String) this.f459480a.f310123d));
        c01.o8 o8Var = this.f459481b;
        if (o8Var != null) {
            o8Var.a(str, z17);
        }
    }
}
