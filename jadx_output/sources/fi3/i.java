package fi3;

/* loaded from: classes10.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fi3.j f263009d;

    public i(fi3.j jVar) {
        this.f263009d = jVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        fi3.j jVar = this.f263009d;
        if (jVar.f263015f != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRemuxMediaCodecDecoder", "delay to stop decoder");
            try {
                jVar.f263015f.y();
                jVar.f263015f.q();
                jVar.f263015f = null;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightRemuxMediaCodecDecoder", e17, "delay to stop decoder error: %s", e17.getMessage());
            }
        }
    }
}
