package sg2;

/* loaded from: classes13.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407914d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407915e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sg2.x f407916f;

    /* renamed from: g, reason: collision with root package name */
    public int f407917g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(sg2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407916f = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407915e = obj;
        this.f407917g |= Integer.MIN_VALUE;
        return this.f407916f.e(null, this);
    }
}
