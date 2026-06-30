package com.tencent.mm.pluginsdk.model;

/* loaded from: classes12.dex */
public abstract class j3 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f189348a = false;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f189349b = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    public abstract java.lang.Object a(java.lang.Object... objArr);

    public abstract java.util.concurrent.ExecutorService b();

    public abstract void c(java.lang.Object obj);

    public void d(java.lang.Object... objArr) {
    }

    public void e(java.lang.Object... objArr) {
    }

    public boolean f(java.lang.Object... objArr) {
        if (this.f189348a) {
            iz5.a.g("MicroMsg.MMAsyncTask Should construct a new Task", false);
        }
        this.f189348a = true;
        d(objArr);
        java.util.concurrent.ExecutorService b17 = b();
        if (b17 == null) {
            return false;
        }
        b17.execute(new com.tencent.mm.pluginsdk.model.h3(this, objArr));
        return true;
    }
}
