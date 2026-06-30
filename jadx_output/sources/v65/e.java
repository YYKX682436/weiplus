package v65;

/* loaded from: classes16.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f433556d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f433557e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f433558f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f433559g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.h f433560h;

    /* renamed from: i, reason: collision with root package name */
    public int f433561i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(v65.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f433560h = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f433559g = obj;
        this.f433561i |= Integer.MIN_VALUE;
        return this.f433560h.c(null, this);
    }
}
