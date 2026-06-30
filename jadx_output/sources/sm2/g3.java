package sm2;

/* loaded from: classes3.dex */
public final class g3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ km2.q f409468e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(sm2.o4 o4Var, km2.q qVar) {
        super(0);
        this.f409467d = o4Var;
        this.f409468e = qVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.x7 x7Var = this.f409467d.M;
        if (x7Var != null) {
            x7Var.G1(true, this.f409468e);
        }
        return jz5.f0.f302826a;
    }
}
