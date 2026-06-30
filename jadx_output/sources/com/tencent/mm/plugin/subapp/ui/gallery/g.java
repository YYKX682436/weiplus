package com.tencent.mm.plugin.subapp.ui.gallery;

/* loaded from: classes3.dex */
public class g implements sy3.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.gallery.j f172382a;

    public g(com.tencent.mm.plugin.subapp.ui.gallery.j jVar) {
        this.f172382a = jVar;
    }

    @Override // sy3.e
    public void a(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.subapp.ui.gallery.h hVar = this.f172382a.f172389g;
        if (hVar != null) {
            ((com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI) hVar).x7();
        }
    }

    @Override // sy3.e
    public void b(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.subapp.ui.gallery.h hVar = this.f172382a.f172389g;
        if (hVar != null) {
            ((com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI) hVar).x7();
        }
    }

    @Override // sy3.e
    public void c(long j17) {
        com.tencent.mm.plugin.subapp.ui.gallery.h hVar = this.f172382a.f172389g;
        if (hVar != null) {
            com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI gestureGalleryUI = (com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI) hVar;
            gestureGalleryUI.F1 = true;
            com.tencent.mm.ui.tools.MMGestureGallery mMGestureGallery = gestureGalleryUI.f172190e;
            if (mMGestureGallery != null) {
                mMGestureGallery.f210063o = true;
            }
        }
    }

    @Override // sy3.e
    public void d(android.content.DialogInterface dialogInterface) {
        com.tencent.mars.xlog.Log.i("MicroMsg.GestureGalleryTransLogic", "dealWithImageOcr onDialogShow");
        com.tencent.mm.plugin.subapp.ui.gallery.j jVar = this.f172382a;
        com.tencent.mm.plugin.subapp.ui.gallery.h hVar = jVar.f172389g;
        if (hVar != null) {
            ((com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI) hVar).U.setVisibility(4);
        }
        jVar.f172390h.setVisibility(8);
        jVar.f172391i.setVisibility(8);
        jVar.f172392j.setVisibility(8);
        jVar.g();
    }

    @Override // sy3.e
    public void onError(int i17, int i18) {
        com.tencent.mm.plugin.subapp.ui.gallery.j jVar = this.f172382a;
        com.tencent.mm.plugin.subapp.ui.gallery.h hVar = jVar.f172389g;
        if (hVar != null) {
            ((com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI) hVar).x7();
        }
        jVar.f172390h.setVisibility(8);
        jVar.f172391i.setVisibility(8);
        jVar.f172392j.setVisibility(8);
        jVar.g();
    }
}
