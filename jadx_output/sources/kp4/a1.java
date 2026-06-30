package kp4;

/* loaded from: classes10.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView f311085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f311086e;

    public a1(com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView trackCropView, java.util.LinkedList linkedList, long j17) {
        this.f311085d = trackCropView;
        this.f311086e = linkedList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.ui.thumb.TrackCropView trackCropView = this.f311085d;
        androidx.recyclerview.widget.RecyclerView recyclerView = trackCropView.f176055e;
        if (recyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        if (recyclerView.getWidth() <= 0) {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = trackCropView.f176055e;
            if (recyclerView2 != null) {
                recyclerView2.post(trackCropView.f176072y);
                return;
            } else {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
        }
        trackCropView.f176066s = i65.a.b(trackCropView.getContext(), 40);
        if (trackCropView.f176055e == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        float height = (r2.getHeight() * 1.0f) / trackCropView.f176059i;
        androidx.recyclerview.widget.RecyclerView recyclerView3 = trackCropView.f176055e;
        if (recyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        int width = recyclerView3.getWidth() - (trackCropView.f176066s * 2);
        trackCropView.f176067t = width;
        float f17 = (width * 1.0f) / ((float) trackCropView.f176062o);
        trackCropView.f176065r = f17;
        int i17 = (int) (f17 * ((float) trackCropView.f176061n));
        trackCropView.getClass();
        float f18 = i17 / (trackCropView.f176060m * height);
        java.util.LinkedList<kp4.c1> linkedList = this.f311086e;
        for (kp4.c1 c1Var : linkedList) {
            c1Var.f311076f = ((f18 / ((float) trackCropView.f176061n)) * ((float) (c1Var.f311075e - c1Var.f311074d))) / c1Var.f311097n.f175627l.f397506h;
            c1Var.f();
        }
        kp4.c1 c1Var2 = trackCropView.f176068u;
        int i18 = trackCropView.f176066s;
        c1Var2.f311073c = i18;
        kp4.c1 c1Var3 = trackCropView.f176069v;
        c1Var3.f311073c = i18;
        float f19 = (float) trackCropView.f176063p;
        float f27 = trackCropView.f176065r;
        int max = java.lang.Math.max(0, java.lang.Math.min((int) (f19 * f27), (int) ((((float) trackCropView.f176064q) * f27) - trackCropView.f176067t)));
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = trackCropView.f176056f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(-max));
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(linearLayoutManager, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$setTrack$4", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linearLayoutManager.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(linearLayoutManager, "com/tencent/mm/plugin/vlog/ui/thumb/TrackCropView$setTrack$4", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        linkedList.add(0, c1Var2);
        linkedList.add(c1Var3);
        kp4.r rVar = trackCropView.f176057g;
        rVar.z(linkedList);
        rVar.notifyDataSetChanged();
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar seekSlider = trackCropView.getSeekSlider();
        if (seekSlider != null) {
            androidx.recyclerview.widget.RecyclerView recyclerView4 = trackCropView.f176055e;
            if (recyclerView4 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            int width2 = recyclerView4.getWidth();
            int i19 = trackCropView.f176066s;
            seekSlider.post(new com.tencent.mm.plugin.mmsight.segment.i1(seekSlider, width2 - (i19 * 2), i19, (int) (((float) 3000) * trackCropView.f176065r)));
        }
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar seekSlider2 = trackCropView.getSeekSlider();
        if (seekSlider2 != null) {
            seekSlider2.setCursorPos(0.0f);
        }
        com.tencent.mm.plugin.mmsight.segment.SliderSeekBar seekSlider3 = trackCropView.getSeekSlider();
        if (seekSlider3 != null) {
            seekSlider3.post(new kp4.z0(trackCropView, max));
        }
    }
}
