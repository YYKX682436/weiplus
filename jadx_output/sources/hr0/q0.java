package hr0;

@j95.b
/* loaded from: classes11.dex */
public final class q0 extends i95.w implements lp0.g {

    /* renamed from: d, reason: collision with root package name */
    public m3.d f283320d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f283321e;

    public void Ai() {
        char c17;
        if (this.f283320d != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            m3.d dVar = this.f283320d;
            kotlin.jvm.internal.o.d(dVar);
            java.lang.Throwable th6 = (java.lang.Throwable) dVar.f323093b;
            m3.d dVar2 = this.f283320d;
            kotlin.jvm.internal.o.d(dVar2);
            java.lang.Object first = dVar2.f323092a;
            kotlin.jvm.internal.o.f(first, "first");
            long longValue = currentTimeMillis - ((java.lang.Number) first).longValue();
            com.tencent.mars.xlog.Log.w("MicroMsg.SdcardRemountingHandler", "handleExternalCacheDirRecover: lastErr=" + th6.getMessage() + ", durationMs=" + longValue);
            ap.a.a(1, "errGetExtCacheDir", th6, null, "recover", th6.getMessage(), java.lang.String.valueOf(longValue));
            if (com.tencent.mm.sdk.platformtools.x2.n()) {
                synchronized (this) {
                    if (!this.f283321e) {
                        java.lang.String a17 = bm5.f1.a();
                        kotlin.jvm.internal.o.d(a17);
                        if (r26.n0.B(a17, ":", false)) {
                            c17 = 0;
                            a17 = a17.substring(r26.n0.P(a17, ":", 0, false, 6, null) + 1);
                            kotlin.jvm.internal.o.f(a17, "substring(...)");
                        } else {
                            c17 = 0;
                        }
                        java.lang.String str = "MicroMsg.SdcardRemountingHandler." + a17 + ".LastRelaunchPostMs";
                        long j17 = com.tencent.mm.sdk.platformtools.o4.L().getLong(str, 0L);
                        if (j17 > 0) {
                            long j18 = currentTimeMillis - j17;
                            if (j18 >= 0 && j18 <= 43200000) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.SdcardRemountingHandler", "skip, duration bounded, last was " + (j18 / com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL) + "min ago");
                                return;
                            }
                        }
                        com.tencent.mm.sdk.platformtools.o4.L().putLong(str, currentTimeMillis);
                        this.f283321e = true;
                        com.tencent.mars.xlog.Log.w("MicroMsg.SdcardRemountingHandler", "post relaunch task");
                        java.lang.String[] strArr = new java.lang.String[3];
                        strArr[c17] = "relaunch";
                        strArr[1] = th6.getMessage();
                        strArr[2] = java.lang.String.valueOf(longValue);
                        ap.a.a(1, "errGetExtCacheDir", th6, null, strArr);
                        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(new hr0.p0());
                    }
                }
            }
        }
        this.f283320d = null;
    }

    public void wi(java.lang.Throwable throwable) {
        kotlin.jvm.internal.o.g(throwable, "throwable");
        if (com.tencent.mm.sdk.platformtools.x2.r()) {
            return;
        }
        this.f283320d = new m3.d(java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), throwable);
        com.tencent.mars.xlog.Log.w("MicroMsg.SdcardRemountingHandler", "handleExternalCacheDirError: " + throwable.getMessage());
        ap.a.a(1, "errGetExtCacheDir", throwable, null, "err", throwable.getMessage());
    }
}
