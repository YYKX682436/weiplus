package sp2;

/* loaded from: classes2.dex */
public final class s3 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f411207d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f411208e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f411209f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f411210g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ sp2.x3 f411211h;

    /* renamed from: i, reason: collision with root package name */
    public int f411212i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(sp2.x3 x3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f411211h = x3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f411210g = obj;
        this.f411212i |= Integer.MIN_VALUE;
        return sp2.x3.P6(this.f411211h, null, null, this);
    }
}
