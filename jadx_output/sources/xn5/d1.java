package xn5;

/* loaded from: classes13.dex */
public final class d1 extends java.util.concurrent.FutureTask {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f455662d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        super(runnable, null);
        this.f455662d = runnable2;
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public boolean cancel(boolean z17) {
        xn5.e1.f455666d.removeCallbacks(this.f455662d);
        return true;
    }
}
