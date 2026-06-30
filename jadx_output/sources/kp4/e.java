package kp4;

/* loaded from: classes10.dex */
public final class e implements com.tencent.mm.plugin.mmsight.segment.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kp4.c1 f311099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kp4.f f311100b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kp4.h f311101c;

    public e(kp4.c1 c1Var, kp4.f fVar, boolean z17, boolean z18, kp4.h hVar) {
        this.f311099a = c1Var;
        this.f311100b = fVar;
        this.f311101c = hVar;
    }

    public void a(boolean z17) {
        kp4.c1 c1Var = this.f311099a;
        c1Var.f311083m = z17;
        c1Var.f311082l = !z17;
        kp4.f fVar = this.f311100b;
        fVar.f311104f.a(c1Var, fVar.f311102d, true, true);
        fVar.f311105g.d(fVar.f311104f.getShowWidth() - (fVar.f311103e * 2), fVar.f311104f.getMinWidth(), fVar.f311103e);
        if (z17) {
            fVar.f311105g.f(true, fVar.f311103e + ((int) ((((float) c1Var.f311074d) / ((float) c1Var.d())) * fVar.f311104f.getTotalFrameWidth())));
            fVar.f311105g.f(false, fVar.f311103e + fVar.f311104f.getFrameWidth());
        } else {
            int d17 = (int) ((((float) (c1Var.f311075e - c1Var.f311074d)) / ((float) c1Var.d())) * fVar.f311104f.getTotalFrameWidth());
            fVar.f311105g.f(true, fVar.f311103e);
            fVar.f311105g.f(false, fVar.f311103e + d17);
        }
        com.tencent.mm.plugin.mmsight.segment.EditSliderSeekBar editSliderSeekBar = fVar.f311105g;
        android.view.ViewGroup.LayoutParams layoutParams = editSliderSeekBar.getLayoutParams();
        layoutParams.width = fVar.f311104f.getShowWidth();
        editSliderSeekBar.setLayoutParams(layoutParams);
        android.view.View view = fVar.itemView;
        android.view.ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.width = fVar.f311104f.getValidWidth();
        view.setLayoutParams(layoutParams2);
        com.tencent.mm.plugin.vlog.ui.thumb.EditFrameListView editFrameListView = fVar.f311104f;
        android.view.ViewGroup.LayoutParams layoutParams3 = editFrameListView.getLayoutParams();
        layoutParams3.width = fVar.f311104f.getShowWidth();
        editFrameListView.setLayoutParams(layoutParams3);
        fVar.itemView.setLayoutDirection(z17 ? 1 : 0);
        long j17 = c1Var.f311074d;
        c1Var.d();
        fVar.f311104f.getTotalWidth();
        int i17 = fVar.f311103e;
        kp4.g gVar = this.f311101c.f311112g;
        if (gVar != null) {
            int adapterPosition = fVar.getAdapterPosition();
            com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView = ((kp4.f0) gVar).f311107a;
            multiTrackCropView.f176039w = true;
            com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView = multiTrackCropView.f176023d;
            if (multiTrackRecyclerView == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            int makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView2 = multiTrackCropView.f176023d;
            if (multiTrackRecyclerView2 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            multiTrackRecyclerView.measure(makeMeasureSpec, android.view.View.MeasureSpec.makeMeasureSpec(multiTrackRecyclerView2.getHeight(), 1073741824));
            com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView3 = multiTrackCropView.f176023d;
            if (multiTrackRecyclerView3 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            int width = multiTrackRecyclerView3.getWidth();
            com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView4 = multiTrackCropView.f176023d;
            if (multiTrackRecyclerView4 == null) {
                kotlin.jvm.internal.o.o("recyclerView");
                throw null;
            }
            multiTrackRecyclerView3.layout(0, 0, width, multiTrackRecyclerView4.getHeight());
            if (z17) {
                int i18 = adapterPosition - 1;
                long j18 = multiTrackCropView.getTrackList().get(adapterPosition).f311075e;
                kp4.c0 callback = multiTrackCropView.getCallback();
                if (callback != null) {
                    callback.b(i18, z17, 0L, multiTrackCropView.getTrackList().get(adapterPosition).f311075e);
                    return;
                }
                return;
            }
            int i19 = adapterPosition - 1;
            long j19 = multiTrackCropView.getTrackList().get(adapterPosition).f311074d;
            multiTrackCropView.getTrackList().get(adapterPosition).d();
            kp4.c0 callback2 = multiTrackCropView.getCallback();
            if (callback2 != null) {
                callback2.b(i19, z17, multiTrackCropView.getTrackList().get(adapterPosition).f311074d, multiTrackCropView.getTrackList().get(adapterPosition).d());
            }
        }
    }
}
