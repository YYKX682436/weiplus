package dk5;

/* loaded from: classes9.dex */
public class l3 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f234721d = new android.util.SparseArray(0);

    /* renamed from: e, reason: collision with root package name */
    public int f234722e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.transmit.SelectConversationUI f234723f;

    public l3(com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI) {
        this.f234723f = selectConversationUI;
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
        yj0.a.b("com/tencent/mm/ui/transmit/SelectConversationUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.tencent.mm.ui.transmit.SelectConversationUI selectConversationUI = this.f234723f;
        com.tencent.mm.ui.contact.p6 p6Var = selectConversationUI.f210982b2;
        if (p6Var != null) {
            ?? r102 = p6Var.f207090u;
            android.widget.RelativeLayout relativeLayout = selectConversationUI.C;
            int i28 = 0;
            if (relativeLayout != null) {
                if (i17 > r102) {
                    relativeLayout.setVisibility(0);
                    if (selectConversationUI.f210982b2.G) {
                        selectConversationUI.D.setBackground(selectConversationUI.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.agd));
                        selectConversationUI.E.setBackground(selectConversationUI.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.agd));
                    }
                } else {
                    relativeLayout.setVisibility(8);
                }
            }
            this.f234722e = i17;
            android.view.View childAt = absListView.getChildAt(0);
            if (childAt != null) {
                android.util.SparseArray sparseArray = this.f234721d;
                dk5.a3 a3Var = (dk5.a3) sparseArray.get(i17);
                if (a3Var == null) {
                    a3Var = new dk5.a3(this);
                }
                a3Var.f234493a = childAt.getHeight();
                a3Var.f234494b = childAt.getTop();
                sparseArray.append(i17, a3Var);
                int i29 = 0;
                while (true) {
                    i27 = this.f234722e;
                    if (i28 >= i27) {
                        break;
                    }
                    dk5.a3 a3Var2 = (dk5.a3) sparseArray.get(i28);
                    if (a3Var2 != null) {
                        i29 += a3Var2.f234493a;
                    }
                    i28++;
                }
                dk5.a3 a3Var3 = (dk5.a3) sparseArray.get(i27);
                if (a3Var3 == null) {
                    a3Var3 = new dk5.a3(this);
                }
                int i37 = i29 - a3Var3.f234494b;
                android.view.View view = selectConversationUI.f206452m;
                if (view != null) {
                    view.setY(-i37);
                }
                com.tencent.mm.pluginsdk.ui.MultiSelectContactView multiSelectContactView = selectConversationUI.f206450h;
                if (multiSelectContactView != null) {
                    multiSelectContactView.setY(-i37);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/transmit/SelectConversationUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/transmit/SelectConversationUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/ui/transmit/SelectConversationUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
