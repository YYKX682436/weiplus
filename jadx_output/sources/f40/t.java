package f40;

/* loaded from: classes12.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f259460d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f40.v f259461e;

    /* renamed from: f, reason: collision with root package name */
    public int f259462f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(f40.v vVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f259461e = vVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f259460d = obj;
        this.f259462f |= Integer.MIN_VALUE;
        return f40.v.T6(this.f259461e, null, null, this);
    }
}
