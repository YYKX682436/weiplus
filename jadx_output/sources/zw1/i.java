package zw1;

/* loaded from: classes9.dex */
public class i implements db5.k5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectBillListUI f476657d;

    public i(com.tencent.mm.plugin.collect.ui.CollectBillListUI collectBillListUI) {
        this.f476657d = collectBillListUI;
    }

    @Override // db5.k5
    public boolean E0() {
        android.view.View childAt;
        com.tencent.mm.plugin.collect.ui.CollectBillListUI collectBillListUI = this.f476657d;
        int firstVisiblePosition = collectBillListUI.f96342d.getFirstVisiblePosition();
        return firstVisiblePosition == 0 && (childAt = collectBillListUI.f96342d.getChildAt(firstVisiblePosition)) != null && childAt.getX() == 0.0f;
    }
}
