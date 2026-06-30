package wh5;

/* loaded from: classes12.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wh5.s f446061d;

    public g(wh5.s sVar) {
        this.f446061d = sVar;
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
        yj0.a.b("com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wh5.s sVar = this.f446061d;
        mf3.s sVar2 = sVar.f326110m;
        if (sVar2 != null && (kVar = sVar2.f326117a) != null && (aVar = (vf3.a) sVar.H(vf3.a.class)) != null && (X6 = ((vf3.i) aVar).X6(kVar)) != null) {
            vf3.e eVar = X6.f436389a;
            vf3.e eVar2 = vf3.e.f436380g;
            if (eVar == eVar2) {
                mf3.w level = kVar.getLevel();
                mf3.w wVar = mf3.w.f326129e;
                if (level == wVar) {
                    sVar.Q("cancelDownloadHD", new java.lang.Object[0]);
                    mf3.s sVar3 = sVar.f326110m;
                    if (sVar3 != null && (kVar2 = sVar3.f326117a) != null && kVar2.getLevel() == wVar) {
                        sVar.Q("cancelDownload execute", new java.lang.Object[0]);
                        vf3.a aVar2 = (vf3.a) sVar.H(vf3.a.class);
                        if (aVar2 != null) {
                            aVar2.x6(kVar2);
                        }
                    }
                    lg3.a aVar3 = sVar.f446090w;
                    if (aVar3 != null) {
                        ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar3).h(kVar, new vf3.f(vf3.e.f436377d, null, 0, 0.0f, 14, null));
                    }
                }
            }
            if (X6.f436389a != eVar2 || kVar.getLevel() != mf3.w.f326128d) {
                sVar.Q("tryDownloadHD", new java.lang.Object[0]);
                sVar.l0();
            } else if (sVar.A) {
                sVar.Q("cancel wait for downloadHD", new java.lang.Object[0]);
                lg3.a aVar4 = sVar.f446090w;
                if (aVar4 != null) {
                    ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar4).h(kVar, new vf3.f(vf3.e.f436377d, null, 0, 0.0f, 14, null));
                }
                sVar.A = false;
            } else {
                sVar.Q("try wait for downloadHD", new java.lang.Object[0]);
                lg3.a aVar5 = sVar.f446090w;
                if (aVar5 != null) {
                    ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar5).h(kVar, new vf3.f(vf3.e.f436379f, null, 0, 0.0f, 6, null));
                }
                sVar.A = true;
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/chat/live/ChatLiveBottomBarLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
