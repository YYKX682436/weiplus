package pk2;

/* loaded from: classes3.dex */
public final class f2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f355723d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f355724e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f355725f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f355726g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.i2 f355727h;

    /* renamed from: i, reason: collision with root package name */
    public int f355728i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(pk2.i2 i2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f355727h = i2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f355726g = obj;
        this.f355728i |= Integer.MIN_VALUE;
        return this.f355727h.b(null, null, null, this);
    }
}
