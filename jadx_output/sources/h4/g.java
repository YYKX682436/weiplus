package h4;

/* loaded from: classes14.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278653d;

    /* renamed from: e, reason: collision with root package name */
    public int f278654e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.i f278655f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h4.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f278655f = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f278653d = obj;
        this.f278654e |= Integer.MIN_VALUE;
        return this.f278655f.h(null, this);
    }
}
