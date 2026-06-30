package qf2;

/* loaded from: classes3.dex */
public final class i implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qf2.l f362407d;

    public i(qf2.l lVar) {
        this.f362407d = lVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        java.lang.String str = (java.lang.String) obj;
        com.tencent.mars.xlog.Log.i("AnchorMicCloudController", "liveMicAutoAcceptLiveData collect sessionId " + str);
        if (str != null) {
            this.f362407d.a7(str);
        }
        return jz5.f0.f302826a;
    }
}
