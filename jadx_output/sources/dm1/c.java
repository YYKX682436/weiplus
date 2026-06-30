package dm1;

/* loaded from: classes5.dex */
public final class c implements com.tencent.mm.app.t2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm1.m f241631d;

    public c(dm1.m mVar) {
        this.f241631d = mVar;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        android.content.Context context;
        com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInPopupWindow", "onAppBackground: ");
        dm1.m mVar = this.f241631d;
        android.view.View view = mVar.f241648c;
        java.lang.Object systemService = (view == null || (context = view.getContext()) == null) ? null : context.getSystemService("power");
        android.os.PowerManager powerManager = systemService instanceof android.os.PowerManager ? (android.os.PowerManager) systemService : null;
        if (powerManager != null ? powerManager.isInteractive() : true) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WMPFVoip.WMPFVoipCallInPopupWindow", "onAppBackground: hideCard");
            kotlinx.coroutines.i2 i2Var = kotlinx.coroutines.i2.f310477d;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.l.d(i2Var, kotlinx.coroutines.internal.b0.f310484a, null, new dm1.b(mVar, null), 2, null);
        }
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        dm1.m mVar = this.f241631d;
        if (mVar.f241659n) {
            mVar.f241659n = false;
            mVar.b(true, mVar.f241649d);
        }
    }
}
