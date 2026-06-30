package f32;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t85.j f259299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView f259300e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t85.j jVar, com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView) {
        super(0);
        this.f259299d = jVar;
        this.f259300e = stickerPreviewView;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        int a17;
        t85.j jVar = this.f259299d;
        java.lang.String str = jVar != null ? jVar.f416477d : null;
        boolean z17 = true;
        int i18 = 0;
        boolean z18 = str == null || str.length() == 0;
        com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView = this.f259300e;
        if (z18) {
            stickerPreviewView.C.c(null, -16777216, y22.n.a(-16777216));
        } else {
            java.lang.String stringColor = jVar != null ? jVar.f416478e : null;
            java.lang.String stringColor2 = jVar != null ? jVar.f416479f : null;
            if (stringColor == null || r26.n0.N(stringColor)) {
                i17 = -1;
            } else {
                kotlin.jvm.internal.o.g(stringColor, "stringColor");
                if (r26.i0.y(stringColor, "#", false)) {
                    i17 = android.graphics.Color.parseColor(stringColor);
                } else {
                    try {
                        r26.a.a(16);
                        i17 = (java.lang.Integer.parseInt(stringColor, 16) & (-1)) | (-16777216);
                    } catch (java.lang.Exception unused) {
                        i17 = 0;
                    }
                }
            }
            if (stringColor2 != null && !r26.n0.N(stringColor2)) {
                z17 = false;
            }
            if (z17) {
                a17 = y22.n.a(i17);
            } else {
                kotlin.jvm.internal.o.g(stringColor2, "stringColor");
                if (r26.i0.y(stringColor2, "#", false)) {
                    a17 = android.graphics.Color.parseColor(stringColor2);
                } else {
                    try {
                        r26.a.a(16);
                        i18 = (java.lang.Integer.parseInt(stringColor2, 16) & (-1)) | (-16777216);
                    } catch (java.lang.Exception unused2) {
                    }
                    a17 = i18;
                }
            }
            stickerPreviewView.C.c(jVar != null ? jVar.f416477d : null, i17, a17);
        }
        stickerPreviewView.B.setStickerPack(jVar);
        return jz5.f0.f302826a;
    }
}
