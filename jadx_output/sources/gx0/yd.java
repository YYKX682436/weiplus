package gx0;

/* loaded from: classes5.dex */
public final class yd extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f277230d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f277231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f277232f;

    /* renamed from: g, reason: collision with root package name */
    public int f277233g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(gx0.bf bfVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f277232f = bfVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f277231e = obj;
        this.f277233g |= Integer.MIN_VALUE;
        return this.f277232f.g7(this);
    }
}
