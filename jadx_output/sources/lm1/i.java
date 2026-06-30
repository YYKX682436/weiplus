package lm1;

@j95.b
/* loaded from: classes7.dex */
public class i extends i95.w implements fg1.w0 {
    @Override // fg1.w0
    public ye1.e r2(sf.f fVar, final android.os.Handler handler) {
        com.tencent.mm.plugin.appbrand.jsapi.l m17;
        if ((fVar instanceof com.tencent.mm.plugin.appbrand.extendplugin.b) && (m17 = fVar.m()) != null) {
            oe1.b2.a(m17.getAppId());
        }
        lm1.i$$a i__a = new lm1.i$$a();
        int d17 = com.tencent.mm.plugin.appbrand.utils.p.d();
        if (-1 != d17) {
            if (d17 == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandXWebVideoStrategy", "createMediaPlayer, use SysMediaPlayer");
                kotlin.jvm.internal.o.g(handler, "handler");
                return new mk1.u(kz5.c0.i(new ok1.c(handler), ok1.a.f345961a));
            }
            if (d17 == 4) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandXWebVideoStrategy", "createMediaPlayer, use ExoMediaPlayer");
                mk1.v vVar = new mk1.v() { // from class: lm1.i$$b
                    @Override // mk1.v
                    public final ye1.r a(mk1.b0 b0Var) {
                        return pk1.q.O.a(com.tencent.mm.sdk.platformtools.x2.f193071a, handler.getLooper(), false, b0Var);
                    }
                };
                mk1.v vVar2 = new mk1.v() { // from class: lm1.i$$c
                    @Override // mk1.v
                    public final ye1.r a(mk1.b0 b0Var) {
                        return new af1.i0(handler, com.tencent.mm.plugin.appbrand.utils.p.c(), com.tencent.mm.plugin.appbrand.utils.p.b(), com.tencent.mm.plugin.appbrand.utils.p.a());
                    }
                };
                kotlin.jvm.internal.o.g(handler, "handler");
                return new mk1.u(kz5.c0.i(new mk1.b(vVar, handler), new mk1.a(vVar2, handler)));
            }
            if (d17 == 5) {
                return i__a.r2(fVar, handler);
            }
        }
        return i__a.r2(fVar, handler);
    }
}
