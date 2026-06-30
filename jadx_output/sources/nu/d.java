package nu;

/* loaded from: classes9.dex */
public final class d extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        s15.m mVar;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13));
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 2, 42);
        v05.b k17 = cVar.k();
        if (k17 == null || (mVar = (s15.m) k17.getCustom(k17.f432315e + 71)) == null || (str = mVar.getTitle()) == null) {
            str = "";
        }
        recordDataItem.set(i17 + 0, str);
        v05.b k18 = cVar.k();
        recordDataItem.r0(k18 != null ? (s15.m) k18.getCustom(k18.f432315e + 71) : null);
        return true;
    }
}
