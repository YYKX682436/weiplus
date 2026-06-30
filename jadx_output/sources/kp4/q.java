package kp4;

/* loaded from: classes10.dex */
public final class q extends kp4.n {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.vlog.ui.thumb.FrameListView f311132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kp4.r f311133e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(kp4.r rVar, android.view.View itemView) {
        super(rVar, itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f311133e = rVar;
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.gdt);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f311132d = (com.tencent.mm.plugin.vlog.ui.thumb.FrameListView) findViewById;
    }

    @Override // kp4.n
    public void i(kp4.a trackInfo) {
        kotlin.jvm.internal.o.g(trackInfo, "trackInfo");
        kp4.r rVar = this.f311133e;
        boolean z17 = rVar.f311141m;
        com.tencent.mm.plugin.vlog.ui.thumb.FrameListView frameListView = this.f311132d;
        if (z17) {
            boolean z18 = getAdapterPosition() != rVar.f311136e;
            boolean z19 = getAdapterPosition() != rVar.f311137f;
            frameListView.f176010p = true;
            frameListView.f176011q = true;
            frameListView.f176012r = z18;
            frameListView.f176013s = z19;
        } else {
            boolean z27 = getAdapterPosition() == rVar.f311136e;
            boolean z28 = getAdapterPosition() == rVar.f311137f;
            frameListView.f176010p = z27;
            frameListView.f176011q = z28;
            frameListView.f176012r = false;
            frameListView.f176013s = false;
        }
        kp4.s0 s0Var = rVar.f311140i;
        if (s0Var != null) {
            frameListView.setThumbFetcherFactory(s0Var);
        }
        frameListView.setTrackInfo(trackInfo);
        this.itemView.setBackground(null);
        android.view.View view = this.itemView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder", "onBind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder", "onBind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i17 = rVar.f311138g;
        if (i17 >= 0) {
            if (trackInfo.f311079i == i17) {
                android.view.View view2 = this.itemView;
                view2.setBackground(i65.a.i(view2.getContext(), com.tencent.mm.R.drawable.b96));
            } else {
                android.view.View view3 = this.itemView;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder", "onBind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/vlog/ui/thumb/FrameListAdapter$FrameViewHolder", "onBind", "(Lcom/tencent/mm/plugin/vlog/ui/thumb/BaseTrackThumbInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        this.itemView.setOnClickListener(new kp4.p(rVar, this));
    }

    @Override // kp4.n
    public void j() {
        com.tencent.mm.plugin.vlog.ui.thumb.FrameListView frameListView = this.f311132d;
        rm5.k kVar = frameListView.f176018x;
        if (kVar != null) {
            kVar.destroy();
        }
        frameListView.f176018x = null;
        frameListView.f176003f = null;
        com.tencent.mars.xlog.Log.i(frameListView.f176001d, "clearThumb");
        frameListView.f176004g.clear();
        frameListView.f176005h = null;
        frameListView.postInvalidate();
    }
}
