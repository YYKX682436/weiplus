package zw1;

/* loaded from: classes9.dex */
public class e implements db5.l5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.ui.CollectBillListUI f476614d;

    public e(com.tencent.mm.plugin.collect.ui.CollectBillListUI collectBillListUI) {
        this.f476614d = collectBillListUI;
    }

    @Override // db5.l5
    public boolean J6() {
        com.tencent.mm.plugin.collect.ui.CollectBillListUI collectBillListUI = this.f476614d;
        boolean z17 = collectBillListUI.f96349n;
        boolean z18 = collectBillListUI.f96351p;
        if (collectBillListUI.f96349n || collectBillListUI.f96351p) {
            return true;
        }
        collectBillListUI.f96346h.setBottomViewVisible(true);
        collectBillListUI.U6();
        return false;
    }
}
