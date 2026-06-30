package iu1;

/* loaded from: classes9.dex */
public final class s0 implements i11.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI f294953d;

    public s0(com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI cardNewBaseUI) {
        this.f294953d = cardNewBaseUI;
    }

    @Override // i11.c
    public final boolean onGetLocation(boolean z17, float f17, float f18, int i17, double d17, double d18, double d19) {
        com.tencent.mm.plugin.card.ui.v2.CardNewBaseUI cardNewBaseUI = this.f294953d;
        if (z17) {
            cardNewBaseUI.f95212d = f18;
            cardNewBaseUI.f95213e = f17;
            cardNewBaseUI.W6();
        }
        cardNewBaseUI.T6(0, z17);
        return false;
    }
}
