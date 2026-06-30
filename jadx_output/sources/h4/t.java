package h4;

/* loaded from: classes14.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278695d;

    /* renamed from: e, reason: collision with root package name */
    public int f278696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h4.u f278697f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f278698g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(h4.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f278697f = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f278695d = obj;
        this.f278696e |= Integer.MIN_VALUE;
        return this.f278697f.emit(null, this);
    }
}
