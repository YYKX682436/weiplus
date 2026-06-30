package com.tencent.mm.plugin.record.ui;

/* loaded from: classes4.dex */
public class i0 implements android.widget.AbsListView.OnScrollListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.record.ui.RecordMsgBaseUI f155418d;

    public i0(com.tencent.mm.plugin.record.ui.RecordMsgBaseUI recordMsgBaseUI) {
        this.f155418d = recordMsgBaseUI;
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
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V", this, array);
        com.tencent.mm.plugin.record.ui.RecordMsgBaseUI recordMsgBaseUI = this.f155418d;
        if (i17 == 0) {
            android.view.View childAt = recordMsgBaseUI.f155266m.getChildAt(0);
            if ((childAt != null ? childAt.getTop() : 0) == 0) {
                recordMsgBaseUI.hideActionbarLine();
                yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
                return;
            }
        }
        recordMsgBaseUI.showActionbarLine();
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScroll", "(Landroid/widget/AbsListView;III)V");
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(android.widget.AbsListView absListView, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(absListView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V", this, array);
        if (i17 == 0) {
            com.tencent.mm.autogen.events.UIStatusChangedEvent uIStatusChangedEvent = new com.tencent.mm.autogen.events.UIStatusChangedEvent();
            am.mz mzVar = uIStatusChangedEvent.f54907g;
            mzVar.f7378a = 5;
            com.tencent.mm.plugin.record.ui.RecordMsgBaseUI recordMsgBaseUI = this.f155418d;
            mzVar.f7379b = recordMsgBaseUI.f155266m.getFirstVisiblePosition();
            mzVar.f7380c = recordMsgBaseUI.f155266m.getLastVisiblePosition();
            mzVar.f7381d = recordMsgBaseUI.f155266m.getHeaderViewsCount();
            uIStatusChangedEvent.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/record/ui/RecordMsgBaseUI$2", "android/widget/AbsListView$OnScrollListener", "onScrollStateChanged", "(Landroid/widget/AbsListView;I)V");
    }
}
