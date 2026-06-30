package gx0;

/* loaded from: classes5.dex */
public final class xd extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f277175d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f277176e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.bf f277177f;

    /* renamed from: g, reason: collision with root package name */
    public int f277178g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xd(gx0.bf bfVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f277177f = bfVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f277176e = obj;
        this.f277178g |= Integer.MIN_VALUE;
        return this.f277177f.f7(this);
    }
}
