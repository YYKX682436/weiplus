package gx0;

/* loaded from: classes5.dex */
public final class g5 implements com.tencent.maas.moviecomposing.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.util.Size f276448a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f276449b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f276450c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wt3.q f276451d;

    public g5(android.util.Size size, android.graphics.Bitmap bitmap, kotlin.coroutines.Continuation continuation, wt3.q qVar) {
        this.f276448a = size;
        this.f276449b = bitmap;
        this.f276450c = continuation;
        this.f276451d = qVar;
    }

    @Override // com.tencent.maas.moviecomposing.l0
    public final void a(com.tencent.maas.moviecomposing.m0 m0Var, int i17, com.tencent.maas.moviecomposing.n0 n0Var) {
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        kotlin.jvm.internal.o.g(m0Var, "<anonymous parameter 0>");
        android.util.Size size = this.f276448a;
        if (n0Var == null || (bitmap2 = n0Var.f48514a) == null || (bitmap = dx0.o.b(bitmap2, size)) == null) {
            bitmap = this.f276449b;
        }
        android.graphics.Bitmap bitmap3 = bitmap;
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f276450c.resumeWith(kotlin.Result.m521constructorimpl(this.f276451d.b(bitmap3, size.getWidth(), size.getHeight(), 0L)));
    }
}
