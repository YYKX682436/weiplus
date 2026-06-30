package zy2;

/* loaded from: classes9.dex */
public final class j extends ot0.h {

    /* renamed from: b, reason: collision with root package name */
    public r45.un2 f477426b = new r45.un2();

    @Override // ot0.h
    public ot0.h a() {
        zy2.j jVar = new zy2.j();
        jVar.f477426b = this.f477426b;
        return jVar;
    }

    @Override // ot0.h
    public void c(java.lang.StringBuilder sb6, ot0.q qVar, java.lang.String str, dn.h hVar, int i17, int i18) {
        kotlin.jvm.internal.o.g(sb6, "sb");
        r45.un2 un2Var = this.f477426b;
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        if (un2Var != null) {
            try {
                sb7.append("<finderOrder>");
                sb7.append("<appID>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(un2Var.getString(6)));
                sb7.append("</appID>");
                sb7.append("<orderID>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(un2Var.getString(0)));
                sb7.append("</orderID>");
                sb7.append("<path>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(un2Var.getString(7)));
                sb7.append("</path>");
                sb7.append("<priceWording>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(un2Var.getString(3)));
                sb7.append("</priceWording>");
                sb7.append("<stateWording>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(un2Var.getString(4)));
                sb7.append("</stateWording>");
                sb7.append("<productImageURL>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(un2Var.getString(5)));
                sb7.append("</productImageURL>");
                sb7.append("<products>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(un2Var.getString(1)));
                sb7.append("</products>");
                sb7.append("<productsCount>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(java.lang.Integer.toString(un2Var.getInteger(2))));
                sb7.append("</productsCount>");
                sb7.append("<orderType>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(java.lang.Integer.toString(un2Var.getInteger(8))));
                sb7.append("</orderType>");
                sb7.append("<newPriceWording>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(un2Var.getString(9)));
                sb7.append("</newPriceWording>");
                sb7.append("<newStateWording>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(un2Var.getString(10)));
                sb7.append("</newStateWording>");
                sb7.append("<useNewWording>");
                sb7.append(com.tencent.mm.sdk.platformtools.aa.a(java.lang.Integer.toString(un2Var.getInteger(11))));
                sb7.append("</useNewWording>");
                sb7.append("</finderOrder>");
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.FinderShareParser", "make content error! %s", e17.getMessage());
            }
        }
        sb6.append(sb7.toString());
    }

    @Override // ot0.h
    public void d(java.util.Map values, ot0.q content) {
        kotlin.jvm.internal.o.g(values, "values");
        kotlin.jvm.internal.o.g(content, "content");
        r45.un2 un2Var = new r45.un2();
        try {
            if (!values.isEmpty()) {
                java.lang.String str = (java.lang.String) values.get(".msg.appmsg.finderOrder.productImageURL");
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                java.lang.String str2 = "";
                if (str == null) {
                    str = "";
                }
                un2Var.set(5, str);
                java.lang.String str3 = (java.lang.String) values.get(".msg.appmsg.finderOrder.appID");
                if (str3 == null) {
                    str3 = "";
                }
                un2Var.set(6, str3);
                java.lang.String str4 = (java.lang.String) values.get(".msg.appmsg.finderOrder.path");
                if (str4 == null) {
                    str4 = "";
                }
                un2Var.set(7, str4);
                java.lang.String str5 = (java.lang.String) values.get(".msg.appmsg.finderOrder.products");
                if (str5 == null) {
                    str5 = "";
                }
                un2Var.set(1, str5);
                java.lang.String str6 = (java.lang.String) values.get(".msg.appmsg.finderOrder.orderID");
                if (str6 == null) {
                    str6 = "";
                }
                un2Var.set(0, str6);
                java.lang.String str7 = (java.lang.String) values.get(".msg.appmsg.finderOrder.stateWording");
                if (str7 == null) {
                    str7 = "";
                }
                un2Var.set(4, str7);
                java.lang.String str8 = (java.lang.String) values.get(".msg.appmsg.finderOrder.priceWording");
                if (str8 == null) {
                    str8 = "";
                }
                un2Var.set(3, str8);
                un2Var.set(2, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(".msg.appmsg.finderOrder.productsCount"), 0)));
                un2Var.set(8, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(".msg.appmsg.finderOrder.orderType"), 0)));
                java.lang.String str9 = (java.lang.String) values.get(".msg.appmsg.finderOrder.newPriceWording");
                if (str9 == null) {
                    str9 = "";
                }
                un2Var.set(9, str9);
                java.lang.String str10 = (java.lang.String) values.get(".msg.appmsg.finderOrder.newStateWording");
                if (str10 != null) {
                    str2 = str10;
                }
                un2Var.set(10, str2);
                un2Var.set(11, java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) values.get(".msg.appmsg.finderOrder.useNewWording"), 0)));
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.FinderShareParser", "parse error! %s", e17.getMessage());
        }
        this.f477426b = un2Var;
    }

    public final r45.un2 f() {
        return this.f477426b;
    }
}
