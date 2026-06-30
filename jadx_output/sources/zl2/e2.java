package zl2;

/* loaded from: classes2.dex */
public final class e2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f473733d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f473734e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed, java.lang.String str) {
        super(1);
        this.f473733d = baseFinderFeed;
        this.f473734e = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
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
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f473733d;
        r45.nw1 liveInfo = baseFinderFeed.getFeedObject().getLiveInfo();
        aVar.a(java.lang.String.valueOf(liveInfo != null ? java.lang.Long.valueOf(liveInfo.getLong(0)) : null), java.lang.String.valueOf(baseFinderFeed.getFeedObject().getFeedObject().getId()), baseFinderFeed.getFeedObject().getFeedObject().getUsername(), this.f473734e, "1", "1", (i17 & 64) != 0 ? null : jSONObject, (i17 & 128) != 0 ? "" : null);
        return jz5.f0.f302826a;
    }
}
