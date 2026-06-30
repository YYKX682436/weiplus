package il0;

/* loaded from: classes13.dex */
public class a extends com.tencent.matrix.lifecycle.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ il0.e f292006a;

    public a(il0.e eVar) {
        this.f292006a = eVar;
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
        boolean z17;
        synchronized (this.f292006a) {
            il0.e eVar = il0.e.f292009f;
            synchronized (eVar) {
                z17 = eVar.f292013d;
            }
            if (!z17) {
                com.tencent.mars.xlog.Log.i("Kara.DiscoveryReddotEnv", "clear init");
                eVar.f();
            }
        }
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
    }
}
