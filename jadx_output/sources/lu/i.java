package lu;

/* loaded from: classes9.dex */
public final class i extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13), true);
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 2, 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490430uv));
        java.lang.String wi6 = ((bf5.o) ((e40.u) i95.n0.c(e40.u.class))).wi(cVar.k());
        if (wi6 == null) {
            wi6 = "";
        }
        sb6.append(wi6);
        recordDataItem.set(i17 + 1, sb6.toString());
        return true;
    }
}
