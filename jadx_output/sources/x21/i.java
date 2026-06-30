package x21;

/* loaded from: classes14.dex */
public final class i implements x21.d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f451535a = new java.util.ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public x21.h f451536b;

    /* renamed from: c, reason: collision with root package name */
    public x21.g f451537c;

    @Override // x21.d
    public x21.m a() {
        x21.m mVar;
        java.lang.Object m521constructorimpl;
        x21.m mVar2;
        do {
            x21.g gVar = this.f451537c;
            mVar = null;
            if (gVar == null || gVar.f451528e || gVar.f451529f || !gVar.f451530g) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MSP.MultiFileSilkDecoder", "createDecoderContext");
                x21.h hVar = this.f451536b;
                java.util.List list = this.f451535a;
                x21.h hVar2 = hVar == null ? (x21.h) kz5.n0.Z(list) : (x21.h) kz5.n0.a0(list, kz5.n0.c0(list, hVar) + 1);
                if (hVar2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.MSP.MultiFileSilkDecoder", "get file null");
                    gVar = null;
                } else {
                    this.f451536b = hVar2;
                    x21.g gVar2 = new x21.g(hVar2);
                    x21.h hVar3 = gVar2.f451524a;
                    java.lang.String str = gVar2.f451525b;
                    com.tencent.mars.xlog.Log.i(str, com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
                    try {
                        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                        java.io.InputStream E = com.tencent.mm.vfs.w6.E(hVar3.f451532a);
                        try {
                            byte[] bArr = new byte[E.available()];
                            E.read(bArr);
                            vz5.b.a(E, null);
                            m521constructorimpl = kotlin.Result.m521constructorimpl(bArr);
                        } finally {
                            try {
                                break;
                            } catch (java.lang.Throwable th6) {
                            }
                        }
                    } catch (java.lang.Throwable th7) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
                    }
                    java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
                    if (m524exceptionOrNullimpl != null) {
                        com.tencent.mars.xlog.Log.e(str, "open file error", m524exceptionOrNullimpl);
                    }
                    if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                        m521constructorimpl = null;
                    }
                    byte[] bArr2 = (byte[]) m521constructorimpl;
                    if (bArr2 != null) {
                        if (bArr2.length == 0) {
                            com.tencent.mars.xlog.Log.e(str, "dataBuffer is empty, no data to decode");
                            gVar2.f451529f = true;
                        } else {
                            gVar2.f451527d = com.tencent.mm.modelvoice.MediaRecorder.SilkGetEncSampleRate(new byte[]{bArr2[0]}, 0L);
                            if (hVar3.f451534c == 0) {
                                hVar3.f451534c = (((bArr2.length * 2) * 1000) / 23900) * 8;
                                com.tencent.mars.xlog.Log.i(str, "init duration, " + hVar3.f451534c);
                            }
                            gVar2.f451526c = new w21.v(gVar2.f451527d, bArr2, bArr2.length);
                            gVar2.f451530g = true;
                            gVar2.f451529f = false;
                        }
                    }
                    gVar = gVar2;
                }
                x21.g gVar3 = this.f451537c;
                if (gVar3 != null) {
                    com.tencent.mars.xlog.Log.i(gVar3.f451525b, "decoder uninit");
                    gVar3.f451530g = false;
                    w21.v vVar = gVar3.f451526c;
                    if (vVar != null) {
                        com.tencent.mm.modelvoice.MediaRecorder.SilkDecUnInit(vVar.f442482a);
                    }
                }
            }
            this.f451537c = gVar;
            if (gVar == null) {
                return null;
            }
            boolean z17 = gVar.f451530g;
            java.lang.String str2 = gVar.f451525b;
            if (z17) {
                w21.v vVar2 = gVar.f451526c;
                if (vVar2 == null) {
                    com.tencent.mars.xlog.Log.w(str2, "silk decoder init error");
                } else {
                    int i17 = gVar.f451527d;
                    int i18 = (i17 * 20) / 1000;
                    byte[] bArr3 = new byte[android.media.AudioTrack.getMinBufferSize(i17, 4, 2) * 2];
                    int SilkDoDec = com.tencent.mm.modelvoice.MediaRecorder.SilkDoDec(bArr3, (short) i18, vVar2.f442482a);
                    x21.h hVar4 = gVar.f451524a;
                    if (SilkDoDec > 0) {
                        java.lang.String str3 = hVar4.f451532a;
                        int i19 = hVar4.f451533b;
                        java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr3);
                        wrap.limit(i18 * 2);
                        int i27 = gVar.f451527d;
                        long j17 = gVar.f451531h;
                        long j18 = 20 + j17;
                        gVar.f451531h = j18;
                        long j19 = hVar4.f451534c;
                        mVar2 = new x21.m(str3, i19, wrap, i27, j17, j19 == 0 ? 0.0f : java.lang.Math.min(1.0f, ((float) j18) / ((float) j19)), false);
                    } else if (SilkDoDec == 0) {
                        gVar.f451529f = true;
                        gVar.f451530g = false;
                        hVar4.f451534c = gVar.f451531h;
                        com.tencent.mars.xlog.Log.i(str2, "decode done, duration: " + gVar.f451531h);
                        java.lang.String str4 = hVar4.f451532a;
                        int i28 = hVar4.f451533b;
                        java.nio.ByteBuffer wrap2 = java.nio.ByteBuffer.wrap(bArr3);
                        wrap2.limit(i18 * 2);
                        int i29 = gVar.f451527d;
                        long j27 = gVar.f451531h;
                        long j28 = 20 + j27;
                        gVar.f451531h = j28;
                        long j29 = hVar4.f451534c;
                        mVar2 = new x21.m(str4, i28, wrap2, i29, j27, j29 == 0 ? 0.0f : java.lang.Math.min(1.0f, ((float) j28) / ((float) j29)), true);
                    } else {
                        com.tencent.mars.xlog.Log.e(str2, "decode error code " + SilkDoDec);
                        gVar.f451528e = true;
                    }
                    mVar = mVar2;
                }
            } else {
                com.tencent.mars.xlog.Log.w(str2, "decoder is not working");
            }
        } while (mVar == null);
        return mVar;
    }
}
