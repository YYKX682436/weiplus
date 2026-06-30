package m36;

/* loaded from: classes14.dex */
public class d implements java.util.concurrent.ThreadFactory {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f323384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f323385e;

    public d(java.lang.String str, boolean z17) {
        this.f323384d = str;
        this.f323385e = z17;
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable runnable) {
        java.lang.Thread thread = new java.lang.Thread(runnable, this.f323384d);
        thread.setDaemon(this.f323385e);
        return thread;
    }
}
