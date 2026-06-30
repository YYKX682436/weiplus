package vt;

/* loaded from: classes9.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439926d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f439927e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vt.d f439928f;

    /* renamed from: g, reason: collision with root package name */
    public int f439929g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vt.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f439928f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f439927e = obj;
        this.f439929g |= Integer.MIN_VALUE;
        return this.f439928f.D(null, this);
    }
}
