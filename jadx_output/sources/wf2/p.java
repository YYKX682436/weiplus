package wf2;

/* loaded from: classes.dex */
public final class p implements ep0.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f445611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f445612b;

    public p(kotlin.jvm.internal.c0 c0Var, kotlinx.coroutines.q qVar) {
        this.f445611a = c0Var;
        this.f445612b = qVar;
    }

    @Override // ep0.e
    public void a(ip0.a aVar, cp0.n nVar, java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        kotlin.jvm.internal.c0 c0Var = this.f445611a;
        if (c0Var.f310112d) {
            return;
        }
        c0Var.f310112d = true;
        ((kotlinx.coroutines.r) this.f445612b).resumeWith(kotlin.Result.m521constructorimpl(bitmap));
    }
}
