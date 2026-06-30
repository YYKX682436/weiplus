package df2;

/* loaded from: classes3.dex */
public final class fz extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230176d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230177e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.hz f230178f;

    /* renamed from: g, reason: collision with root package name */
    public int f230179g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fz(df2.hz hzVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f230178f = hzVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f230177e = obj;
        this.f230179g |= Integer.MIN_VALUE;
        return this.f230178f.q(this);
    }
}
