package x65;

/* loaded from: classes14.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452387d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f452388e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup f452389f;

    /* renamed from: g, reason: collision with root package name */
    public int f452390g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup workerPoolWeTaskGroup, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f452389f = workerPoolWeTaskGroup;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f452388e = obj;
        this.f452390g |= Integer.MIN_VALUE;
        return this.f452389f.i(null, this);
    }
}
