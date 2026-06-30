package xc5;

/* loaded from: classes12.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.y0 f453534d;

    public m0(xc5.y0 y0Var) {
        this.f453534d = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        mf3.k kVar;
        vf3.a aVar;
        vf3.f X6;
        mf3.k kVar2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryLiveBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        xc5.y0 y0Var = this.f453534d;
        mf3.s sVar = y0Var.f326110m;
        if (sVar != null && (kVar = sVar.f326117a) != null && (aVar = (vf3.a) y0Var.H(vf3.a.class)) != null && (X6 = ((vf3.i) aVar).X6(kVar)) != null) {
            vf3.e eVar = X6.f436389a;
            vf3.e eVar2 = vf3.e.f436380g;
            if (eVar == eVar2) {
                mf3.w level = kVar.getLevel();
                mf3.w wVar = mf3.w.f326129e;
                if (level == wVar) {
                    y0Var.Q("cancelDownloadHD", new java.lang.Object[0]);
                    mf3.s sVar2 = y0Var.f326110m;
                    if (sVar2 != null && (kVar2 = sVar2.f326117a) != null && kVar2.getLevel() == wVar) {
                        y0Var.Q("cancelDownload execute", new java.lang.Object[0]);
                        vf3.a aVar2 = (vf3.a) y0Var.H(vf3.a.class);
                        if (aVar2 != null) {
                            aVar2.x6(kVar2);
                        }
                    }
                    lg3.a aVar3 = y0Var.f453594w;
                    if (aVar3 != null) {
                        ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar3).h(kVar, new vf3.f(vf3.e.f436377d, null, 0, 0.0f, 14, null));
                    }
                }
            }
            if (X6.f436389a != eVar2 || kVar.getLevel() != mf3.w.f326128d) {
                y0Var.Q("tryDownloadHD", new java.lang.Object[0]);
                y0Var.m0();
            } else if (y0Var.f453597z) {
                y0Var.Q("cancel wait for downloadHD", new java.lang.Object[0]);
                lg3.a aVar4 = y0Var.f453594w;
                if (aVar4 != null) {
                    ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar4).h(kVar, new vf3.f(vf3.e.f436377d, null, 0, 0.0f, 14, null));
                }
                y0Var.f453597z = false;
            } else {
                y0Var.Q("try wait for downloadHD", new java.lang.Object[0]);
                lg3.a aVar5 = y0Var.f453594w;
                if (aVar5 != null) {
                    ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar5).h(kVar, new vf3.f(vf3.e.f436379f, null, 0, 0.0f, 6, null));
                }
                y0Var.f453597z = true;
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/gallery/MsgHistoryGalleryLiveBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
