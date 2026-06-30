package ku;

/* loaded from: classes9.dex */
public final class h extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 2, 31);
        j41.y yVar = (j41.y) i95.n0.c(j41.y.class);
        int i18 = simpleMsgInfo.f345617d;
        java.lang.String string = simpleMsgInfo.getString(i18 + 13);
        ((l41.b2) yVar).getClass();
        k41.k0 b17 = k41.o0.b(string);
        if (b17 == null || (str = b17.a()) == null) {
            str = "";
        }
        recordDataItem.set(i17 + 0, str);
        recordDataItem.set(i17 + 1, simpleMsgInfo.getString(i18 + 13));
        return true;
    }
}
