package com.unionpay;

/* loaded from: classes13.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.b f220712e;

    public d0(com.unionpay.b bVar, java.lang.String str) {
        this.f220712e = bVar;
        this.f220711d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f220712e.f220700d.loadUrl(this.f220711d);
    }
}
