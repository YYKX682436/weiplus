package lu3;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f321401d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lu3.m f321402e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lu3.a f321403f;

    public g(boolean z17, lu3.m mVar, lu3.a aVar) {
        this.f321401d = z17;
        this.f321402e = mVar;
        this.f321403f = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("initProvider reCreate:");
        boolean z17 = this.f321401d;
        sb6.append(z17);
        sb6.append(" mediaRecorder:");
        lu3.m mVar = this.f321402e;
        sb6.append(mVar.f321419o);
        sb6.append(" initRecorderJobFinished:");
        sb6.append(mVar.f321428x);
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecorder", sb6.toString());
        lu3.a aVar = this.f321403f;
        if (!z17 && mVar.f321419o != null) {
            if (aVar != null) {
                aVar.a();
                return;
            }
            return;
        }
        ht0.s sVar = mVar.f321419o;
        if (sVar != null) {
            sVar.cancel();
        }
        ht0.s sVar2 = mVar.f321419o;
        if (sVar2 != null) {
            sVar2.clear();
        }
        mVar.e(z17, aVar);
    }
}
