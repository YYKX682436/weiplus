package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class u4 implements com.tencent.mm.ui.contact.n4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.MMBaseSelectContactUI f207206d;

    public u4(com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI) {
        this.f207206d = mMBaseSelectContactUI;
    }

    @Override // com.tencent.mm.ui.contact.n4
    public void d4(java.lang.String str, int i17, boolean z17) {
        com.tencent.mm.ui.base.AlphabetScrollBar alphabetScrollBar;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseSelectContactUI", "Callback SearchEnd Count=%d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.ui.contact.MMBaseSelectContactUI mMBaseSelectContactUI = this.f207206d;
        android.view.View view = mMBaseSelectContactUI.f206453n;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI$5", "end", "(Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/MMBaseSelectContactUI$5", "end", "(Ljava/lang/String;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17 && i17 == 0) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                mMBaseSelectContactUI.s7();
                return;
            } else {
                com.tencent.mm.ui.contact.MMBaseSelectContactUI.V6(mMBaseSelectContactUI);
                return;
            }
        }
        mMBaseSelectContactUI.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MMBaseSelectContactUI", "setSearchStatus");
        mMBaseSelectContactUI.r7(mMBaseSelectContactUI.f206446d, 8);
        mMBaseSelectContactUI.f206446d.setAdapter((android.widget.ListAdapter) mMBaseSelectContactUI.f206449g);
        mMBaseSelectContactUI.f206449g.notifyDataSetChanged();
        if (mMBaseSelectContactUI.m7() && (alphabetScrollBar = mMBaseSelectContactUI.f206447e) != null) {
            alphabetScrollBar.setVisibility(mMBaseSelectContactUI.f206449g.v() ? 0 : 8);
        }
        android.view.View view2 = mMBaseSelectContactUI.f206458s;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setSearchStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/ui/contact/MMBaseSelectContactUI", "setSearchStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mMBaseSelectContactUI.f206446d.setVisibility(0);
    }
}
