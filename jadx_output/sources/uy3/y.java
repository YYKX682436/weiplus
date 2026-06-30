package uy3;

/* loaded from: classes7.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f432001d;

    public y(yz5.a aVar) {
        this.f432001d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Looper.myQueue().addIdleHandler(new uy3.x(this.f432001d));
    }
}
