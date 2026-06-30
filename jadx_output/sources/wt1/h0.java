package wt1;

/* loaded from: classes4.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f449284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f449285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wt1.j0 f449286g;

    public h0(wt1.j0 j0Var, java.lang.String str, boolean z17, java.util.ArrayList arrayList) {
        this.f449286g = j0Var;
        this.f449283d = str;
        this.f449284e = z17;
        this.f449285f = arrayList;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Set set;
        synchronized (this.f449286g.f449297d) {
            set = (java.util.Set) ((java.util.HashMap) this.f449286g.f449297d).get(this.f449283d);
        }
        if (set == null || set.size() <= 0) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(set);
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            wt1.i0 i0Var = (wt1.i0) it.next();
            if (i0Var != null) {
                boolean z17 = this.f449284e;
                java.util.ArrayList arrayList = this.f449285f;
                com.tencent.mm.plugin.card.ui.CardShopUI cardShopUI = (com.tencent.mm.plugin.card.ui.CardShopUI) i0Var;
                android.app.ProgressDialog progressDialog = cardShopUI.f94903e;
                if (progressDialog != null) {
                    progressDialog.dismiss();
                    cardShopUI.f94903e = null;
                }
                if (arrayList != null) {
                    arrayList.size();
                }
                if (!z17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CardShopUI", "onGotCardShop fail");
                } else if (arrayList == null || arrayList.size() == 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.CardShopUI", "list == null || list.size() == 0");
                } else {
                    java.util.ArrayList arrayList2 = cardShopUI.f94904f;
                    if (arrayList2 != null) {
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        android.view.View view = cardShopUI.f94910o;
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                        arrayList3.add(0);
                        java.util.Collections.reverse(arrayList3);
                        yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/card/ui/CardShopUI", "onGotCardShop", "(ZLjava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardShopUI", "onGotCardShop", "(ZLjava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        android.view.View view2 = cardShopUI.f94910o;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                        arrayList4.add(8);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/card/ui/CardShopUI", "onGotCardShop", "(ZLjava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardShopUI", "onGotCardShop", "(ZLjava/util/ArrayList;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    cardShopUI.f94908m.notifyDataSetChanged();
                }
            }
        }
    }
}
