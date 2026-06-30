package zx0;

/* loaded from: classes5.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f476984d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f476985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zx0.f f476986f;

    /* renamed from: g, reason: collision with root package name */
    public int f476987g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zx0.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f476986f = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f476985e = obj;
        this.f476987g |= Integer.MIN_VALUE;
        return this.f476986f.a(this);
    }
}
