package tt1;

/* loaded from: classes15.dex */
public class c implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.base.CardBaseUI f421811d;

    public c(com.tencent.mm.plugin.card.base.CardBaseUI cardBaseUI) {
        this.f421811d = cardBaseUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardBaseUI", "onItemLongClick pos is 0");
            return true;
        }
        if (i17 > 0) {
            i17--;
        }
        com.tencent.mm.plugin.card.base.CardBaseUI cardBaseUI = this.f421811d;
        if (i17 >= cardBaseUI.f94632e.getCount()) {
            return true;
        }
        cardBaseUI.e7(cardBaseUI.f94639o.getItem(i17));
        return true;
    }
}
