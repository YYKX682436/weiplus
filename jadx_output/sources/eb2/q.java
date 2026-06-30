package eb2;

/* loaded from: classes2.dex */
public final class q extends fp0.r {

    /* renamed from: i, reason: collision with root package name */
    public final u26.w f250841i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(u26.w channel, yz5.l task) {
        super(task, null, 2, null);
        kotlin.jvm.internal.o.g(channel, "channel");
        kotlin.jvm.internal.o.g(task, "task");
        this.f250841i = channel;
    }

    @Override // fp0.r
    public void e() {
        this.f250841i.b(null);
        com.tencent.mars.xlog.Log.w("Finder.EnhanceStreamFetcher", "Task cancel");
    }
}
