package s61;

/* loaded from: classes8.dex */
public class l0 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI f403364d;

    public l0(com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI recommendFriendUI) {
        this.f403364d = recommendFriendUI;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/friend/ui/RecommendFriendUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        com.tencent.mm.plugin.account.friend.ui.RecommendFriendUI recommendFriendUI = this.f403364d;
        if (recommendFriendUI.f73169n) {
            s61.c0 c0Var = recommendFriendUI.f73163e;
            recommendFriendUI.U6(c0Var.f403334g ? ((r45.e53) c0Var.f403333f.get(i17)).f373019d : 0);
        } else {
            s61.c0 c0Var2 = recommendFriendUI.f73163e;
            if (i17 >= 0) {
                boolean[] zArr = c0Var2.f403335h;
                if (i17 < zArr.length) {
                    zArr[i17] = !zArr[i17];
                    c0Var2.notifyDataSetChanged();
                }
            } else {
                c0Var2.getClass();
            }
            if (recommendFriendUI.f73163e.a().length > 0) {
                recommendFriendUI.showOptionMenu(true);
            } else {
                recommendFriendUI.showOptionMenu(false);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/friend/ui/RecommendFriendUI$1", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
