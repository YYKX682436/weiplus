package r02;

/* loaded from: classes8.dex */
public class a implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader_app.ui.BottomEntranceView f368283d;

    public a(com.tencent.mm.plugin.downloader_app.ui.BottomEntranceView bottomEntranceView) {
        this.f368283d = bottomEntranceView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17 = com.tencent.mm.plugin.downloader_app.ui.BottomEntranceView.f97356i;
        com.tencent.mm.plugin.downloader_app.ui.BottomEntranceView bottomEntranceView = this.f368283d;
        if (bottomEntranceView.getVisibility() == 8) {
            return;
        }
        for (android.view.ViewParent parent = bottomEntranceView.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof com.tencent.mm.plugin.downloader_app.ui.TaskListView) {
                int computeVerticalScrollRange = ((com.tencent.mm.plugin.downloader_app.ui.TaskListView) parent).computeVerticalScrollRange();
                android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) bottomEntranceView.getLayoutParams();
                int i18 = bottomEntranceView.f97361h;
                if (computeVerticalScrollRange < i18) {
                    layoutParams.topMargin += i18 - computeVerticalScrollRange;
                    bottomEntranceView.setLayoutParams(layoutParams);
                } else if (computeVerticalScrollRange > i18) {
                    int i19 = layoutParams.topMargin;
                    int i27 = bottomEntranceView.f97360g;
                    if (i19 > i27) {
                        layoutParams.topMargin = i19 - (computeVerticalScrollRange - i18);
                        bottomEntranceView.setLayoutParams(layoutParams);
                    } else if (i19 < i27) {
                        layoutParams.topMargin = i27;
                        bottomEntranceView.setLayoutParams(layoutParams);
                    }
                }
                int i28 = layoutParams.topMargin;
                return;
            }
        }
    }
}
