package jt1;

/* loaded from: classes12.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f301606d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f301607e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f301608f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jt1.e f301609g;

    /* renamed from: h, reason: collision with root package name */
    public int f301610h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(jt1.e eVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f301609g = eVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f301608f = obj;
        this.f301610h |= Integer.MIN_VALUE;
        return this.f301609g.i(null, this);
    }
}
