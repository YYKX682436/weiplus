package s;

/* loaded from: classes16.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {
    public final /* synthetic */ s.i C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s.i iVar) {
        super(0);
        this.C = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        s.i iVar = this.C;
        if (iVar.f401838h) {
            com.tencent.mars.xlog.Log.w("MicroMsg.OVCLoadingUI", "notifyDismissEvent: already released");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.OVCLoadingUI", "notifyDismissEvent");
            com.tencent.wechat.aff.ovc.r rVar = iVar.f401832b;
            if (rVar != null) {
                rVar.H();
            }
        }
        return jz5.f0.f302826a;
    }
}
