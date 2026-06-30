package v22;

/* loaded from: classes10.dex */
public final class y extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v22.z f432868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sight.base.b f432869e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(v22.z zVar, com.tencent.mm.plugin.sight.base.b bVar) {
        super(0);
        this.f432868d = zVar;
        this.f432869e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        v22.a0 oVar;
        boolean c17 = fp.h.c(23);
        v22.z zVar = this.f432868d;
        if (c17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiMixer", "api level 23 user async decoder");
            java.lang.String str = zVar.f432870a;
            com.tencent.mm.plugin.sight.base.b bVar = this.f432869e;
            int i17 = bVar != null ? bVar.f162382a : 0;
            d32.j jVar = zVar.f432878i;
            if (jVar == null) {
                kotlin.jvm.internal.o.o("mixPixelBuffer");
                throw null;
            }
            android.view.Surface surface = jVar.f226157j;
            if (surface == null) {
                kotlin.jvm.internal.o.o("videoDecodeSurface");
                throw null;
            }
            oVar = new v22.q(str, i17, surface);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiMixer", "api level below 23 user sync decoder");
            java.lang.String str2 = zVar.f432870a;
            d32.j jVar2 = zVar.f432878i;
            if (jVar2 == null) {
                kotlin.jvm.internal.o.o("mixPixelBuffer");
                throw null;
            }
            android.view.Surface surface2 = jVar2.f226157j;
            if (surface2 == null) {
                kotlin.jvm.internal.o.o("videoDecodeSurface");
                throw null;
            }
            oVar = new v22.o(str2, surface2);
        }
        zVar.f432877h = oVar;
        oVar.f432800a = v22.v.f432865d;
        oVar.f432801b = new v22.x(zVar);
        if (oVar.a() < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiCaptureDetailIDKeyStat", "markVideoDecoderInitFailed");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1012L, 26L, 1L);
        }
        v22.a0 a0Var = zVar.f432877h;
        if (a0Var != null) {
            a0Var.c();
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("videoDecoder");
        throw null;
    }
}
