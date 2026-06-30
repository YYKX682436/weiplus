package x51;

/* loaded from: classes16.dex */
public class d0 implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Callable f451984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m3.a f451985b;

    public d0(java.util.concurrent.Callable callable, m3.a aVar) {
        this.f451984a = callable;
        this.f451985b = aVar;
    }

    @Override // m3.a
    public void accept(java.lang.Object obj) {
        x51.c0 c0Var = new x51.c0(this, (java.lang.Boolean) obj);
        java.util.concurrent.Executor executor = p5.m.f351983g;
        p5.n nVar = new p5.n();
        try {
            ((p5.e) executor).execute(new p5.l(null, nVar, c0Var));
        } catch (java.lang.Exception e17) {
            nVar.a(new p5.i(e17));
        }
        x51.b0 b0Var = new x51.b0(this);
        java.util.concurrent.Executor executor2 = com.tencent.mm.platformtools.ExportFileUtil.f72401a;
        if (executor2 == null) {
            executor2 = p5.m.f351984h;
        }
        nVar.f351990a.a(b0Var, executor2, null).a(new x51.a0(this), p5.m.f351984h, null);
    }
}
