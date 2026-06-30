package lu;

/* loaded from: classes9.dex */
public final class e extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13), true);
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 2, 1);
        v05.b k17 = cVar.k();
        if (k17 == null || (str = k17.getString(k17.f368365d + 2)) == null) {
            str = "";
        }
        recordDataItem.set(i17 + 1, str);
        return true;
    }
}
