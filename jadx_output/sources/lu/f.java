package lu;

/* loaded from: classes9.dex */
public final class f extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        java.lang.String appId;
        java.lang.String string;
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        l15.c cVar = new l15.c();
        int i17 = simpleMsgInfo.f345617d;
        cVar.fromXml(simpleMsgInfo.getString(i17 + 13));
        v05.b k17 = cVar.k();
        java.lang.String str = "";
        if (k17 == null || (appId = k17.getString(k17.f368365d + 0)) == null) {
            l15.b j17 = cVar.j();
            appId = j17 != null ? j17.getAppId() : null;
            if (appId == null) {
                appId = "";
            }
        }
        recordDataItem.f0(appId);
        v05.b k18 = cVar.k();
        if (k18 != null && (string = k18.getString(k18.f432315e + 11)) != null) {
            str = string;
        }
        recordDataItem.g0(str);
        v05.b k19 = cVar.k();
        if (k19 != null && k19.getInteger(k19.f432315e + 1) == 1) {
            new ku.j().a(simpleMsgInfo, recordDataItem);
            return true;
        }
        java.lang.Class cls = (java.lang.Class) ((java.util.HashMap) ((jz5.n) ((ot.q) i95.n0.c(ot.q.class)).f348329n).getValue()).get(java.lang.Integer.valueOf(simpleMsgInfo.getInteger(i17 + 5)));
        if (cls != null) {
            java.lang.Object newInstance = cls.getConstructors()[0].newInstance(new java.lang.Object[0]);
            kotlin.jvm.internal.o.e(newInstance, "null cannot be cast to non-null type com.tencent.mm.feature.appmsg.record.IAppMsgRecordBuildXmlApi");
            return ((gu.e) newInstance).a(simpleMsgInfo, recordDataItem);
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String appId2 = recordDataItem.getAppId();
        ((kt.c) i0Var).getClass();
        com.tencent.mm.pluginsdk.model.app.m h17 = com.tencent.mm.pluginsdk.model.app.w.h(appId2);
        if (h17 == null || !h17.k()) {
            new ku.j().a(simpleMsgInfo, recordDataItem);
            return true;
        }
        int i18 = recordDataItem.f303422d;
        recordDataItem.set(i18 + 2, 1);
        java.lang.String g17 = com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490448vc);
        kotlin.jvm.internal.o.f(g17, "getString(...)");
        recordDataItem.set(i18 + 1, g17);
        return true;
    }
}
