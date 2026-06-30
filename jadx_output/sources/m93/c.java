package m93;

/* loaded from: classes8.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m93.g f325021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m93.d f325022e;

    public c(m93.d dVar, m93.g gVar) {
        this.f325022e = dVar;
        this.f325021d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        m93.d dVar = this.f325022e;
        m93.i iVar = dVar.f325026d;
        m93.f fVar = new m93.f(iVar, null);
        fVar.f325031b = dVar.f325024b;
        fVar.f325030a = this.f325021d;
        ((java.util.concurrent.ConcurrentHashMap) iVar.f325039e).put(dVar.f325023a + "_" + java.lang.Integer.toString(dVar.f325025c), fVar);
    }
}
