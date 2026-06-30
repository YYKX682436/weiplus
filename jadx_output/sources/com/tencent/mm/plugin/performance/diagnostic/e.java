package com.tencent.mm.plugin.performance.diagnostic;

/* loaded from: classes12.dex */
public class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f152918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f152919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.performance.diagnostic.d f152920f;

    public e(com.tencent.mm.plugin.performance.diagnostic.d dVar, long j17, java.lang.String str) {
        this.f152920f = dVar;
        this.f152918d = j17;
        this.f152919e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f152920f.h().e()) {
            this.f152920f.s(false);
            ((ku5.t0) ku5.t0.f312615d).l(this, this.f152918d, this.f152919e);
        }
    }
}
