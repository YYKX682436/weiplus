package gu1;

/* loaded from: classes15.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f275913a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f275914b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f275915c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f275916d;

    public s(com.tencent.mm.ui.MMActivity mMActivity, android.view.View view) {
        this.f275913a = view;
    }

    public void a() {
        java.lang.Integer num = (java.lang.Integer) xt1.t0.Di().a("key_share_card_show_type");
        if (num == null) {
            num = 0;
        }
        if (num.intValue() == 0 || eu1.f.b()) {
            android.view.View view = this.f275914b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f275914b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/sharecard/ui/ShareCardNoLocalCityController", "updateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f275915c.setVisibility(0);
        com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo shareCardInfo = new com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo();
        if (android.text.TextUtils.isEmpty(shareCardInfo.C(10))) {
            this.f275915c.setVisibility(8);
        } else {
            this.f275915c.setVisibility(0);
            this.f275915c.setText(shareCardInfo.C(10));
        }
        if (android.text.TextUtils.isEmpty("")) {
            this.f275916d.setVisibility(8);
        } else {
            this.f275916d.setVisibility(0);
            this.f275916d.setText("");
        }
    }
}
