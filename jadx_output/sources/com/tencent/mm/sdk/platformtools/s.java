package com.tencent.mm.sdk.platformtools;

/* loaded from: classes8.dex */
public class s extends java.io.Writer {

    /* renamed from: d, reason: collision with root package name */
    public java.io.StringWriter f192964d;

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        java.io.StringWriter stringWriter = this.f192964d;
        if (stringWriter == null) {
            return;
        }
        java.lang.String stringWriter2 = stringWriter.toString();
        this.f192964d = null;
        com.tencent.mars.xlog.Log.w("MicroMsg.BitmapTracer", stringWriter2);
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i17, int i18) {
        if (this.f192964d == null) {
            this.f192964d = new java.io.StringWriter();
        }
        this.f192964d.write(cArr, i17, i18);
    }
}
