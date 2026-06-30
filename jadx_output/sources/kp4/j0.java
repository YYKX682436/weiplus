package kp4;

/* loaded from: classes10.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView f311117d;

    public j0(com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView) {
        this.f311117d = multiTrackCropView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView = this.f311117d;
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView = multiTrackCropView.f176023d;
        if (multiTrackRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        if (multiTrackRecyclerView.getWidth() <= 0) {
            com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView2 = multiTrackCropView.f176023d;
            if (multiTrackRecyclerView2 != null) {
                multiTrackRecyclerView2.post(multiTrackCropView.C);
                return;
            } else {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
        }
        multiTrackCropView.c(true);
        multiTrackCropView.f176029m = multiTrackCropView.f176040x / 2;
        kp4.c1 c1Var = multiTrackCropView.A;
        c1Var.f311079i = -2;
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView3 = multiTrackCropView.f176023d;
        if (multiTrackRecyclerView3 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        c1Var.f311073c = multiTrackRecyclerView3.getWidth();
        kp4.c1 c1Var2 = multiTrackCropView.B;
        c1Var2.f311079i = -3;
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView4 = multiTrackCropView.f176023d;
        if (multiTrackRecyclerView4 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        c1Var2.f311073c = multiTrackRecyclerView4.getWidth();
        multiTrackCropView.getTrackList().add(0, multiTrackCropView.A);
        multiTrackCropView.getTrackList().add(multiTrackCropView.B);
        multiTrackCropView.f176025f.x(-1);
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView5 = multiTrackCropView.f176023d;
        if (multiTrackRecyclerView5 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        multiTrackRecyclerView5.f176044b2 = -1;
        multiTrackCropView.f176025f.y(multiTrackCropView.getTrackList());
        multiTrackCropView.f176025f.notifyDataSetChanged();
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView6 = multiTrackCropView.f176023d;
        if (multiTrackRecyclerView6 != null) {
            multiTrackRecyclerView6.post(new kp4.i0(multiTrackCropView));
        } else {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
    }
}
