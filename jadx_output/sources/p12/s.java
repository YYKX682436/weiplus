package p12;

/* loaded from: classes10.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f351045d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f351046e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p12.w f351047f;

    /* renamed from: g, reason: collision with root package name */
    public int f351048g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p12.w wVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f351047f = wVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f351046e = obj;
        this.f351048g |= Integer.MIN_VALUE;
        return p12.w.g(this.f351047f, null, this);
    }
}
