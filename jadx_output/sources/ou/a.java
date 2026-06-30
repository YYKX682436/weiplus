package ou;

/* loaded from: classes9.dex */
public final class a extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String string;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13));
        v05.b k17 = cVar.k();
        java.lang.String str7 = "";
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
        recordDataItem.set(i17 + 2, 7);
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
        v05.b k29 = cVar.k();
        if (k29 == null || (str6 = k29.getString(k29.f432315e + 46)) == null) {
            str6 = "";
        }
        recordDataItem.O0(str6);
        v05.b k37 = cVar.k();
        if (k37 != null && (string = k37.getString(k37.f432315e + 47)) != null) {
            str7 = string;
        }
        recordDataItem.P0(str7);
        return true;
    }
}
