package org.msgpack.core.buffer;

/* loaded from: classes7.dex */
public class a implements org.msgpack.core.buffer.i {

    /* renamed from: d, reason: collision with root package name */
    public org.msgpack.core.buffer.h f347834d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f347835e;

    public a(byte[] bArr) {
        org.msgpack.core.buffer.h wrap = org.msgpack.core.buffer.h.wrap(bArr, 0, bArr.length);
        this.f347834d = wrap;
        if (wrap == null) {
            this.f347835e = true;
        } else {
            this.f347835e = false;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f347834d = null;
        this.f347835e = true;
    }
}
