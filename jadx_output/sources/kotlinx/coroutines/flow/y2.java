package kotlinx.coroutines.flow;

/* loaded from: classes10.dex */
public final class y2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310461d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.z2 f310462e;

    /* renamed from: f, reason: collision with root package name */
    public int f310463f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(kotlinx.coroutines.flow.z2 z2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310462e = z2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310461d = obj;
        this.f310463f |= Integer.MIN_VALUE;
        return this.f310462e.a(0, this);
    }
}
