package my1;

/* loaded from: classes4.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ my1.j f332683e;

    /* renamed from: f, reason: collision with root package name */
    public int f332684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(my1.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332683e = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332682d = obj;
        this.f332684f |= Integer.MIN_VALUE;
        return this.f332683e.a(0, null, null, null, null, this);
    }
}
