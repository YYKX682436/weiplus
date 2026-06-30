package dz4;

/* loaded from: classes12.dex */
public final class w2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f245443d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f245444e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f245445f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dz4.y2 f245446g;

    /* renamed from: h, reason: collision with root package name */
    public int f245447h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(dz4.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f245446g = y2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f245445f = obj;
        this.f245447h |= Integer.MIN_VALUE;
        return dz4.y2.a(this.f245446g, null, null, null, this);
    }
}
