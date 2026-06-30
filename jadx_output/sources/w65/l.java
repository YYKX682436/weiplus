package w65;

/* loaded from: classes12.dex */
public final class l extends w65.p {

    /* renamed from: e, reason: collision with root package name */
    public boolean f443361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(w65.q status, w65.m task) {
        super(status, task);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(task, "task");
    }

    @Override // w65.p
    public java.lang.String toString() {
        return "fileWeTaskEvent id:" + this.f443363b.id() + " status:" + this.f443362a + " ret:" + this.f443364c + " taskPercent:" + this.f443365d + " isAutoDownload:" + this.f443361e;
    }
}
