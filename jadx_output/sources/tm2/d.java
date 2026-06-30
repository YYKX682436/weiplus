package tm2;

/* loaded from: classes3.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f420495d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.b f420496e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tm2.g f420497f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(boolean z17, km2.b bVar, tm2.g gVar) {
        super(0);
        this.f420495d = z17;
        this.f420496e = bVar;
        this.f420497f = gVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        km2.b bVar;
        com.tencent.mm.plugin.finder.live.plugin.v3 v3Var;
        if (this.f420495d && (bVar = this.f420496e) != null && (v3Var = this.f420497f.f420510h) != null) {
            v3Var.M1(bVar);
        }
        return jz5.f0.f302826a;
    }
}
