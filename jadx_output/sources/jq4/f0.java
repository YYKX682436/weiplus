package jq4;

/* loaded from: classes5.dex */
public final class f0 implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jq4.z0 f301144d;

    public f0(jq4.z0 z0Var) {
        this.f301144d = z0Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        android.content.Context context;
        com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "onAppBackground: ");
        jq4.z0 z0Var = this.f301144d;
        android.view.View view = z0Var.f301236e;
        java.lang.Object systemService = (view == null || (context = view.getContext()) == null) ? null : context.getSystemService("power");
        android.os.PowerManager powerManager = systemService instanceof android.os.PowerManager ? (android.os.PowerManager) systemService : null;
        if (!(powerManager != null ? powerManager.isInteractive() : true)) {
            z0Var.l();
            return;
        }
        com.tencent.mars.xlog.Log.i("VoipBaseFloatCardManager", "onAppBackground: hideCard");
        if (z0Var.f301249r != 3) {
            kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new jq4.e0(z0Var, null), 2, null);
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
    }
}
