package pd0;

/* loaded from: classes9.dex */
public class m1 implements com.tencent.mm.app.v6 {
    @Override // com.tencent.mm.app.v6
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        try {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                w04.l.INSTANCE.D9(activity);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SOALC", "call onActivityCreated error: " + e17);
        }
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityResumed(android.app.Activity activity) {
        try {
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                w04.l.INSTANCE.Eg(activity);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SOALC", "call onActivityResumed error: " + e17);
        }
    }

    @Override // com.tencent.mm.app.v6
    public void onActivitySaveInstanceState(android.app.Activity activity, android.os.Bundle bundle) {
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityStarted(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityStopped(android.app.Activity activity) {
    }
}
