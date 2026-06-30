package wm5;

/* loaded from: classes10.dex */
public abstract class a implements com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter {

    /* renamed from: a, reason: collision with root package name */
    public final android.util.ArrayMap f447341a = new android.util.ArrayMap();

    /* renamed from: b, reason: collision with root package name */
    public android.util.Size f447342b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode f447343c;

    public a() {
        android.opengl.EGLContext EGL_NO_CONTEXT = android.opengl.EGL14.EGL_NO_CONTEXT;
        kotlin.jvm.internal.o.f(EGL_NO_CONTEXT, "EGL_NO_CONTEXT");
        this.f447342b = new android.util.Size(0, 0);
        this.f447343c = com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode.aspectFill;
        xm5.b.c("BaseMultiVideoCompositionEffect", "init: " + this, new java.lang.Object[0]);
    }

    public final void a(com.tencent.tavkit.composition.model.TAVVideoConfiguration.TAVVideoConfigurationContentMode newMode) {
        kotlin.jvm.internal.o.g(newMode, "newMode");
        xm5.b.c("BaseMultiVideoCompositionEffect", "setVideoConfigurationContentMode newMode:" + newMode, new java.lang.Object[0]);
        this.f447343c = newMode;
    }

    @Override // com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter
    public com.tencent.tavkit.ciimage.CIImage apply(com.tencent.tavkit.composition.video.TAVVideoMixEffect tAVVideoMixEffect, com.tencent.tavkit.composition.video.ImageCollection imageCollection, com.tencent.tavkit.composition.video.RenderInfo renderInfo) {
        com.tencent.tavkit.ciimage.CIContext ciContext;
        com.tencent.tav.coremedia.TextureInfo textureInfo;
        com.tencent.mm.xeffect.VLogDirector vLogDirector;
        if (renderInfo == null || (ciContext = renderInfo.getCiContext()) == null) {
            return null;
        }
        if (this.f447342b.getWidth() == 0 || this.f447342b.getHeight() == 0) {
            b(renderInfo.getRenderWidth(), renderInfo.getRenderHeight());
            xm5.b.b("BaseMultiVideoCompositionEffect", "assetsSize error %s, update as renderSize", this.f447342b);
        }
        kotlin.jvm.internal.o.f(ciContext.getRenderContext().eglContext(), "eglContext(...)");
        long j17 = 1000;
        long timeUs = renderInfo.getTime().getTimeUs() / j17;
        if (imageCollection == null) {
            return null;
        }
        java.util.LinkedList<jz5.l> linkedList = new java.util.LinkedList();
        java.util.Iterator<com.tencent.tavkit.composition.video.ImageCollection.TrackImagePair> it = imageCollection.getVideoChannelImages().iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            com.tencent.tavkit.composition.video.ImageCollection.TrackImagePair next = it.next();
            com.tencent.tavkit.composition.model.TAVVideoCompositionTrack track = next.getTrack();
            kotlin.jvm.internal.o.e(track, "null cannot be cast to non-null type com.tencent.tavkit.composition.TAVClip");
            com.tencent.tavkit.composition.TAVClip tAVClip = (com.tencent.tavkit.composition.TAVClip) track;
            if (!(tAVClip.getResource() instanceof com.tencent.tavkit.composition.resource.TAVEmptyResource)) {
                long timeUs2 = tAVClip.getStartTime().getTimeUs() / j17;
                long timeUs3 = (tAVClip.getDuration().getTimeUs() / j17) + timeUs2 + 1;
                if (timeUs2 <= timeUs && timeUs < timeUs3) {
                    z17 = true;
                }
                if (z17) {
                    java.lang.Object extraTrackInfo = tAVClip.getExtraTrackInfo("key_extra_track");
                    rm5.j jVar = extraTrackInfo instanceof rm5.j ? (rm5.j) extraTrackInfo : null;
                    if (jVar != null) {
                        linkedList.add(new jz5.l(jVar, next.getImage()));
                    }
                }
            }
        }
        java.util.LinkedList<rm5.m> linkedList2 = new java.util.LinkedList();
        for (jz5.l lVar : linkedList) {
            com.tencent.tavkit.ciimage.CIImage cIImage = (com.tencent.tavkit.ciimage.CIImage) lVar.f302834e;
            int i17 = (int) cIImage.getSize().width;
            int i18 = (int) cIImage.getSize().height;
            if (i17 > 0 && i18 > 0) {
                java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i18);
                java.util.LinkedList linkedList3 = (java.util.LinkedList) this.f447341a.get(new jz5.l(valueOf, valueOf2));
                com.tencent.tav.coremedia.TextureInfo newTextureInfo = !(linkedList3 == null || linkedList3.isEmpty()) ? (com.tencent.tav.coremedia.TextureInfo) linkedList3.removeFirst() : com.tencent.tavkit.ciimage.CIContext.newTextureInfo(valueOf.intValue(), valueOf2.intValue());
                com.tencent.tavkit.ciimage.CIImage cIImage2 = (com.tencent.tavkit.ciimage.CIImage) lVar.f302834e;
                cIImage2.applyFlip(false, true);
                ciContext.convertImageToTexture(cIImage2, newTextureInfo);
                cIImage2.reset();
                rm5.j jVar2 = (rm5.j) lVar.f302833d;
                kotlin.jvm.internal.o.d(newTextureInfo);
                linkedList2.add(new rm5.m(jVar2, newTextureInfo));
            }
        }
        wm5.h hVar = (wm5.h) this;
        xm5.b.a(hVar.f447354d, "[hash:%d][thread:%d]renderTracks ", java.lang.Integer.valueOf(hVar.hashCode()), java.lang.Integer.valueOf(android.os.Process.myTid()));
        if (hVar.f447361k == 0 || hVar.f447362l == 0) {
            hVar.f447361k = ciContext.getRenderContext().width();
            hVar.f447362l = ciContext.getRenderContext().height();
            xm5.b.c(hVar.f447354d, "renderTracks renderSize " + hVar.f447361k + ", " + hVar.f447362l + ", assetSize: " + hVar.f447342b + ", crop: " + hVar.f447360j, new java.lang.Object[0]);
        }
        if (hVar.f447355e == null) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.xeffect.VLogDirector vLogDirector2 = new com.tencent.mm.xeffect.VLogDirector();
            hVar.f447355e = vLogDirector2;
            vLogDirector2.c();
            com.tencent.mm.xeffect.VLogDirector vLogDirector3 = hVar.f447355e;
            if (vLogDirector3 != null) {
                vLogDirector3.g(0, 0, hVar.f447342b.getWidth(), hVar.f447342b.getHeight());
            }
            if (!hVar.f447360j.isEmpty() && (vLogDirector = hVar.f447355e) != null) {
                android.graphics.Rect rect = hVar.f447360j;
                vLogDirector.f(rect.left, rect.top, rect.right, rect.bottom);
            }
            com.tencent.mm.xeffect.VLogDirector vLogDirector4 = hVar.f447355e;
            if (vLogDirector4 != null) {
                int i19 = hVar.f447361k;
                int i27 = hVar.f447362l;
                vLogDirector4.f214799c = i19;
                vLogDirector4.f214800d = i27;
            }
            xm5.b.c(hVar.f447354d, "init vLogDirector:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime), new java.lang.Object[0]);
        }
        if (hVar.f447358h) {
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            com.tencent.mm.xeffect.VLogDirector vLogDirector5 = hVar.f447355e;
            if (vLogDirector5 != null) {
                vLogDirector5.e(hVar.f447356f);
            }
            hVar.f447358h = false;
            xm5.b.c(hVar.f447354d, "setVLogEffectMgr:" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime2), new java.lang.Object[0]);
        }
        if (hVar.f447363m == null) {
            long elapsedRealtime3 = android.os.SystemClock.elapsedRealtime();
            com.tencent.tav.coremedia.TextureInfo newTextureInfo2 = com.tencent.tavkit.ciimage.CIContext.newTextureInfo(hVar.f447361k, hVar.f447362l);
            android.opengl.GLES20.glBindTexture(3553, newTextureInfo2.textureID);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, newTextureInfo2.width, newTextureInfo2.height, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
            android.opengl.GLES20.glBindTexture(3553, 0);
            hVar.f447363m = newTextureInfo2;
            java.lang.String str = hVar.f447354d;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCreateOutputTexture texture.id:");
            com.tencent.tav.coremedia.TextureInfo textureInfo2 = hVar.f447363m;
            sb6.append(textureInfo2 != null ? java.lang.Integer.valueOf(textureInfo2.textureID) : null);
            sb6.append(", cost:");
            sb6.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime3);
            xm5.b.c(str, sb6.toString(), new java.lang.Object[0]);
            hVar.f447359i = false;
        } else if (hVar.f447359i) {
            long elapsedRealtime4 = android.os.SystemClock.elapsedRealtime();
            com.tencent.tav.coremedia.TextureInfo newTextureInfo3 = com.tencent.tavkit.ciimage.CIContext.newTextureInfo(hVar.f447361k, hVar.f447362l);
            android.opengl.GLES20.glBindTexture(3553, newTextureInfo3.textureID);
            android.opengl.GLES20.glTexImage2D(3553, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, newTextureInfo3.width, newTextureInfo3.height, 0, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, null);
            android.opengl.GLES20.glBindTexture(3553, 0);
            hVar.f447363m = newTextureInfo3;
            java.lang.String str2 = hVar.f447354d;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("ReCreateOutputTexture texture.id:");
            com.tencent.tav.coremedia.TextureInfo textureInfo3 = hVar.f447363m;
            sb7.append(textureInfo3 != null ? java.lang.Integer.valueOf(textureInfo3.textureID) : null);
            sb7.append(", cost:");
            sb7.append(android.os.SystemClock.elapsedRealtime() - elapsedRealtime4);
            xm5.b.c(str2, sb7.toString(), new java.lang.Object[0]);
            hVar.f447359i = false;
        }
        java.util.LinkedList linkedList4 = new java.util.LinkedList();
        for (rm5.m mVar : linkedList2) {
            com.tencent.tav.coremedia.TextureInfo textureInfo4 = mVar.f397528b;
            tq5.f fVar = new tq5.f(textureInfo4.textureID, textureInfo4.width, textureInfo4.height, false, mVar.f397527a.f397511m);
            if (!mVar.f397527a.f397513o.isEmpty()) {
                fVar.f421262g.set(mVar.f397527a.f397513o);
            }
            rm5.j jVar3 = mVar.f397527a;
            if (jVar3.f397514p) {
                if (jVar3.f397512n.isEmpty()) {
                    android.graphics.Rect rect2 = fVar.f421263h;
                    rm5.j jVar4 = mVar.f397527a;
                    rect2.set(0, 0, jVar4.f397509k, jVar4.f397510l);
                    rm5.o.a(fVar.f421263h, new android.graphics.Rect(0, 0, hVar.f447342b.getWidth(), hVar.f447342b.getHeight()));
                } else {
                    fVar.f421263h.set(mVar.f397527a.f397512n);
                }
            }
            linkedList4.add(fVar);
        }
        wm5.e eVar = hVar.f447364n;
        eVar.getClass();
        eVar.f447352e = android.os.SystemClock.elapsedRealtime();
        if (linkedList4.size() > 0 && (textureInfo = hVar.f447363m) != null) {
            if (!(textureInfo.textureID > 0)) {
                textureInfo = null;
            }
            if (textureInfo != null) {
                if (hVar.f447367q == null) {
                    hVar.f447367q = new wm5.c();
                }
                wm5.c cVar = hVar.f447367q;
                if (cVar != null) {
                    synchronized (cVar) {
                        int i28 = 0;
                        while (true) {
                            int[] iArr = cVar.f447345a;
                            if (i28 >= iArr.length) {
                                break;
                            }
                            android.opengl.GLES20.glGetIntegerv(iArr[i28], cVar.f447346b, i28);
                            i28++;
                        }
                    }
                }
                wm5.f fVar2 = hVar.f447357g;
                if (fVar2 != null) {
                    fVar2.a(timeUs);
                }
                com.tencent.mm.xeffect.VLogDirector vLogDirector6 = hVar.f447355e;
                if (vLogDirector6 != null) {
                    vLogDirector6.d(linkedList4, textureInfo.textureID, timeUs);
                }
                wm5.c cVar2 = hVar.f447367q;
                if (cVar2 != null) {
                    synchronized (cVar2) {
                        com.tencent.tav.decoder.logger.Logger.v("GLBlendStateCache", "restore: params = " + java.util.Arrays.toString(cVar2.f447346b));
                        android.opengl.GLES20.glEnable(3042);
                        android.opengl.GLES20.glBlendEquation(cVar2.f447346b[0]);
                        int[] iArr2 = cVar2.f447346b;
                        android.opengl.GLES20.glBlendEquationSeparate(iArr2[1], iArr2[2]);
                        int[] iArr3 = cVar2.f447346b;
                        android.opengl.GLES20.glBlendFuncSeparate(iArr3[3], iArr3[4], iArr3[5], iArr3[6]);
                    }
                }
            }
        }
        if (hVar.f447365o) {
            android.opengl.GLES20.glFinish();
        }
        wm5.e eVar2 = hVar.f447364n;
        long j18 = eVar2.f447352e;
        if (j18 > 0) {
            eVar2.f447349b += android.os.SystemClock.elapsedRealtime() - j18;
            eVar2.f447350c++;
        }
        eVar2.f447352e = 0L;
        com.tencent.tav.coremedia.TextureInfo textureInfo5 = hVar.f447363m;
        for (rm5.m mVar2 : linkedList2) {
            jz5.l lVar2 = new jz5.l(java.lang.Integer.valueOf(mVar2.f397528b.width), java.lang.Integer.valueOf(mVar2.f397528b.height));
            android.util.ArrayMap arrayMap = this.f447341a;
            java.lang.Object obj = arrayMap.get(lVar2);
            if (obj == null) {
                obj = new java.util.LinkedList();
                arrayMap.put(lVar2, obj);
            }
            ((java.util.LinkedList) obj).add(mVar2.f397528b);
        }
        com.tencent.tavkit.ciimage.CIImage cIImage3 = new com.tencent.tavkit.ciimage.CIImage(textureInfo5);
        cIImage3.applyFlip(false, true);
        cIImage3.applyFillInFrame(new com.tencent.tav.coremedia.CGRect(0.0f, 0.0f, renderInfo.getRenderWidth(), renderInfo.getRenderHeight()), this.f447343c);
        return cIImage3;
    }

    public abstract void b(int i17, int i18);

    @Override // com.tencent.tavkit.composition.video.TAVVideoMixEffect.Filter
    public void release() {
        xm5.b.c("BaseMultiVideoCompositionEffect", "release: " + this, new java.lang.Object[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.util.ArrayMap arrayMap = this.f447341a;
        java.util.Iterator it = arrayMap.entrySet().iterator();
        while (it.hasNext()) {
            java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
            kotlin.jvm.internal.o.f(value, "<get-value>(...)");
            kz5.h0.u(arrayList, (java.util.LinkedList) value);
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            ((com.tencent.tav.coremedia.TextureInfo) it6.next()).release();
        }
        arrayMap.clear();
    }
}
