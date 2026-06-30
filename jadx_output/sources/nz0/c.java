package nz0;

/* loaded from: classes5.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f341493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nz0.d f341494e;

    /* renamed from: f, reason: collision with root package name */
    public int f341495f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(nz0.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f341494e = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f341493d = obj;
        this.f341495f |= Integer.MIN_VALUE;
        return this.f341494e.c(null, 0, false, this);
    }
}
