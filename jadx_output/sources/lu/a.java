package lu;

/* loaded from: classes9.dex */
public final class a extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String str;
        java.lang.String str2;
        s05.d dVar;
        java.lang.String str3;
        s05.d dVar2;
        s05.d dVar3;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        cVar.fromXml(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13));
        v05.b k17 = cVar.k();
        boolean z17 = (k17 == null || (dVar3 = (s05.d) k17.getCustom(k17.f432315e + 39)) == null || dVar3.getType() != 3) ? false : true;
        int i17 = recordDataItem.f303422d;
        if (!z17) {
            v05.b k18 = cVar.k();
            if (!((k18 == null || (dVar2 = (s05.d) k18.getCustom(k18.f432315e + 39)) == null || dVar2.k() != 1) ? false : true)) {
                recordDataItem.set(i17 + 2, 19);
                v05.b k19 = cVar.k();
                if (k19 == null || (str = k19.getString(k19.f368365d + 2)) == null) {
                    str = "";
                }
                recordDataItem.set(i17 + 0, str);
                v05.b k27 = cVar.k();
                if (k27 == null || (str2 = k27.getString(k27.f368365d + 3)) == null) {
                    str2 = "";
                }
                recordDataItem.set(i17 + 1, str2);
                v05.b k28 = cVar.k();
                if (k28 != null && (dVar = (s05.d) k28.getCustom(k28.f432315e + 39)) != null) {
                    s15.e eVar = new s15.e();
                    java.lang.String y17 = dVar.y();
                    if (y17 == null) {
                        y17 = "";
                    }
                    recordDataItem.g0(y17);
                    java.lang.String y18 = dVar.y();
                    if (y18 == null) {
                        y18 = "";
                    }
                    eVar.z(y18);
                    java.lang.String appId = dVar.getAppId();
                    if (appId == null) {
                        appId = "";
                    }
                    eVar.o(appId);
                    s05.e q17 = dVar.q();
                    eVar.t(q17 != null ? q17.getType() : 0);
                    java.lang.String B = dVar.B();
                    if (B == null) {
                        B = "";
                    }
                    eVar.q(B);
                    eVar.y(dVar.getType());
                    java.lang.String p17 = dVar.p();
                    if (p17 == null) {
                        p17 = "";
                    }
                    eVar.s(p17);
                    v05.b k29 = cVar.k();
                    if (k29 == null || (str3 = k29.getString(k29.f432315e + 12)) == null) {
                        str3 = "";
                    }
                    eVar.w(str3);
                    eVar.A(dVar.getVersion());
                    eVar.p(dVar.k());
                    eVar.u(dVar.x());
                    java.lang.String n17 = dVar.n();
                    eVar.r(n17 != null ? n17 : "");
                    eVar.x(dVar.getSubType());
                    recordDataItem.e0(eVar);
                }
                return true;
            }
        }
        recordDataItem.set(i17 + 2, 1);
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490482wb);
        kotlin.jvm.internal.o.f(g17, "getString(...)");
        recordDataItem.set(i17 + 1, g17);
        return true;
    }
}
