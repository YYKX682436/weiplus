package com.unionpay;

/* loaded from: classes13.dex */
public final class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.f f220706d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f220707e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.unionpay.g f220708f;

    public c0(com.unionpay.b bVar, com.unionpay.f fVar, java.lang.String str, com.unionpay.d dVar) {
        this.f220706d = fVar;
        this.f220707e = str;
        this.f220708f = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.unionpay.f fVar = this.f220706d;
        if (fVar != null) {
            fVar.a(this.f220707e, this.f220708f);
        }
    }
}
