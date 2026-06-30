package wo;

/* loaded from: classes14.dex */
public class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.media.MediaCodec f447719a;

    /* renamed from: b, reason: collision with root package name */
    public final wo.j1 f447720b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f447721c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f447722d = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f447723e = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f447724f = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f447725g = new java.util.concurrent.atomic.AtomicInteger();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f447726h = new java.util.concurrent.atomic.AtomicInteger();

    public i1(android.media.MediaCodec mediaCodec, wo.j1 j1Var) {
        this.f447721c = false;
        this.f447719a = mediaCodec;
        this.f447720b = j1Var;
        this.f447721c = true;
    }

    public static wo.i1 b(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecProxy", "into createByCodecName, name = [%s]", str);
        wo.j1 j1Var = new wo.j1();
        try {
            wo.k1.a(7);
            wo.k1.a(66);
            android.media.MediaCodec createByCodecName = android.media.MediaCodec.createByCodecName(str);
            wo.k1.a(67);
            j1Var = wo.n1.d(createByCodecName.hashCode(), str);
            int codecCount = android.media.MediaCodecList.getCodecCount();
            int i17 = 0;
            while (true) {
                if (i17 >= codecCount) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxyUtils", "codecNameSupportCheck error, type unsupport:[%s]", str);
                    wo.k1.a(24);
                    wo.k1.b(24, j1Var);
                    break;
                }
                if (android.text.TextUtils.equals(str, android.media.MediaCodecList.getCodecInfoAt(i17).getName())) {
                    j1Var.f447732e = str;
                    break;
                }
                i17++;
            }
            wo.n1.a();
            return new wo.i1(createByCodecName, j1Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "createByCodecName func error " + str, new java.lang.Object[0]);
            u(2, e17, j1Var);
            int codecCount2 = android.media.MediaCodecList.getCodecCount();
            for (int i18 = 0; i18 < codecCount2; i18++) {
                android.media.MediaCodecInfo codecInfoAt = android.media.MediaCodecList.getCodecInfoAt(i18);
                if (android.text.TextUtils.equals(codecInfoAt.getName(), str)) {
                    java.lang.String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    if (supportedTypes.length > 0) {
                        wo.n1.c(codecInfoAt.isEncoder(), supportedTypes[0], j1Var);
                    }
                }
            }
            throw e17;
        }
    }

    public static wo.i1 c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecProxy", "into createDecoderByType, type = [%s]", str);
        wo.j1 j1Var = new wo.j1();
        try {
            wo.k1.a(7);
            wo.k1.a(60);
            android.media.MediaCodec createDecoderByType = android.media.MediaCodec.createDecoderByType(str);
            wo.k1.a(61);
            j1Var = wo.n1.e(createDecoderByType.hashCode(), false, str);
            wo.n1.f(str, j1Var);
            wo.n1.a();
            return new wo.i1(createDecoderByType, j1Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "createDecoderByType error " + str, new java.lang.Object[0]);
            u(0, e17, j1Var);
            wo.n1.c(false, str, j1Var);
            throw e17;
        }
    }

    public static wo.i1 d(java.lang.String str, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecProxy", "into createEncoderByType, type = [%s]", str);
        wo.j1 j1Var = new wo.j1();
        try {
            wo.k1.a(7);
            wo.k1.a(63);
            android.media.MediaCodec createEncoderByType = android.media.MediaCodec.createEncoderByType(str);
            wo.k1.a(64);
            j1Var = wo.n1.e(createEncoderByType.hashCode(), true, str);
            wo.n1.f(str, j1Var);
            wo.n1.a();
            return new wo.i1(createEncoderByType, j1Var);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "createByCodecName error " + str, new java.lang.Object[0]);
            if (!z17) {
                u(1, e17, j1Var);
                wo.n1.c(true, str, j1Var);
            }
            throw e17;
        }
    }

    public static void u(int i17, java.lang.Exception exc, wo.j1 j1Var) {
        java.lang.String b17;
        if (j1Var != null) {
            if (exc != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(exc.toString());
                sb6.append("----");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                sb6.append(com.tencent.mm.sdk.platformtools.z3.b(true));
                b17 = sb6.toString();
            } else {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                b17 = com.tencent.mm.sdk.platformtools.z3.b(true);
            }
            j1Var.f447730c = b17;
        }
        wo.k1.a(i17);
        wo.k1.b(i17, j1Var);
    }

    public void a(android.media.MediaFormat mediaFormat, android.view.Surface surface, android.media.MediaCrypto mediaCrypto, int i17) {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecProxy", "configure 1 function, thread:[%s], threadName:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()), java.lang.Thread.currentThread().getName());
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("configure 1 format = ");
            sb6.append(mediaFormat != null ? mediaFormat.toString() : "null");
            sb6.append(" surface = ");
            sb6.append(surface != null ? surface.toString() : "null");
            sb6.append(" crypto = ");
            sb6.append(mediaCrypto != null ? mediaCrypto.toString() : "null");
            sb6.append(" flags = ");
            sb6.append(i17);
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecProxy", sb6.toString());
            if (!this.f447721c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "MediaCodecProxy configure not alive");
            }
            if (mediaFormat != null) {
                this.f447720b.f447733f = mediaFormat.toString();
            }
            wo.k1.a(75);
            this.f447719a.configure(mediaFormat, surface, mediaCrypto, i17);
            wo.k1.a(76);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy configure 1", new java.lang.Object[0]);
            u(32, e17, this.f447720b);
            throw e17;
        }
    }

    public final android.view.Surface e() {
        try {
            wo.k1.a(87);
            android.view.Surface createInputSurface = this.f447719a.createInputSurface();
            wo.k1.a(88);
            return createInputSurface;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy createInputSurface", new java.lang.Object[0]);
            u(36, e17, this.f447720b);
            throw e17;
        }
    }

    public final int f(long j17) {
        try {
            if (!this.f447721c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "dequeueInputBuffer function, threadName:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()), java.lang.Thread.currentThread().getName());
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "MediaCodecProxy dequeueInputBuffer not alive");
            }
            return this.f447719a.dequeueInputBuffer(j17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy dequeueInputBuffer, thread:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()));
            wo.k1.a(42);
            this.f447725g.getAndIncrement();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            throw e17;
        }
    }

    public final int g(android.media.MediaCodec.BufferInfo bufferInfo, long j17) {
        try {
            if (!this.f447721c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "dequeueOutputBuffer function, threadName:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()), java.lang.Thread.currentThread().getName());
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "MediaCodecProxy dequeueOutputBuffer not alive");
            }
            return this.f447719a.dequeueOutputBuffer(bufferInfo, j17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy dequeueOutputBuffer, thread:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()));
            wo.k1.a(43);
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            this.f447726h.getAndIncrement();
            throw e17;
        }
    }

    public final void h() {
        try {
            if (!this.f447721c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "MediaCodecProxy flush not alive");
            }
            wo.k1.a(96);
            this.f447719a.flush();
            wo.k1.a(97);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy flush, thread:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()));
            wo.k1.a(39);
            this.f447722d.getAndIncrement();
            throw e17;
        }
    }

    public android.media.MediaCodecInfo i() {
        try {
            wo.k1.a(com.tencent.thumbplayer.core.player.ITPNativePlayerMessageCallback.INFO_LONG1_CLIP_EOS);
            android.media.MediaCodecInfo codecInfo = this.f447719a.getCodecInfo();
            wo.k1.a(154);
            return codecInfo;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy getCodecInfo, thread:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()));
            u(58, e17, this.f447720b);
            throw e17;
        }
    }

    public java.nio.ByteBuffer j(int i17) {
        try {
            return this.f447719a.getInputBuffer(i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy getInputBuffer", new java.lang.Object[0]);
            u(51, e17, this.f447720b);
            throw e17;
        }
    }

    public java.nio.ByteBuffer[] k() {
        try {
            wo.k1.a(126);
            java.nio.ByteBuffer[] inputBuffers = this.f447719a.getInputBuffers();
            wo.k1.a(127);
            return inputBuffers;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy getInputBuffers", new java.lang.Object[0]);
            u(49, e17, this.f447720b);
            throw e17;
        }
    }

    public final java.lang.String l() {
        try {
            wo.k1.a(147);
            java.lang.String name = this.f447719a.getName();
            wo.k1.a(148);
            return name;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy getName", new java.lang.Object[0]);
            u(56, e17, this.f447720b);
            throw e17;
        }
    }

    public java.nio.ByteBuffer m(int i17) {
        try {
            return this.f447719a.getOutputBuffer(i17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy getOutputBuffer", new java.lang.Object[0]);
            u(53, e17, this.f447720b);
            throw e17;
        }
    }

    public java.nio.ByteBuffer[] n() {
        try {
            wo.k1.a(129);
            java.nio.ByteBuffer[] outputBuffers = this.f447719a.getOutputBuffers();
            wo.k1.a(130);
            return outputBuffers;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy getOutputBuffers", new java.lang.Object[0]);
            u(50, e17, this.f447720b);
            throw e17;
        }
    }

    public final android.media.MediaFormat o() {
        try {
            wo.k1.a(120);
            android.media.MediaFormat outputFormat = this.f447719a.getOutputFormat();
            wo.k1.a(121);
            return outputFormat;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy getOutputFormat, thread:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()));
            u(47, e17, this.f447720b);
            throw e17;
        }
    }

    public final void p(int i17, int i18, int i19, long j17, int i27) {
        try {
            if (!this.f447721c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "queueInputBuffer function, threadName:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()), java.lang.Thread.currentThread().getName());
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "MediaCodecProxy queueInputBuffer not alive");
            }
            this.f447719a.queueInputBuffer(i17, i18, i19, j17, i27);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy queueInputBuffer, thread:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()));
            wo.k1.a(40);
            this.f447723e.getAndIncrement();
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            throw e17;
        }
    }

    public final void q() {
        try {
            wo.k1.a(11);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecProxy", "into release function, thread:[%s], stack:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()), com.tencent.mm.sdk.platformtools.z3.b(true));
            if (!this.f447721c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "release error, multi release, stack:[%s]", com.tencent.mm.sdk.platformtools.z3.b(true));
                u(10, null, this.f447720b);
            }
            wo.n1.g(this.f447719a.hashCode());
            wo.n1.a();
            wo.k1.a(69);
            this.f447719a.release();
            wo.k1.a(70);
            t();
            this.f447721c = false;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy release", new java.lang.Object[0]);
            u(30, e17, this.f447720b);
            throw e17;
        }
    }

    public final void r(int i17, long j17) {
        try {
            if (!this.f447721c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "releaseOutputBuffer function, threadName:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()), java.lang.Thread.currentThread().getName());
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "MediaCodecProxy releaseOutputBuffer not alive");
            }
            wo.k1.a(114);
            this.f447719a.releaseOutputBuffer(i17, j17);
            wo.k1.a(115);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy releaseOutputBuffer 2, thread:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()));
            u(45, e17, this.f447720b);
            throw e17;
        }
    }

    public final void s(int i17, boolean z17) {
        try {
            if (!this.f447721c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "releaseOutputBuffer function, threadName:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()), java.lang.Thread.currentThread().getName());
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "MediaCodecProxy releaseOutputBuffer not alive");
            }
            this.f447719a.releaseOutputBuffer(i17, z17);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy releaseOutputBuffer 1, thread:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()));
            u(44, e17, this.f447720b);
            throw e17;
        }
    }

    public final void t() {
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f447722d;
        int i17 = atomicInteger.get();
        java.util.concurrent.atomic.AtomicInteger atomicInteger2 = this.f447725g;
        int i18 = i17 + atomicInteger2.get();
        java.util.concurrent.atomic.AtomicInteger atomicInteger3 = this.f447726h;
        int i19 = i18 + atomicInteger3.get();
        java.util.concurrent.atomic.AtomicInteger atomicInteger4 = this.f447723e;
        int i27 = i19 + atomicInteger4.get();
        java.util.concurrent.atomic.AtomicInteger atomicInteger5 = this.f447724f;
        if (i27 + atomicInteger5.get() > 10) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("countFlush:");
            sb6.append(atomicInteger);
            sb6.append(";countDequeueInputBuffer:");
            sb6.append(atomicInteger2);
            sb6.append(";countDequeueOutputBuffer:");
            sb6.append(atomicInteger3);
            sb6.append(";countQueueInputBuffer:");
            sb6.append(atomicInteger4);
            sb6.append(";countQueueSecureInputBuffer:");
            sb6.append(atomicInteger5);
            sb6.append(";");
            wo.j1 j1Var = this.f447720b;
            if (j1Var != null) {
                java.lang.String str = j1Var.f447733f;
                java.lang.String replace = str != null ? str.replace(",", ";") : "";
                sb6.append(j1Var.f447729b);
                sb6.append(";");
                sb6.append(j1Var.f447731d);
                sb6.append(";");
                sb6.append(j1Var.f447732e);
                sb6.append(";");
                sb6.append(bm5.f1.a());
                sb6.append(";");
                sb6.append(replace);
                sb6.append(";stack:");
                sb6.append(j1Var.f447730c);
            }
            wo.k1.a(16);
            wo.k1.c(16, sb6.toString());
            atomicInteger.set(0);
            atomicInteger2.set(0);
            atomicInteger3.set(0);
            atomicInteger4.set(0);
            atomicInteger5.set(0);
        }
    }

    public final void v(android.os.Bundle bundle) {
        try {
            wo.k1.a(150);
            this.f447719a.setParameters(bundle);
            wo.k1.a(151);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy setParameters, thread:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()));
            u(57, e17, this.f447720b);
            throw e17;
        }
    }

    public final void w() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecProxy", "signalEndOfInputStream function, thread:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()));
            wo.k1.a(117);
            this.f447719a.signalEndOfInputStream();
            wo.k1.a(118);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy signalEndOfInputStream, thread:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()));
            u(46, e17, this.f447720b);
            throw e17;
        }
    }

    public final void x() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecProxy", "start function, thread:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()));
            if (!this.f447721c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "MediaCodecProxy start not alive");
            }
            wo.k1.a(90);
            this.f447719a.start();
            wo.k1.a(91);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy start", new java.lang.Object[0]);
            u(37, e17, this.f447720b);
            throw e17;
        }
    }

    public final void y() {
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.MediaCodecProxy", "stop function, thread:[%s]", java.lang.Integer.valueOf(android.os.Process.myTid()));
            if (!this.f447721c) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MediaCodecProxy", "MediaCodecProxy stop not alive");
            }
            wo.k1.a(93);
            this.f447719a.stop();
            wo.k1.a(94);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MediaCodecProxy", e17, "MediaCodecProxy stop", new java.lang.Object[0]);
            u(38, e17, this.f447720b);
            throw e17;
        }
    }
}
