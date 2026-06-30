package uo5;

/* loaded from: classes14.dex */
public final class l extends android.media.MediaCodec.Callback implements uo5.q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f429724a;

    /* renamed from: b, reason: collision with root package name */
    public final uo5.b f429725b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f429726c;

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f429727d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.Surface f429728e;

    /* renamed from: f, reason: collision with root package name */
    public uo5.r f429729f;

    /* renamed from: g, reason: collision with root package name */
    public int f429730g;

    /* renamed from: h, reason: collision with root package name */
    public final wo5.a f429731h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f429732i;

    /* renamed from: j, reason: collision with root package name */
    public android.util.Size f429733j;

    /* renamed from: k, reason: collision with root package name */
    public android.util.Size f429734k;

    /* renamed from: l, reason: collision with root package name */
    public int f429735l;

    /* renamed from: m, reason: collision with root package name */
    public int f429736m;

    public l(boolean z17, uo5.b codecContext) {
        kotlin.jvm.internal.o.g(codecContext, "codecContext");
        this.f429724a = z17;
        this.f429725b = codecContext;
        this.f429726c = "MicroMsg.HW.HWCodecImpl-enc" + z17 + '-' + hashCode();
        this.f429727d = kotlinx.coroutines.flow.i3.a(uo5.f.f429718a);
        this.f429730g = 8;
        this.f429731h = new wo5.a();
        this.f429732i = true;
        this.f429733j = new android.util.Size(0, 0);
        this.f429734k = new android.util.Size(0, 0);
    }

    public final void a() {
        java.lang.Object m521constructorimpl;
        java.lang.String str = this.f429726c;
        com.tencent.mars.xlog.Log.i(str, "releaseCodec");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            uo5.r rVar = this.f429729f;
            if (rVar != null) {
                if (this.f429724a) {
                    this.f429728e = null;
                }
                ((uo5.s) rVar).f429739a.stop();
                ((uo5.s) rVar).f429739a.release();
            }
            this.f429729f = null;
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, m524exceptionOrNullimpl, "codec call error", new java.lang.Object[0]);
            java.lang.String message = m524exceptionOrNullimpl.getMessage();
            c(message != null ? message : "codec call error");
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
    }

    public void b(int i17) {
        if (!this.f429724a) {
            throw new java.lang.IllegalStateException("encode use only");
        }
        com.tencent.mars.xlog.Log.i(this.f429726c, "setDynFpsNum() called with: fps = " + i17);
        this.f429735l = i17;
    }

    public final void c(java.lang.String str) {
        com.tencent.mars.xlog.Log.e(this.f429726c, "setErrorState: " + str);
        e(new uo5.e(str));
    }

    public void d(android.os.Bundle bundle) {
        java.lang.Object m521constructorimpl;
        jz5.f0 f0Var;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            uo5.r rVar = this.f429729f;
            if (rVar != null) {
                ((uo5.s) rVar).f429739a.setParameters(bundle);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f429726c, m524exceptionOrNullimpl, "codec call error", new java.lang.Object[0]);
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
    }

    public final void e(uo5.j jVar) {
        kotlinx.coroutines.flow.j2 j2Var = this.f429727d;
        uo5.j jVar2 = (uo5.j) ((kotlinx.coroutines.flow.h3) j2Var).getValue();
        ((kotlinx.coroutines.flow.h3) j2Var).k(jVar);
        com.tencent.mars.xlog.Log.i(this.f429726c, "setState: set state from " + jVar2 + " to " + jVar + " success true");
    }

    public void f() {
        java.lang.Object m521constructorimpl;
        java.lang.Object m521constructorimpl2;
        java.lang.Object m521constructorimpl3;
        java.lang.String str = this.f429726c;
        com.tencent.mars.xlog.Log.i(str, "startWorking: ");
        uo5.b bVar = this.f429725b;
        uo5.a a17 = bVar.f429715b.a(this.f429732i);
        if (a17 == null) {
            c("startWorking: get initial config error");
            return;
        }
        android.media.MediaFormat mediaFormat = a17.f429713c;
        this.f429730g = this.f429732i ? 8 : 1;
        a();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            uo5.r a18 = ((uo5.c) bVar.f429714a).a(a17);
            jz5.f0 f0Var = jz5.f0.f302826a;
            if (a18 == null) {
                c("startWorking: create codec error");
            } else {
                com.tencent.mars.xlog.Log.i(str, "startWorking: create codec successful");
                ((uo5.s) a18).f429739a.setCallback(this, bVar.f429715b.b());
                java.lang.Object obj = null;
                ((uo5.s) a18).f429739a.configure(mediaFormat, this.f429728e, (android.media.MediaCrypto) null, bVar.f429715b.c());
                com.tencent.mars.xlog.Log.i(str, "startWorking: codec configured surface " + this.f429728e);
                if (this.f429724a) {
                    try {
                        android.view.Surface createInputSurface = ((uo5.s) a18).f429739a.createInputSurface();
                        kotlin.jvm.internal.o.f(createInputSurface, "createInputSurface(...)");
                        m521constructorimpl2 = kotlin.Result.m521constructorimpl(createInputSurface);
                    } catch (java.lang.Throwable th6) {
                        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                        m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
                    }
                    java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl2);
                    if (m524exceptionOrNullimpl != null) {
                        com.tencent.mars.xlog.Log.printErrStackTrace(str, m524exceptionOrNullimpl, "codec call error", new java.lang.Object[0]);
                        java.lang.String message = m524exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "codec call error";
                        }
                        c(message);
                    }
                    if (!kotlin.Result.m527isFailureimpl(m521constructorimpl2)) {
                        obj = m521constructorimpl2;
                    }
                    this.f429728e = (android.view.Surface) obj;
                    if (mediaFormat.containsKey("width") && mediaFormat.containsKey("height")) {
                        int integer = mediaFormat.getInteger("width");
                        int integer2 = mediaFormat.getInteger("height");
                        if (mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-right")) {
                            integer = (mediaFormat.getInteger("crop-right") + 1) - mediaFormat.getInteger("crop-left");
                        }
                        if (mediaFormat.containsKey("crop-top") && mediaFormat.containsKey("crop-bottom")) {
                            integer2 = (mediaFormat.getInteger("crop-bottom") + 1) - mediaFormat.getInteger("crop-top");
                        }
                        this.f429734k = new android.util.Size(integer, integer2);
                        this.f429733j = new android.util.Size(integer, integer2);
                        com.tencent.mars.xlog.Log.i(str, "startWorking: set encoder width " + integer + " height " + integer2);
                    }
                    com.tencent.mars.xlog.Log.i(str, "startWorking: encode surface created");
                }
                e(new uo5.d(a17));
                this.f429729f = a18;
                try {
                    ((uo5.s) a18).f429739a.start();
                    m521constructorimpl3 = kotlin.Result.m521constructorimpl(f0Var);
                } catch (java.lang.Throwable th7) {
                    kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                    m521constructorimpl3 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
                }
                java.lang.Throwable m524exceptionOrNullimpl2 = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl3);
                if (m524exceptionOrNullimpl2 != null) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(str, m524exceptionOrNullimpl2, "codec call error", new java.lang.Object[0]);
                    java.lang.String message2 = m524exceptionOrNullimpl2.getMessage();
                    if (message2 == null) {
                        message2 = "codec call error";
                    }
                    c(message2);
                }
                kotlin.Result.m527isFailureimpl(m521constructorimpl3);
                uo5.j jVar = (uo5.j) ((kotlinx.coroutines.flow.h3) this.f429727d).getValue();
                com.tencent.mars.xlog.Log.i(str, "startWorking: codec start working, curState " + jVar);
                if (jVar instanceof uo5.d) {
                    e(uo5.i.f429721a);
                } else {
                    c(jVar + " not allow to start");
                }
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th8) {
            kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th8));
        }
        java.lang.Throwable m524exceptionOrNullimpl3 = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl3 != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, m524exceptionOrNullimpl3, "codec call error", new java.lang.Object[0]);
            java.lang.String message3 = m524exceptionOrNullimpl3.getMessage();
            c(message3 != null ? message3 : "codec call error");
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e17) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.String message = e17.getMessage();
        if (message == null) {
            message = "on codec error";
        }
        c(message);
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(android.media.MediaCodec codec, int i17) {
        java.lang.Object m521constructorimpl;
        java.lang.String str = this.f429726c;
        kotlin.jvm.internal.o.g(codec, "codec");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (i17 >= 0) {
                java.nio.ByteBuffer inputBuffer = codec.getInputBuffer(i17);
                if (inputBuffer == null) {
                    return;
                } else {
                    this.f429725b.f429716c.b(inputBuffer, new uo5.k(codec, i17));
                }
            } else {
                com.tencent.mars.xlog.Log.i(str, "input buffer error");
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, m524exceptionOrNullimpl, "codec call error", new java.lang.Object[0]);
            java.lang.String message = m524exceptionOrNullimpl.getMessage();
            c(message != null ? message : "codec call error");
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(android.media.MediaCodec codec, int i17, android.media.MediaCodec.BufferInfo info) {
        java.lang.Object m521constructorimpl;
        java.lang.String str = this.f429726c;
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(info, "info");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            if (i17 >= 0) {
                uo5.b bVar = this.f429725b;
                boolean z17 = this.f429724a;
                if (z17) {
                    java.nio.ByteBuffer outputBuffer = codec.getOutputBuffer(i17);
                    if (outputBuffer == null) {
                        return;
                    }
                    bVar.f429716c.a(outputBuffer, info);
                    codec.releaseOutputBuffer(i17, info.presentationTimeUs);
                    int i18 = this.f429735l;
                    if (i18 > 0) {
                        this.f429736m++;
                        if (info.flags == 1) {
                            this.f429736m = 0;
                        }
                        int i19 = this.f429736m - i18;
                        if (i19 > 0 && i19 % (i18 / 10) == 0) {
                            com.tencent.mars.xlog.Log.i(str, "onOutputBufferAvailable: reqI, cur " + this.f429736m + ", dynFps " + this.f429735l);
                            com.tencent.mars.xlog.Log.i(str, "requestIFrame");
                            android.os.Bundle bundle = new android.os.Bundle();
                            bundle.putInt("request-sync", 0);
                            d(bundle);
                        }
                    }
                } else {
                    java.nio.ByteBuffer outputBuffer2 = codec.getOutputBuffer(i17);
                    if (outputBuffer2 == null) {
                        return;
                    }
                    if (z17 && this.f429730g != 1) {
                        byte[] bArr = new byte[info.size];
                        outputBuffer2.get(bArr);
                        if (this.f429731h.a(bArr)) {
                            this.f429732i = false;
                            e(uo5.h.f429720a);
                        }
                    }
                    bVar.f429716c.a(outputBuffer2, info);
                    codec.releaseOutputBuffer(i17, true);
                }
            } else {
                com.tencent.mars.xlog.Log.w(str, "onOutputBufferAvailable " + i17);
                codec.releaseOutputBuffer(i17, false);
            }
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace(str, m524exceptionOrNullimpl, "codec call error", new java.lang.Object[0]);
        }
        kotlin.Result.m527isFailureimpl(m521constructorimpl);
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format) {
        int integer;
        int integer2;
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(format, "format");
        java.lang.String str = this.f429726c;
        com.tencent.mars.xlog.Log.i(str, "onOutputFormatChanged " + format);
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            int integer3 = format.getInteger("width");
            int integer4 = format.getInteger("height");
            this.f429734k = new android.util.Size(integer3, integer4);
            this.f429725b.f429716c.c(integer3, integer4);
            if (format.containsKey("crop-left") && format.containsKey("crop-right") && (integer2 = (format.getInteger("crop-right") + 1) - format.getInteger("crop-left")) > 0 && integer2 <= integer3) {
                integer3 = integer2;
            }
            if (format.containsKey("crop-top") && format.containsKey("crop-bottom") && (integer = (format.getInteger("crop-bottom") + 1) - format.getInteger("crop-top")) > 0 && integer <= integer4) {
                integer4 = integer;
            }
            this.f429733j = new android.util.Size(integer3, integer4);
            com.tencent.mars.xlog.Log.i(str, "onOutputFormatChanged: buffer size " + this.f429734k + ", real size " + this.f429733j);
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
    }
}
