package mn2;

/* loaded from: classes10.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn2.c4 f329910d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.o f329911e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dn.h f329912f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(mn2.c4 c4Var, dn.o oVar, dn.h hVar) {
        super(0);
        this.f329910d = c4Var;
        this.f329911e = oVar;
        this.f329912f = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mn2.c4 c4Var = this.f329910d;
        cw2.eb ebVar = c4Var.f329929e;
        if (ebVar != null) {
            ebVar.z(c4Var.f329928d, this.f329911e, this.f329912f);
        }
        return jz5.f0.f302826a;
    }
}
