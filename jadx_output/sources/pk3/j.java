package pk3;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk3.l f356451d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f356452e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f356453f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qn5.a f356454g;

    public j(pk3.l lVar, boolean z17, boolean z18, qn5.a aVar) {
        this.f356451d = lVar;
        this.f356452e = z17;
        this.f356453f = z18;
        this.f356454g = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        pk3.e eVar = this.f356451d.f356458d;
        boolean z17 = eVar != null;
        qn5.a aVar = this.f356454g;
        if (!z17) {
            if (aVar != null) {
                aVar.a(null);
                return;
            }
            return;
        }
        if (eVar != null) {
            if (eVar.f356441a == null) {
                if (aVar != null) {
                    aVar.a(null);
                    return;
                }
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hide MultiTaskFloatBallView, transAnim:");
            boolean z18 = this.f356452e;
            sb6.append(z18);
            sb6.append(", alphaAnim:");
            boolean z19 = this.f356453f;
            sb6.append(z19);
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallContainer", sb6.toString());
            com.tencent.mm.plugin.multitask.ui.MultiTaskFloatBallView multiTaskFloatBallView = eVar.f356441a;
            if (multiTaskFloatBallView != null) {
                multiTaskFloatBallView.l(z18, z19, aVar);
            }
        }
    }
}
