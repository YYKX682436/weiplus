package mu;

/* loaded from: classes9.dex */
public final class a extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        u05.a aVar;
        java.lang.String string;
        u05.a aVar2;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13));
        v05.b k17 = cVar.k();
        int integer = k17 != null ? k17.getInteger(k17.f368365d + 6) : 0;
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 2, java.lang.Integer.valueOf(integer + 10000));
        v05.b k18 = cVar.k();
        java.lang.String str2 = "";
        if (k18 == null || (aVar2 = (u05.a) k18.getCustom(k18.f432315e + 60)) == null || (str = aVar2.getNickname()) == null) {
            str = "";
        }
        recordDataItem.set(i17 + 0, str);
        v05.b k19 = cVar.k();
        if (k19 != null && (string = k19.getString(k19.f368365d + 3)) != null) {
            str2 = string;
        }
        recordDataItem.set(i17 + 1, str2);
        recordDataItem.V0(cVar.toXml());
        v05.b k27 = cVar.k();
        if (k27 != null && (aVar = (u05.a) k27.getCustom(k27.f432315e + 60)) != null) {
            s15.b0 b0Var = new s15.b0();
            b0Var.o(aVar.getUsername());
            b0Var.n(aVar.getNickname());
            b0Var.j(aVar.k());
            b0Var.l(aVar.n());
            b0Var.k(aVar.l());
            recordDataItem.K0(b0Var);
        }
        return true;
    }
}
