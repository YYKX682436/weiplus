package u61;

/* loaded from: classes4.dex */
public final class s extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f424927d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f424928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ u61.u f424929f;

    /* renamed from: g, reason: collision with root package name */
    public int f424930g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u61.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f424929f = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f424928e = obj;
        this.f424930g |= Integer.MIN_VALUE;
        return this.f424929f.Ai(null, null, this);
    }
}
