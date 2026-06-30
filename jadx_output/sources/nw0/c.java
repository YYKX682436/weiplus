package nw0;

/* loaded from: classes5.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f340754d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f340755e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f340756f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nw0.h f340757g;

    /* renamed from: h, reason: collision with root package name */
    public int f340758h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(nw0.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f340757g = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f340756f = obj;
        this.f340758h |= Integer.MIN_VALUE;
        return this.f340757g.c(null, null, this);
    }
}
