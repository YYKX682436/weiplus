package kf3;

/* loaded from: classes12.dex */
public class y0 implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI f307464a;

    public y0(com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI) {
        this.f307464a = massSendHistoryUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI = this.f307464a;
        com.tencent.mm.ui.base.MMPullDownView mMPullDownView = massSendHistoryUI.f148529g;
        kf3.k0 k0Var = massSendHistoryUI.f148528f;
        mMPullDownView.setIsTopShowAll(k0Var.f307379r >= k0Var.f307380s);
        massSendHistoryUI.f148529g.setVisibility(0);
        android.view.View view = massSendHistoryUI.f148532m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$6", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$6", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        massSendHistoryUI.f148533n.setVisibility(0);
    }
}
