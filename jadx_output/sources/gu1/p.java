package gu1;

/* loaded from: classes15.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI f275910d;

    public p(com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI shareCardListUI) {
        this.f275910d = shareCardListUI;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.card.sharecard.ui.ShareCardListUI shareCardListUI = this.f275910d;
        eu1.f fVar = shareCardListUI.f94724z;
        if (eu1.f.b() && eu1.f.c()) {
            shareCardListUI.K = 2;
        } else if (eu1.f.c()) {
            shareCardListUI.K = 3;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11582, "OperChangeOtherCity ", 0, 0, "", "", "");
        xt1.t0.Di().b("key_share_card_show_type", java.lang.Integer.valueOf(shareCardListUI.K));
        android.widget.BaseAdapter baseAdapter = shareCardListUI.f94632e;
        if (baseAdapter instanceof gu1.k) {
            gu1.k kVar = (gu1.k) baseAdapter;
            kVar.f275894q = shareCardListUI.K;
            kVar.f();
        }
        shareCardListUI.f94722x.a();
        shareCardListUI.f94724z.getClass();
        eu1.f.f256752c = true;
        yj0.a.h(this, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardListUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
