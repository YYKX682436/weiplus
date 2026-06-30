package f32;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView f259301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t85.j f259302e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView, t85.j jVar) {
        super(0);
        this.f259301d = stickerPreviewView;
        this.f259302e = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        d32.t tVar = this.f259301d.E;
        p05.l4 l4Var = tVar.f226195w;
        t85.j jVar = this.f259302e;
        if (l4Var != null) {
            l4Var.i(jVar);
        }
        tVar.f226196x = jVar;
        return jz5.f0.f302826a;
    }
}
