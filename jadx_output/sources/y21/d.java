package y21;

/* loaded from: classes10.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f459040d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f459041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y21.e f459042f;

    /* renamed from: g, reason: collision with root package name */
    public int f459043g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(y21.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f459042f = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f459041e = obj;
        this.f459043g |= Integer.MIN_VALUE;
        return this.f459042f.c(this);
    }
}
