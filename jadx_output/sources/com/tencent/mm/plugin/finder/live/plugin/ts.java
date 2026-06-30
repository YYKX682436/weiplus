package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ts implements w25.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f114473d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f114474e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f114475f;

    public ts(com.tencent.mm.plugin.finder.live.plugin.et etVar, float f17, float f18) {
        this.f114473d = etVar;
        this.f114474e = f17;
        this.f114475f = f18;
    }

    @Override // w25.e
    public void i3(java.lang.String str, java.util.List list) {
        bm2.m3 m3Var;
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f114473d;
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
            return;
        }
        etVar.f112447l1 = com.tencent.mm.plugin.finder.assist.n3.f102399a.e(list != null ? (r45.c64) kz5.n0.Z(list) : null, this.f114474e, this.f114475f, str);
        r45.ze2 ze2Var = etVar.f112447l1;
        if (ze2Var == null || (m3Var = etVar.L) == null) {
            return;
        }
        m3Var.y(ze2Var);
    }
}
