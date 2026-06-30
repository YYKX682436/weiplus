package org.tensorflow.lite;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class NativeInterpreterWrapper implements java.lang.AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public long f347855d;

    /* renamed from: e, reason: collision with root package name */
    public long f347856e;

    /* renamed from: f, reason: collision with root package name */
    public long f347857f;

    /* renamed from: g, reason: collision with root package name */
    public java.nio.ByteBuffer f347858g;

    /* renamed from: h, reason: collision with root package name */
    public org.tensorflow.lite.Tensor[] f347859h;

    /* renamed from: i, reason: collision with root package name */
    public org.tensorflow.lite.Tensor[] f347860i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f347861m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f347862n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f347863o = new java.util.ArrayList();

    public NativeInterpreterWrapper(java.nio.ByteBuffer byteBuffer, org.tensorflow.lite.c cVar) {
        org.tensorflow.lite.b bVar;
        java.util.Iterator it;
        boolean z17 = false;
        this.f347861m = false;
        org.tensorflow.lite.TensorFlowLite.a();
        if (byteBuffer == null || !((byteBuffer instanceof java.nio.MappedByteBuffer) || (byteBuffer.isDirect() && byteBuffer.order() == java.nio.ByteOrder.nativeOrder()))) {
            throw new java.lang.IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.f347858g = byteBuffer;
        long createErrorReporter = createErrorReporter(512);
        long createModelWithBuffer = createModelWithBuffer(this.f347858g, createErrorReporter);
        cVar = cVar == null ? new org.tensorflow.lite.c() : cVar;
        this.f347855d = createErrorReporter;
        this.f347857f = createModelWithBuffer;
        long createInterpreter = createInterpreter(createModelWithBuffer, createErrorReporter, -1);
        this.f347856e = createInterpreter;
        this.f347859h = new org.tensorflow.lite.Tensor[getInputCount(createInterpreter)];
        this.f347860i = new org.tensorflow.lite.Tensor[getOutputCount(this.f347856e)];
        boolean hasUnresolvedFlexOp = hasUnresolvedFlexOp(this.f347856e);
        java.util.List list = cVar.f347877a;
        if (hasUnresolvedFlexOp) {
            try {
                it = ((java.util.ArrayList) list).iterator();
            } catch (java.lang.Exception unused) {
            }
            while (it.hasNext()) {
                if (org.tensorflow.lite.flex.FlexDelegate.class.isInstance((org.tensorflow.lite.b) it.next())) {
                    bVar = null;
                    break;
                }
            }
            bVar = (org.tensorflow.lite.b) org.tensorflow.lite.flex.FlexDelegate.class.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (bVar != null) {
                ((java.util.ArrayList) this.f347863o).add((java.lang.AutoCloseable) bVar);
                applyDelegate(this.f347856e, this.f347855d, bVar.a());
            }
        }
        try {
            java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
            while (it6.hasNext()) {
                org.tensorflow.lite.b bVar2 = (org.tensorflow.lite.b) it6.next();
                applyDelegate(this.f347856e, this.f347855d, bVar2.a());
                ((java.util.ArrayList) this.f347862n).add(bVar2);
            }
        } catch (java.lang.IllegalArgumentException e17) {
            if (hasUnresolvedFlexOp && !hasUnresolvedFlexOp(this.f347856e)) {
                z17 = true;
            }
            if (!z17) {
                throw e17;
            }
            java.lang.System.err.println("Ignoring failed delegate application: " + e17);
        }
        allocateTensors(this.f347856e, createErrorReporter);
        this.f347861m = true;
    }

    private static native long allocateTensors(long j17, long j18);

    private static native void allowBufferHandleOutput(long j17, boolean z17);

    private static native void allowFp16PrecisionForFp32(long j17, boolean z17);

    private static native void applyDelegate(long j17, long j18, long j19);

    private static native long createCancellationFlag(long j17);

    private static native long createErrorReporter(int i17);

    private static native long createInterpreter(long j17, long j18, int i17);

    private static native long createModel(java.lang.String str, long j17);

    private static native long createModelWithBuffer(java.nio.ByteBuffer byteBuffer, long j17);

    private static native void delete(long j17, long j18, long j19);

    private static native long deleteCancellationFlag(long j17);

    private static native int getExecutionPlanLength(long j17);

    private static native int getInputCount(long j17);

    private static native java.lang.String[] getInputNames(long j17);

    private static native int getInputTensorIndex(long j17, int i17);

    private static native int getOutputCount(long j17);

    private static native int getOutputDataType(long j17, int i17);

    private static native java.lang.String[] getOutputNames(long j17);

    private static native int getOutputTensorIndex(long j17, int i17);

    private static native boolean hasUnresolvedFlexOp(long j17);

    private static native void numThreads(long j17, int i17);

    private static native void resetVariableTensors(long j17, long j18);

    private static native boolean resizeInput(long j17, long j18, int i17, int[] iArr, boolean z17);

    private static native void run(long j17, long j18);

    private static native void setCancelled(long j17, long j18, boolean z17);

    private static native void useXNNPACK(long j17, long j18, boolean z17, int i17);

    public org.tensorflow.lite.Tensor a(int i17) {
        if (i17 >= 0) {
            org.tensorflow.lite.Tensor[] tensorArr = this.f347859h;
            if (i17 < tensorArr.length) {
                org.tensorflow.lite.Tensor tensor = tensorArr[i17];
                if (tensor != null) {
                    return tensor;
                }
                long j17 = this.f347856e;
                org.tensorflow.lite.Tensor g17 = org.tensorflow.lite.Tensor.g(j17, getInputTensorIndex(j17, i17));
                tensorArr[i17] = g17;
                return g17;
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid input Tensor index: " + i17);
    }

    public org.tensorflow.lite.Tensor b(int i17) {
        if (i17 >= 0) {
            org.tensorflow.lite.Tensor[] tensorArr = this.f347860i;
            if (i17 < tensorArr.length) {
                org.tensorflow.lite.Tensor tensor = tensorArr[i17];
                if (tensor != null) {
                    return tensor;
                }
                long j17 = this.f347856e;
                org.tensorflow.lite.Tensor g17 = org.tensorflow.lite.Tensor.g(j17, getOutputTensorIndex(j17, i17));
                tensorArr[i17] = g17;
                return g17;
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid output Tensor index: " + i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.Object[] r10, java.util.Map r11) {
        /*
            r9 = this;
            if (r10 == 0) goto Lbf
            int r0 = r10.length
            if (r0 == 0) goto Lbf
            if (r11 == 0) goto Lb7
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto Lb7
            r0 = 0
            r8 = r0
        Lf:
            int r1 = r10.length
            if (r8 >= r1) goto L4f
            org.tensorflow.lite.Tensor r1 = r9.a(r8)
            r2 = r10[r8]
            r3 = 0
            if (r2 != 0) goto L1d
        L1b:
            r6 = r3
            goto L33
        L1d:
            boolean r4 = r2 instanceof java.nio.Buffer
            if (r4 == 0) goto L22
            goto L1b
        L22:
            r1.l(r2)
            int[] r2 = r1.d(r2)
            int[] r1 = r1.f347866c
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L32
            goto L1b
        L32:
            r6 = r2
        L33:
            if (r6 == 0) goto L4c
            r7 = 0
            long r1 = r9.f347856e
            long r3 = r9.f347855d
            r5 = r8
            boolean r1 = resizeInput(r1, r3, r5, r6, r7)
            if (r1 == 0) goto L4c
            r9.f347861m = r0
            org.tensorflow.lite.Tensor[] r1 = r9.f347859h
            r1 = r1[r8]
            if (r1 == 0) goto L4c
            r1.j()
        L4c:
            int r8 = r8 + 1
            goto Lf
        L4f:
            boolean r1 = r9.f347861m
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L5e
            long r3 = r9.f347856e
            long r5 = r9.f347855d
            allocateTensors(r3, r5)
            r9.f347861m = r2
        L5e:
            r2 = r0
        L5f:
            int r3 = r10.length
            if (r2 >= r3) goto L6e
            org.tensorflow.lite.Tensor r3 = r9.a(r2)
            r4 = r10[r2]
            r3.k(r4)
            int r2 = r2 + 1
            goto L5f
        L6e:
            java.lang.System.nanoTime()
            long r2 = r9.f347856e
            long r4 = r9.f347855d
            run(r2, r4)
            java.lang.System.nanoTime()
            if (r1 == 0) goto L8c
        L7d:
            org.tensorflow.lite.Tensor[] r10 = r9.f347860i
            int r1 = r10.length
            if (r0 >= r1) goto L8c
            r10 = r10[r0]
            if (r10 == 0) goto L89
            r10.j()
        L89:
            int r0 = r0 + 1
            goto L7d
        L8c:
            java.util.Set r10 = r11.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L94:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb6
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r0 = r11.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            org.tensorflow.lite.Tensor r0 = r9.b(r0)
            java.lang.Object r11 = r11.getValue()
            r0.e(r11)
            goto L94
        Lb6:
            return
        Lb7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Input error: Outputs should not be null or empty."
            r10.<init>(r11)
            throw r10
        Lbf:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Input error: Inputs should not be null or empty."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.tensorflow.lite.NativeInterpreterWrapper.c(java.lang.Object[], java.util.Map):void");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        int i17 = 0;
        while (true) {
            org.tensorflow.lite.Tensor[] tensorArr = this.f347859h;
            if (i17 >= tensorArr.length) {
                break;
            }
            org.tensorflow.lite.Tensor tensor = tensorArr[i17];
            if (tensor != null) {
                tensor.b();
                this.f347859h[i17] = null;
            }
            i17++;
        }
        int i18 = 0;
        while (true) {
            org.tensorflow.lite.Tensor[] tensorArr2 = this.f347860i;
            if (i18 >= tensorArr2.length) {
                break;
            }
            org.tensorflow.lite.Tensor tensor2 = tensorArr2[i18];
            if (tensor2 != null) {
                tensor2.b();
                this.f347860i[i18] = null;
            }
            i18++;
        }
        delete(this.f347855d, this.f347857f, this.f347856e);
        deleteCancellationFlag(0L);
        this.f347855d = 0L;
        this.f347857f = 0L;
        this.f347856e = 0L;
        this.f347858g = null;
        this.f347861m = false;
        ((java.util.ArrayList) this.f347862n).clear();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f347863o;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((java.lang.AutoCloseable) it.next()).close();
            } catch (java.lang.Exception e17) {
                java.lang.System.err.println("Failed to close flex delegate: " + e17);
            }
        }
        arrayList.clear();
    }
}
