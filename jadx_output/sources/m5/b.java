package m5;

/* loaded from: classes13.dex */
public class b implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m5.c f323469d;

    public b(m5.c cVar) {
        this.f323469d = cVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(java.lang.Runnable runnable) {
        this.f323469d.f323471b.post(runnable);
    }
}
