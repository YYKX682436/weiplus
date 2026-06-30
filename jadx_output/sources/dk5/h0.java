package dk5;

/* loaded from: classes9.dex */
public final class h0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234645d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234646e;

    public h0(java.lang.String str, java.lang.String str2) {
        this.f234645d = str;
        this.f234646e = str2;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        r70.h hVar = (r70.h) obj;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgUpload.ImgRetransmitLogic", this.f234645d + " resultType:" + hVar.f393109a + " localId:" + hVar.f393111c);
        r70.i iVar = r70.i.f393113d;
        r70.i iVar2 = hVar.f393109a;
        if (iVar2 == iVar) {
            com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent updateForwardMsgIdEvent = new com.tencent.mm.autogen.events.UpdateForwardMsgIdEvent();
            long j17 = hVar.f393111c;
            am.xz xzVar = updateForwardMsgIdEvent.f54918g;
            xzVar.f8409a = j17;
            xzVar.f8410b = 0;
            xzVar.f8411c = this.f234646e;
            updateForwardMsgIdEvent.e();
        } else if (iVar2 == r70.i.f393118i) {
            d75.b.g(dk5.g0.f234632d);
        }
        return jz5.f0.f302826a;
    }
}
