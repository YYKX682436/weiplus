package v65;

/* loaded from: classes16.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f433549d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f433550e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f433551f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f433552g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.h f433553h;

    /* renamed from: i, reason: collision with root package name */
    public int f433554i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(v65.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f433553h = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f433552g = obj;
        this.f433554i |= Integer.MIN_VALUE;
        return this.f433553h.a(this);
    }
}
