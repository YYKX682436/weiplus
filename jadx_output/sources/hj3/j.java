package hj3;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f281632d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f281633e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hj3.m f281634f;

    /* renamed from: g, reason: collision with root package name */
    public int f281635g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(hj3.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f281634f = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f281633e = obj;
        this.f281635g |= Integer.MIN_VALUE;
        return this.f281634f.a(this);
    }
}
