package jg0;

/* loaded from: classes12.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f299580d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f299581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299582f;

    /* renamed from: g, reason: collision with root package name */
    public int f299583g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(jg0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f299582f = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f299581e = obj;
        this.f299583g |= Integer.MIN_VALUE;
        return jg0.x.H(this.f299582f, this);
    }
}
