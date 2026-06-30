package sf4;

/* loaded from: classes4.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf4.f2 f407459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f407460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f407461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f407462g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(sf4.f2 f2Var, java.lang.String str, int i17, int i18) {
        super(0);
        this.f407459d = f2Var;
        this.f407460e = str;
        this.f407461f = i17;
        this.f407462g = i18;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sf4.f2 f2Var = this.f407459d;
        if4.h hVar = f2Var.f407475f;
        if (hVar != null) {
            f2Var.f407473d = ef4.k0.f252459a.b(hVar);
        }
        ((vf0.u1) ((wf0.p1) i95.n0.c(wf0.p1.class))).getClass();
        com.tencent.mm.modelcdntran.l3 Di = t21.o2.Di();
        java.lang.String str = this.f407460e;
        int i17 = this.f407461f;
        int i18 = this.f407462g;
        int p17 = Di.p(str, i17, i18, 0);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestVideoData ");
        sb6.append(str);
        sb6.append(' ');
        sb6.append(i17);
        sb6.append(' ');
        sb6.append(i18);
        sb6.append(' ');
        nf4.o oVar = f2Var.f407473d;
        sb6.append(oVar != null ? java.lang.Integer.valueOf(oVar.field_cacheSize) : null);
        sb6.append(", ret:");
        sb6.append(p17);
        sb6.append(" this:");
        sb6.append(f2Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.VideoPlayProxy", sb6.toString());
        return jz5.f0.f302826a;
    }
}
