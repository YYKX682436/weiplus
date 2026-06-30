package kj3;

/* loaded from: classes14.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f308441d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f308442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kj3.d f308443f;

    /* renamed from: g, reason: collision with root package name */
    public int f308444g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(kj3.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f308443f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f308442e = obj;
        this.f308444g |= Integer.MIN_VALUE;
        return this.f308443f.b(this);
    }
}
