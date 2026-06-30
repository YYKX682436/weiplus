package f32;

/* loaded from: classes10.dex */
public final class d implements com.tencent.mm.plugin.mmsight.ui.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView f259289a;

    public d(com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView) {
        this.f259289a = stickerPreviewView;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void a() {
        this.f259289a.D.p(true, false, 1);
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void b() {
        this.f259289a.D.p(false, false, 1);
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void c(float f17, float f18) {
        com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView = this.f259289a;
        stickerPreviewView.D.c(f17, f18, stickerPreviewView.f98793w.getWidth(), stickerPreviewView.f98793w.getHeight(), 400L);
        stickerPreviewView.f98795y.a(f17, f18);
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.u
    public void d() {
        com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView = this.f259289a;
        at0.n nVar = stickerPreviewView.D;
        if (nVar.f13604l == 0) {
            nVar.f13594b.o();
        }
        stickerPreviewView.I = stickerPreviewView.D.m(false);
    }
}
