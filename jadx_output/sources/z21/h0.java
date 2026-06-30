package z21;

/* loaded from: classes12.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f469596d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f469597e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z21.j0 f469598f;

    /* renamed from: g, reason: collision with root package name */
    public int f469599g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(z21.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f469598f = j0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f469597e = obj;
        this.f469599g |= Integer.MIN_VALUE;
        return this.f469598f.l(this);
    }
}
