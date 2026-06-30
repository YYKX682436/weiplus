package qx3;

/* loaded from: classes10.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public long f367334d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f367335e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f367336f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f367337g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f367338h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qx3.b f367339i;

    /* renamed from: m, reason: collision with root package name */
    public int f367340m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qx3.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f367339i = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f367338h = obj;
        this.f367340m |= Integer.MIN_VALUE;
        return this.f367339i.c(0L, null, this);
    }
}
