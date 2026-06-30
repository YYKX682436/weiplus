package m0;

/* loaded from: classes14.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f322479d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f322480e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0.r f322481f;

    /* renamed from: g, reason: collision with root package name */
    public int f322482g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(m0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f322481f = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f322480e = obj;
        this.f322482g |= Integer.MIN_VALUE;
        return this.f322481f.a(this);
    }
}
