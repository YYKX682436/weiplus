package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class c10 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f133948d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c10(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        super(1);
        this.f133948d = baseFinderFeed;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f133948d;
        if (baseFinderFeed.getFeedObject().isLiveFeed()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String str = "";
            if (list != null) {
                java.util.Iterator it = list.iterator();
                while (it.hasNext()) {
                    str = str + ((java.lang.String) it.next()) + ';';
                }
            }
            if (r26.i0.o(str, ";", false, 2, null)) {
                str = str.substring(0, str.length() - 1);
                kotlin.jvm.internal.o.f(str, "substring(...)");
            }
            jSONObject.put("share_username", str);
            vs5.a aVar = vs5.a.f439924a;
            r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
            aVar.a(java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null), java.lang.String.valueOf(baseFinderFeed.getFeedObject().getFeedObject().getId()), baseFinderFeed.getFeedObject().getFeedObject().getUsername(), com.tencent.mm.plugin.finder.convert.zf.D1, "1", "0", (i17 & 64) != 0 ? null : jSONObject, (i17 & 128) != 0 ? "" : null);
        }
        return jz5.f0.f302826a;
    }
}
