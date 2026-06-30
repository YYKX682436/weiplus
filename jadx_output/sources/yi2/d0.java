package yi2;

/* loaded from: classes10.dex */
public final class d0 implements si2.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yi2.i0 f462506a;

    public d0(yi2.i0 i0Var) {
        this.f462506a = i0Var;
    }

    @Override // si2.b
    public com.tencent.mm.plugin.finder.live.plugin.l a() {
        return this.f462506a.f462520f;
    }

    @Override // si2.b
    public void b(dk2.m battleData, yz5.l lVar) {
        kotlin.jvm.internal.o.g(battleData, "battleData");
        fj2.s sVar = fj2.s.f263183a;
        if (battleData.f233738a != 2) {
            sVar.a(ml2.k1.f327640g);
        } else if (battleData.f233742e != 3) {
            sVar.a(ml2.k1.f327641h);
        }
        com.tencent.mm.plugin.finder.live.view.c2 c2Var = this.f462506a.f462517J;
        if (c2Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.x7.t1(((com.tencent.mm.plugin.finder.live.plugin.p7) c2Var).f113838a, battleData, lVar);
        }
    }

    @Override // si2.b
    public void onCancel() {
        yi2.i0 i0Var = this.f462506a;
        i0Var.f462520f.f365323d.setBackground(i0Var.f462519e.getContext().getResources().getDrawable(com.tencent.mm.R.color.f479319w5));
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = i0Var.f462520f.f115040t;
        liveBottomSheetPanel.animate().translationY(0.0f);
        liveBottomSheetPanel.f();
    }
}
