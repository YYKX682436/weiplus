package v22;

/* loaded from: classes10.dex */
public final class p extends android.media.MediaCodec.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v22.q f432848a;

    public p(v22.q qVar) {
        this.f432848a = qVar;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(android.media.MediaCodec codec, android.media.MediaCodec.CodecException e17) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(e17, "e");
        v22.q qVar = this.f432848a;
        com.tencent.mars.xlog.Log.e(qVar.f432850d, "onError, codec:" + codec + ", " + e17.isRecoverable() + ' ' + e17.isTransient() + ' ' + e17.getDiagnosticInfo());
        if (e17.isRecoverable() || e17.isTransient()) {
            return;
        }
        java.lang.String str = qVar.f432850d;
        com.tencent.mars.xlog.Log.i(str, "sendDecoderEos");
        com.tencent.mars.xlog.Log.i(str, "release");
        try {
            qVar.f432857k.quit();
            wo.i1 i1Var = qVar.f432851e;
            if (i1Var != null) {
                i1Var.y();
            }
            wo.i1 i1Var2 = qVar.f432851e;
            if (i1Var2 != null) {
                i1Var2.q();
            }
        } catch (java.lang.Exception unused) {
        }
        yz5.a aVar = qVar.f432801b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // android.media.MediaCodec.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onInputBufferAvailable(android.media.MediaCodec r12, int r13) {
        /*
            r11 = this;
            java.lang.String r0 = "sampleTime: "
            java.lang.String r1 = "codec"
            kotlin.jvm.internal.o.g(r12, r1)
            v22.q r12 = r11.f432848a
            java.lang.String r1 = r12.f432850d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onInputBufferAvailable "
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r2)
            if (r13 < 0) goto La3
            r1 = 0
            boolean r2 = r12.f432855i     // Catch: java.lang.Exception -> L39
            if (r2 != 0) goto La3
            wo.i1 r2 = r12.f432851e     // Catch: java.lang.Exception -> L39
            if (r2 == 0) goto L2e
            java.nio.ByteBuffer r2 = r2.j(r13)     // Catch: java.lang.Exception -> L39
            goto L2f
        L2e:
            r2 = 0
        L2f:
            if (r2 != 0) goto L3b
            java.lang.String r13 = r12.f432850d     // Catch: java.lang.Exception -> L39
            java.lang.String r0 = "inputBuffer is null"
            com.tencent.mars.xlog.Log.w(r13, r0)     // Catch: java.lang.Exception -> L39
            return
        L39:
            r13 = move-exception
            goto L99
        L3b:
            r2.clear()     // Catch: java.lang.Exception -> L39
            gp.c r3 = r12.f432853g     // Catch: java.lang.Exception -> L39
            int r7 = r3.f(r2, r1)     // Catch: java.lang.Exception -> L39
            gp.c r3 = r12.f432853g     // Catch: java.lang.Exception -> L39
            r3.a()     // Catch: java.lang.Exception -> L39
            r2.position(r1)     // Catch: java.lang.Exception -> L39
            gp.c r2 = r12.f432853g     // Catch: java.lang.Exception -> L39
            long r8 = r2.b()     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = r12.f432850d     // Catch: java.lang.Exception -> L39
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L39
            r3.<init>(r0)     // Catch: java.lang.Exception -> L39
            r3.append(r8)     // Catch: java.lang.Exception -> L39
            java.lang.String r0 = ", sampleSize: "
            r3.append(r0)     // Catch: java.lang.Exception -> L39
            r3.append(r7)     // Catch: java.lang.Exception -> L39
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L39
            com.tencent.mars.xlog.Log.i(r2, r0)     // Catch: java.lang.Exception -> L39
            long r2 = r12.f432856j     // Catch: java.lang.Exception -> L39
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L73
            r12.f432856j = r8     // Catch: java.lang.Exception -> L39
        L73:
            if (r7 < 0) goto L7e
            r2 = 0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 >= 0) goto L7c
            goto L7e
        L7c:
            r0 = r1
            goto L87
        L7e:
            java.lang.String r0 = r12.f432850d     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = "read sample end"
            com.tencent.mars.xlog.Log.i(r0, r2)     // Catch: java.lang.Exception -> L39
            r0 = 1
        L87:
            r12.f432855i = r0     // Catch: java.lang.Exception -> L39
            wo.i1 r4 = r12.f432851e     // Catch: java.lang.Exception -> L39
            if (r4 == 0) goto La3
            r6 = 0
            if (r0 == 0) goto L93
            r0 = 4
            r10 = r0
            goto L94
        L93:
            r10 = r1
        L94:
            r5 = r13
            r4.p(r5, r6, r7, r8, r10)     // Catch: java.lang.Exception -> L39
            goto La3
        L99:
            java.lang.String r12 = r12.f432850d
            java.lang.String r0 = "onInputBufferAvailable"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            com.tencent.mars.xlog.Log.printErrStackTrace(r12, r13, r0, r1)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v22.p.onInputBufferAvailable(android.media.MediaCodec, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r5 != false) goto L18;
     */
    @Override // android.media.MediaCodec.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onOutputBufferAvailable(android.media.MediaCodec r9, int r10, android.media.MediaCodec.BufferInfo r11) {
        /*
            r8 = this;
            java.lang.String r0 = "presentationTimeUs: "
            java.lang.String r1 = "codec"
            kotlin.jvm.internal.o.g(r9, r1)
            java.lang.String r9 = "info"
            kotlin.jvm.internal.o.g(r11, r9)
            v22.q r9 = r8.f432848a
            java.lang.String r1 = r9.f432850d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "onOutputBufferAvailable "
            r2.<init>(r3)
            r2.append(r10)
            java.lang.String r3 = ", flags "
            r2.append(r3)
            int r3 = r11.flags
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.tencent.mars.xlog.Log.i(r1, r2)
            java.lang.String r1 = r9.f432850d
            r2 = 0
            if (r10 < 0) goto La5
            int r3 = r11.size     // Catch: java.lang.Exception -> La3
            if (r3 == 0) goto La5
            long r3 = r11.presentationTimeUs     // Catch: java.lang.Exception -> La3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> La3
            r5.<init>(r0)     // Catch: java.lang.Exception -> La3
            r5.append(r3)     // Catch: java.lang.Exception -> La3
            java.lang.String r0 = ", inputSampleTime: "
            r5.append(r0)     // Catch: java.lang.Exception -> La3
            long r6 = r9.f432856j     // Catch: java.lang.Exception -> La3
            r5.append(r6)     // Catch: java.lang.Exception -> La3
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> La3
            com.tencent.mars.xlog.Log.i(r1, r0)     // Catch: java.lang.Exception -> La3
            wo.i1 r0 = r9.f432851e     // Catch: java.lang.Exception -> La3
            r5 = 1
            if (r0 == 0) goto L59
            r0.s(r10, r5)     // Catch: java.lang.Exception -> La3
        L59:
            v22.q.d(r9, r11)     // Catch: java.lang.Exception -> La3
            boolean r10 = r9.f432855i     // Catch: java.lang.Exception -> La3
            if (r10 == 0) goto L70
            r6 = 0
            int r10 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r10 > 0) goto L6d
            long r6 = r9.f432856j     // Catch: java.lang.Exception -> La3
            int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r10 >= 0) goto L6d
            goto L6e
        L6d:
            r5 = r2
        L6e:
            if (r5 == 0) goto L76
        L70:
            int r10 = r11.flags     // Catch: java.lang.Exception -> La3
            r10 = r10 & 4
            if (r10 == 0) goto Lb5
        L76:
            java.lang.String r10 = "receive eos!"
            com.tencent.mars.xlog.Log.i(r1, r10)     // Catch: java.lang.Exception -> La3
            java.lang.String r10 = "sendDecoderEos"
            com.tencent.mars.xlog.Log.i(r1, r10)     // Catch: java.lang.Exception -> La3
            java.lang.String r10 = "release"
            com.tencent.mars.xlog.Log.i(r1, r10)     // Catch: java.lang.Exception -> La3
            android.os.HandlerThread r10 = r9.f432857k     // Catch: java.lang.Exception -> L9b
            r10.quit()     // Catch: java.lang.Exception -> L9b
            wo.i1 r10 = r9.f432851e     // Catch: java.lang.Exception -> L9b
            if (r10 == 0) goto L94
            r10.y()     // Catch: java.lang.Exception -> L9b
        L94:
            wo.i1 r10 = r9.f432851e     // Catch: java.lang.Exception -> L9b
            if (r10 == 0) goto L9b
            r10.q()     // Catch: java.lang.Exception -> L9b
        L9b:
            yz5.a r9 = r9.f432801b     // Catch: java.lang.Exception -> La3
            if (r9 == 0) goto La2
            r9.invoke()     // Catch: java.lang.Exception -> La3
        La2:
            return
        La3:
            r9 = move-exception
            goto Lad
        La5:
            wo.i1 r9 = r9.f432851e     // Catch: java.lang.Exception -> La3
            if (r9 == 0) goto Lb5
            r9.s(r10, r2)     // Catch: java.lang.Exception -> La3
            goto Lb5
        Lad:
            java.lang.String r10 = "onOutputBufferAvailable"
            java.lang.Object[] r11 = new java.lang.Object[r2]
            com.tencent.mars.xlog.Log.printErrStackTrace(r1, r9, r10, r11)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v22.p.onOutputBufferAvailable(android.media.MediaCodec, int, android.media.MediaCodec$BufferInfo):void");
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(android.media.MediaCodec codec, android.media.MediaFormat format) {
        kotlin.jvm.internal.o.g(codec, "codec");
        kotlin.jvm.internal.o.g(format, "format");
        v22.q qVar = this.f432848a;
        com.tencent.mars.xlog.Log.i(qVar.f432850d, "onOutputFormatChanged " + format);
        qVar.f432852f = format;
    }
}
