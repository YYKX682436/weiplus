package df2;

/* loaded from: classes3.dex */
public final class r9 implements p05.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f231236a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ df2.t9 f231237b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f231238c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f231239d;

    public r9(kotlin.jvm.internal.c0 c0Var, df2.t9 t9Var, int i17, kotlinx.coroutines.q qVar) {
        this.f231236a = c0Var;
        this.f231237b = t9Var;
        this.f231238c = i17;
        this.f231239d = qVar;
    }

    public void a() {
        kotlin.jvm.internal.c0 c0Var = this.f231236a;
        if (c0Var.f310112d) {
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f231237b.f231426m, hashCode() + ", animEnd, count:" + this.f231238c);
        c0Var.f310112d = true;
        this.f231239d.resumeWith(kotlin.Result.m521constructorimpl("f"));
    }
}
