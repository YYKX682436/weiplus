package zk2;

/* loaded from: classes2.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f473427d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f473428e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zk2.b f473429f;

    /* renamed from: g, reason: collision with root package name */
    public int f473430g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(zk2.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f473429f = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f473428e = obj;
        this.f473430g |= Integer.MIN_VALUE;
        return this.f473429f.b(this);
    }
}
