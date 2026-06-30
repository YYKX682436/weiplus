package fa3;

/* loaded from: classes10.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260750d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fa3.d f260751e;

    public c(fa3.d dVar, java.lang.String str) {
        this.f260751e = dVar;
        this.f260750d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        fa3.d dVar = this.f260751e;
        fa3.b.a(dVar.f260754f, this.f260750d, dVar.f260753e);
    }
}
