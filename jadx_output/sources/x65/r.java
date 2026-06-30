package x65;

/* loaded from: classes14.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452393d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f452394e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f452395f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup f452396g;

    /* renamed from: h, reason: collision with root package name */
    public int f452397h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup workerPoolWeTaskGroup, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f452396g = workerPoolWeTaskGroup;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f452395f = obj;
        this.f452397h |= Integer.MIN_VALUE;
        return com.tencent.mm.sdk.coroutines.task.group.WorkerPoolWeTaskGroup.c(this.f452396g, 0, this);
    }
}
