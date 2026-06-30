package tt1;

/* loaded from: classes15.dex */
public class e implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tt1.j f421814a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421815b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.base.CardBaseUI f421816c;

    public e(com.tencent.mm.plugin.card.base.CardBaseUI cardBaseUI, tt1.j jVar, java.lang.String str) {
        this.f421816c = cardBaseUI;
        this.f421814a = jVar;
        this.f421815b = str;
    }

    @Override // db5.c1
    public void e(int i17) {
        tt1.j jVar = this.f421814a;
        boolean u17 = jVar.u();
        java.lang.String str = this.f421815b;
        com.tencent.mm.plugin.card.base.CardBaseUI cardBaseUI = this.f421816c;
        if (!u17) {
            if (i17 != 0) {
                return;
            }
            int i18 = com.tencent.mm.plugin.card.base.CardBaseUI.f94630v;
            cardBaseUI.getClass();
            lu1.r.b(cardBaseUI, str, "", new tt1.d(cardBaseUI, str));
            return;
        }
        if (i17 == 0) {
            cardBaseUI.a7((com.tencent.mm.plugin.card.model.CardInfo) jVar);
        } else {
            if (i17 != 1) {
                return;
            }
            int i19 = com.tencent.mm.plugin.card.base.CardBaseUI.f94630v;
            cardBaseUI.getClass();
            lu1.r.b(cardBaseUI, str, "", new tt1.d(cardBaseUI, str));
        }
    }
}
