package ig1;

/* loaded from: classes7.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    public static final java.math.BigInteger f291340b = java.math.BigInteger.valueOf(1024);

    /* renamed from: a, reason: collision with root package name */
    public final ig1.c f291341a = new ig1.c(null);

    public ye1.d a(int i17, int i18) {
        ye1.d dVar;
        ye1.d.f461182d.getClass();
        ye1.d dVar2 = null;
        if (-4000 >= i17) {
            if (i17 != -4999) {
                switch (i17) {
                    case com.tencent.liteav.TXLiteAVCode.ERR_BGM_INVALID_URL /* -4006 */:
                    case -4000:
                        dVar = ye1.d.f461183e;
                        break;
                    case com.tencent.liteav.TXLiteAVCode.ERR_BGM_INVALID_PATH /* -4005 */:
                        dVar = ye1.d.f461188m;
                        break;
                    case com.tencent.liteav.TXLiteAVCode.ERR_BGM_INVALID_OPERATION /* -4004 */:
                        dVar = ye1.d.f461184f;
                        break;
                    case com.tencent.liteav.TXLiteAVCode.ERR_BGM_OVER_LIMIT /* -4003 */:
                        dVar = ye1.d.f461186h;
                        break;
                    case com.tencent.liteav.TXLiteAVCode.ERR_BGM_DECODE_FAILED /* -4002 */:
                        dVar = ye1.d.f461189n;
                        break;
                    case com.tencent.liteav.TXLiteAVCode.ERR_BGM_OPEN_FAILED /* -4001 */:
                        dVar = ye1.d.f461185g;
                        break;
                }
            } else {
                dVar = ye1.d.f461190o;
            }
            dVar2 = dVar;
            if (dVar2 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.GeneralErrorType", "fromExoErrorInfo, errorType is null, errorWhat: " + i17 + ", errorExtra: " + i18);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.GeneralErrorType", "fromErrorInfo, errorWhat: " + i17 + ", errorExtra: " + i18 + ", errorType: " + dVar2);
        return dVar2;
    }

    public boolean b(ye1.e eVar) {
        return false;
    }

    public final void c(dg.f fVar, sf.f fVar2, ye1.e eVar, java.lang.String str) {
        o8.f fVar3;
        int i17;
        int i18;
        int i19;
        ig1.c cVar = this.f291341a;
        if (cVar.f291349g < cVar.f291348f) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "reportVideoProfile, wired case, ignore reporting and reset data");
            cVar.a();
            return;
        }
        java.lang.String appId = fVar2 != null ? fVar2.getAppId() : "";
        o8.f fVar4 = af1.z.f4517b;
        af1.i0 i0Var = (af1.i0) eVar.l(af1.i0.class);
        if (i0Var != null) {
            int i27 = i0Var.Q;
            int i28 = i0Var.R;
            int i29 = i0Var.S;
            o8.f fVar5 = i0Var.W;
            if (fVar5 == null) {
                fVar5 = fVar4;
            }
            o8.f fVar6 = i0Var.V;
            if (fVar6 != null) {
                fVar4 = fVar6;
            }
            fVar3 = fVar4;
            i17 = i27;
            i18 = i28;
            i19 = i29;
            fVar4 = fVar5;
        } else {
            fVar3 = fVar4;
            i17 = 0;
            i18 = 0;
            i19 = 0;
        }
        int i37 = fVar4.f343605d;
        int i38 = fVar4.f343607f;
        int i39 = fVar4.f343608g;
        int i47 = fVar3.f343605d;
        int i48 = fVar3.f343607f;
        int i49 = fVar3.f343608g;
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(oe1.v1.h().f344748e);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(cVar.f291344b);
        java.lang.Long valueOf3 = java.lang.Long.valueOf(cVar.f291345c);
        java.lang.String str2 = cVar.f291343a;
        java.lang.Long valueOf4 = java.lang.Long.valueOf(cVar.f291346d);
        java.lang.Long valueOf5 = java.lang.Long.valueOf(cVar.f291347e);
        java.lang.Long valueOf6 = java.lang.Long.valueOf(cVar.f291350h);
        java.lang.Integer valueOf7 = java.lang.Integer.valueOf(cVar.f291351i);
        java.lang.Long valueOf8 = java.lang.Long.valueOf(cVar.f291352j);
        java.lang.Integer valueOf9 = java.lang.Integer.valueOf(cVar.f291357o);
        java.lang.Integer valueOf10 = java.lang.Integer.valueOf(cVar.f291358p);
        java.lang.String str3 = cVar.f291359q;
        java.lang.Integer valueOf11 = java.lang.Integer.valueOf(i17);
        java.lang.Integer valueOf12 = java.lang.Integer.valueOf(i18);
        java.lang.Integer valueOf13 = java.lang.Integer.valueOf(i19);
        java.lang.Integer valueOf14 = java.lang.Integer.valueOf(cVar.f291360r.f4490a);
        cVar.f291360r.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        cVar.f291360r.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.AppBrandVideoProfileReport", "reportVideoProfile:%s, appId:%s, proxy:%s, playerType:%s, playerCreateTime:%s, videoPath:%s, cachedSize:%s, duration:%s, prepareTime:%s, bufferCount:%s, bufferTime:%s, error(%s, %s, %s), minBufferMs:%s, maxBufferMs:%s, bufferForPlaybackMs:%s, fixNotifyErrorChannel: %d, lockCache: %b, useCronet: %b, interruptCache: %b, notifyErrorFix2FailCount: %d, audioRenderedCount: %d, audioDroppedCount: %d, audioMaxConsecutiveDroppedCount: %d, videoRenderedCount: %d, videoDroppedCount: %d, videoMaxConsecutiveDroppedCount: %d", str, appId, valueOf, valueOf2, valueOf3, str2, valueOf4, valueOf5, valueOf6, valueOf7, valueOf8, valueOf9, valueOf10, str3, valueOf11, valueOf12, valueOf13, valueOf14, bool, bool, java.lang.Boolean.valueOf(cVar.f291360r.f4491b), java.lang.Integer.valueOf(cVar.f291361s), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i49));
        cVar.f291360r.getClass();
        cVar.f291360r.getClass();
        java.lang.Object[] objArr = {appId, java.lang.Integer.valueOf(cVar.f291344b), cVar.f291343a, java.lang.Long.valueOf(cVar.f291350h), java.lang.Long.valueOf(cVar.f291347e), java.lang.Long.valueOf(cVar.f291346d), java.lang.Integer.valueOf(cVar.f291357o), java.lang.Integer.valueOf(cVar.f291358p), cVar.f291359q, 1, java.lang.Integer.valueOf(oe1.v1.h().f344748e ? 1 : 0), java.lang.Integer.valueOf(cVar.f291351i), java.lang.Long.valueOf(cVar.f291352j), java.lang.Long.valueOf(cVar.f291345c), java.lang.Long.valueOf(cVar.f291348f), java.lang.Long.valueOf(cVar.f291349g), java.lang.Long.valueOf(cVar.f291355m), java.lang.Long.valueOf(cVar.f291356n), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), java.lang.Integer.valueOf(cVar.f291360r.f4490a), 0, 0, java.lang.Integer.valueOf(cVar.f291360r.f4491b ? 1 : 0), java.lang.Integer.valueOf(cVar.f291361s), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i38), java.lang.Integer.valueOf(i39), java.lang.Integer.valueOf(i47), java.lang.Integer.valueOf(i48), java.lang.Integer.valueOf(i49)};
        ((fg1.q0) fVar).getClass();
        ((ch1.d) ((com.tencent.mm.plugin.appbrand.profile.c) nd.f.d(com.tencent.mm.plugin.appbrand.profile.c.class, true))).c(18651, objArr);
        cVar.a();
    }
}
