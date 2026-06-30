package org.tensorflow.lite;

/* loaded from: classes13.dex */
public final class d implements java.lang.AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public org.tensorflow.lite.NativeInterpreterWrapper f347878d;

    public d(java.nio.ByteBuffer byteBuffer) {
        this.f347878d = new org.tensorflow.lite.NativeInterpreterWrapper(byteBuffer, null);
    }

    public final void a() {
        if (this.f347878d == null) {
            throw new java.lang.IllegalStateException("Internal error: The Interpreter has already been closed.");
        }
    }

    public org.tensorflow.lite.Tensor b(int i17) {
        a();
        return this.f347878d.a(i17);
    }

    public int c() {
        a();
        return this.f347878d.f347859h.length;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        org.tensorflow.lite.NativeInterpreterWrapper nativeInterpreterWrapper = this.f347878d;
        if (nativeInterpreterWrapper != null) {
            nativeInterpreterWrapper.close();
            this.f347878d = null;
        }
    }

    public org.tensorflow.lite.Tensor f(int i17) {
        a();
        return this.f347878d.b(i17);
    }

    public void finalize() {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    public int i() {
        a();
        return this.f347878d.f347860i.length;
    }

    public void j(java.lang.Object[] objArr, java.util.Map map) {
        a();
        this.f347878d.c(objArr, map);
    }
}
