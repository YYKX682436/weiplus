package wo4;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.g f448242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f448243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.model.p0 f448244f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(wo4.g gVar, int i17, com.tencent.mm.plugin.vlog.model.p0 p0Var) {
        super(2);
        this.f448242d = gVar;
        this.f448243e = i17;
        this.f448244f = p0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        byte[] bArr = (byte[]) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        com.tencent.mm.plugin.vlog.model.p1 p1Var = (com.tencent.mm.plugin.vlog.model.p1) this.f448244f;
        wo4.g gVar = this.f448242d;
        gVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFrameDecode: ");
        sb6.append(bArr != null ? java.lang.Integer.valueOf(bArr.length) : null);
        sb6.append(", pts:");
        sb6.append(longValue);
        sb6.append(", index:");
        sb6.append(this.f448243e);
        sb6.append(", materialStart:");
        sb6.append(p1Var.f175708a);
        sb6.append(", materialEnd:");
        sb6.append(p1Var.f175709b);
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", sb6.toString());
        long j17 = gVar.E;
        if (j17 > 0) {
            long j18 = longValue - j17;
            if (j18 > 0) {
                long j19 = j18 / 1000;
                gVar.D = j19;
                if (j19 <= 0) {
                    gVar.D = 23L;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.VLogAudioBackgroundDecoder", "onFrameDecode, currentAudioFrameInterval:" + gVar.D);
        gVar.f448265y.post(new wo4.f(longValue, p1Var, gVar, bArr));
        gVar.E = longValue;
        return jz5.f0.f302826a;
    }
}
