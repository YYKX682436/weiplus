package il4;

/* loaded from: classes9.dex */
public class a extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public int f292092b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f292093c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f292094d;

    /* renamed from: e, reason: collision with root package name */
    public bw5.o50 f292095e;

    public static r45.km6 f(il4.a aVar) {
        r45.km6 km6Var = new r45.km6();
        if (aVar != null) {
            km6Var.f378838d = aVar.f292092b;
            km6Var.f378839e = aVar.f292093c;
            km6Var.f378840f = aVar.f292094d;
        }
        return km6Var;
    }

    @Override // ot0.h
    public ot0.h a() {
        il4.a aVar = new il4.a();
        aVar.f292092b = this.f292092b;
        aVar.f292093c = this.f292093c;
        aVar.f292094d = this.f292094d;
        aVar.f292095e = this.f292095e;
        return aVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        if (this.f292092b > 0) {
            sb6.append("<tingCategoryItem>");
            sb6.append("<type>");
            sb6.append(this.f292092b);
            sb6.append("</type>");
            sb6.append("<categoryItem>");
            sb6.append(this.f292093c);
            sb6.append("</categoryItem>");
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f292094d)) {
                sb6.append("<categoryId>");
                sb6.append(this.f292094d);
                sb6.append("</categoryId>");
            } else if (this.f292095e != null) {
                sb6.append("<categoryId>");
                java.lang.String c17 = this.f292095e.c();
                if (c17 == null) {
                    c17 = "";
                }
                sb6.append(c17);
                sb6.append("</categoryId>");
            }
            sb6.append("</tingCategoryItem>");
        }
    }

    @Override // ot0.h
    public void d(java.util.Map map, ot0.q qVar) {
        this.f292093c = (java.lang.String) map.get(".msg.appmsg.tingCategoryItem.categoryItem");
        this.f292092b = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".msg.appmsg.tingCategoryItem.type"), 0);
        this.f292094d = (java.lang.String) map.get(".msg.appmsg.tingCategoryItem.categoryId");
        this.f292095e = il4.d.v(this.f292093c);
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f292094d)) {
            bw5.o50 o50Var = this.f292095e;
            this.f292094d = o50Var != null ? o50Var.c() : "";
        }
        com.tencent.mm.sdk.platformtools.t8.G1(qVar.f348654f);
    }
}
