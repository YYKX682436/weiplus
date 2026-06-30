package sr5;

/* loaded from: classes13.dex */
public class b extends java.util.TimerTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sr5.c f411867d;

    public b(sr5.c cVar) {
        this.f411867d = cVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        sr5.c cVar = this.f411867d;
        cVar.f411868a = null;
        cVar.f411870c.run();
    }
}
