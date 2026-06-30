package ln1;

/* loaded from: classes12.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln1.l f319777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f319778e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ln1.h f319779f;

    public k(ln1.h hVar, ln1.l lVar, java.util.LinkedList linkedList) {
        this.f319779f = hVar;
        this.f319777d = lVar;
        this.f319778e = linkedList;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            java.lang.Thread.sleep(bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.backup.RepairerConfigBackupConvCalcuDelay()));
        } catch (java.lang.InterruptedException unused) {
        }
        com.tencent.mm.sdk.platformtools.u3.h(new ln1.j(this));
    }
}
