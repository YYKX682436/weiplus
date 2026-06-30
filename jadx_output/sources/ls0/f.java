package ls0;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.k f320823d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f320824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f320825f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f320826g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ls0.k kVar, byte[] bArr, long j17, yz5.l lVar) {
        super(0);
        this.f320823d = kVar;
        this.f320824e = bArr;
        this.f320825f = j17;
        this.f320826g = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f320823d.f320868v) {
            try {
                ms0.c.l(this.f320823d.f320847a, this.f320824e, false, 2, null);
                this.f320823d.f320847a.p();
                ls0.k kVar = this.f320823d;
                if (kVar.f320853g != null) {
                    kVar.i(this.f320825f);
                    rs0.h hVar = this.f320823d.f320851e;
                    if (hVar != null) {
                        rs0.i.f399296a.x(hVar.f399292a, hVar.f399293b);
                    }
                }
                yz5.l lVar = this.f320823d.f320852f;
                if (lVar != null) {
                    lVar.invoke(java.lang.Boolean.TRUE);
                }
                this.f320826g.invoke(this.f320824e);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markMediaCodecWriteYUVError");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.C(985L, 27L, 1L);
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f320823d.f320848b, e17, "", new java.lang.Object[0]);
                yz5.l lVar2 = this.f320823d.f320852f;
                if (lVar2 != null) {
                    lVar2.invoke(java.lang.Boolean.FALSE);
                }
            }
        } else {
            com.tencent.mars.xlog.Log.e(this.f320823d.f320848b, "requestDraw not init now");
        }
        return jz5.f0.f302826a;
    }
}
