package mj3;

/* loaded from: classes14.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f327042d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f327043e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mj3.d f327044f;

    /* renamed from: g, reason: collision with root package name */
    public int f327045g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(mj3.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f327044f = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f327043e = obj;
        this.f327045g |= Integer.MIN_VALUE;
        return this.f327044f.b(this);
    }
}
