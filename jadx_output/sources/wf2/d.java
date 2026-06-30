package wf2;

/* loaded from: classes10.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f445567d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f445568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wf2.j f445569f;

    /* renamed from: g, reason: collision with root package name */
    public int f445570g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(wf2.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f445569f = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f445568e = obj;
        this.f445570g |= Integer.MIN_VALUE;
        return this.f445569f.d7(this);
    }
}
