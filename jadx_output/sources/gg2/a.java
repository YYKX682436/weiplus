package gg2;

/* loaded from: classes2.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f271660d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f271661e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gg2.b f271662f;

    /* renamed from: g, reason: collision with root package name */
    public int f271663g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(gg2.b bVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f271662f = bVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f271661e = obj;
        this.f271663g |= Integer.MIN_VALUE;
        return this.f271662f.b(this);
    }
}
