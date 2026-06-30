package e04;

/* loaded from: classes15.dex */
public class v implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e04.p f246135b;

    public v(e04.p pVar, int i17) {
        this.f246135b = pVar;
        this.f246134a = i17;
    }

    @Override // h45.i
    public void onKindaBusinessCallback(android.content.Intent intent) {
        int intExtra = intent.getIntExtra("scan_continue", 0);
        e04.p pVar = this.f246135b;
        if (intExtra != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "WPHK finish scan");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1882, 117);
            pVar.t(true, null);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.QBarStringHandler", "WPHK scan continue is 1，call getA8key，mOriginQBarString is %s, codeType is %s, codeVersion is %s, getA8keyScene is %s, appId is %s, processOfflineScan is %s, mGetA8KeyRequestId is %s", pVar.f246046g, java.lang.Integer.valueOf(pVar.f246048i), java.lang.Integer.valueOf(pVar.f246049m), java.lang.Integer.valueOf(this.f246134a), pVar.D, java.lang.Boolean.valueOf(pVar.f246051o), java.lang.Integer.valueOf(pVar.f246057u));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.A(1882, 116);
            java.lang.ref.WeakReference weakReference = pVar.f246043d;
            android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
            e04.p pVar2 = this.f246135b;
            pVar2.f(activity, pVar2.f246046g, pVar2.f246048i, pVar2.f246049m, this.f246134a, pVar2.D, pVar2.f246051o, pVar2.f246057u);
        }
    }
}
