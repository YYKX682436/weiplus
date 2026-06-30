package p13;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p13.t f351134d;

    public s(p13.t tVar) {
        this.f351134d = tVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        p13.t tVar = this.f351134d;
        o13.x xVar = (o13.x) tVar.f351137p.get();
        if (xVar != null) {
            xVar.X2(tVar.f351136o);
        }
    }
}
