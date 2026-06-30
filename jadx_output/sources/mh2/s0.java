package mh2;

/* loaded from: classes10.dex */
public final class s0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f326452d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f326453e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f326454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mh2.f1 f326455g;

    /* renamed from: h, reason: collision with root package name */
    public int f326456h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(mh2.f1 f1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f326455g = f1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f326454f = obj;
        this.f326456h |= Integer.MIN_VALUE;
        return mh2.f1.f(this.f326455g, null, this);
    }
}
