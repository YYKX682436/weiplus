package qo2;

/* loaded from: classes3.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f365568d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f365569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qo2.e f365570f;

    /* renamed from: g, reason: collision with root package name */
    public int f365571g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qo2.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f365570f = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f365569e = obj;
        this.f365571g |= Integer.MIN_VALUE;
        return qo2.e.a(this.f365570f, null, this);
    }
}
