package kp4;

/* loaded from: classes10.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView f311125d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f311126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp4.c1 f311127f;

    public m0(com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView, int i17, kp4.c1 c1Var) {
        this.f311125d = multiTrackCropView;
        this.f311126e = i17;
        this.f311127f = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackCropView multiTrackCropView = this.f311125d;
        com.tencent.mm.plugin.vlog.ui.thumb.MultiTrackRecyclerView multiTrackRecyclerView = multiTrackCropView.f176023d;
        if (multiTrackRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        multiTrackRecyclerView.f176044b2 = this.f311126e;
        multiTrackCropView.f176025f.x(this.f311127f.f311079i);
    }
}
