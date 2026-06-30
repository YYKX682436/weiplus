package iu1;

/* loaded from: classes9.dex */
public final class b0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI f294840d;

    public b0(com.tencent.mm.plugin.card.ui.v2.CardHomePageNewUI cardHomePageNewUI) {
        this.f294840d = cardHomePageNewUI;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        java.util.Iterator it = this.f294840d.F.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            g4Var.add(0, i17, 1, ((r45.qu) it.next()).f384261f);
            i17++;
        }
    }
}
