package nu;

/* loaded from: classes9.dex */
public final class g extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        w05.b bVar;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490589za));
        v05.b k17 = cVar.k();
        if (k17 == null || (bVar = (w05.b) k17.getCustom(k17.f432315e + 54)) == null || (str = bVar.G()) == null) {
            str = "";
        }
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 1, sb7);
        recordDataItem.set(i17 + 2, 40);
        v05.b k18 = cVar.k();
        recordDataItem.w0(k18 != null ? (s15.a) k18.getCustom(k18.f432315e + 67) : null);
        return true;
    }
}
