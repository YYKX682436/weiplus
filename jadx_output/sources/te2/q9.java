package te2;

/* loaded from: classes10.dex */
public final class q9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.t9 f418360d;

    public q9(te2.t9 t9Var) {
        this.f418360d = t9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f418360d.f418449m;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.f();
        }
    }
}
