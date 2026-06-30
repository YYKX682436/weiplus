package hr3;

/* loaded from: classes12.dex */
public final class sf extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f283978d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f283979e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ hr3.ag f283980f;

    /* renamed from: g, reason: collision with root package name */
    public int f283981g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(hr3.ag agVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f283980f = agVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f283979e = obj;
        this.f283981g |= Integer.MIN_VALUE;
        return this.f283980f.c(null, null, this);
    }
}
