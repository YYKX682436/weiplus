package fk4;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f263598d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f263599e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fk4.k f263600f;

    /* renamed from: g, reason: collision with root package name */
    public int f263601g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fk4.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f263600f = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f263599e = obj;
        this.f263601g |= Integer.MIN_VALUE;
        return this.f263600f.c(this);
    }
}
