package lu;

/* loaded from: classes9.dex */
public final class b extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 2, 1);
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490517xd);
        kotlin.jvm.internal.o.f(g17, "getString(...)");
        recordDataItem.set(i17 + 1, g17);
        return true;
    }
}
