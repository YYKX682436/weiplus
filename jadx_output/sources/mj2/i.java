package mj2;

/* loaded from: classes10.dex */
public final class i extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f327031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f327032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zh2.c f327033f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(gk2.e eVar, android.content.Context context, zh2.c cVar) {
        super(0);
        this.f327031d = eVar;
        this.f327032e = context;
        this.f327033f = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return new qi2.q1(this.f327031d, this.f327032e, new mj2.h(this.f327033f));
    }
}
