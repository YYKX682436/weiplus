package nu;

/* loaded from: classes9.dex */
public final class i extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        x05.c cVar;
        x05.c cVar2;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar3 = new l15.c();
        cVar3.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13));
        v05.b k17 = cVar3.k();
        if (k17 == null || (cVar2 = (x05.c) k17.getCustom(k17.f432315e + 57)) == null || (str = cVar2.getNickname()) == null) {
            str = "";
        }
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 0, str);
        recordDataItem.set(i17 + 2, 26);
        v05.b k18 = cVar3.k();
        if (k18 == null || (cVar = (x05.c) k18.getCustom(k18.f432315e + 57)) == null) {
            return true;
        }
        s15.s sVar = new s15.s();
        java.lang.String username = cVar.getUsername();
        if (username == null) {
            username = "";
        }
        sVar.t(username);
        java.lang.String nickname = cVar.getNickname();
        if (nickname == null) {
            nickname = "";
        }
        sVar.s(nickname);
        java.lang.String l17 = cVar.l();
        if (l17 == null) {
            l17 = "";
        }
        sVar.q(l17);
        java.lang.String k19 = cVar.k();
        if (k19 == null) {
            k19 = "";
        }
        sVar.p(k19);
        sVar.o(cVar.j());
        java.lang.String o17 = cVar.o();
        sVar.r(o17 != null ? o17 : "");
        recordDataItem.z0(sVar);
        return true;
    }
}
