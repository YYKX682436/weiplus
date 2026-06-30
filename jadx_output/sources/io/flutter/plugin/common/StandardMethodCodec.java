package io.flutter.plugin.common;

/* loaded from: classes13.dex */
public final class StandardMethodCodec implements io.flutter.plugin.common.MethodCodec {
    public static final io.flutter.plugin.common.StandardMethodCodec INSTANCE = new io.flutter.plugin.common.StandardMethodCodec(io.flutter.plugin.common.StandardMessageCodec.INSTANCE);
    private final io.flutter.plugin.common.StandardMessageCodec messageCodec;

    public StandardMethodCodec(io.flutter.plugin.common.StandardMessageCodec standardMessageCodec) {
        this.messageCodec = standardMessageCodec;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (r0 == 1) goto L10;
     */
    @Override // io.flutter.plugin.common.MethodCodec
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object decodeEnvelope(java.nio.ByteBuffer r5) {
        /*
            r4 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            r5.order(r0)
            byte r0 = r5.get()
            if (r0 == 0) goto L11
            r1 = 1
            if (r0 != r1) goto L4a
            goto L1e
        L11:
            io.flutter.plugin.common.StandardMessageCodec r0 = r4.messageCodec
            java.lang.Object r0 = r0.readValue(r5)
            boolean r1 = r5.hasRemaining()
            if (r1 != 0) goto L1e
            return r0
        L1e:
            io.flutter.plugin.common.StandardMessageCodec r0 = r4.messageCodec
            java.lang.Object r0 = r0.readValue(r5)
            io.flutter.plugin.common.StandardMessageCodec r1 = r4.messageCodec
            java.lang.Object r1 = r1.readValue(r5)
            io.flutter.plugin.common.StandardMessageCodec r2 = r4.messageCodec
            java.lang.Object r2 = r2.readValue(r5)
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L4a
            if (r1 == 0) goto L3a
            boolean r3 = r1 instanceof java.lang.String
            if (r3 == 0) goto L4a
        L3a:
            boolean r5 = r5.hasRemaining()
            if (r5 != 0) goto L4a
            io.flutter.plugin.common.FlutterException r5 = new io.flutter.plugin.common.FlutterException
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = (java.lang.String) r1
            r5.<init>(r0, r1, r2)
            throw r5
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Envelope corrupted"
            r5.<init>(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.common.StandardMethodCodec.decodeEnvelope(java.nio.ByteBuffer):java.lang.Object");
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public io.flutter.plugin.common.MethodCall decodeMethodCall(java.nio.ByteBuffer byteBuffer) {
        byteBuffer.order(java.nio.ByteOrder.nativeOrder());
        java.lang.Object readValue = this.messageCodec.readValue(byteBuffer);
        java.lang.Object readValue2 = this.messageCodec.readValue(byteBuffer);
        if (!(readValue instanceof java.lang.String) || byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("Method call corrupted");
        }
        return new io.flutter.plugin.common.MethodCall((java.lang.String) readValue, readValue2);
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public java.nio.ByteBuffer encodeErrorEnvelope(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        io.flutter.plugin.common.StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new io.flutter.plugin.common.StandardMessageCodec.ExposedByteArrayOutputStream();
        exposedByteArrayOutputStream.write(1);
        this.messageCodec.writeValue(exposedByteArrayOutputStream, str);
        this.messageCodec.writeValue(exposedByteArrayOutputStream, str2);
        if (obj instanceof java.lang.Throwable) {
            this.messageCodec.writeValue(exposedByteArrayOutputStream, io.flutter.Log.getStackTraceString((java.lang.Throwable) obj));
        } else {
            this.messageCodec.writeValue(exposedByteArrayOutputStream, obj);
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        allocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return allocateDirect;
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public java.nio.ByteBuffer encodeErrorEnvelopeWithStacktrace(java.lang.String str, java.lang.String str2, java.lang.Object obj, java.lang.String str3) {
        io.flutter.plugin.common.StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new io.flutter.plugin.common.StandardMessageCodec.ExposedByteArrayOutputStream();
        exposedByteArrayOutputStream.write(1);
        this.messageCodec.writeValue(exposedByteArrayOutputStream, str);
        this.messageCodec.writeValue(exposedByteArrayOutputStream, str2);
        if (obj instanceof java.lang.Throwable) {
            this.messageCodec.writeValue(exposedByteArrayOutputStream, io.flutter.Log.getStackTraceString((java.lang.Throwable) obj));
        } else {
            this.messageCodec.writeValue(exposedByteArrayOutputStream, obj);
        }
        this.messageCodec.writeValue(exposedByteArrayOutputStream, str3);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        allocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return allocateDirect;
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public java.nio.ByteBuffer encodeMethodCall(io.flutter.plugin.common.MethodCall methodCall) {
        io.flutter.plugin.common.StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new io.flutter.plugin.common.StandardMessageCodec.ExposedByteArrayOutputStream();
        this.messageCodec.writeValue(exposedByteArrayOutputStream, methodCall.method);
        this.messageCodec.writeValue(exposedByteArrayOutputStream, methodCall.arguments);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        allocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return allocateDirect;
    }

    @Override // io.flutter.plugin.common.MethodCodec
    public java.nio.ByteBuffer encodeSuccessEnvelope(java.lang.Object obj) {
        io.flutter.plugin.common.StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new io.flutter.plugin.common.StandardMessageCodec.ExposedByteArrayOutputStream();
        exposedByteArrayOutputStream.write(0);
        this.messageCodec.writeValue(exposedByteArrayOutputStream, obj);
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(exposedByteArrayOutputStream.size());
        allocateDirect.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return allocateDirect;
    }
}
