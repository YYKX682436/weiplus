package th5;

/* loaded from: classes12.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.l0 f419387d;

    public i0(th5.l0 l0Var) {
        this.f419387d = l0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        vf3.a aVar;
        vf3.f X6;
        lg3.a aVar2;
        lg3.a aVar3;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/media/bizphoto/BizPhotoLiveBottomBarLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        th5.l0 l0Var = this.f419387d;
        mf3.s sVar = l0Var.f326110m;
        java.lang.Object obj = sVar != null ? sVar.f326117a : null;
        th5.q qVar = obj instanceof th5.q ? (th5.q) obj : null;
        if (qVar != null && (aVar = (vf3.a) l0Var.H(vf3.a.class)) != null && (X6 = ((vf3.i) aVar).X6(qVar)) != null) {
            vf3.e eVar = X6.f436389a;
            vf3.e eVar2 = vf3.e.f436380g;
            if (eVar == eVar2 && qVar.f419450h == mf3.w.f326129e) {
                vf3.a aVar4 = (vf3.a) l0Var.H(vf3.a.class);
                if (aVar4 != null) {
                    aVar4.x6(qVar);
                }
                qVar.f419450h = mf3.w.f326128d;
                lg3.a aVar5 = l0Var.f419403x;
                if (aVar5 != null) {
                    ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar5).h(qVar, new vf3.f(vf3.e.f436377d, null, 0, 0.0f, 14, null));
                }
                long j17 = qVar.f419343b;
                if (j17 > 0 && (aVar3 = l0Var.f419403x) != null) {
                    ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar3).g(new vf3.b(0L, j17, 0L, 0L, 0L, false, 61, null));
                }
                l0Var.h0();
            } else if (eVar == eVar2 && qVar.f419450h == mf3.w.f326128d) {
                if (l0Var.f419405z) {
                    l0Var.f419405z = false;
                    lg3.a aVar6 = l0Var.f419403x;
                    if (aVar6 != null) {
                        ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar6).h(qVar, new vf3.f(vf3.e.f436377d, null, 0, 0.0f, 14, null));
                    }
                    long j18 = qVar.f419343b;
                    if (j18 > 0 && (aVar2 = l0Var.f419403x) != null) {
                        ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar2).g(new vf3.b(0L, j18, 0L, 0L, 0L, false, 61, null));
                    }
                } else {
                    l0Var.f419405z = true;
                    lg3.a aVar7 = l0Var.f419403x;
                    if (aVar7 != null) {
                        ((com.tencent.mm.plugin.media.view.download.MediaDownloadText) aVar7).h(qVar, new vf3.f(vf3.e.f436379f, null, 0, 0.0f, 6, null));
                    }
                }
            } else if (qVar.f419450h != mf3.w.f326129e) {
                l0Var.j0();
                th5.v0.f419470a.a(qVar.f419344c, qVar.f419342a, qVar.f419343b, th5.a.f419333e, th5.e.f419367f);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/media/bizphoto/BizPhotoLiveBottomBarLayer$attach$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
