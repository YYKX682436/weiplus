package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class ac implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f206597d = new android.util.SparseArray(0);

    /* renamed from: e, reason: collision with root package name */
    public int f206598e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.SnsSelectConversationUI f206599f;

    public ac(com.tencent.mm.ui.contact.SnsSelectConversationUI snsSelectConversationUI) {
        this.f206599f = snsSelectConversationUI;
    }

    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        int i27;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SnsSelectConversationUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.tencent.mm.ui.contact.SnsSelectConversationUI snsSelectConversationUI = this.f206599f;
        com.tencent.mm.ui.contact.pb pbVar = snsSelectConversationUI.K;
        if (pbVar != null) {
            ?? r102 = pbVar.f207090u;
            android.widget.RelativeLayout relativeLayout = snsSelectConversationUI.C;
            int i28 = 0;
            if (relativeLayout != null) {
                if (i17 > r102) {
                    relativeLayout.setVisibility(0);
                    if (snsSelectConversationUI.K.G) {
                        snsSelectConversationUI.D.setBackground(snsSelectConversationUI.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.agd));
                        snsSelectConversationUI.E.setBackground(snsSelectConversationUI.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.agd));
                    }
                } else {
                    relativeLayout.setVisibility(8);
                }
            }
            this.f206598e = i17;
            android.view.View childAt = absListView.getChildAt(0);
            if (childAt != null) {
                android.util.SparseArray sparseArray = this.f206597d;
                com.tencent.mm.ui.contact.zb zbVar = (com.tencent.mm.ui.contact.zb) sparseArray.get(i17);
                if (zbVar == null) {
                    zbVar = new com.tencent.mm.ui.contact.zb(this);
                }
                zbVar.f207277a = childAt.getHeight();
                zbVar.f207278b = childAt.getTop();
                sparseArray.append(i17, zbVar);
                int i29 = 0;
                while (true) {
                    i27 = this.f206598e;
                    if (i28 >= i27) {
                        break;
                    }
                    com.tencent.mm.ui.contact.zb zbVar2 = (com.tencent.mm.ui.contact.zb) sparseArray.get(i28);
                    if (zbVar2 != null) {
                        i29 += zbVar2.f207277a;
                    }
                    i28++;
                }
                com.tencent.mm.ui.contact.zb zbVar3 = (com.tencent.mm.ui.contact.zb) sparseArray.get(i27);
                if (zbVar3 == null) {
                    zbVar3 = new com.tencent.mm.ui.contact.zb(this);
                }
                int i37 = i29 - zbVar3.f207278b;
                android.view.View view = snsSelectConversationUI.f206452m;
                if (view != null) {
                    view.setY(-i37);
                }
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = snsSelectConversationUI.f206450h;
                if (multiSelectContactView != null) {
                    multiSelectContactView.setY(-i37);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/contact/SnsSelectConversationUI$1", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/SnsSelectConversationUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/contact/SnsSelectConversationUI$1", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
