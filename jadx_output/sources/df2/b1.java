package df2;

/* loaded from: classes3.dex */
public final class b1 implements p05.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f229768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.d1 f229769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f229770c;

    public b1(kotlin.jvm.internal.c0 c0Var, df2.d1 d1Var, kotlinx.coroutines.q qVar) {
        this.f229768a = c0Var;
        this.f229769b = d1Var;
        this.f229770c = qVar;
    }

    public void a() {
        kotlin.jvm.internal.c0 c0Var = this.f229768a;
        if (c0Var.f310112d) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f229769b.f229933m, hashCode() + ", animEnd");
        c0Var.f310112d = true;
        this.f229770c.resumeWith(kotlin.Result.m521constructorimpl("f"));
    }
}
