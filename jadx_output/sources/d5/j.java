package d5;

/* loaded from: classes13.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final d5.k f226496d;

    public j(d5.k kVar) {
        this.f226496d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        d5.k kVar = this.f226496d;
        kVar.getClass();
        a5.a0 c17 = a5.a0.c();
        java.lang.String str = d5.k.f226497q;
        c17.a(str, "Checking if commands are complete.", new java.lang.Throwable[0]);
        kVar.b();
        synchronized (kVar.f226505n) {
            boolean z18 = true;
            if (kVar.f226506o != null) {
                a5.a0.c().a(str, java.lang.String.format("Removing command %s", kVar.f226506o), new java.lang.Throwable[0]);
                if (!((android.content.Intent) ((java.util.ArrayList) kVar.f226505n).remove(0)).equals(kVar.f226506o)) {
                    throw new java.lang.IllegalStateException("Dequeue-d command is not the first.");
                }
                kVar.f226506o = null;
            }
            k5.l lVar = ((m5.c) kVar.f226499e).f323470a;
            d5.b bVar = kVar.f226503i;
            synchronized (bVar.f226473f) {
                z17 = !((java.util.HashMap) bVar.f226472e).isEmpty();
            }
            if (!z17 && ((java.util.ArrayList) kVar.f226505n).isEmpty()) {
                synchronized (lVar.f304138f) {
                    if (lVar.f304136d.isEmpty()) {
                        z18 = false;
                    }
                }
                if (!z18) {
                    a5.a0.c().a(str, "No more commands & intents.", new java.lang.Throwable[0]);
                    d5.i iVar = kVar.f226507p;
                    if (iVar != null) {
                        ((androidx.work.impl.background.systemalarm.SystemAlarmService) iVar).b();
                    }
                }
            }
            if (!((java.util.ArrayList) kVar.f226505n).isEmpty()) {
                kVar.f();
            }
        }
    }
}
