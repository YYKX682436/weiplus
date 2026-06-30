package xp4;

/* loaded from: classes10.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f455948d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xp4.e f455949e;

    /* renamed from: f, reason: collision with root package name */
    public int f455950f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xp4.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f455949e = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f455948d = obj;
        this.f455950f |= Integer.MIN_VALUE;
        return this.f455949e.a(null, this);
    }
}
