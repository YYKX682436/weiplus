package jn2;

/* loaded from: classes5.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f300594d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f300595e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jn2.j f300596f;

    /* renamed from: g, reason: collision with root package name */
    public int f300597g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(jn2.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f300596f = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f300595e = obj;
        this.f300597g |= Integer.MIN_VALUE;
        return jn2.j.e0(this.f300596f, this);
    }
}
