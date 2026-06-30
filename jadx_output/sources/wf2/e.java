package wf2;

/* loaded from: classes10.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f445571d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f445572e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wf2.j f445573f;

    /* renamed from: g, reason: collision with root package name */
    public int f445574g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(wf2.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f445573f = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f445572e = obj;
        this.f445574g |= Integer.MIN_VALUE;
        return this.f445573f.e7(this);
    }
}
