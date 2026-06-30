package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class qr implements w25.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f114040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f114041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f114042f;

    public qr(com.tencent.mm.plugin.finder.live.plugin.et etVar, float f17, float f18) {
        this.f114040d = etVar;
        this.f114041e = f17;
        this.f114042f = f18;
    }

    @Override // w25.e
    public void i3(java.lang.String str, java.util.List list) {
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f114040d;
        if (!etVar.f112450p1) {
            com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", "getPoiCityInfo: mounted = false");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getPoiCityInfo: onGetLbsLifes, city:");
        sb6.append(str);
        sb6.append(", list size:");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        com.tencent.mars.xlog.Log.i("Finder.LiveInputPlugin", sb6.toString());
        if (str == null || str.length() == 0) {
            com.tencent.mm.plugin.finder.live.plugin.et.w1(etVar);
            return;
        }
        etVar.f112447l1 = com.tencent.mm.plugin.finder.assist.n3.f102399a.e(list != null ? (r45.c64) kz5.n0.Z(list) : null, this.f114041e, this.f114042f, str);
        etVar.getClass();
        r45.ze2 ze2Var = etVar.f112447l1;
        if (ze2Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.et.u1(etVar, ze2Var);
        } else {
            com.tencent.mm.plugin.finder.live.plugin.et.w1(etVar);
        }
    }
}
