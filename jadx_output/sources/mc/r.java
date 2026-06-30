package mc;

/* loaded from: classes14.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public volatile int f325541b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f325542c;

    /* renamed from: d, reason: collision with root package name */
    public android.media.MediaCodec f325543d;

    /* renamed from: e, reason: collision with root package name */
    public android.media.MediaMuxer f325544e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f325546g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f325547h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f325548i;

    /* renamed from: m, reason: collision with root package name */
    public long f325552m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f325556q;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ArrayBlockingQueue f325540a = new java.util.concurrent.ArrayBlockingQueue(10);

    /* renamed from: f, reason: collision with root package name */
    public int f325545f = -1;

    /* renamed from: j, reason: collision with root package name */
    public volatile boolean f325549j = false;

    /* renamed from: k, reason: collision with root package name */
    public volatile boolean f325550k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f325551l = 0;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f325553n = true;

    /* renamed from: o, reason: collision with root package name */
    public int f325554o = -1;

    /* renamed from: p, reason: collision with root package name */
    public boolean f325555p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f325557r = true;

    /* renamed from: s, reason: collision with root package name */
    public boolean f325558s = false;

    /* renamed from: t, reason: collision with root package name */
    public int f325559t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f325560u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f325561v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f325562w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.concurrent.CountDownLatch f325563x = new java.util.concurrent.CountDownLatch(1);

    /* renamed from: y, reason: collision with root package name */
    public int f325564y = 1;

    public r() {
        this.f325556q = true;
        int i17 = ic.d.f290281k;
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = ic.c.f290280a.f290290i;
        if (huiYanSdkConfig == null) {
            return;
        }
        this.f325556q = huiYanSdkConfig.isRecordVideo();
        if (huiYanSdkConfig.isDeleteVideoCache()) {
            com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil.getInstance().addWork(new java.lang.Runnable() { // from class: mc.r$$a
                @Override // java.lang.Runnable
                public final void run() {
                    mc.r.this.getClass();
                    int i18 = ic.d.f290281k;
                    android.content.Context a17 = ic.c.f290280a.a();
                    if (a17 == null) {
                        mc.p.f325531a.e("VideoRecorderManager", "Context is null");
                        return;
                    }
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    sb6.append(a17.getFilesDir());
                    java.lang.String str = java.io.File.separator;
                    sb6.append(str);
                    sb6.append("cloud-huiyan");
                    sb6.append(str);
                    sb6.append("video");
                    java.io.File file = new java.io.File(sb6.toString());
                    if (file.isDirectory()) {
                        java.io.File[] listFiles = file.listFiles();
                        if (listFiles == null || listFiles.length == 0) {
                            return;
                        }
                        for (java.io.File file2 : listFiles) {
                            file2.delete();
                        }
                    }
                    if (file.exists()) {
                        file.delete();
                    }
                }
            });
        }
    }

    public static java.lang.String a(java.lang.String str) {
        int i17 = ic.d.f290281k;
        android.content.Context a17 = ic.c.f290280a.a();
        if (a17 == null) {
            mc.p.f325531a.e("VideoRecorderManager", "Context is null");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cloud-huiyan");
        java.lang.String str2 = java.io.File.separator;
        sb6.append(str2);
        sb6.append("video");
        sb6.append(str2);
        sb6.append(str);
        java.lang.String str3 = a17.getFilesDir() + str2 + sb6.toString();
        java.io.File file = new java.io.File(str3);
        if (!file.getParentFile().exists() && !file.getParentFile().mkdirs()) {
            mc.p.f325531a.e("VideoRecorderManager", "Create parent dir error!");
        }
        if (file.exists() && !file.delete()) {
            mc.p.f325531a.e("VideoRecorderManager", "delete last video error!");
        }
        return str3;
    }

    public static void e(android.media.MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("max-input-size")) {
            return;
        }
        int integer = mediaFormat.getInteger("height");
        if (mediaFormat.containsKey("max-height")) {
            integer = java.lang.Math.max(integer, mediaFormat.getInteger("max-height"));
        }
        int integer2 = mediaFormat.getInteger("width");
        if (mediaFormat.containsKey("max-width")) {
            integer2 = java.lang.Math.max(integer, mediaFormat.getInteger("max-width"));
        }
        mediaFormat.setInteger("max-input-size", ((((((integer + 15) / 16) * ((integer2 + 15) / 16)) * 16) * 16) * 3) / 4);
    }

    public static void h(byte[] bArr, int i17, int i18) {
        int i19 = 0;
        int i27 = 0;
        while (i27 < i18) {
            int i28 = i27 * i17;
            i27++;
            for (int i29 = (i27 * i17) - 1; i28 < i29; i29--) {
                byte b17 = bArr[i28];
                bArr[i28] = bArr[i29];
                bArr[i29] = b17;
                i28++;
            }
        }
        int i37 = i17 * i18;
        while (i19 < i18 / 2) {
            int i38 = i19 * i17;
            i19++;
            for (int i39 = (i19 * i17) - 2; i38 < i39; i39 -= 2) {
                int i47 = i38 + i37;
                byte b18 = bArr[i47];
                int i48 = i39 + i37;
                bArr[i47] = bArr[i48];
                bArr[i48] = b18;
                int i49 = i47 + 1;
                byte b19 = bArr[i49];
                int i57 = i48 + 1;
                bArr[i49] = bArr[i57];
                bArr[i57] = b19;
                i38 += 2;
            }
        }
    }

    public static byte[] j(byte[] bArr, int i17, int i18) {
        pc.b bVar = pc.a.f353200a;
        com.tencent.cloud.component.common.ai.utils.SimplePool simplePool = bVar.f353201a;
        byte[] bArr2 = simplePool == null ? null : (byte[]) simplePool.acquire();
        if (bArr2 == null) {
            bArr2 = new byte[((i17 * i18) * 3) / 2];
        }
        int i19 = i17 * i18;
        int i27 = 0;
        for (int i28 = i19 - 1; i28 >= 0; i28--) {
            bArr2[i27] = bArr[i28];
            i27++;
        }
        for (int i29 = ((i19 * 3) / 2) - 1; i29 >= i19; i29 -= 2) {
            int i37 = i27 + 1;
            bArr2[i27] = bArr[i29 - 1];
            i27 = i37 + 1;
            bArr2[i37] = bArr[i29];
        }
        bVar.a(bArr);
        return bArr2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:26|(8:45|30|(2:31|(1:34)(1:33))|35|36|37|38|39)|29|30|(3:31|(0)(0)|33)|35|36|37|38|39) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00bf, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c0, code lost:
    
        mc.p.f325531a.e("VideoRecorderManager", "cutMediaMuxer.stop(): " + r4.getLocalizedMessage());
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3 A[Catch: IOException -> 0x0107, LOOP:1: B:31:0x00b2->B:33:0x00e3, LOOP_END, TryCatch #1 {IOException -> 0x0107, blocks: (B:14:0x0031, B:15:0x0038, B:17:0x003e, B:21:0x0055, B:22:0x0059, B:24:0x006c, B:26:0x0079, B:30:0x00ac, B:31:0x00b2, B:35:0x00b8, B:37:0x00bb, B:38:0x00da, B:42:0x00c0, B:33:0x00e3, B:43:0x00a2, B:47:0x00fa), top: B:13:0x0031, inners: #0, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8 A[EDGE_INSN: B:34:0x00b8->B:35:0x00b8 BREAK  A[LOOP:1: B:31:0x00b2->B:33:0x00e3], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(jc.d r14) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mc.r.b(jc.d):java.lang.String");
    }

    public final void c(int i17, int i18, int i19) {
        this.f325559t = i17;
        this.f325560u = i18;
        this.f325561v = i17;
        this.f325562w = i18;
        this.f325564y = 1;
        this.f325541b = (i17 / 64) * 64;
        this.f325542c = (this.f325562w / 64) * 64;
        if (5 == i19) {
            this.f325558s = true;
        }
        int i27 = ic.d.f290281k;
        com.tencent.cloud.huiyan.entity.HuiYanSdkConfig huiYanSdkConfig = ic.c.f290280a.f290290i;
        if (huiYanSdkConfig != null && huiYanSdkConfig.isUseBackCamera()) {
            this.f325557r = false;
        }
        this.f325561v = i17;
        this.f325562w = i18;
        com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil.getInstance().addWork(new java.lang.Runnable() { // from class: mc.r$$d
            /* JADX WARN: Code restructure failed: missing block: B:73:0x0086, code lost:
            
                if (r2 != false) goto L50;
             */
            /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 357
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: mc.r$$d.run():void");
            }
        });
    }

    public final void d(long j17, byte[] bArr) {
        java.nio.ByteBuffer[] inputBuffers = this.f325543d.getInputBuffers();
        java.nio.ByteBuffer[] outputBuffers = this.f325543d.getOutputBuffers();
        int dequeueInputBuffer = this.f325543d.dequeueInputBuffer(0L);
        if (dequeueInputBuffer >= 0) {
            java.nio.ByteBuffer byteBuffer = inputBuffers[dequeueInputBuffer];
            byteBuffer.clear();
            byteBuffer.put(bArr);
            this.f325543d.queueInputBuffer(dequeueInputBuffer, 0, bArr.length, (java.lang.System.nanoTime() - j17) / 1000, 0);
        }
        android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
        int dequeueOutputBuffer = this.f325543d.dequeueOutputBuffer(bufferInfo, 0L);
        if (dequeueOutputBuffer == -2) {
            int addTrack = this.f325544e.addTrack(this.f325543d.getOutputFormat());
            this.f325545f = addTrack;
            if (addTrack >= 0) {
                this.f325544e.start();
                mc.p.f325531a.b("VideoRecorderManager", "mediaMuxer.start!");
            }
        }
        while (dequeueOutputBuffer > 0) {
            java.nio.ByteBuffer byteBuffer2 = outputBuffers[dequeueOutputBuffer];
            int i17 = this.f325545f;
            if (i17 >= 0) {
                this.f325544e.writeSampleData(i17, byteBuffer2, bufferInfo);
            }
            this.f325543d.releaseOutputBuffer(dequeueOutputBuffer, false);
            dequeueOutputBuffer = this.f325543d.dequeueOutputBuffer(bufferInfo, 0L);
        }
    }

    public final byte[] f(byte[] bArr) {
        int i17 = this.f325564y;
        if (i17 != 1) {
            int i18 = this.f325559t;
            int i19 = this.f325560u;
            if (i17 <= 0) {
                throw new java.lang.IllegalArgumentException("scaleFactor must be positive");
            }
            int i27 = (i19 / i17) * (i18 / i17);
            byte[] bArr2 = new byte[(i27 * 3) / 2];
            int i28 = 0;
            for (int i29 = 0; i29 < i19; i29 += i17) {
                for (int i37 = 0; i37 < i18; i37 += i17) {
                    bArr2[i28] = bArr[(i29 * i18) + i37];
                    i28++;
                }
            }
            int i38 = i18 * i19;
            for (int i39 = 0; i39 < i19 / 2; i39 += i17) {
                for (int i47 = 0; i47 < i18; i47 += i17 * 2) {
                    int i48 = (i39 * i18) + i38 + i47;
                    bArr2[i27] = bArr[i48];
                    bArr2[i27 + 1] = bArr[i48 + 1];
                    i27 += 2;
                }
            }
            bArr = bArr2;
        }
        int i49 = (this.f325562w - this.f325542c) / 2;
        int i57 = (this.f325561v - this.f325541b) / 2;
        int i58 = this.f325561v;
        int i59 = this.f325562w;
        int i66 = this.f325541b;
        int i67 = this.f325542c;
        if (i57 % 2 == 1) {
            i57--;
        }
        if (i49 % 2 == 1) {
            i49--;
        }
        int i68 = i49 + i67;
        int i69 = ((i66 * i67) * 3) / 2;
        com.tencent.cloud.component.common.ai.utils.SimplePool simplePool = pc.a.f353200a.f353201a;
        byte[] bArr3 = simplePool == null ? null : (byte[]) simplePool.acquire();
        if (bArr3 == null) {
            bArr3 = new byte[i69];
        }
        for (int i76 = i49; i76 < i68; i76++) {
            java.lang.System.arraycopy(bArr, (i76 * i58) + i57, bArr3, (i76 - i49) * i66, i66);
        }
        int i77 = (i49 / 2) + i59;
        int i78 = (i68 / 2) + i59;
        for (int i79 = i77; i79 < i78; i79++) {
            java.lang.System.arraycopy(bArr, (i79 * i58) + i57, bArr3, ((i79 - i77) + i67) * i66, i66);
        }
        return bArr3;
    }

    public final byte[] g(byte[] bArr, int i17, int i18) {
        byte[] bArr2;
        int i19;
        int i27 = this.f325554o;
        pc.b bVar = pc.a.f353200a;
        if (i27 == 19) {
            com.tencent.cloud.component.common.ai.utils.SimplePool simplePool = bVar.f353201a;
            bArr2 = simplePool != null ? (byte[]) simplePool.acquire() : null;
            if (bArr2 == null) {
                bArr2 = new byte[((i17 * i18) * 3) / 2];
            }
            int i28 = i17 * i18;
            java.nio.ByteBuffer wrap = java.nio.ByteBuffer.wrap(bArr2, 0, i28);
            int i29 = i28 / 4;
            java.nio.ByteBuffer wrap2 = java.nio.ByteBuffer.wrap(bArr2, i28, i29);
            java.nio.ByteBuffer wrap3 = java.nio.ByteBuffer.wrap(bArr2, i28 + i29, i29);
            wrap.put(bArr, 0, i28);
            while (i28 < bArr.length) {
                wrap3.put(bArr[i28]);
                wrap2.put(bArr[i28 + 1]);
                i28 += 2;
            }
            return bArr2;
        }
        if (i27 != 21) {
            return null;
        }
        com.tencent.cloud.component.common.ai.utils.SimplePool simplePool2 = bVar.f353201a;
        bArr2 = simplePool2 != null ? (byte[]) simplePool2.acquire() : null;
        if (bArr2 == null) {
            bArr2 = new byte[((i17 * i18) * 3) / 2];
        }
        int i37 = i17 * i18;
        for (int i38 = 0; i38 < i37; i38++) {
            bArr2[i38] = bArr[i38];
        }
        int i39 = 0;
        while (true) {
            i19 = i37 / 2;
            if (i39 >= i19) {
                break;
            }
            int i47 = i37 + i39;
            bArr2[i47 - 1] = bArr[i47];
            i39 += 2;
        }
        for (int i48 = 0; i48 < i19; i48 += 2) {
            int i49 = i37 + i48;
            bArr2[i49] = bArr[i49 - 1];
        }
        return bArr2;
    }

    public final boolean i() {
        return (this.f325556q && this.f325553n && !this.f325555p) ? false : true;
    }

    public final void k() {
        if (i()) {
            mc.p.f325531a.e("VideoRecorderManager", "start thread not need video!");
        } else {
            this.f325552m = java.lang.System.nanoTime();
            com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil.getInstance().addWork(new java.lang.Runnable() { // from class: mc.r$$c
                @Override // java.lang.Runnable
                public final void run() {
                    java.lang.Object obj;
                    byte[] bArr;
                    mc.r rVar = mc.r.this;
                    rVar.getClass();
                    try {
                        rVar.f325563x.await();
                    } catch (java.lang.InterruptedException e17) {
                        mc.p.f325531a.e("VideoRecorderManager", "countDownLatch.wait(): " + e17.getLocalizedMessage());
                    }
                    while (!rVar.f325549j) {
                        long j17 = rVar.f325552m;
                        if (rVar.f325540a.size() > 0) {
                            byte[] bArr2 = (byte[]) rVar.f325540a.poll();
                            try {
                                try {
                                    bArr = rVar.f(bArr2);
                                    pc.c.f353202a.a(bArr2);
                                } catch (java.lang.Exception e18) {
                                    e = e18;
                                }
                            } catch (java.lang.Throwable th6) {
                                th = th6;
                                bArr = bArr2;
                            }
                            try {
                                if (rVar.f325557r) {
                                    mc.r.h(bArr, rVar.f325541b, rVar.f325542c);
                                }
                                byte[] j18 = rVar.f325558s ? mc.r.j(bArr, rVar.f325541b, rVar.f325542c) : bArr;
                                byte[] g17 = rVar.g(j18, rVar.f325541b, rVar.f325542c);
                                if (g17 == null) {
                                    pc.b bVar = pc.a.f353200a;
                                    bVar.a(j18);
                                    if (g17 != null) {
                                        bVar.a(g17);
                                    }
                                    bVar.a(bArr);
                                } else {
                                    rVar.d(j17, g17);
                                    pc.b bVar2 = pc.a.f353200a;
                                    bVar2.a(g17);
                                    bVar2.a(bArr);
                                }
                            } catch (java.lang.Exception e19) {
                                e = e19;
                                bArr2 = bArr;
                                mc.p.f325531a.e("VideoRecorderManager", "record video has some error! " + e.getLocalizedMessage());
                                rVar.f325549j = true;
                                if (0 != 0) {
                                    pc.a.f353200a.a(null);
                                }
                                pc.a.f353200a.a(bArr2);
                            } catch (java.lang.Throwable th7) {
                                th = th7;
                                if (0 != 0) {
                                    pc.a.f353200a.a(null);
                                }
                                pc.a.f353200a.a(bArr);
                                throw th;
                            }
                        }
                    }
                    synchronized (rVar.f325548i) {
                        try {
                            try {
                                android.media.MediaMuxer mediaMuxer = rVar.f325544e;
                                if (mediaMuxer != null) {
                                    try {
                                        mediaMuxer.stop();
                                    } catch (java.lang.IllegalStateException e27) {
                                        mc.p.f325531a.e("VideoRecorderManager", "mediaMuxer.stop(): " + e27.getLocalizedMessage());
                                    }
                                    rVar.f325544e.release();
                                    rVar.f325544e = null;
                                }
                                android.media.MediaCodec mediaCodec = rVar.f325543d;
                                if (mediaCodec != null) {
                                    mediaCodec.stop();
                                    rVar.f325543d.release();
                                    rVar.f325543d = null;
                                }
                                obj = rVar.f325548i;
                            } catch (java.lang.RuntimeException e28) {
                                mc.p.f325531a.e("VideoRecorderManager", "release media state error! e: " + e28.getLocalizedMessage());
                                obj = rVar.f325548i;
                            }
                            obj.notifyAll();
                            if (rVar.f325550k) {
                                com.tencent.cloud.component.common.ai.utils.ThreadPoolUtil.getInstance().addWork(new pc.e(rVar.f325546g));
                            }
                        } catch (java.lang.Throwable th8) {
                            rVar.f325548i.notifyAll();
                            throw th8;
                        }
                    }
                }
            });
        }
    }
}
