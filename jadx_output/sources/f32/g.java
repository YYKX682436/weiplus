package f32;

/* loaded from: classes10.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView f259293d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y9.i f259294e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView, y9.i iVar) {
        super(1);
        this.f259293d = stickerPreviewView;
        this.f259294e = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView = this.f259293d;
        android.view.ViewGroup.LayoutParams layoutParams = stickerPreviewView.f98793w.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams2 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams3 = stickerPreviewView.C.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        androidx.constraintlayout.widget.ConstraintLayout.LayoutParams layoutParams4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) layoutParams3;
        android.graphics.Rect rect = stickerPreviewView.H;
        if (intValue == 0) {
            int i17 = stickerPreviewView.F;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = i17;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = i17;
            int i18 = stickerPreviewView.G;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = i18;
            int width = (stickerPreviewView.getWidth() - i17) / 2;
            rect.set(width, i18, width + i17, i17 + i18);
            layoutParams4.f10899k = 0;
            layoutParams4.f10895i = -1;
        } else if (intValue == 1) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = -1;
            if (stickerPreviewView.getWidth() * 16 > stickerPreviewView.getHeight() * 9) {
                int width2 = (stickerPreviewView.getWidth() - ((stickerPreviewView.getHeight() * 9) / 16)) / 2;
                rect.set(width2, 0, stickerPreviewView.getWidth() - width2, stickerPreviewView.getHeight());
            } else {
                int height = (stickerPreviewView.getHeight() - ((stickerPreviewView.getWidth() * 16) / 9)) / 2;
                rect.set(0, height, stickerPreviewView.getWidth(), stickerPreviewView.getHeight() - height);
            }
            layoutParams4.f10899k = -1;
            layoutParams4.f10895i = com.tencent.mm.R.id.nj8;
        } else if (intValue == 2) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width = -1;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).height = -1;
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            rect.set(0, 0, stickerPreviewView.getWidth(), stickerPreviewView.getHeight());
            layoutParams4.f10899k = -1;
            layoutParams4.f10895i = com.tencent.mm.R.id.nj8;
        }
        stickerPreviewView.f98794x.l(new f32.f(stickerPreviewView, intValue));
        this.f259294e.dismiss();
        return jz5.f0.f302826a;
    }
}
