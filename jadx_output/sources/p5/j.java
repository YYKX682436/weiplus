package p5;

/* loaded from: classes16.dex */
public class j implements p5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p5.n f351974a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p5.h f351975b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.Executor f351976c;

    public j(p5.m mVar, p5.n nVar, p5.h hVar, java.util.concurrent.Executor executor, p5.g gVar) {
        this.f351974a = nVar;
        this.f351975b = hVar;
        this.f351976c = executor;
    }

    @Override // p5.h
    public java.lang.Object a(p5.m mVar) {
        p5.h hVar = this.f351975b;
        java.util.concurrent.Executor executor = this.f351976c;
        p5.n nVar = this.f351974a;
        try {
            executor.execute(new p5.k(null, nVar, hVar, mVar));
        } catch (java.lang.Exception e17) {
            nVar.a(new p5.i(e17));
        }
        return null;
    }
}
