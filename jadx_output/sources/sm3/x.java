package sm3;

/* loaded from: classes10.dex */
public final class x extends androidx.recyclerview.widget.a1 {

    /* renamed from: a, reason: collision with root package name */
    public int f409915a;

    /* renamed from: b, reason: collision with root package name */
    public int f409916b = -1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView f409917c;

    public x(com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView) {
        this.f409917c = mvTracksEditView;
    }

    @Override // androidx.recyclerview.widget.a1
    public int getMovementFlags(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        if (!(this.f409917c.getSelectedIndex() != -1) && recyclerView.getScrollState() == 0 && (viewHolder instanceof sm3.n)) {
            return androidx.recyclerview.widget.a1.makeMovementFlags(15, 0);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.a1
    public void onChildDraw(android.graphics.Canvas c17, androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder, float f17, float f18, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        if (i17 != 2) {
            super.onChildDraw(c17, recyclerView, viewHolder, f17, f18, i17, z17);
            return;
        }
        com.tencent.mm.plugin.mv.ui.widget.MvTracksEditView mvTracksEditView = this.f409917c;
        sm3.u callback = mvTracksEditView.getCallback();
        if (callback != null) {
            ((mm3.h) callback).a(mvTracksEditView.f152022r + f18, sm3.v.f409911d, mvTracksEditView.getDraggingIndex());
        }
        super.onChildDraw(c17, recyclerView, viewHolder, f17 - this.f409915a, f18, i17, z17);
    }

    @Override // androidx.recyclerview.widget.a1
    public boolean onMove(androidx.recyclerview.widget.RecyclerView recyclerView, androidx.recyclerview.widget.k3 viewHolder, androidx.recyclerview.widget.k3 target) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
        kotlin.jvm.internal.o.g(target, "target");
        if (!(viewHolder instanceof sm3.n) || !(target instanceof sm3.n)) {
            return false;
        }
        sm3.n nVar = (sm3.n) viewHolder;
        int i17 = nVar.i();
        sm3.n nVar2 = (sm3.n) target;
        int i18 = nVar2.i();
        this.f409916b = nVar2.i();
        com.tencent.mars.xlog.Log.i("MicroMsg.MvTracksEditView", "move " + i17 + " => " + i18);
        androidx.recyclerview.widget.f2 adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return true;
        }
        adapter.notifyItemMoved(nVar.getAdapterPosition(), nVar2.getAdapterPosition());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016b  */
    @Override // androidx.recyclerview.widget.a1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onSelectedChanged(androidx.recyclerview.widget.k3 r19, int r20) {
        /*
            Method dump skipped, instructions count: 809
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sm3.x.onSelectedChanged(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.a1
    public void onSwiped(androidx.recyclerview.widget.k3 viewHolder, int i17) {
        kotlin.jvm.internal.o.g(viewHolder, "viewHolder");
    }
}
