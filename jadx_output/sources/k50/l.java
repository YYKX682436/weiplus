package k50;

/* loaded from: classes9.dex */
public final class l implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r70.g f304237d;

    public l(r70.g gVar) {
        this.f304237d = gVar;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r70.h hVar = (r70.h) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ForwardImgUIC", "forwardMsgInfo " + hVar.f393109a);
        r70.i iVar = r70.i.f393113d;
        r70.i iVar2 = hVar.f393109a;
        if (iVar2 == iVar) {
            com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent updateForwardMsgIdEvent = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent();
            long j17 = hVar.f393111c;
            am.xz xzVar = updateForwardMsgIdEvent.f54918g;
            xzVar.f8409a = j17;
            xzVar.f8410b = 0;
            xzVar.f8411c = this.f304237d.f393102d;
            updateForwardMsgIdEvent.e();
        } else if (iVar2 == r70.i.f393118i) {
            d75.b.g(k50.k.f304234d);
        }
        return jz5.f0.f302826a;
    }
}
