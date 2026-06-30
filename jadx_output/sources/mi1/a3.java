package mi1;

/* loaded from: classes7.dex */
public final class a3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f326511d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326512e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mi1.b3 f326513f;

    /* renamed from: g, reason: collision with root package name */
    public int f326514g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(mi1.b3 b3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f326513f = b3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f326512e = obj;
        this.f326514g |= Integer.MIN_VALUE;
        return this.f326513f.b(null, this);
    }
}
