package ed5;

/* loaded from: classes9.dex */
public final class u implements androidx.recyclerview.widget.v2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f251391d;

    /* renamed from: e, reason: collision with root package name */
    public float f251392e;

    /* renamed from: f, reason: collision with root package name */
    public float f251393f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ed5.v f251394g;

    public u(ed5.v vVar) {
        this.f251394g = vVar;
    }

    @Override // androidx.recyclerview.widget.v2
    public void a(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(rv6);
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryTradeCountDecoration$TradeCountTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(e17, "e");
        yj0.a.h(this, "com/tencent/mm/ui/chatting/history/widgets/MsgHistoryGalleryTradeCountDecoration$TradeCountTouchListener", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
    }

    @Override // androidx.recyclerview.widget.v2
    public boolean b(androidx.recyclerview.widget.RecyclerView rv6, android.view.MotionEvent e17) {
        kotlin.jvm.internal.o.g(rv6, "rv");
        kotlin.jvm.internal.o.g(e17, "e");
        int actionMasked = e17.getActionMasked();
        ed5.v vVar = this.f251394g;
        if (actionMasked == 0) {
            boolean contains = vVar.f251398g.contains(e17.getX(), e17.getY());
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[onInterceptTouchEvent] ACTION_DOWN x=%.1f y=%.1f bounds=%s inBounds=%s", java.lang.Float.valueOf(e17.getX()), java.lang.Float.valueOf(e17.getY()), vVar.f251398g, java.lang.Boolean.valueOf(contains));
            if (contains) {
                this.f251391d = true;
                this.f251392e = e17.getX();
                this.f251393f = e17.getY();
            } else {
                this.f251391d = false;
            }
        } else if (actionMasked == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[onInterceptTouchEvent] ACTION_UP x=%.1f y=%.1f isPressed=%s", java.lang.Float.valueOf(e17.getX()), java.lang.Float.valueOf(e17.getY()), java.lang.Boolean.valueOf(this.f251391d));
            if (this.f251391d) {
                float x17 = e17.getX() - this.f251392e;
                float y17 = e17.getY() - this.f251393f;
                float f17 = (x17 * x17) + (y17 * y17);
                int scaledTouchSlop = android.view.ViewConfiguration.get(rv6.getContext()).getScaledTouchSlop();
                java.lang.Object[] objArr = new java.lang.Object[3];
                objArr[0] = java.lang.Float.valueOf(f17);
                float f18 = scaledTouchSlop * scaledTouchSlop;
                objArr[1] = java.lang.Float.valueOf(f18);
                objArr[2] = java.lang.Boolean.valueOf(f17 <= f18);
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[onInterceptTouchEvent] ACTION_UP dist2=%.1f slop2=%.1f pass=%s", objArr);
                if (f17 <= f18) {
                    vVar.getClass();
                    android.content.Context context = rv6.getContext();
                    java.lang.String str = vVar.f251396e;
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[handleTradeCountClick] talker=%s context=%s", str, context);
                    com.tencent.mm.autogen.events.EntryWalletLedgerEvent entryWalletLedgerEvent = new com.tencent.mm.autogen.events.EntryWalletLedgerEvent();
                    am.x4 x4Var = entryWalletLedgerEvent.f54111g;
                    x4Var.f8344a = str;
                    x4Var.f8345b = new java.lang.ref.WeakReference(rv6.getContext());
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[handleTradeCountClick] publishing EntryWalletLedgerEvent");
                    entryWalletLedgerEvent.e();
                    com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[handleTradeCountClick] event published, reporting kvStat");
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.d(30027, 1, 0, 1, 0, 0);
                }
            }
            this.f251391d = false;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryTradeCountDecoration", "[onInterceptTouchEvent] ACTION_CANCEL");
                this.f251391d = false;
            }
        } else if (this.f251391d) {
            float x18 = e17.getX() - this.f251392e;
            float y18 = e17.getY() - this.f251393f;
            int scaledTouchSlop2 = android.view.ViewConfiguration.get(rv6.getContext()).getScaledTouchSlop();
            if ((x18 * x18) + (y18 * y18) > scaledTouchSlop2 * scaledTouchSlop2) {
                this.f251391d = false;
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.v2
    public void c(boolean z17) {
        if (z17) {
            this.f251391d = false;
        }
    }
}
