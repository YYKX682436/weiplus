package ni2;

/* loaded from: classes3.dex */
public final class i1 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.l1 f337330d;

    public i1(ni2.l1 l1Var) {
        this.f337330d = l1Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        sf2.d3 d3Var = (sf2.d3) this.f337330d.f337371c.U0(sf2.d3.class);
        if (d3Var != null) {
            d3Var.f407106p = null;
            d3Var.f407107q = null;
        }
    }
}
