package si0;

/* loaded from: classes13.dex */
public final class j0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f408090d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f408091e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.pigeon.flutter_pag.FlutterPAGInfo f408092f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f408093g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(si0.l0 l0Var, com.tencent.pigeon.flutter_pag.FlutterPAGInfo flutterPAGInfo, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f408091e = l0Var;
        this.f408092f = flutterPAGInfo;
        this.f408093g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new si0.j0(this.f408091e, this.f408092f, this.f408093g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.j0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        org.libpag.PAGPlayer pAGPlayer;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f408090d;
        si0.l0 l0Var = this.f408091e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.pigeon.flutter_pag.FlutterPAGInfo flutterPAGInfo = this.f408092f;
            int repeatCount = (int) flutterPAGInfo.getRepeatCount();
            l0Var.getClass();
            android.animation.ValueAnimator valueAnimator = l0Var.f408112o;
            valueAnimator.setRepeatCount(repeatCount);
            double width = flutterPAGInfo.getWidth();
            double height = flutterPAGInfo.getHeight();
            l0Var.f408114q = (int) width;
            l0Var.f408115r = (int) height;
            java.lang.String pagPath = flutterPAGInfo.getFilepath();
            boolean isFromAsset = flutterPAGInfo.isFromAsset();
            kotlin.jvm.internal.o.g(pagPath, "pagPath");
            l0Var.f408104g = null;
            si0.b bVar = l0Var.C;
            if (bVar != null) {
                bVar.f408037a.stop();
            }
            si0.b bVar2 = l0Var.C;
            if (bVar2 != null) {
                bVar2.f408037a.release();
            }
            l0Var.C = null;
            if (isFromAsset) {
                l0Var.f408104g = org.libpag.PAGFile.Load(l0Var.f408098a.getAssets(), pagPath);
            } else {
                l0Var.f408104g = org.libpag.PAGFile.Load(pagPath);
            }
            org.libpag.PAGFile pAGFile = l0Var.f408104g;
            l0Var.f408113p = pAGFile != null ? pAGFile.duration() : 0L;
            io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = l0Var.f408107j;
            if (surfaceProducer != null) {
                surfaceProducer.setSize(l0Var.f408114q, l0Var.f408115r);
            }
            org.libpag.PAGSurface pAGSurface = l0Var.f408105h;
            if (pAGSurface != null) {
                pAGSurface.freeCache();
            }
            org.libpag.PAGSurface pAGSurface2 = l0Var.f408105h;
            if (pAGSurface2 != null) {
                pAGSurface2.release();
            }
            l0Var.f408105h = null;
            l0Var.f408103f = new org.libpag.PAGPlayer();
            io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer2 = l0Var.f408107j;
            l0Var.f408105h = org.libpag.PAGSurface.FromSurface(surfaceProducer2 != null ? surfaceProducer2.getSurface() : null);
            org.libpag.PAGPlayer pAGPlayer2 = l0Var.f408103f;
            if (pAGPlayer2 != null) {
                pAGPlayer2.setComposition(l0Var.f408104g);
            }
            org.libpag.PAGPlayer pAGPlayer3 = l0Var.f408103f;
            if (pAGPlayer3 != null) {
                pAGPlayer3.setSurface(l0Var.f408105h);
            }
            com.tencent.pigeon.flutter_pag.FlutterPAGInfo flutterPAGInfo2 = l0Var.f408106i;
            java.lang.Double valueOf = flutterPAGInfo2 != null ? java.lang.Double.valueOf(flutterPAGInfo2.getMaxFrameRate()) : null;
            if (valueOf != null && valueOf.doubleValue() > 0.0d && (pAGPlayer = l0Var.f408103f) != null) {
                pAGPlayer.setMaxFrameRate((float) valueOf.doubleValue());
            }
            valueAnimator.setDuration((long) ((l0Var.f408113p / 1000) / l0Var.f408116s));
            java.lang.String str = "reset width:" + l0Var.f408114q + ", height:" + l0Var.f408115r + ", duration:" + l0Var.f408113p;
            java.lang.String str2 = l0Var.f408101d;
            io.flutter.Log.i(str2, str);
            org.libpag.PAGFile pAGFile2 = l0Var.f408104g;
            java.nio.ByteBuffer audioBytes = pAGFile2 != null ? pAGFile2.audioBytes() : null;
            org.libpag.PAGFile pAGFile3 = l0Var.f408104g;
            l0Var.D = pAGFile3 != null ? pAGFile3.audioStartTime() : 0L;
            if (audioBytes != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                org.libpag.PAGFile pAGFile4 = l0Var.f408104g;
                kotlin.jvm.internal.o.d(pAGFile4);
                sb6.append(pAGFile4.path());
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
                    l0Var.C = bVar3;
                    kotlin.jvm.internal.o.g(filePath, "filePath");
                    bVar3.f408037a.setDataSource(filePath);
                    si0.b bVar4 = l0Var.C;
                    if (bVar4 != null) {
                        bVar4.f408038b = (int) flutterPAGInfo.getRepeatCount();
                    }
                    si0.b bVar5 = l0Var.C;
                    if (bVar5 != null) {
                        bVar5.f408037a.prepare();
                    }
                } catch (java.lang.Exception e17) {
                    io.flutter.Log.e(str2, "write audio file error. " + e17);
                }
            }
            kotlinx.coroutines.y0 y0Var = l0Var.f408117t;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.r2 d17 = kotlinx.coroutines.l.d(y0Var, kotlinx.coroutines.internal.b0.f310484a, null, new si0.i0(flutterPAGInfo, l0Var, null), 2, null);
            this.f408090d = 1;
            if (((kotlinx.coroutines.c3) d17).C(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer3 = l0Var.f408107j;
        this.f408093g.invoke(new java.lang.Long(surfaceProducer3 != null ? surfaceProducer3.id() : 0L));
        return jz5.f0.f302826a;
    }
}
