package wo4;

/* loaded from: classes10.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wo4.y f448293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(wo4.y yVar) {
        super(0);
        this.f448293d = yVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.media.MediaFormat mediaFormat;
        boolean z17;
        java.lang.String str;
        fs0.f lVar;
        boolean z18;
        wo4.y yVar = this.f448293d;
        int i17 = yVar.f448296c.f162415a;
        com.tencent.mm.plugin.vlog.model.l1 l1Var = yVar.f448295b;
        if (l1Var.f175666k <= 0) {
            l1Var.f175666k = 1;
        }
        if (l1Var.f175665j <= 0) {
            l1Var.f175665j = 44100;
        }
        if (!com.tencent.mm.vfs.w6.j(yVar.f448303j)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "local has no music ,musicPath:" + yVar.f448303j + "  and set Mute");
            yVar.f448304k = true;
        } else if (yVar.f448295b.f175657b == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "mix silent, ignore remuxMusic");
            yVar.f448304k = true;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "remuxMusic, mixType:" + yVar.f448295b.f175657b + " musicPath:" + yVar.f448303j);
            java.lang.String str2 = yVar.f448303j;
            if (str2 != null) {
                hs0.a aVar = new hs0.a(str2);
                if (aVar.f284557k) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxMusicMediaExtractorCreateFailed");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 15L, 1L);
                    com.tencent.mars.xlog.Log.e("MicroMsg.VLogRemuxer", "markRemuxMusicMediaExtractorCreateFailed");
                    yVar.f448304k = true;
                    yVar.b();
                    yz5.r rVar = yVar.f448312s;
                    if (rVar != null) {
                        rVar.C("", "", java.lang.Boolean.FALSE, 2);
                    }
                } else {
                    yVar.f448301h = aVar;
                    mediaFormat = aVar.f284552f;
                }
            } else {
                mediaFormat = null;
            }
            wo4.g gVar = new wo4.g(yVar.f448294a.f175674b);
            if (yVar.f448295b.f175657b == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "mix background, delete musicFile:" + yVar.f448303j);
                dw3.c0.f244182a.j(yVar.f448303j);
                yVar.f448303j = null;
                hs0.a aVar2 = yVar.f448301h;
                if (aVar2 != null) {
                    aVar2.d();
                }
                yVar.f448301h = null;
                mediaFormat = gVar.A;
            }
            if (yVar.f448295b.f175657b == 3) {
                if (!gVar.f448262v.isEmpty()) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "has video mix all");
                    yVar.f448295b.f175657b = 3;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.VLogRemuxer", "do not have video mix music");
                    yVar.f448295b.f175657b = 2;
                }
            }
            com.tencent.mm.plugin.vlog.model.l1 l1Var2 = yVar.f448295b;
            ds0.d0 d0Var = new ds0.d0(l1Var2.f175657b, l1Var2.f175665j, l1Var2.f175666k, new wo4.n(yVar));
            yVar.f448302i = d0Var;
            com.tencent.mm.plugin.vlog.model.l1 l1Var3 = yVar.f448295b;
            if (l1Var3.f175657b == 2) {
                d0Var.j(null, yVar.f448301h, 0L, l1Var3.f175656a);
                gVar.e();
                z17 = false;
            } else {
                z17 = false;
                hs0.a aVar3 = yVar.f448301h;
                long j17 = l1Var3.f175656a;
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecAACCodec", "initWithBackgroundDecoder, backgroundDecoder:" + gVar + ", music:" + aVar3 + ", startTime:0, endTime:" + j17);
                try {
                    d0Var.f242796f = gVar;
                    gVar.f266215e = new ds0.t(d0Var);
                    gVar.f266216f = new ds0.u(d0Var);
                    if (aVar3 != null) {
                        try {
                            if (fp.h.a(23)) {
                                str = "MicroMsg.MediaCodecAACCodec";
                                lVar = new fs0.h(aVar3, "music", 0L, j17 - 0, new ds0.v(d0Var), new ds0.w(d0Var));
                            } else {
                                str = "MicroMsg.MediaCodecAACCodec";
                                d0Var.f242810t = true;
                                lVar = new fs0.l(aVar3, "music", 0L, j17 - 0, new ds0.x(d0Var), new ds0.y(d0Var));
                            }
                            d0Var.f242795e = lVar;
                        } catch (java.lang.Exception e17) {
                            e = e17;
                            com.tencent.mars.xlog.Log.printErrStackTrace(str, e, "", new java.lang.Object[0]);
                            com.tencent.mars.xlog.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxAACDecoderInitFailed");
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.C(986L, 22L, 1L);
                            throw e;
                        }
                    }
                } catch (java.lang.Exception e18) {
                    e = e18;
                    str = "MicroMsg.MediaCodecAACCodec";
                }
            }
            if ((mediaFormat == null || mediaFormat.containsKey(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE)) ? z17 : true) {
                mediaFormat.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, yVar.f448295b.f175662g);
            }
            if (mediaFormat != null) {
                mediaFormat.setInteger("channel-count", yVar.f448295b.f175666k);
            }
            if (mediaFormat != null) {
                ds0.d0 d0Var2 = yVar.f448302i;
                if (d0Var2 != null) {
                    d0Var2.k(mediaFormat);
                }
                z18 = true;
            } else {
                z18 = z17;
            }
            if (z18) {
                ds0.d0 d0Var3 = yVar.f448302i;
                if (d0Var3 != null) {
                    d0Var3.m(new wo4.o(yVar));
                }
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.VLogRemuxer", "remuxMusic cannot init encoder, return");
                hs0.a aVar4 = yVar.f448301h;
                if (aVar4 != null) {
                    aVar4.d();
                }
                yVar.f448304k = true;
                yVar.c();
            }
        }
        return jz5.f0.f302826a;
    }
}
