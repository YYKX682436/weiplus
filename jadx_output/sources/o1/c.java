package o1;

/* loaded from: classes14.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f342015d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o1.e f342016e;

    /* renamed from: f, reason: collision with root package name */
    public int f342017f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o1.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f342016e = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f342015d = obj;
        this.f342017f |= Integer.MIN_VALUE;
        return this.f342016e.a(0L, 0L, this);
    }
}
