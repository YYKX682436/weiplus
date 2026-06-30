package xg1;

/* loaded from: classes7.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final int f454373d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f454374e;

    public i(int i17, java.lang.String TAG) {
        kotlin.jvm.internal.o.g(TAG, "TAG");
        this.f454373d = i17;
        this.f454374e = TAG;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (xg1.h.f454370a.a(this.f454373d)) {
            com.tencent.mars.xlog.Log.w(this.f454374e, "timeout, fallback to legacy logic");
        }
    }
}
