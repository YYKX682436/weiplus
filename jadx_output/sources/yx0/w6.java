package yx0;

/* loaded from: classes5.dex */
public final class w6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f467744d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f467745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f467746f;

    /* renamed from: g, reason: collision with root package name */
    public int f467747g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6(yx0.b8 b8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f467746f = b8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f467745e = obj;
        this.f467747g |= Integer.MIN_VALUE;
        return this.f467746f.u0(null, this);
    }
}
