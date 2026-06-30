package ub2;

/* loaded from: classes10.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f426043d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ub2.k f426044e;

    /* renamed from: f, reason: collision with root package name */
    public int f426045f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ub2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f426044e = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f426043d = obj;
        this.f426045f |= Integer.MIN_VALUE;
        return this.f426044e.c(this);
    }
}
