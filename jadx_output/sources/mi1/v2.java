package mi1;

/* loaded from: classes7.dex */
public final class v2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.x2 f326717e;

    /* renamed from: f, reason: collision with root package name */
    public int f326718f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(mi1.x2 x2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f326717e = x2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f326716d = obj;
        this.f326718f |= Integer.MIN_VALUE;
        return this.f326717e.a(this);
    }
}
