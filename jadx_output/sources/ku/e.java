package ku;

/* loaded from: classes9.dex */
public final class e extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String sb6;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        m15.a aVar = new m15.a();
        int i17 = simpleMsgInfo.f345617d;
        aVar.fromXml(simpleMsgInfo.getString(i17 + 13));
        int o17 = aVar.o();
        java.util.Set set = c01.e2.f37117a;
        boolean D3 = com.tencent.mm.storage.z3.D3(o17);
        int i18 = recordDataItem.f303422d;
        if (D3) {
            recordDataItem.set(i18 + 2, 16);
            recordDataItem.set(i18 + 1, simpleMsgInfo.getString(i17 + 13));
        } else if (com.tencent.mm.storage.z3.m4(aVar.getUsername())) {
            java.lang.String Ni = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).Ni(aVar.s(), "openim_card_type_name", j41.a0.TYPE_WORDING);
            recordDataItem.set(i18 + 2, 1);
            if (Ni == null || r26.n0.N(Ni)) {
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                sb7.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490447vb));
                java.lang.String nickname = aVar.getNickname();
                if (r26.n0.N(nickname)) {
                    nickname = aVar.j();
                    if (r26.n0.N(nickname)) {
                        nickname = aVar.getFromUsername();
                    }
                }
                sb7.append(nickname);
                sb6 = sb7.toString();
            } else {
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[");
                sb8.append(Ni);
                sb8.append(']');
                java.lang.String nickname2 = aVar.getNickname();
                if (r26.n0.N(nickname2)) {
                    nickname2 = aVar.j();
                    if (r26.n0.N(nickname2)) {
                        nickname2 = aVar.getFromUsername();
                    }
                }
                sb8.append(nickname2);
                sb6 = sb8.toString();
            }
            recordDataItem.set(i18 + 1, sb6);
        } else {
            recordDataItem.set(i18 + 2, 1);
            java.lang.StringBuilder sb9 = new java.lang.StringBuilder();
            sb9.append(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f490447vb));
            java.lang.String nickname3 = aVar.getNickname();
            if (r26.n0.N(nickname3)) {
                nickname3 = aVar.j();
                if (r26.n0.N(nickname3)) {
                    nickname3 = aVar.getFromUsername();
                }
            }
            sb9.append(nickname3);
            recordDataItem.set(i18 + 1, sb9.toString());
        }
        return true;
    }
}
