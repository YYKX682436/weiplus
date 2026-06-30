package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes10.dex */
public final class q4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI f129720d;

    public q4(com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI finderCropAvatarUI) {
        this.f129720d = finderCropAvatarUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int D1;
        int D12;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderCropAvatarUI finderCropAvatarUI = this.f129720d;
        com.tencent.mm.sdk.platformtools.u3.i(finderCropAvatarUI.G, 300L);
        e60.g1 g1Var = new e60.g1();
        int i17 = finderCropAvatarUI.f128561z;
        boolean z17 = true;
        if (i17 == 1) {
            g1Var.f249703g = ((java.lang.Number) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127814m).getValue()).intValue();
            java.lang.String d17 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderHeadCompressPicLevel");
            if (d17 != null && d17.length() != 0) {
                z17 = false;
            }
            if (z17) {
                D12 = 90;
            } else {
                com.tencent.mars.xlog.Log.i("FinderConfig", "FinderHeadCompressPicLevel=" + d17);
                kotlin.jvm.internal.o.d(d17);
                D12 = com.tencent.mm.sdk.platformtools.t8.D1(r26.n0.u0(d17).toString(), 0);
            }
            g1Var.f249702f = D12;
            g1Var.f249701e = com.tencent.mm.plugin.finder.storage.t70.f127832n;
            g1Var.f249700d = com.tencent.mm.plugin.finder.storage.t70.f127850o;
        } else if (i17 == 2) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            java.lang.String d18 = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("FinderProfileBgImgCompressPicLevel");
            if (d18 != null && d18.length() != 0) {
                z17 = false;
            }
            if (z17) {
                D1 = 70;
            } else {
                com.tencent.mars.xlog.Log.i("FinderConfig", "FinderProfileBgImgCompressPicLevel=" + d18);
                kotlin.jvm.internal.o.d(d18);
                D1 = com.tencent.mm.sdk.platformtools.t8.D1(r26.n0.u0(d18).toString(), 0);
            }
            g1Var.f249702f = D1;
            g1Var.f249701e = t70Var.x();
            g1Var.f249700d = t70Var.w();
        }
        g1Var.a(com.tencent.mm.plugin.finder.assist.e9.f102143l);
        java.lang.String str = finderCropAvatarUI.f128557v;
        if (str == null) {
            str = "default_finder_crop_photo.tmp";
        }
        g1Var.f249698b = str;
        java.lang.String str2 = g1Var.f249697a + g1Var.f249698b;
        ot5.g.c(finderCropAvatarUI.f128555t, "resultPath=" + str2 + " size: " + (com.tencent.mm.vfs.w6.k(finderCropAvatarUI.f128556u) / 1024));
        com.tencent.mm.plugin.gallery.picker.view.WxMediaCropLayout wxMediaCropLayout = finderCropAvatarUI.f128558w;
        if (wxMediaCropLayout == null) {
            kotlin.jvm.internal.o.o("roundCropLayout");
            throw null;
        }
        d33.t0 currentCropInfo = wxMediaCropLayout.getCurrentCropInfo();
        ((d60.y) ((e60.j1) i95.n0.c(e60.j1.class))).getClass();
        z23.h hVar = new z23.h(g1Var);
        java.lang.String str3 = finderCropAvatarUI.f128556u;
        kotlin.jvm.internal.o.d(str3);
        android.graphics.Matrix matrix = currentCropInfo.f226276d;
        android.graphics.Matrix matrix2 = currentCropInfo.f226275c;
        matrix.set(matrix2);
        android.graphics.Rect rect = currentCropInfo.f226278f;
        matrix.postTranslate(0.0f, -rect.top);
        java.util.Objects.toString(matrix2);
        java.util.Objects.toString(matrix);
        java.util.Objects.toString(rect);
        e60.i1.a(hVar, str3, 1, matrix, currentCropInfo.f226278f, currentCropInfo.f226281i, currentCropInfo.f226280h, 0, false, new com.tencent.mm.plugin.finder.ui.p4(finderCropAvatarUI, str2), 128, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderCropAvatarUI$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
