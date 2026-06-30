package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class a0 implements u60.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.PickPoi f144747a;

    public a0(com.tencent.mm.plugin.location.ui.impl.PickPoi pickPoi) {
        this.f144747a = pickPoi;
    }

    @Override // u60.e
    public void onLocationAddr(com.tencent.mm.modelgeo.Addr addr) {
        addr.toString();
        com.tencent.mm.plugin.location.ui.impl.PickPoi pickPoi = this.f144747a;
        com.tencent.mm.plugin.location.ui.impl.d0 d0Var = pickPoi.f144706h;
        if (d0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PickPoi", "error, empty poi!");
            return;
        }
        if (!d0Var.a(addr) || pickPoi.f144708m == null) {
            return;
        }
        com.tencent.mm.plugin.location.ui.impl.v1 v1Var = pickPoi.f144710o;
        if (v1Var != null) {
            com.tencent.mm.plugin.location.ui.impl.d0 d0Var2 = pickPoi.f144706h;
            com.tencent.mm.plugin.location.ui.impl.x1 x1Var = ((com.tencent.mm.plugin.location.ui.impl.r1) v1Var).f144891a;
            x1Var.f144924n.setOnCurPoiGet(null);
            if (d0Var2 != null) {
                com.tencent.mm.modelgeo.Addr addr2 = d0Var2.f144784j;
                com.tencent.mm.plugin.location.ui.impl.d0 d0Var3 = x1Var.L1;
                d0Var3.a(addr2);
                com.tencent.mm.plugin.location.ui.impl.c0 c0Var = x1Var.f144931s;
                if (c0Var != null) {
                    java.lang.String str = d0Var3.f144780f;
                    java.lang.String str2 = d0Var3.f144781g;
                    c0Var.f144769r = str;
                    c0Var.f144770s = str2;
                    com.tencent.mm.plugin.location.ui.impl.c0 c0Var2 = x1Var.f144932t;
                    c0Var2.f144769r = str;
                    c0Var2.f144770s = str2;
                }
            }
        }
        pickPoi.f144708m.notifyDataSetChanged();
    }
}
