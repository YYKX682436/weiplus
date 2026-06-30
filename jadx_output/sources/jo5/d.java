package jo5;

/* loaded from: classes14.dex */
public final class d implements java.util.concurrent.Executor {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jo5.i f300940d;

    public d(jo5.i iVar) {
        this.f300940d = iVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable runnable) {
        this.f300940d.b().post(runnable);
    }
}
