package te2;

/* loaded from: classes3.dex */
public final class ua extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f418482d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418483e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418484f;

    /* renamed from: g, reason: collision with root package name */
    public int f418485g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ua(te2.hc hcVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f418484f = hcVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f418483e = obj;
        this.f418485g |= Integer.MIN_VALUE;
        return te2.hc.O6(this.f418484f, this);
    }
}
