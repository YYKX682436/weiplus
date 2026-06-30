package f;

/* loaded from: classes14.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f.a f257972d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.result.h f257973e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f257974f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ h.b f257975g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f257976h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f.a aVar, androidx.activity.result.h hVar, java.lang.String str, h.b bVar, n0.e5 e5Var) {
        super(1);
        this.f257972d = aVar;
        this.f257973e = hVar;
        this.f257974f = str;
        this.f257975g = bVar;
        this.f257976h = e5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        f.b bVar = new f.b(this.f257976h);
        androidx.activity.result.c e17 = this.f257973e.e(this.f257974f, this.f257975g, bVar);
        f.a aVar = this.f257972d;
        aVar.f257969a = e17;
        return new f.c(aVar);
    }
}
