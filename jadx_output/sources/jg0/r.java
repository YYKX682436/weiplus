package jg0;

/* loaded from: classes12.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f299607d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f299608e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299609f;

    /* renamed from: g, reason: collision with root package name */
    public int f299610g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(jg0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f299609f = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f299608e = obj;
        this.f299610g |= Integer.MIN_VALUE;
        return this.f299609f.B(this);
    }
}
