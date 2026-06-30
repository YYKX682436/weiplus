package dn2;

/* loaded from: classes3.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.p0 f241932d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn2.m f241933e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.qq1 f241934f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f241935g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(cn2.p0 p0Var, dn2.m mVar, r45.qq1 qq1Var, android.view.View view) {
        super(1);
        this.f241932d = p0Var;
        this.f241933e = mVar;
        this.f241934f = qq1Var;
        this.f241935g = view;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        cn2.p0 p0Var = this.f241932d;
        p0Var.f43599j = booleanValue;
        r45.qq1 qq1Var = this.f241934f;
        dn2.m mVar = this.f241933e;
        if (booleanValue) {
            mVar.e(3, qq1Var.getList(0).size());
            p0Var.b().j(-1);
        } else {
            mVar.e(4, qq1Var.getList(0).size());
            kotlinx.coroutines.r2 r2Var = mVar.f241942e;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            mVar.f241942e = com.tencent.mm.plugin.finder.live.util.y.m(p0Var.f43591b, null, null, new dn2.j(mVar, p0Var, this.f241935g, null), 3, null);
        }
        return jz5.f0.f302826a;
    }
}
