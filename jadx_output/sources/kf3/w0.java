package kf3;

/* loaded from: classes12.dex */
public class w0 implements db5.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI f307457d;

    public w0(com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI) {
        this.f307457d = massSendHistoryUI;
    }

    @Override // db5.j5
    public boolean A5() {
        com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI = this.f307457d;
        com.tencent.mm.plugin.masssend.ui.MassSendHistoryListView massSendHistoryListView = massSendHistoryUI.f148526d;
        android.view.View childAt = massSendHistoryListView.getChildAt(massSendHistoryListView.getChildCount() - 1);
        return childAt != null && childAt.getBottom() <= massSendHistoryUI.f148526d.getHeight() && massSendHistoryUI.f148526d.getLastVisiblePosition() == massSendHistoryUI.f148526d.getAdapter().getCount() - 1;
    }
}
