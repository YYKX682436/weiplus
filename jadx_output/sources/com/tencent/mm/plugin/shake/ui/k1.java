package com.tencent.mm.plugin.shake.ui;

/* loaded from: classes9.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j34.i f162290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.shake.ui.TVInfoUI f162291e;

    public k1(com.tencent.mm.plugin.shake.ui.TVInfoUI tVInfoUI, j34.i iVar) {
        this.f162291e = tVInfoUI;
        this.f162290d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList;
        com.tencent.mm.ui.base.preference.r rVar;
        java.util.LinkedList linkedList2;
        int i17 = com.tencent.mm.plugin.shake.ui.TVInfoUI.f162223q;
        com.tencent.mm.plugin.shake.ui.TVInfoUI tVInfoUI = this.f162291e;
        tVInfoUI.getClass();
        j34.i iVar = this.f162290d;
        if (iVar != null && (linkedList = iVar.f297494a) != null && linkedList.size() != 0 && (rVar = tVInfoUI.f162224d) != null) {
            ((com.tencent.mm.ui.base.preference.h0) rVar).t();
            for (int i18 = 0; i18 < iVar.f297494a.size(); i18++) {
                j34.g gVar = (j34.g) iVar.f297494a.get(i18);
                if (gVar != null && (linkedList2 = gVar.f297491a) != null && linkedList2.size() != 0) {
                    for (int i19 = 0; i19 < gVar.f297491a.size(); i19++) {
                        java.lang.String str = "" + ((i18 * 100) + i19);
                        j34.f fVar = (j34.f) gVar.f297491a.get(i19);
                        if (fVar.f297484a == 2) {
                            com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(tVInfoUI);
                            preference.C(str);
                            preference.G = com.tencent.mm.R.layout.d2h;
                            preference.L(com.tencent.mm.sdk.platformtools.t8.K0(fVar.f297485b) ? tVInfoUI.getResources().getString(com.tencent.mm.R.string.j3s) : fVar.f297485b);
                            preference.H(java.lang.String.format(tVInfoUI.getResources().getString(com.tencent.mm.R.string.j3r), 108));
                        } else {
                            java.util.List list = fVar.f297488e;
                            if (list != null) {
                                java.util.ArrayList arrayList = (java.util.ArrayList) list;
                                if (arrayList.size() > 0) {
                                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                                    for (int i27 = 0; i27 < arrayList.size() && i27 < 3 && (i27 != 2 || fVar.f297485b.length() <= 4); i27++) {
                                        arrayList2.add((java.lang.String) arrayList.get(i27));
                                    }
                                    com.tencent.mm.plugin.shake.ui.TVThumbPreference tVThumbPreference = new com.tencent.mm.plugin.shake.ui.TVThumbPreference(tVInfoUI, null);
                                    tVThumbPreference.C(str);
                                    tVThumbPreference.Q = arrayList2;
                                    tVThumbPreference.L(fVar.f297485b);
                                    com.tencent.mm.ui.base.preference.r rVar2 = tVInfoUI.f162224d;
                                    tVThumbPreference.P = rVar2;
                                    ((com.tencent.mm.ui.base.preference.h0) rVar2).d(tVThumbPreference, -1);
                                }
                            }
                            com.tencent.mm.ui.base.preference.Preference preference2 = new com.tencent.mm.ui.base.preference.Preference(tVInfoUI);
                            preference2.C(str);
                            preference2.G = com.tencent.mm.R.layout.d2h;
                            preference2.L(fVar.f297485b);
                            preference2.H(fVar.f297486c);
                            ((com.tencent.mm.ui.base.preference.h0) tVInfoUI.f162224d).d(preference2, -1);
                        }
                    }
                }
            }
            ((com.tencent.mm.ui.base.preference.h0) tVInfoUI.f162224d).notifyDataSetChanged();
        }
        tVInfoUI.getClass();
        if (iVar == null || com.tencent.mm.sdk.platformtools.t8.K0(iVar.field_thumburl)) {
            return;
        }
        j34.h hVar = new j34.h(iVar);
        tVInfoUI.f162232o = hVar;
        tVInfoUI.f162226f = hVar.c();
        y60.f fVar2 = (y60.f) i95.n0.c(y60.f.class);
        j34.h hVar2 = tVInfoUI.f162232o;
        ((x60.e) fVar2).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(hVar2);
        if (d17 == null) {
            tVInfoUI.f162225e.setImageDrawable(tVInfoUI.getResources().getDrawable(com.tencent.mm.R.raw.tv_info_thumb_default));
            return;
        }
        tVInfoUI.f162225e.setImageBitmap(d17);
        tVInfoUI.f162233p = true;
        tVInfoUI.X6();
    }
}
