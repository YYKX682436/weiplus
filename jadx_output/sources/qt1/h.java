package qt1;

/* loaded from: classes7.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f366528d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qt1.i f366529e;

    /* renamed from: f, reason: collision with root package name */
    public int f366530f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(qt1.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f366529e = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f366528d = obj;
        this.f366530f |= Integer.MIN_VALUE;
        return this.f366529e.e(this);
    }
}
