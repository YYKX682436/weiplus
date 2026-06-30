package w36;

/* loaded from: classes16.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w36.h f442769d;

    public a(w36.h hVar) {
        this.f442769d = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        w36.h hVar = this.f442769d;
        do {
            try {
            } catch (java.io.IOException e17) {
                hVar.c(e17, null);
                return;
            }
        } while (hVar.f());
    }
}
