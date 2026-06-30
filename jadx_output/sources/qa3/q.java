package qa3;

/* loaded from: classes11.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f361059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f361060e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f361061f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qa3.s f361062g;

    public q(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.c0 c0Var2, qa3.s sVar) {
        this.f361059d = h0Var;
        this.f361060e = c0Var;
        this.f361061f = c0Var2;
        this.f361062g = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        ((com.tencent.mm.feature.lite.i) g0Var).kk(com.tencent.mm.sdk.platformtools.x2.f193071a, (android.os.Bundle) this.f361059d.f310123d, this.f361060e.f310112d, this.f361061f.f310112d, new qa3.p(this.f361062g));
    }
}
