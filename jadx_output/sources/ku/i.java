package ku;

/* loaded from: classes9.dex */
public final class i extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 2, 1);
        int i18 = simpleMsgInfo.f345617d;
        int i19 = i17 + 1;
        recordDataItem.set(i19, simpleMsgInfo.getString(i18 + 13));
        java.lang.String string = simpleMsgInfo.getString(i18 + 12);
        int i27 = com.tencent.mm.storage.f9.f193926r2;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(string) && string.contains("announcement@all")) {
            recordDataItem.set(i19, com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490349ml3) + '\n' + recordDataItem.getString(i19));
        }
        return true;
    }
}
