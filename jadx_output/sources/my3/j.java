package my3;

/* loaded from: classes13.dex */
public final class j implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.q f332808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f332810f;

    public j(my3.q qVar, java.lang.String str, java.lang.String str2) {
        this.f332808d = qVar;
        this.f332809e = str;
        this.f332810f = str2;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        boolean z17 = false;
        if (bundle != null && bundle.getBoolean("result", false)) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosServiceImpl", "Login result " + z17);
        my3.q qVar = this.f332808d;
        if (!z17) {
            fy3.f fVar = qVar.f332833s;
            if (fVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onLoginFail");
                com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI rtosWatchLoginUI = ((oy3.t) fVar).f350044a;
                rtosWatchLoginUI.f158607y = 8;
                com.tencent.mm.plugin.rtos.ui.RtosWatchLoginUI.U6(rtosWatchLoginUI, 8);
                return;
            }
            return;
        }
        java.lang.String userName = this.f332810f;
        kotlin.jvm.internal.o.f(userName, "$userName");
        my3.q.Bi(qVar, this.f332809e, userName);
        qVar.Ri(fy3.i.f267251m);
        fy3.f fVar2 = qVar.f332833s;
        if (fVar2 != null) {
            ((oy3.t) fVar2).c();
        }
    }
}
