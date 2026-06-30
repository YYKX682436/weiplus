package vv1;

/* loaded from: classes9.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vv1.d f440404d;

    public c(vv1.d dVar) {
        this.f440404d = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        vv1.d dVar = this.f440404d;
        dVar.f440409h = true;
        vv1.a aVar = dVar.f440406e;
        if (aVar != null) {
            aVar.a(dVar.f440407f, dVar.f440408g);
        }
    }
}
