package uj5;

/* loaded from: classes5.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f428474d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f428475e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ uj5.n f428476f;

    /* renamed from: g, reason: collision with root package name */
    public int f428477g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(uj5.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f428476f = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f428475e = obj;
        this.f428477g |= Integer.MIN_VALUE;
        return this.f428476f.c(null, null, null, null, this);
    }
}
