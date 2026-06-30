package v62;

/* loaded from: classes12.dex */
public class l extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v62.i f433518h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(v62.p pVar, long j17, v62.o oVar, boolean z17, v62.i iVar) {
        super(j17, oVar, z17);
        this.f433518h = iVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        v62.i iVar = this.f433518h;
        try {
            if (iVar != null) {
                com.tencent.mm.autogen.events.RequestRecogQBarInYuvEvent requestRecogQBarInYuvEvent = new com.tencent.mm.autogen.events.RequestRecogQBarInYuvEvent();
                am.nr nrVar = requestRecogQBarInYuvEvent.f54698g;
                nrVar.f7448b = iVar.f433511b;
                nrVar.f7449c = iVar.f433512c;
                nrVar.f7447a = iVar.f433510a;
                nrVar.f7450d = new v62.k(this);
                requestRecogQBarInYuvEvent.e();
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.ExtQrCodeHandler", "hy: qrcode data not retrieved");
                c(null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ExtQrCodeHandler", e17, "hy: error when syncTaskScanQrCode", new java.lang.Object[0]);
            c(null);
        }
        return null;
    }
}
