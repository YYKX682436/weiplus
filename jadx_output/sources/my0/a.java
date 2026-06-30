package my0;

/* loaded from: classes5.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f332643d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f332644e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ my0.e f332645f;

    /* renamed from: g, reason: collision with root package name */
    public int f332646g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(my0.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f332645f = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f332644e = obj;
        this.f332646g |= Integer.MIN_VALUE;
        java.lang.Object e17 = this.f332645f.e(null, null, this);
        return e17 == pz5.a.f359186d ? e17 : kotlin.Result.m520boximpl(e17);
    }
}
