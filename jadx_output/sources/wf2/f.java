package wf2;

/* loaded from: classes10.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f445575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wf2.j f445576e;

    /* renamed from: f, reason: collision with root package name */
    public int f445577f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(wf2.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f445576e = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f445575d = obj;
        this.f445577f |= Integer.MIN_VALUE;
        return wf2.j.a7(this.f445576e, this);
    }
}
