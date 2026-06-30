package ou;

/* loaded from: classes9.dex */
public final class c extends ku.a {
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
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        java.lang.String str16;
        java.lang.String str17;
        java.lang.String str18;
        java.lang.String str19;
        java.lang.String string;
        e15.c cVar;
        e15.c cVar2;
        e15.c cVar3;
        e15.b bVar;
        e15.b bVar2;
        e15.b bVar3;
        e15.b bVar4;
        e15.b bVar5;
        e15.b bVar6;
        e15.b bVar7;
        e15.b bVar8;
        e15.b bVar9;
        e15.b bVar10;
        e15.b bVar11;
        e15.b bVar12;
        e15.b bVar13;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        int i17 = simpleMsgInfo.f345617d;
        int i18 = simpleMsgInfo.getInteger(i17 + 5) == 92 ? 32 : 29;
        int i19 = recordDataItem.f303422d;
        recordDataItem.set(i19 + 2, java.lang.Integer.valueOf(i18));
        l15.c cVar4 = new l15.c();
        cVar4.fromXml(simpleMsgInfo.getString(i17 + 13));
        v05.b k17 = cVar4.k();
        java.lang.String str20 = "";
        if (k17 == null || (str = k17.getString(k17.f368365d + 2)) == null) {
            str = "";
        }
        recordDataItem.set(i19 + 0, str);
        v05.b k18 = cVar4.k();
        if (k18 == null || (str2 = k18.getString(k18.f368365d + 3)) == null) {
            str2 = "";
        }
        recordDataItem.set(i19 + 1, str2);
        v05.b k19 = cVar4.k();
        if (k19 == null || (str3 = k19.getString(k19.f432315e + 2)) == null) {
            str3 = "";
        }
        recordDataItem.Y0(str3);
        v05.b k27 = cVar4.k();
        if (k27 == null || (str4 = k27.getString(k27.f432315e + 3)) == null) {
            str4 = "";
        }
        recordDataItem.Z0(str4);
        v05.b k28 = cVar4.k();
        if (k28 == null || (str5 = k28.getString(k28.f368365d + 9)) == null) {
            str5 = "";
        }
        recordDataItem.b1(str5);
        v05.b k29 = cVar4.k();
        if (k29 == null || (str6 = k29.getString(k29.f432315e + 46)) == null) {
            str6 = "";
        }
        recordDataItem.O0(str6);
        v05.b k37 = cVar4.k();
        if (k37 == null || (str7 = k37.getString(k37.f432315e + 47)) == null) {
            str7 = "";
        }
        recordDataItem.P0(str7);
        s15.z zVar = new s15.z();
        v05.b k38 = cVar4.k();
        if (k38 == null || (bVar13 = (e15.b) k38.getCustom(k38.f432315e + 49)) == null || (str8 = bVar13.u()) == null) {
            str8 = "";
        }
        zVar.F(str8);
        v05.b k39 = cVar4.k();
        if (k39 == null || (bVar12 = (e15.b) k39.getCustom(k39.f432315e + 49)) == null || (str9 = bVar12.t()) == null) {
            str9 = "";
        }
        zVar.E(str9);
        v05.b k47 = cVar4.k();
        if (k47 == null || (bVar11 = (e15.b) k47.getCustom(k47.f432315e + 49)) == null || (str10 = bVar11.n()) == null) {
            str10 = "";
        }
        zVar.x(str10);
        v05.b k48 = cVar4.k();
        if (k48 == null || (bVar10 = (e15.b) k48.getCustom(k48.f432315e + 49)) == null || (str11 = bVar10.r()) == null) {
            str11 = "";
        }
        zVar.B(str11);
        v05.b k49 = cVar4.k();
        if (k49 == null || (bVar9 = (e15.b) k49.getCustom(k49.f432315e + 49)) == null || (str12 = bVar9.x()) == null) {
            str12 = "";
        }
        zVar.H(str12);
        v05.b k57 = cVar4.k();
        if (k57 == null || (bVar8 = (e15.b) k57.getCustom(k57.f432315e + 49)) == null || (str13 = bVar8.l()) == null) {
            str13 = "";
        }
        zVar.w(str13);
        v05.b k58 = cVar4.k();
        if (k58 == null || (bVar7 = (e15.b) k58.getCustom(k58.f432315e + 49)) == null || (str14 = bVar7.s()) == null) {
            str14 = "";
        }
        zVar.C(str14);
        v05.b k59 = cVar4.k();
        long j17 = 0;
        zVar.A(com.tencent.mm.sdk.platformtools.t8.F1((k59 == null || (bVar6 = (e15.b) k59.getCustom(k59.f432315e + 49)) == null) ? null : bVar6.q(), 0L));
        v05.b k66 = cVar4.k();
        if (k66 == null || (bVar5 = (e15.b) k66.getCustom(k66.f432315e + 49)) == null || (str15 = bVar5.p()) == null) {
            str15 = "";
        }
        zVar.z(str15);
        v05.b k67 = cVar4.k();
        int i27 = 0;
        zVar.u((k67 == null || (bVar4 = (e15.b) k67.getCustom(k67.f432315e + 49)) == null) ? 0 : bVar4.k());
        v05.b k68 = cVar4.k();
        if (k68 == null || (bVar3 = (e15.b) k68.getCustom(k68.f432315e + 49)) == null || (str16 = bVar3.o()) == null) {
            str16 = "";
        }
        zVar.y(str16);
        v05.b k69 = cVar4.k();
        if (k69 == null || (bVar2 = (e15.b) k69.getCustom(k69.f432315e + 49)) == null || (str17 = bVar2.w()) == null) {
            str17 = "";
        }
        zVar.G(str17);
        v05.b k76 = cVar4.k();
        if (k76 == null || (bVar = (e15.b) k76.getCustom(k76.f432315e + 49)) == null || (str18 = bVar.j()) == null) {
            str18 = "";
        }
        zVar.t(str18);
        recordDataItem.J0(zVar);
        s15.g0 g0Var = new s15.g0();
        v05.b k77 = cVar4.k();
        if (k77 == null || (cVar3 = (e15.c) k77.getCustom(k77.f432315e + 48)) == null || (str19 = cVar3.k()) == null) {
            str19 = "";
        }
        g0Var.n(str19);
        v05.b k78 = cVar4.k();
        if (k78 != null && (cVar2 = (e15.c) k78.getCustom(k78.f432315e + 48)) != null) {
            i27 = cVar2.getType();
        }
        g0Var.o(i27);
        v05.b k79 = cVar4.k();
        if (k79 != null && (cVar = (e15.c) k79.getCustom(k79.f432315e + 48)) != null) {
            j17 = cVar.j();
        }
        g0Var.l(java.lang.String.valueOf(j17));
        recordDataItem.g1(g0Var);
        if (recordDataItem.getInteger(i19 + 2) != 32) {
            return true;
        }
        v05.b k86 = cVar4.k();
        if (k86 != null && (string = k86.getString(k86.f432315e + 46)) != null) {
            str20 = string;
        }
        recordDataItem.set(i19 + 12, str20);
        return true;
    }
}
