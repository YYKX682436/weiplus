package f26;

/* loaded from: classes16.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f26.b2 f259149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i26.o f259150e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i26.j f259151f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ i26.j f259152g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f26.b2 b2Var, i26.o oVar, i26.j jVar, i26.j jVar2) {
        super(0);
        this.f259149d = b2Var;
        this.f259150e = oVar;
        this.f259151f = jVar;
        this.f259152g = jVar2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return java.lang.Boolean.valueOf(f26.g.f259162a.h(this.f259149d, this.f259150e.w(this.f259151f), this.f259152g));
    }
}
