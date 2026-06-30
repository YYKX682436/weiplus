package x65;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f452351d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f452352e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x65.l f452353f;

    /* renamed from: g, reason: collision with root package name */
    public int f452354g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x65.l lVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f452353f = lVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f452352e = obj;
        this.f452354g |= Integer.MIN_VALUE;
        return this.f452353f.h(null, this);
    }
}
