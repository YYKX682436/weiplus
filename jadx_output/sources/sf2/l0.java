package sf2;

/* loaded from: classes10.dex */
public final class l0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf2.e1 f407192e;

    /* renamed from: f, reason: collision with root package name */
    public int f407193f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(sf2.e1 e1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407192e = e1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407191d = obj;
        this.f407193f |= Integer.MIN_VALUE;
        return this.f407192e.c7(null, this);
    }
}
