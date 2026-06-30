package x65;

/* loaded from: classes14.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452382d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f452383e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f452384f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup f452385g;

    /* renamed from: h, reason: collision with root package name */
    public int f452386h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup workerPoolWeTaskGroup, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f452385g = workerPoolWeTaskGroup;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f452384f = obj;
        this.f452386h |= Integer.MIN_VALUE;
        return this.f452385g.e(null, this);
    }
}
