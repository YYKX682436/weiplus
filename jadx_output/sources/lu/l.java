package lu;

/* loaded from: classes9.dex */
public final class l extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        r05.a aVar;
        java.lang.String j17;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13));
        v05.b k17 = cVar.k();
        java.lang.String str9 = "";
        if (k17 == null || (str = k17.getString(k17.f368365d + 2)) == null) {
            str = "";
        }
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 0, str);
        v05.b k18 = cVar.k();
        if (k18 == null || (str2 = k18.getString(k18.f368365d + 3)) == null) {
            str2 = "";
        }
        recordDataItem.set(i17 + 1, str2);
        recordDataItem.set(i17 + 2, 5);
        v05.b k19 = cVar.k();
        if (k19 == null || (str3 = k19.getString(k19.f432315e + 2)) == null) {
            str3 = "";
        }
        recordDataItem.Y0(str3);
        v05.b k27 = cVar.k();
        if (k27 == null || (str4 = k27.getString(k27.f432315e + 3)) == null) {
            str4 = "";
        }
        recordDataItem.Z0(str4);
        v05.b k28 = cVar.k();
        if (k28 == null || (str5 = k28.getString(k28.f368365d + 9)) == null) {
            str5 = "";
        }
        recordDataItem.b1(str5);
        s15.h0 h0Var = new s15.h0();
        v05.b k29 = cVar.k();
        if (k29 == null || (str6 = k29.getString(k29.f368365d + 2)) == null) {
            str6 = "";
        }
        h0Var.y(str6);
        v05.b k37 = cVar.k();
        if (k37 == null || (str7 = k37.getString(k37.f368365d + 3)) == null) {
            str7 = "";
        }
        h0Var.q(str7);
        v05.b k38 = cVar.k();
        if (k38 == null || (str8 = k38.getString(k38.f432315e + 14)) == null) {
            str8 = "";
        }
        h0Var.x(str8);
        v05.b k39 = cVar.k();
        h0Var.s(k39 != null ? k39.getInteger(k39.f432315e + 1) : 0);
        if ((!r26.n0.N(h0Var.getTitle())) || (!r26.n0.N(h0Var.j())) || (!r26.n0.N(h0Var.o())) || h0Var.l() != 0) {
            h0Var.u(1);
        }
        o72.t3 t3Var = (o72.t3) i95.n0.c(o72.t3.class);
        v05.b k47 = cVar.k();
        if (k47 != null && (aVar = (r05.a) k47.getCustom(k47.f432315e + 7)) != null && (j17 = aVar.j()) != null) {
            str9 = j17;
        }
        h0Var.r(((com.tencent.mm.pluginsdk.model.l0) t3Var).wi(str9));
        recordDataItem.n1(h0Var);
        return true;
    }
}
