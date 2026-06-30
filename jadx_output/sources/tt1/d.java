package tt1;

/* loaded from: classes15.dex */
public class d extends lu1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421812a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.base.CardBaseUI f421813b;

    public d(com.tencent.mm.plugin.card.base.CardBaseUI cardBaseUI, java.lang.String str) {
        this.f421813b = cardBaseUI;
        this.f421812a = str;
    }

    @Override // lu1.p, lu1.q
    public void b(java.lang.String str) {
        int i17 = com.tencent.mm.plugin.card.base.CardBaseUI.f94630v;
        com.tencent.mm.plugin.card.base.CardBaseUI cardBaseUI = this.f421813b;
        cardBaseUI.getClass();
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(this.f421812a);
        cardBaseUI.f94637m = false;
        cardBaseUI.j7(true);
        gm0.j1.n().f273288b.g(new xt1.z(linkedList));
    }
}
