package fk4;

/* loaded from: classes12.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f263603d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f263604e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk4.k f263605f;

    /* renamed from: g, reason: collision with root package name */
    public int f263606g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(fk4.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f263605f = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f263604e = obj;
        this.f263606g |= Integer.MIN_VALUE;
        return this.f263605f.d(this);
    }
}
