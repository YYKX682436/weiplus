package ks3;

/* loaded from: classes8.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks3.x f311761d;

    public w(ks3.x xVar) {
        this.f311761d = xVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Iterator it = ((java.util.ArrayList) this.f311761d.f311769d.f311789c).iterator();
        while (it.hasNext()) {
            ((ks3.y) it.next()).a();
        }
    }
}
