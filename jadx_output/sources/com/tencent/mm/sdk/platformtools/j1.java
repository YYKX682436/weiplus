package com.tencent.mm.sdk.platformtools;

/* loaded from: classes7.dex */
public class j1 extends java.io.FilterInputStream {

    /* renamed from: d, reason: collision with root package name */
    public long f192752d;

    public j1(java.io.FileInputStream fileInputStream) {
        super(fileInputStream);
        this.f192752d = 0L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i17) {
        try {
            this.f192752d = ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FileSeekingInputStream", e17, "Failed seeking FileChannel.", new java.lang.Object[0]);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        ((java.io.FileInputStream) ((java.io.FilterInputStream) this).in).getChannel().position(this.f192752d);
    }
}
