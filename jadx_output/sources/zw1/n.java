package zw1;

/* loaded from: classes9.dex */
public class n implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectBillUI f476732d;

    public n(com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI) {
        this.f476732d = collectBillUI;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(android.widget.AbsListView absListView, int i17, int i18, int i19) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/CollectBillUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.tencent.mm.plugin.collect.ui.CollectBillUI collectBillUI = this.f476732d;
        if (collectBillUI.f96357d.getLastVisiblePosition() == collectBillUI.f96358e.getCount() && collectBillUI.f96358e.getCount() > 0 && !collectBillUI.f96370t && !collectBillUI.f96369s) {
            if (!collectBillUI.f96368r) {
                collectBillUI.f96357d.addFooterView(collectBillUI.f96359f, null, false);
                collectBillUI.f96368r = true;
            }
            if (!collectBillUI.f96370t) {
                collectBillUI.doSceneForceProgress(new ww1.y1(collectBillUI.f96373w, collectBillUI.f96375y, collectBillUI.f96372v, collectBillUI.f96376z));
                collectBillUI.f96369s = true;
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/CollectBillUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/CollectBillUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/CollectBillUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
