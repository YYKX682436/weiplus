package zw1;

/* loaded from: classes9.dex */
public class j implements db5.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectBillListUI f476671d;

    public j(com.tencent.mm.plugin.collect.ui.CollectBillListUI collectBillListUI) {
        this.f476671d = collectBillListUI;
    }

    @Override // db5.j5
    public boolean A5() {
        com.tencent.mm.plugin.collect.ui.CollectBillListUI collectBillListUI = this.f476671d;
        if (collectBillListUI.f96345g.getVisibility() == 0) {
            return true;
        }
        android.widget.ListView listView = collectBillListUI.f96342d;
        android.view.View childAt = listView.getChildAt(listView.getChildCount() - 1);
        return childAt != null && childAt.getBottom() <= collectBillListUI.f96342d.getHeight() && collectBillListUI.f96342d.getLastVisiblePosition() == collectBillListUI.f96342d.getAdapter().getCount() - 1;
    }
}
