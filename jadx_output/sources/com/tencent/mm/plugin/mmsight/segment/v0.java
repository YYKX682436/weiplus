package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes5.dex */
public final class v0 extends androidx.recyclerview.widget.w2 {

    /* renamed from: d, reason: collision with root package name */
    public boolean f149093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView f149094e;

    public v0(com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView) {
        this.f149094e = segmentClipRecyclerThumbBarView;
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView recyclerView, int i17) {
        com.tencent.mm.plugin.vlog.ui.thumb.SegmentClipThumbSeekBarContainer segmentClipThumbSeekBarContainer;
        bg0.y yVar;
        bg0.x behaviorHolder;
        int d17;
        bz0.h hVar;
        java.util.List list;
        com.tencent.mm.plugin.vlog.ui.thumb.SegmentClipThumbSeekBarContainer segmentClipThumbSeekBarContainer2;
        bg0.y yVar2;
        bg0.x behaviorHolder2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/segment/SegmentClipRecyclerThumbBarView$frameRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView = this.f149094e;
        if (i17 != 0) {
            if (i17 == 1) {
                this.f149093d = true;
                com.tencent.mm.plugin.mmsight.segment.e eVar = segmentClipRecyclerThumbBarView.f148916o;
                if (eVar != null) {
                    boolean z17 = segmentClipRecyclerThumbBarView.a() > segmentClipRecyclerThumbBarView.f148908d;
                    kp4.p0 p0Var = (kp4.p0) eVar;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SegmentClip.MediaThumbSeekBarView", "onDown: " + z17);
                    if (z17 && (yVar2 = (segmentClipThumbSeekBarContainer2 = p0Var.f311131a).f176052g) != null && (behaviorHolder2 = segmentClipThumbSeekBarContainer2.getBehaviorHolder()) != null) {
                        dz0.v vVar = (dz0.v) behaviorHolder2;
                        if (vVar.b(yVar2)) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "onSegmentClipUpdateReady: stopPlay");
                            com.tencent.mm.mj_template.maas.uic.MaasSdkUIC maasSdkUIC = vVar.f245035g;
                            kotlinx.coroutines.l.d(maasSdkUIC.getMainScope(), null, null, new dz0.t(maasSdkUIC, null), 3, null);
                        }
                    }
                }
            }
        } else if (this.f149093d) {
            this.f149093d = false;
            com.tencent.mm.plugin.mmsight.segment.e eVar2 = segmentClipRecyclerThumbBarView.f148916o;
            if (eVar2 != null) {
                boolean z18 = segmentClipRecyclerThumbBarView.a() > segmentClipRecyclerThumbBarView.f148908d;
                kp4.p0 p0Var2 = (kp4.p0) eVar2;
                com.tencent.mars.xlog.Log.i("MicroMsg.SegmentClip.MediaThumbSeekBarView", "onUp: " + z18);
                if (z18 && (yVar = (segmentClipThumbSeekBarContainer = p0Var2.f311131a).f176052g) != null && (behaviorHolder = segmentClipThumbSeekBarContainer.getBehaviorHolder()) != null) {
                    dz0.v vVar2 = (dz0.v) behaviorHolder;
                    if (vVar2.b(yVar) && (d17 = vVar2.d(yVar)) >= 0 && (hVar = bz0.j.f36761l) != null && (list = hVar.f36747d) != null) {
                        if (!(list.indexOf(java.lang.Integer.valueOf(d17)) >= 0)) {
                            list.add(java.lang.Integer.valueOf(d17));
                        }
                    }
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/segment/SegmentClipRecyclerThumbBarView$frameRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // androidx.recyclerview.widget.w2
    public void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i17, int i18) {
        com.tencent.mm.plugin.vlog.ui.thumb.SegmentClipThumbSeekBarContainer segmentClipThumbSeekBarContainer;
        bg0.y yVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mmsight/segment/SegmentClipRecyclerThumbBarView$frameRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        if (i17 != 0) {
            com.tencent.mm.plugin.mmsight.segment.SegmentClipRecyclerThumbBarView segmentClipRecyclerThumbBarView = this.f149094e;
            if (segmentClipRecyclerThumbBarView.a() > segmentClipRecyclerThumbBarView.f148908d) {
                int computeHorizontalScrollRange = recyclerView.computeHorizontalScrollRange();
                double computeHorizontalScrollOffset = computeHorizontalScrollRange <= 0 ? 0.0d : recyclerView.computeHorizontalScrollOffset() / computeHorizontalScrollRange;
                double d17 = (segmentClipRecyclerThumbBarView.f148912h * computeHorizontalScrollOffset) / 1000;
                com.tencent.mm.plugin.mmsight.segment.SegmentClipTimeCursorView segmentClipTimeCursorView = segmentClipRecyclerThumbBarView.f148919r;
                java.lang.Object obj = null;
                if (segmentClipTimeCursorView != null) {
                    kotlinx.coroutines.r2 r2Var = segmentClipTimeCursorView.f148928d;
                    if (r2Var != null) {
                        kotlinx.coroutines.p2.a(r2Var, null, 1, null);
                    }
                    segmentClipTimeCursorView.setVisibility(0);
                    double pow = java.lang.Math.pow(10.0d, 1);
                    java.lang.String format = java.lang.String.format("%.1f", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Double.valueOf(java.lang.Math.rint(d17 * pow) / pow)}, 1));
                    kotlin.jvm.internal.o.f(format, "format(...)");
                    java.lang.String string = segmentClipTimeCursorView.getContext().getString(com.tencent.mm.R.string.ief);
                    kotlin.jvm.internal.o.f(string, "getString(...)");
                    java.lang.String format2 = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{format}, 1));
                    kotlin.jvm.internal.o.f(format2, "format(...)");
                    android.widget.TextView textView = segmentClipTimeCursorView.f148931g;
                    if (textView != null) {
                        textView.setText(format2);
                    }
                    segmentClipTimeCursorView.f148928d = kotlinx.coroutines.l.d(v65.m.a(segmentClipTimeCursorView), null, null, new com.tencent.mm.plugin.mmsight.segment.f1(segmentClipTimeCursorView, null), 3, null);
                }
                com.tencent.mm.plugin.mmsight.segment.e eVar = segmentClipRecyclerThumbBarView.f148916o;
                if (eVar != null && (yVar = (segmentClipThumbSeekBarContainer = ((kp4.p0) eVar).f311131a).f176052g) != null) {
                    yVar.f19870f = yVar.f19868d * computeHorizontalScrollOffset;
                    bg0.x behaviorHolder = segmentClipThumbSeekBarContainer.getBehaviorHolder();
                    if (behaviorHolder != null) {
                        dz0.v vVar = (dz0.v) behaviorHolder;
                        if (vVar.b(yVar)) {
                            java.util.Iterator it = vVar.f245031c.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                java.lang.Object next = it.next();
                                if (kotlin.jvm.internal.o.b(((com.tencent.maas.instamovie.a) next).f48165a, yVar.f19865a)) {
                                    obj = next;
                                    break;
                                }
                            }
                            com.tencent.maas.instamovie.a aVar = (com.tencent.maas.instamovie.a) obj;
                            if (aVar != null) {
                                com.tencent.maas.model.time.MJTime fromMilliseconds = com.tencent.maas.model.time.MJTime.fromMilliseconds((long) yVar.f19870f);
                                az0.n7 n7Var = vVar.f245035g.f69783d;
                                if (n7Var != null) {
                                    java.lang.String str = aVar.f48165a;
                                    kotlin.jvm.internal.o.f(str, "getId(...)");
                                    kotlin.jvm.internal.o.d(fromMilliseconds);
                                    n7Var.f15742a.skimToSegment(str, fromMilliseconds);
                                }
                            }
                        }
                    }
                }
                segmentClipRecyclerThumbBarView.getMediaItemStartTimeMsPositionMap().put(segmentClipRecyclerThumbBarView.f148910f, java.lang.Double.valueOf(segmentClipRecyclerThumbBarView.f148912h * computeHorizontalScrollOffset));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mmsight/segment/SegmentClipRecyclerThumbBarView$frameRecyclerScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
