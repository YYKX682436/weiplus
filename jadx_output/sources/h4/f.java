package h4;

/* loaded from: classes14.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278647d;

    /* renamed from: e, reason: collision with root package name */
    public int f278648e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.i f278649f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h4.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f278649f = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f278647d = obj;
        this.f278648e |= Integer.MIN_VALUE;
        return this.f278649f.g(null, this);
    }
}
