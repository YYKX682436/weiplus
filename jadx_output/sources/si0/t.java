package si0;

/* loaded from: classes13.dex */
public final class t extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f408166d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.v f408167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.flutter_pag.FlutterPAGInfo f408168f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f408169g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(si0.v vVar, com.tencent.pigeon.flutter_pag.FlutterPAGInfo flutterPAGInfo, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f408167e = vVar;
        this.f408168f = flutterPAGInfo;
        this.f408169g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new si0.t(this.f408167e, this.f408168f, this.f408169g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.t) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.rfx.RfxPagPlayer rfxPagPlayer;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f408166d;
        si0.v vVar = this.f408167e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.pigeon.flutter_pag.FlutterPAGInfo flutterPAGInfo = this.f408168f;
            int repeatCount = (int) flutterPAGInfo.getRepeatCount();
            vVar.getClass();
            android.animation.ValueAnimator valueAnimator = vVar.f408192o;
            valueAnimator.setRepeatCount(repeatCount);
            double width = flutterPAGInfo.getWidth();
            double height = flutterPAGInfo.getHeight();
            vVar.f408194q = (int) width;
            vVar.f408195r = (int) height;
            java.lang.String pagPath = flutterPAGInfo.getFilepath();
            boolean isFromAsset = flutterPAGInfo.isFromAsset();
            kotlin.jvm.internal.o.g(pagPath, "pagPath");
            java.lang.String concat = "rfx: pagPath=".concat(pagPath);
            java.lang.String str = vVar.f408181d;
            io.flutter.Log.i(str, concat);
            vVar.f408184g = null;
            si0.b bVar = vVar.C;
            if (bVar != null) {
                bVar.f408037a.stop();
            }
            si0.b bVar2 = vVar.C;
            if (bVar2 != null) {
                bVar2.f408037a.release();
            }
            vVar.C = null;
            if (isFromAsset) {
                vVar.f408184g = com.tencent.mm.rfx.RfxPagFile.Load(vVar.f408178a.getAssets(), pagPath);
            } else {
                vVar.f408184g = com.tencent.mm.rfx.RfxPagFile.Load(pagPath);
            }
            com.tencent.mm.rfx.RfxPagFile rfxPagFile = vVar.f408184g;
            vVar.f408193p = rfxPagFile != null ? rfxPagFile.duration() : 0L;
            io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = vVar.f408187j;
            if (surfaceProducer != null) {
                surfaceProducer.setSize(vVar.f408194q, vVar.f408195r);
            }
            com.tencent.mm.rfx.RfxPagSurface rfxPagSurface = vVar.f408185h;
            if (rfxPagSurface != null) {
                rfxPagSurface.freeCache();
            }
            com.tencent.mm.rfx.RfxPagSurface rfxPagSurface2 = vVar.f408185h;
            if (rfxPagSurface2 != null) {
                rfxPagSurface2.release();
            }
            vVar.f408185h = null;
            vVar.f408183f = new com.tencent.mm.rfx.RfxPagPlayer();
            io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer2 = vVar.f408187j;
            vVar.f408185h = com.tencent.mm.rfx.RfxPagSurface.FromSurface(surfaceProducer2 != null ? surfaceProducer2.getSurface() : null);
            com.tencent.mm.rfx.RfxPagPlayer rfxPagPlayer2 = vVar.f408183f;
            if (rfxPagPlayer2 != null) {
                rfxPagPlayer2.setComposition(vVar.f408184g);
            }
            com.tencent.mm.rfx.RfxPagPlayer rfxPagPlayer3 = vVar.f408183f;
            if (rfxPagPlayer3 != null) {
                rfxPagPlayer3.setSurface(vVar.f408185h);
            }
            com.tencent.pigeon.flutter_pag.FlutterPAGInfo flutterPAGInfo2 = vVar.f408186i;
            java.lang.Double valueOf = flutterPAGInfo2 != null ? java.lang.Double.valueOf(flutterPAGInfo2.getMaxFrameRate()) : null;
            if (valueOf != null && valueOf.doubleValue() > 0.0d && (rfxPagPlayer = vVar.f408183f) != null) {
                rfxPagPlayer.setMaxFrameRate((float) valueOf.doubleValue());
            }
            valueAnimator.setDuration((long) ((vVar.f408193p / 1000) / vVar.f408196s));
            io.flutter.Log.i(str, "reset width:" + vVar.f408194q + ", height:" + vVar.f408195r + ", duration:" + vVar.f408193p);
            com.tencent.mm.rfx.RfxPagFile rfxPagFile2 = vVar.f408184g;
            java.nio.ByteBuffer audioBytes = rfxPagFile2 != null ? rfxPagFile2.audioBytes() : null;
            com.tencent.mm.rfx.RfxPagFile rfxPagFile3 = vVar.f408184g;
            vVar.D = rfxPagFile3 != null ? rfxPagFile3.audioStartTime() : 0L;
            if (audioBytes != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.tencent.mm.rfx.RfxPagFile rfxPagFile4 = vVar.f408184g;
                kotlin.jvm.internal.o.d(rfxPagFile4);
                sb6.append(rfxPagFile4.path());
                sb6.append("_aac");
                java.lang.String filePath = sb6.toString();
                try {
                    com.tencent.mm.vfs.y6 y6Var = new com.tencent.mm.vfs.y6(filePath);
                    byte[] bArr = new byte[1024];
                    while (audioBytes.hasRemaining()) {
                        try {
                            int min = java.lang.Math.min(audioBytes.remaining(), 1024);
                            audioBytes.get(bArr, 0, min);
                            y6Var.write(bArr, 0, min);
                        } catch (java.lang.Throwable th6) {
                            y6Var.close();
                            throw th6;
                        }
                    }
                    y6Var.close();
                    si0.b bVar3 = new si0.b();
                    vVar.C = bVar3;
                    kotlin.jvm.internal.o.g(filePath, "filePath");
                    bVar3.f408037a.setDataSource(filePath);
                    si0.b bVar4 = vVar.C;
                    if (bVar4 != null) {
                        bVar4.f408038b = (int) flutterPAGInfo.getRepeatCount();
                    }
                    si0.b bVar5 = vVar.C;
                    if (bVar5 != null) {
                        bVar5.f408037a.prepare();
                    }
                } catch (java.lang.Exception e17) {
                    io.flutter.Log.e(str, "write audio file error. " + e17);
                }
            }
            kotlinx.coroutines.y0 y0Var = vVar.f408197t;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new si0.s(flutterPAGInfo, vVar, null), 2, null);
            this.f408166d = 1;
            if (((kotlinx.coroutines.c3) d17).C(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer3 = vVar.f408187j;
        this.f408169g.invoke(new java.lang.Long(surfaceProducer3 != null ? surfaceProducer3.id() : 0L));
        return jz5.f0.f302826a;
    }
}
