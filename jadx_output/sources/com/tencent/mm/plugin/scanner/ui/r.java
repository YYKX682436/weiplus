package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes15.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.MusicPreference f159618d;

    public r(com.tencent.mm.plugin.scanner.ui.MusicPreference musicPreference) {
        this.f159618d = musicPreference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/scanner/ui/MusicPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.scanner.ui.MusicPreference musicPreference = this.f159618d;
        if (musicPreference.T == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/MusicPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.l2t) {
            int i17 = 0;
            if (musicPreference.N) {
                musicPreference.N = false;
                musicPreference.M.setImageResource(com.tencent.mm.R.drawable.auw);
            } else {
                musicPreference.N = true;
                musicPreference.M.setImageResource(com.tencent.mm.R.drawable.auy);
            }
            com.tencent.mm.plugin.scanner.ui.m0 m0Var = (com.tencent.mm.plugin.scanner.ui.m0) musicPreference.T;
            m0Var.getClass();
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(musicPreference.Q);
            com.tencent.mm.plugin.scanner.ui.ProductUI productUI = m0Var.f159589a;
            if (K0 && com.tencent.mm.sdk.platformtools.t8.K0(musicPreference.R)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.scanner.ProductUI", "wifiurl = null,  wapurl = null");
                if (!com.tencent.mm.sdk.platformtools.t8.K0(musicPreference.S)) {
                    java.lang.String str = musicPreference.S;
                    int i18 = com.tencent.mm.plugin.scanner.ui.ProductUI.S;
                    productUI.g7(str);
                }
            } else {
                java.lang.String format = java.lang.String.format("%s_cd_%s", musicPreference.Q, musicPreference.f197780q);
                int i19 = com.tencent.mm.plugin.scanner.ui.ProductUI.S;
                if (productUI.c7(format)) {
                    b21.m.j();
                } else if (musicPreference.f197774h == null) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.scanner.ProductUI", "onPlayBtnClick, getTitle() == null");
                } else {
                    com.tencent.mm.plugin.scanner.ui.b1 b1Var = productUI.f159328z;
                    java.lang.String k17 = b1Var == null ? null : b1Var.k();
                    java.lang.String format2 = java.lang.String.format("%s_cd_%s", musicPreference.Q, musicPreference.f197780q);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it = ((java.util.ArrayList) productUI.P).iterator();
                    int i27 = -1;
                    while (it.hasNext()) {
                        com.tencent.mm.plugin.scanner.ui.MusicPreference musicPreference2 = (com.tencent.mm.plugin.scanner.ui.MusicPreference) it.next();
                        java.lang.String format3 = java.lang.String.format("%s_cd_%s", musicPreference2.Q, musicPreference2.f197780q);
                        int i28 = format2.equals(format3) ? i17 : i27;
                        arrayList2.add(b21.s.a(5, k17, musicPreference2.f197774h.toString(), "", musicPreference2.S, musicPreference2.R, musicPreference2.Q, format3, gm0.j1.u().d(), k17, "", "wx482a4001c37e2b74"));
                        i17++;
                        i27 = i28;
                    }
                    if (i27 >= 0) {
                        com.tencent.mm.sdk.platformtools.u3.h(new b21.l(arrayList2, i27));
                    }
                }
                productUI.e7();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/scanner/ui/MusicPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
