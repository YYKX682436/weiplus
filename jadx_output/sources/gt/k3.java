package gt;

/* loaded from: classes7.dex */
public class k3 implements com.tencent.mm.app.v6 {
    @Override // com.tencent.mm.app.v6
    public void onActivityCreated(android.app.Activity activity, android.os.Bundle bundle) {
        com.tencent.mm.plugin.appbrand.ui.b5.INSTANCE.onActivityCreated(activity, bundle);
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityDestroyed(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityPaused(android.app.Activity activity) {
    }

    @Override // com.tencent.mm.app.v6
    public void onActivityResumed(android.app.Activity activity) {
        com.tencent.mm.plugin.appbrand.ui.b5.INSTANCE.onActivityResumed(activity);
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
