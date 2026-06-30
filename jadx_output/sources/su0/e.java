package su0;

/* loaded from: classes5.dex */
public final class e implements com.tencent.maas.speech.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ su0.j f412640a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yu0.p f412641b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f412642c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f412643d;

    public e(su0.j jVar, yu0.p pVar, yz5.l lVar, kotlin.jvm.internal.c0 c0Var) {
        this.f412640a = jVar;
        this.f412641b = pVar;
        this.f412642c = lVar;
        this.f412643d = c0Var;
    }

    @Override // com.tencent.maas.speech.c
    public void a(com.tencent.maas.speech.MJAsyncSpeechSubmitResponseInfo mJAsyncSpeechSubmitResponseInfo, com.tencent.maas.instamovie.base.MJError mJError) {
        kotlin.jvm.internal.c0 c0Var = this.f412643d;
        synchronized (this) {
            if (c0Var.f310112d) {
                return;
            }
            c0Var.f310112d = true;
            su0.j jVar = this.f412640a;
            java.lang.Object obj = this.f412641b.f465829d;
            java.util.concurrent.locks.ReentrantLock reentrantLock = jVar.f412659c;
            reentrantLock.lock();
            try {
                jVar.f412662f.remove(obj);
                java.lang.Runnable runnable = (java.lang.Runnable) jVar.f412663g.remove(obj);
                if (runnable != null) {
                    jVar.f412660d.removeCallbacksAndMessages(runnable);
                }
                if (mJError == null && mJAsyncSpeechSubmitResponseInfo != null) {
                    this.f412642c.invoke(mJAsyncSpeechSubmitResponseInfo);
                    return;
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onComplete: message ");
                sb6.append(mJError != null ? mJError.message : null);
                com.tencent.mars.xlog.Log.e("MJTTSTaskExecutor", sb6.toString());
                su0.a aVar = this.f412640a.f412658b;
                yu0.p pVar = this.f412641b;
                ((vu0.r) aVar).b(pVar.f465829d, pVar.f465827b);
                this.f412642c.invoke(null);
            } finally {
                reentrantLock.unlock();
            }
        }
    }
}
