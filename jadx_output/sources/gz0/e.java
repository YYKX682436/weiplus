package gz0;

/* loaded from: classes13.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f277655d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f277656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gz0.h f277657f;

    /* renamed from: g, reason: collision with root package name */
    public int f277658g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(gz0.h hVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f277657f = hVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f277656e = obj;
        this.f277658g |= Integer.MIN_VALUE;
        return this.f277657f.c(this);
    }
}
