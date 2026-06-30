package gg0;

/* loaded from: classes12.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f271499d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f271500e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f271501f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f271502g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gg0.j f271503h;

    /* renamed from: i, reason: collision with root package name */
    public int f271504i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gg0.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f271503h = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f271502g = obj;
        this.f271504i |= Integer.MIN_VALUE;
        return this.f271503h.n(this);
    }
}
