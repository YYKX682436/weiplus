package zd1;

/* loaded from: classes7.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.y f471545d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f471546e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zd1.o f471547f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.plugin.appbrand.y yVar, int i17, zd1.o oVar) {
        super(1);
        this.f471545d = yVar;
        this.f471546e = i17;
        this.f471547f = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        zd1.j result = (zd1.j) obj;
        kotlin.jvm.internal.o.g(result, "result");
        boolean z17 = result instanceof zd1.i;
        zd1.o oVar = this.f471547f;
        int i17 = this.f471546e;
        com.tencent.mm.plugin.appbrand.y yVar = this.f471545d;
        if (z17) {
            zd1.i iVar = (zd1.i) result;
            yVar.a(i17, oVar.x(yVar, jc1.f.f298912a, kz5.c1.k(new jz5.l(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, iVar.f471533a), new jz5.l("width", java.lang.Integer.valueOf(iVar.f471534b)), new jz5.l("height", java.lang.Integer.valueOf(iVar.f471535c)))));
        } else if (result instanceof zd1.h) {
            java.lang.String str2 = ((zd1.h) result).f471532a;
            if (str2 == null || str2.length() == 0) {
                str = "fail";
            } else {
                str = "fail: " + str2;
            }
            yVar.a(i17, oVar.o(str));
        }
        return jz5.f0.f302826a;
    }
}
