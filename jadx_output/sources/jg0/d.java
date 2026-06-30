package jg0;

/* loaded from: classes12.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f299553d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jg0.x f299554e;

    /* renamed from: f, reason: collision with root package name */
    public int f299555f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(jg0.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f299554e = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f299553d = obj;
        this.f299555f |= Integer.MIN_VALUE;
        return this.f299554e.I(null, null, this);
    }
}
