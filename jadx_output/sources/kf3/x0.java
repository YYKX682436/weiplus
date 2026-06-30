package kf3;

/* loaded from: classes12.dex */
public class x0 implements db5.k5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI f307460d;

    public x0(com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI massSendHistoryUI) {
        this.f307460d = massSendHistoryUI;
    }

    @Override // db5.k5
    public boolean E0() {
        com.tencent.mm.plugin.masssend.ui.MassSendHistoryListView massSendHistoryListView = this.f307460d.f148526d;
        android.view.View childAt = massSendHistoryListView.getChildAt(massSendHistoryListView.getFirstVisiblePosition());
        return childAt != null && childAt.getTop() == 0;
    }
}
