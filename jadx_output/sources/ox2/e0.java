package ox2;

/* loaded from: classes10.dex */
public final class e0 implements com.tencent.mm.ui.widget.dialog.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ox2.h0 f349653a;

    public e0(ox2.h0 h0Var) {
        this.f349653a = h0Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.h2
    public final void onDismiss() {
        ox2.h0 h0Var = this.f349653a;
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEggDarkPreview centerInteractionEasterEggDarkPreview = h0Var.f349666e;
        if (centerInteractionEasterEggDarkPreview != null) {
            centerInteractionEasterEggDarkPreview.f132395o = false;
        }
        yz5.l lVar = h0Var.f349663b;
        if (lVar != null) {
            lVar.invoke(h0Var.f349664c);
        }
    }
}
