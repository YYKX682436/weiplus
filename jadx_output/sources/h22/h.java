package h22;

/* loaded from: classes15.dex */
public final class h extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f278303a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView view, android.os.Looper looper) {
        super(looper);
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(looper, "looper");
        this.f278303a = new java.lang.ref.WeakReference(view);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message msg) {
        com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerLayoutManager emojiStoreV3BannerLayoutManager;
        int m17;
        kotlin.jvm.internal.o.g(msg, "msg");
        com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView emojiStoreV3BannerView = (com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView) this.f278303a.get();
        if (emojiStoreV3BannerView != null && msg.what == 1 && (m17 = (emojiStoreV3BannerLayoutManager = emojiStoreV3BannerView.f98489e).m()) >= 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView = emojiStoreV3BannerView.f98493i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(m17 + 1));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerView$TimerHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            recyclerView.c1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerView$TimerHandler", "handleMessage", "(Landroid/os/Message;)V", "Undefined", "smoothScrollToPosition", "(I)V");
            sendEmptyMessageDelayed(1, emojiStoreV3BannerLayoutManager.f98481f + emojiStoreV3BannerView.f98488d.f278299d);
        }
    }
}
