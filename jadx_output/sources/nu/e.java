package nu;

/* loaded from: classes9.dex */
public final class e extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        s15.n nVar;
        java.lang.String j17;
        s15.n nVar2;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13));
        v05.b k17 = cVar.k();
        java.lang.String str2 = "";
        if (k17 == null || (nVar2 = (s15.n) k17.getCustom(k17.f432315e + 59)) == null || (str = nVar2.getTitle()) == null) {
            str = "";
        }
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 0, str);
        v05.b k18 = cVar.k();
        if (k18 != null && (nVar = (s15.n) k18.getCustom(k18.f432315e + 59)) != null && (j17 = nVar.j()) != null) {
            str2 = j17;
        }
        recordDataItem.set(i17 + 1, str2);
        recordDataItem.set(i17 + 2, 28);
        v05.b k19 = cVar.k();
        recordDataItem.t0(k19 != null ? (s15.n) k19.getCustom(k19.f432315e + 59) : null);
        return true;
    }
}
