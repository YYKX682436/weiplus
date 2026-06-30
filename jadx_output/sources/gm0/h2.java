package gm0;

/* loaded from: classes12.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fs.q f273200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f273201e;

    public h2(gm0.j2 j2Var, fs.q qVar, int i17) {
        this.f273200d = qVar;
        this.f273201e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        gm0.i2 i2Var = (gm0.i2) this.f273200d.get();
        if (i2Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.UpgradeManager", "Fail to get impl class of extendable itf: %s", gm0.i2.class.getName());
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.UpgradeManager", "Invoke extension: %s", i2Var.getClass().getName());
            i2Var.kh(this.f273201e);
        }
    }
}
