package g4;

/* loaded from: classes14.dex */
public final class s4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268555d;

    /* renamed from: e, reason: collision with root package name */
    public int f268556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.u4 f268557f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268558g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(g4.u4 u4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268557f = u4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268555d = obj;
        this.f268556e |= Integer.MIN_VALUE;
        return this.f268557f.a(0, null, this);
    }
}
