package wf2;

/* loaded from: classes10.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f445594d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f445595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wf2.n f445596f;

    /* renamed from: g, reason: collision with root package name */
    public int f445597g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(wf2.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f445596f = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f445595e = obj;
        this.f445597g |= Integer.MIN_VALUE;
        return this.f445596f.b7(null, null, null, null, this);
    }
}
