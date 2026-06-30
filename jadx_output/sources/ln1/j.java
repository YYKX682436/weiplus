package ln1;

/* loaded from: classes12.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ln1.k f319776d;

    public j(ln1.k kVar) {
        this.f319776d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ln1.l lVar;
        ln1.k kVar = this.f319776d;
        com.tencent.mars.xlog.Log.i("MicroMsg.BackupCalculator", "run: isCalculatorCancel:%s callbackConvForChoose:%s", java.lang.Boolean.valueOf(kVar.f319779f.f319765a), kVar.f319777d);
        if (kVar.f319779f.f319765a || (lVar = kVar.f319777d) == null) {
            return;
        }
        lVar.s2(kVar.f319778e);
    }
}
