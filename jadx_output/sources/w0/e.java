package w0;

/* loaded from: classes13.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f441832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f441833e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w0.s f441834f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(n0.v2 v2Var, java.lang.Object obj, w0.s sVar) {
        super(0);
        this.f441832d = v2Var;
        this.f441833e = obj;
        this.f441834f = sVar;
    }

    @Override // yz5.a
    public final java.lang.Object invoke() {
        w0.x xVar = (w0.x) this.f441832d.getValue();
        w0.d dVar = new w0.d(this.f441834f);
        w0.a0 a0Var = (w0.a0) xVar;
        a0Var.getClass();
        return a0Var.f441827a.invoke(dVar, this.f441833e);
    }
}
