package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public class rf implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f209734d;

    public rf(com.tencent.mm.ui.sf sfVar, java.lang.Exception exc) {
        this.f209734d = exc;
    }

    @Override // java.lang.Runnable
    public void run() {
        throw new java.lang.RuntimeException(this.f209734d);
    }
}
