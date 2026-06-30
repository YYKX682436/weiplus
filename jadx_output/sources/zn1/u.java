package zn1;

/* loaded from: classes11.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f474476d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zn1.w f474477e;

    /* renamed from: f, reason: collision with root package name */
    public int f474478f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(zn1.w wVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f474477e = wVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f474476d = obj;
        this.f474478f |= Integer.MIN_VALUE;
        return this.f474477e.a(null, null, this);
    }
}
