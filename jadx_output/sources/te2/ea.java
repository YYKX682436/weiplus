package te2;

/* loaded from: classes10.dex */
public final class ea implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.fa f417984d;

    public ea(te2.fa faVar) {
        this.f417984d = faVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = this.f417984d.f418016o;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.f();
        }
    }
}
