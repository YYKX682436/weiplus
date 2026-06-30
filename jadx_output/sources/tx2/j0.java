package tx2;

/* loaded from: classes3.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView f422601d;

    public j0(com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView noticeBindItemMiniInfoView) {
        this.f422601d = noticeBindItemMiniInfoView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.notice.NoticeBindItemMiniInfoView noticeBindItemMiniInfoView = this.f422601d;
        android.text.Layout layout = noticeBindItemMiniInfoView.f132730e.getLayout();
        boolean z17 = false;
        if (layout != null && layout.getEllipsisCount(0) == noticeBindItemMiniInfoView.f132730e.getText().length()) {
            z17 = true;
        }
        if (z17) {
            noticeBindItemMiniInfoView.f132730e.setVisibility(8);
        }
    }
}
