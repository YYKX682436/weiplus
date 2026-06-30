package com.tencent.xweb;

/* loaded from: classes13.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220541d;

    public s(java.lang.String str) {
        this.f220541d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cleanTempFile, do delete ");
        java.lang.String str = this.f220541d;
        sb6.append(str);
        by5.c4.f("FileReaderXWeb", sb6.toString());
        by5.u.i(str);
    }
}
