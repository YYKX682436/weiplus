package z84;

/* loaded from: classes4.dex */
public class a implements android.os.Handler.Callback {

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f470762d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f470763e;

    public a(android.content.Context context, com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager) {
        this.f470762d = new android.os.Handler(context.getMainLooper(), this);
        this.f470763e = new java.lang.ref.WeakReference(cardLayoutManager);
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("cancel", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        android.os.Handler handler = this.f470762d;
        if (handler != null) {
            handler.removeMessages(0);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("cancel", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
    }

    public final boolean b() {
        com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager cardLayoutManager;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleScrollMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        java.lang.ref.WeakReference weakReference = this.f470763e;
        if (weakReference == null || (cardLayoutManager = (com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager) weakReference.get()) == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleScrollMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            return false;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("notifyAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getScrollStateChangedListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        z84.c cVar = cardLayoutManager.f163794u;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getScrollStateChangedListener", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager");
        if (cVar != null) {
            cVar.c((cardLayoutManager.p() + 1) % cardLayoutManager.getItemCount());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("notifyAutoScrollNextItem", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        cardLayoutManager.F();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleScrollMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        if (message == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
            return false;
        }
        if (message.what == 0) {
            try {
                boolean b17 = b();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
                return b17;
            } catch (java.lang.Throwable unused) {
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMessage", "com.tencent.mm.plugin.sns.ad.widget.recyclerview.CardLayoutManager$CardRecyclerViewScrollHelper");
        return false;
    }
}
