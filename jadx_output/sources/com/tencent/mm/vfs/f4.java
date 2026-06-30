package com.tencent.mm.vfs;

/* loaded from: classes7.dex */
public class f4 extends java.io.FileInputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f212924d;

    public f4(java.lang.String str) {
        super(str);
        this.f212924d = 0L;
    }

    @Override // java.io.InputStream
    public void mark(int i17) {
        try {
            this.f212924d = getChannel().position();
        } catch (java.io.IOException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public void reset() {
        getChannel().position(this.f212924d);
    }
}
