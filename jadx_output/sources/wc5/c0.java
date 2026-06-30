package wc5;

/* loaded from: classes10.dex */
public final class c0 extends wm3.a {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.List f444539h = kz5.c0.i("4", "27", "28", "152", "153", "156", "157", "159", "160");

    /* renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.app.AppCompatActivity f444540d;

    /* renamed from: e, reason: collision with root package name */
    public kotlinx.coroutines.r2 f444541e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f444542f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f444543g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(androidx.appcompat.app.AppCompatActivity baseActivity) {
        super(baseActivity);
        kotlin.jvm.internal.o.g(baseActivity, "baseActivity");
        this.f444540d = baseActivity;
        this.f444543g = kz5.p0.f313996d;
    }

    public final uc5.r T6() {
        android.view.LayoutInflater.Factory factory = this.f444540d;
        kotlin.jvm.internal.o.e(factory, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryController");
        return (uc5.r) factory;
    }

    public final void U6(java.util.List list) {
        xm3.t0 b17 = xm3.u0.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) T6()).m7());
        if (b17 == null) {
            return;
        }
        java.util.List data = b17.getData();
        java.util.ArrayList arrayList = data instanceof java.util.ArrayList ? (java.util.ArrayList) data : null;
        if (arrayList == null) {
            return;
        }
        uc5.i0 i0Var = new uc5.i0(list);
        if (this.f444542f) {
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (((uc5.l0) it.next()) instanceof uc5.i0) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0) {
                arrayList.set(i17, i0Var);
                b17.notifyItemChanged(i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryPersonRecommendUIC", "updatePersonRecommendRow: index=" + i17 + ", items=" + list.size());
                return;
            }
        }
        arrayList.add(0, i0Var);
        b17.notifyItemInserted(0);
        this.f444542f = true;
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryPersonRecommendUIC", "insertPersonRecommendRow: items=" + list.size());
    }

    public final void V6(java.lang.String query, boolean z17) {
        kotlin.jvm.internal.o.g(query, "query");
        if (!z17 || r26.n0.N(query) || !kotlin.jvm.internal.o.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) T6()).B, com.tencent.mm.ui.chatting.history.groups.q.f201782f)) {
            W6();
            this.f444543g = kz5.p0.f313996d;
        } else {
            kotlinx.coroutines.r2 r2Var = this.f444541e;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            this.f444541e = v65.i.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) T6()).k7(), null, new wc5.b0(this, query, null), 1, null);
        }
    }

    public final void W6() {
        if (this.f444542f) {
            xm3.t0 b17 = xm3.u0.b(((com.tencent.mm.ui.chatting.history.MsgHistoryGalleryUI) T6()).m7());
            if (b17 == null) {
                this.f444542f = false;
                return;
            }
            java.util.List data = b17.getData();
            java.util.ArrayList arrayList = data instanceof java.util.ArrayList ? (java.util.ArrayList) data : null;
            if (arrayList == null) {
                this.f444542f = false;
                return;
            }
            java.util.Iterator it = arrayList.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                } else if (((uc5.l0) it.next()) instanceof uc5.i0) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 >= 0) {
                arrayList.remove(i17);
                b17.notifyItemRemoved(i17);
                com.tencent.mars.xlog.Log.i("MicroMsg.MsgHistoryGalleryPersonRecommendUIC", "removePersonRecommendRow: index=" + i17);
            }
            this.f444542f = false;
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        kotlinx.coroutines.r2 r2Var = this.f444541e;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f444541e = null;
        this.f444542f = false;
        this.f444543g = kz5.p0.f313996d;
        super.onFinished();
    }
}
