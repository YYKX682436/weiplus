package tt1;

/* loaded from: classes15.dex */
public class f implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f421818b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.base.CardBaseUI f421819c;

    public f(com.tencent.mm.plugin.card.base.CardBaseUI cardBaseUI, java.lang.String str, boolean z17) {
        this.f421819c = cardBaseUI;
        this.f421817a = str;
        this.f421818b = z17;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            int i18 = com.tencent.mm.plugin.card.base.CardBaseUI.f94630v;
            com.tencent.mm.plugin.card.base.CardBaseUI cardBaseUI = this.f421819c;
            cardBaseUI.j7(true);
            gm0.j1.n().f273288b.g(new xt1.m0(cardBaseUI.f94640p.field_card_id, this.f421817a, 17));
            db5.e1.T(cardBaseUI, cardBaseUI.getResources().getString(com.tencent.mm.R.string.asp));
            if (this.f421818b) {
                cardBaseUI.finish();
            }
        }
    }
}
