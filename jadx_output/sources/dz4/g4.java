package dz4;

/* loaded from: classes12.dex */
public final class g4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f245262d;

    /* renamed from: e, reason: collision with root package name */
    public long f245263e;

    /* renamed from: f, reason: collision with root package name */
    public int f245264f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f245265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dz4.h4 f245266h;

    /* renamed from: i, reason: collision with root package name */
    public int f245267i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g4(dz4.h4 h4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f245266h = h4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f245265g = obj;
        this.f245267i |= Integer.MIN_VALUE;
        return dz4.h4.b(this.f245266h, 0L, false, this);
    }
}
