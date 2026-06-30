package e72;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Runnable f249888d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e72.e f249889e;

    public c(e72.e eVar, java.lang.Runnable runnable, e72.a aVar) {
        this.f249889e = eVar;
        this.f249888d = null;
        this.f249888d = runnable;
    }

    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceVoiceRecordLogic", "hy: initDeviceInLock");
        java.lang.String str = e72.e.f249890j + android.os.SystemClock.elapsedRealtime() + ".spx";
        e72.e eVar = this.f249889e;
        eVar.f249893c = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceVoiceRecordLogic", "generateVoiceFilePath: %s", str);
        try {
            com.tencent.mm.vfs.w6.h(eVar.f249893c);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceVoiceRecordLogic", e17, "hy: delete file failed", new java.lang.Object[0]);
        }
        eVar.f249894d = new tl.w(16000, 1, 3);
        tl.w wVar = eVar.f249894d;
        wVar.f420160m = -19;
        wVar.i(false);
        eVar.f249895e = new yl.h();
        if (!eVar.f249895e.b(eVar.f249893c)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FaceVoiceRecordLogic", "hy: init speex writer failed");
            eVar.f249895e.d();
            eVar.f249895e = null;
            e72.d dVar = eVar.f249891a;
            if (dVar != null) {
                ((e72.u) dVar).a(5);
                return;
            }
            return;
        }
        int i17 = wo.v1.f447833m.f447751i;
        if (i17 > 0) {
            eVar.f249894d.h(i17, true);
        } else {
            eVar.f249894d.h(5, false);
        }
        eVar.f249894d.g(50);
        eVar.f249894d.j(false);
        eVar.f249894d.f420172y = eVar.f249898h;
        eVar.a(eVar.f249899i);
        if (eVar.f249894d.k()) {
            java.lang.Runnable runnable = this.f249888d;
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.FaceVoiceRecordLogic", "hy: start record failed");
        e72.d dVar2 = eVar.f249891a;
        if (dVar2 != null) {
            ((e72.u) dVar2).a(7);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f249889e) {
            if (this.f249889e.f249892b) {
                com.tencent.mars.xlog.Log.w("MicroMsg.FaceVoiceRecordLogic", "hy: already called stop. should not start record");
            } else {
                a();
            }
        }
    }
}
