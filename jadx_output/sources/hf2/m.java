package hf2;

/* loaded from: classes10.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f281109d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f281110e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f281111f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hf2.x f281112g;

    /* renamed from: h, reason: collision with root package name */
    public int f281113h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(hf2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f281112g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f281111f = obj;
        this.f281113h |= Integer.MIN_VALUE;
        return hf2.x.Z6(this.f281112g, null, this);
    }
}
