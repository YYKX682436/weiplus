package hl0;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl0.b f282040d;

    public a(hl0.b bVar) {
        this.f282040d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f282040d.f282041d) {
            bm0.c cVar = this.f282040d.f282041d.f282052a;
            if (cVar != null) {
                cVar.d();
                this.f282040d.f282041d.f282052a = null;
            }
        }
    }
}
