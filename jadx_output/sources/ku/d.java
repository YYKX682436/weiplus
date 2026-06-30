package ku;

/* loaded from: classes9.dex */
public final class d extends ku.a {

    /* renamed from: a, reason: collision with root package name */
    public static final ku.c f312059a = new ku.c(null);

    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        java.lang.String string;
        s05.d dVar;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13));
        v05.b k17 = cVar.k();
        boolean z17 = k17 != null && k17.getInteger(k17.f368365d + 6) == 44;
        int i17 = recordDataItem.f303422d;
        if (z17) {
            v05.b k18 = cVar.k();
            if ((k18 == null || (dVar = (s05.d) k18.getCustom(k18.f432315e + 39)) == null || dVar.k() != 1) ? false : true) {
                recordDataItem.set(i17 + 2, 1);
                recordDataItem.set(i17 + 1, f312059a.a(cVar));
                return true;
            }
        }
        v05.b k19 = cVar.k();
        recordDataItem.set(i17 + 2, java.lang.Integer.valueOf((k19 != null ? k19.getInteger(k19.f368365d + 6) : 0) + 10000));
        v05.b k27 = cVar.k();
        java.lang.String str2 = "";
        if (k27 == null || (str = k27.getString(k27.f368365d + 2)) == null) {
            str = "";
        }
        recordDataItem.set(i17 + 0, str);
        v05.b k28 = cVar.k();
        if (k28 != null && (string = k28.getString(k28.f368365d + 3)) != null) {
            str2 = string;
        }
        recordDataItem.set(i17 + 1, str2);
        recordDataItem.V0(cVar.toXml());
        return true;
    }
}
