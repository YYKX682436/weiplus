package tx2;

/* loaded from: classes10.dex */
public final class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.notice.NoticeStatusView f422643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f422644e;

    public r0(com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView, yz5.a aVar) {
        this.f422643d = noticeStatusView;
        this.f422644e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/view/notice/NoticeStatusView$render$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.view.notice.NoticeStatusView noticeStatusView = this.f422643d;
        noticeStatusView.f132733d = 0;
        kotlinx.coroutines.l.d(noticeStatusView.f132736g, null, null, new tx2.q0(noticeStatusView, this.f422644e, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/view/notice/NoticeStatusView$render$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
