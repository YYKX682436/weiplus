package h4;

/* loaded from: classes14.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278635d;

    /* renamed from: e, reason: collision with root package name */
    public int f278636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.i f278637f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f278638g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h4.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f278637f = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f278635d = obj;
        this.f278636e |= Integer.MIN_VALUE;
        return this.f278637f.e(null, this);
    }
}
