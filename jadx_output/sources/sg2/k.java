package sg2;

/* loaded from: classes13.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407910d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sg2.x f407912f;

    /* renamed from: g, reason: collision with root package name */
    public int f407913g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(sg2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407912f = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407911e = obj;
        this.f407913g |= Integer.MIN_VALUE;
        return this.f407912f.d(null, this);
    }
}
