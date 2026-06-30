package st2;

/* loaded from: classes3.dex */
public final class x1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412496d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412497e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ st2.c2 f412498f;

    /* renamed from: g, reason: collision with root package name */
    public int f412499g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(st2.c2 c2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f412498f = c2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f412497e = obj;
        this.f412499g |= Integer.MIN_VALUE;
        return this.f412498f.f(null, null, null, null, false, this);
    }
}
