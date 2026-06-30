package tc5;

/* loaded from: classes10.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI f417554d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI) {
        super(0);
        this.f417554d = msgHistoryGalleryUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI msgHistoryGalleryUI = this.f417554d;
        androidx.appcompat.app.AppCompatActivity context = msgHistoryGalleryUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView scrollViewWidgetQuickScrollBarView = new com.tencent.mm.ui.scroll_view_widgets.widgets.ScrollViewWidgetQuickScrollBarView(context, null, 0, 6, null);
        scrollViewWidgetQuickScrollBarView.setOnDragCallback(new tc5.z(msgHistoryGalleryUI, scrollViewWidgetQuickScrollBarView));
        scrollViewWidgetQuickScrollBarView.setOnScrollCallback(new tc5.a0(msgHistoryGalleryUI));
        return scrollViewWidgetQuickScrollBarView;
    }
}
