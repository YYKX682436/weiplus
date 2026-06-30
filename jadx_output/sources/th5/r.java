package th5;

/* loaded from: classes12.dex */
public final class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.w f419455d;

    public r(th5.w wVar) {
        this.f419455d = wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        rf3.u uVar;
        mf3.s sVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/bizphoto/BizPhotoImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        th5.w wVar = this.f419455d;
        mf3.s sVar2 = wVar.f326110m;
        java.lang.Object obj = sVar2 != null ? sVar2.f326117a : null;
        th5.o oVar = obj instanceof th5.o ? (th5.o) obj : null;
        if (oVar == null) {
            yj0.a.h(this, "com/tencent/mm/ui/media/bizphoto/BizPhotoImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        mf3.w wVar2 = oVar.f419421f;
        mf3.w wVar3 = mf3.w.f326129e;
        if (wVar2 == wVar3 && oVar.f419424i < 1.0f) {
            yz5.a aVar = oVar.f419426k;
            if (aVar != null) {
                aVar.invoke();
            }
            wVar.a0();
            yj0.a.h(this, "com/tencent/mm/ui/media/bizphoto/BizPhotoImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (wVar2 == wVar3) {
            yj0.a.h(this, "com/tencent/mm/ui/media/bizphoto/BizPhotoImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        oVar.f419421f = wVar3;
        wVar.b0();
        lg3.a aVar2 = wVar.f419472w;
        if (aVar2 != null) {
            ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar2).h(oVar, new vf3.f(vf3.e.f436380g, null, 0, 0.0f, 6, null));
        }
        rf3.q qVar = (rf3.q) wVar.g(rf3.q.class);
        if (qVar != null && (sVar = (uVar = (rf3.u) qVar).f326110m) != null) {
            uVar.t(sVar);
        }
        th5.v0.f419470a.a(oVar.f419344c, oVar.f419342a, oVar.f419343b, th5.a.f419333e, th5.e.f419367f);
        yj0.a.h(this, "com/tencent/mm/ui/media/bizphoto/BizPhotoImageBottomBarLayer$attach$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
