package g4;

/* loaded from: classes5.dex */
public final class f2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268283d;

    /* renamed from: e, reason: collision with root package name */
    public int f268284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.y2 f268285f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268286g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f268287h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f268288i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f268289m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f268290n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(g4.y2 y2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268285f = y2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268283d = obj;
        this.f268284e |= Integer.MIN_VALUE;
        return this.f268285f.d(this);
    }
}
