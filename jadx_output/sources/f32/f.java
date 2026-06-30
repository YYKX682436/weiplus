package f32;

/* loaded from: classes10.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView f259291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f259292e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView, int i17) {
        super(0);
        this.f259291d = stickerPreviewView;
        this.f259292e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView = this.f259291d;
        d32.t tVar = stickerPreviewView.E;
        tVar.getClass();
        android.graphics.Rect previewRect = stickerPreviewView.H;
        kotlin.jvm.internal.o.g(previewRect, "previewRect");
        int i17 = tVar.f226192t;
        int i18 = this.f259292e;
        if (i17 != i18) {
            tVar.f226192t = i18;
            tVar.B.set(previewRect);
            os0.a aVar = tVar.f226193u;
            if (aVar != null) {
                aVar.n();
            }
            d32.s sVar = tVar.f226194v;
            if (sVar != null) {
                sVar.n();
            }
            is0.c cVar = tVar.f226197y;
            if (cVar != null) {
                cVar.close();
            }
            tVar.w();
            tVar.f330951g = tVar.f();
            os0.a aVar2 = tVar.f226193u;
            if (aVar2 != null) {
                aVar2.w(tVar.f330945a, tVar.f330946b);
            }
            os0.a aVar3 = tVar.f226193u;
            if (aVar3 != null) {
                aVar3.u(tVar.f226198z, tVar.A);
            }
            os0.a aVar4 = tVar.f226193u;
            if (aVar4 != null) {
                aVar4.f348005n = tVar.f330958n;
            }
            if (aVar4 != null) {
                aVar4.f348007p = tVar.f330959o;
            }
            d32.s sVar2 = tVar.f226194v;
            if (sVar2 != null) {
                sVar2.w(tVar.f226198z, tVar.A);
            }
            d32.s sVar3 = tVar.f226194v;
            if (sVar3 != null) {
                sVar3.u(tVar.f330947c, tVar.f330948d);
            }
            tVar.v();
        }
        pm0.v.X(new f32.e(stickerPreviewView));
        return jz5.f0.f302826a;
    }
}
