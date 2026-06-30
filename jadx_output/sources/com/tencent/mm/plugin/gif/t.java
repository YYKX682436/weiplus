package com.tencent.mm.plugin.gif;

/* loaded from: classes15.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.u f142188d;

    public t(com.tencent.mm.plugin.gif.u uVar) {
        this.f142188d = uVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f142188d.f142193g) {
            com.tencent.mm.plugin.gif.u uVar = this.f142188d;
            if (uVar.G) {
                return;
            }
            if (uVar.f142191e) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMWXGFDrawable", "Cpan This WXGF had been recycle.");
                return;
            }
            if (uVar.f142192f == 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMWXGFDrawable", "Cpan This WXGF JNIHandle is null.");
                jx3.f.INSTANCE.idkeyStat(401L, 18L, 1L, false);
                return;
            }
            com.tencent.mm.plugin.gif.u uVar2 = this.f142188d;
            if (uVar2.f142206w <= 2000 && uVar2.f142205v <= 2000) {
                boolean z17 = true;
                uVar2.G = true;
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.tencent.mm.plugin.gif.u uVar3 = this.f142188d;
                int i17 = uVar3.f142203t + 1;
                android.graphics.Bitmap[] bitmapArr = uVar3.f142201r;
                int length = i17 % bitmapArr.length;
                android.graphics.Bitmap bitmap = bitmapArr[length];
                if (bitmap == null) {
                    int i18 = uVar3.f142205v;
                    int i19 = uVar3.f142206w;
                    android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(config);
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Integer.valueOf(i19));
                    arrayList.add(java.lang.Integer.valueOf(i18));
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/gif/MMWXGFDrawable$4", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    bitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
                    yj0.a.e(obj, bitmap, "com/tencent/mm/plugin/gif/MMWXGFDrawable$4", "run", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                    this.f142188d.f142201r[length] = bitmap;
                }
                int nativeDecodeBufferFrame = ((com.tencent.mm.feature.emoji.api.IWXGFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IWXGFJNIService.class)).nativeDecodeBufferFrame(this.f142188d.f142192f, null, 0, bitmap, this.f142188d.f142195i);
                if (nativeDecodeBufferFrame == -904) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMWXGFDrawable", "nativeDecodeBufferFrame failed. func is null.");
                    jx3.f.INSTANCE.idkeyStat(401L, 8L, 1L, false);
                    return;
                }
                if (nativeDecodeBufferFrame == -909) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMWXGFDrawable", "nativeDecodeBufferFrame failed. frame is null.");
                    jx3.f.INSTANCE.idkeyStat(401L, 11L, 1L, false);
                } else if (nativeDecodeBufferFrame == -1) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.GIF.MMWXGFDrawable", "nativeDecodeBufferFrame failed.");
                    return;
                }
                com.tencent.mm.plugin.gif.u uVar4 = this.f142188d;
                int i27 = uVar4.f142208y + 1;
                uVar4.f142208y = i27;
                if (i27 >= uVar4.f142204u - 1 || nativeDecodeBufferFrame == 1) {
                    uVar4.f142208y = -1;
                    int nativeRewindBuffer = ((com.tencent.mm.feature.emoji.api.IWXGFJNIService) i95.n0.c(com.tencent.mm.feature.emoji.api.IWXGFJNIService.class)).nativeRewindBuffer(this.f142188d.f142192f);
                    if (nativeRewindBuffer != 0) {
                        if (nativeRewindBuffer == -905) {
                            jx3.f.INSTANCE.idkeyStat(711L, 9L, 1L, false);
                        }
                        com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMWXGFDrawable", "Cpan Rewind buffer failed.");
                        return;
                    }
                }
                this.f142188d.A = java.lang.System.currentTimeMillis() - currentTimeMillis;
                com.tencent.mm.plugin.gif.u uVar5 = this.f142188d;
                long j17 = uVar5.B;
                if (j17 != 0) {
                    long j18 = (j17 - uVar5.A) - uVar5.E;
                    uVar5.C = j18;
                    if (j18 < 0) {
                        int i28 = uVar5.f142208y;
                        if (j18 < -100) {
                            jx3.f fVar = jx3.f.INSTANCE;
                            fVar.idkeyStat(401L, 16L, 1L, false);
                            fVar.idkeyStat(401L, 17L, java.lang.Math.abs(this.f142188d.C), false);
                            com.tencent.mm.hardcoder.WXHardCoderJNI wXHardCoderJNI = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance();
                            if (!com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifEnable() && !com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameEnable()) {
                                z17 = false;
                            }
                            wXHardCoderJNI.stopPerformance(z17, this.f142188d.f142189J);
                            this.f142188d.f142189J = com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameDelay(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameThr() ? android.os.Process.myTid() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameTimeout(), 602, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcGifFrameAction(), "MicroMsg.GIF.MMWXGFDrawable");
                        }
                    }
                }
                com.tencent.mm.plugin.gif.u uVar6 = this.f142188d;
                if (uVar6.H) {
                    uVar6.H = false;
                    java.lang.Runnable runnable = uVar6.L;
                    uVar6.F = android.os.SystemClock.uptimeMillis();
                    if (android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) {
                        ((com.tencent.mm.plugin.gif.q) runnable).run();
                    } else {
                        com.tencent.mm.sdk.platformtools.o3 o3Var = uVar6.I;
                        if (o3Var != null) {
                            o3Var.d(runnable);
                        }
                    }
                } else {
                    java.lang.Runnable runnable2 = uVar6.L;
                    long j19 = uVar6.C;
                    uVar6.f(runnable2, j19 > 0 ? j19 : 0L);
                }
                com.tencent.mm.plugin.gif.u uVar7 = this.f142188d;
                int i29 = uVar7.f142195i[0];
                if (i29 <= 0) {
                    i29 = 100;
                }
                uVar7.B = i29;
                uVar7.G = false;
                return;
            }
            com.tencent.mars.xlog.Log.w("MicroMsg.GIF.MMWXGFDrawable", "image size is too big " + this.f142188d.f142206w + ", " + this.f142188d.f142205v);
        }
    }
}
