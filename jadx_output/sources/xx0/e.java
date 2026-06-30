package xx0;

/* loaded from: classes5.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx0.i f457886e;

    /* renamed from: f, reason: collision with root package name */
    public int f457887f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xx0.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f457886e = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f457885d = obj;
        this.f457887f |= Integer.MIN_VALUE;
        return this.f457886e.b(false, this);
    }
}
