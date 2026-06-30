package ly0;

/* loaded from: classes5.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f322243d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ly0.v f322244e;

    /* renamed from: f, reason: collision with root package name */
    public int f322245f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ly0.v vVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f322244e = vVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f322243d = obj;
        this.f322245f |= Integer.MIN_VALUE;
        return this.f322244e.f(null, null, this);
    }
}
