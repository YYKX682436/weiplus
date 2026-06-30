package nu0;

/* loaded from: classes5.dex */
public final class c3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339905e;

    /* renamed from: f, reason: collision with root package name */
    public int f339906f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f339905e = b4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f339904d = obj;
        this.f339906f |= Integer.MIN_VALUE;
        return this.f339905e.v7(this);
    }
}
