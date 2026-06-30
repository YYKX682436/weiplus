package x65;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup f452378d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup workerPoolWeTaskGroup) {
        super(0);
        this.f452378d = workerPoolWeTaskGroup;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f452378d.f();
    }
}
