package t72;

/* loaded from: classes4.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f416049d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f416050e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t72.l f416051f;

    /* renamed from: g, reason: collision with root package name */
    public int f416052g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t72.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f416051f = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f416050e = obj;
        this.f416052g |= Integer.MIN_VALUE;
        return this.f416051f.V6(null, this);
    }
}
