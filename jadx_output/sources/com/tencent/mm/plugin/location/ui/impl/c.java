package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class c implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.a f144757a;

    public c(com.tencent.mm.plugin.location.ui.impl.a aVar) {
        this.f144757a = aVar;
    }

    @Override // u60.e
    public void onLocationAddr(com.tencent.mm.modelgeo.Addr addr) {
        addr.toString();
        com.tencent.mm.plugin.location.ui.impl.a aVar = this.f144757a;
        aVar.getClass();
        java.lang.String b17 = addr.b();
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = aVar.f144732h;
        android.content.res.Resources resources = aVar.f144728d.getResources();
        aVar.getClass();
        locationInfo.f144591m = resources.getString(com.tencent.mm.R.string.ggg);
        java.lang.Object obj = addr.f71227w;
        if (obj != null && obj.equals(aVar.f144732h.f144585d)) {
            aVar.f144732h.f144589h = b17;
        } else if (!com.tencent.mm.sdk.platformtools.t8.K0(addr.f71211d)) {
            aVar.f144733i.f144799a.setVisibility(0);
        }
        java.lang.Object obj2 = addr.f71227w;
        if (obj2 == null || !aVar.f144734m.containsKey(obj2)) {
            return;
        }
        za3.c cVar = (za3.c) aVar.f144734m.get(addr.f71227w);
        cVar.setText(cVar.getPreText() + b17);
    }
}
