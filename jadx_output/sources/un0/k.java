package un0;

/* loaded from: classes13.dex */
public final class k extends android.hardware.display.VirtualDisplay.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f429386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429387b;

    public k(kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var) {
        this.f429386a = c0Var;
        this.f429387b = h0Var;
    }

    @Override // android.hardware.display.VirtualDisplay.Callback
    public void onPaused() {
        super.onPaused();
        com.tencent.mars.xlog.Log.i("FinderLiveScreenRecordHelper", "#createRecorder.VirtualDisplay.onPaused");
    }

    @Override // android.hardware.display.VirtualDisplay.Callback
    public void onResumed() {
        java.util.List list;
        java.util.Iterator it;
        super.onResumed();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#createRecorder.VirtualDisplay.onResumed notifyOnCapturedContentChanged=");
        kotlin.jvm.internal.c0 c0Var = this.f429386a;
        sb6.append(c0Var.f310112d);
        com.tencent.mars.xlog.Log.i("FinderLiveScreenRecordHelper", sb6.toString());
        if (c0Var.f310112d) {
            return;
        }
        un0.h hVar = (un0.h) this.f429387b.f310123d;
        if (hVar != null && (list = hVar.f429362k) != null && (it = list.iterator()) != null) {
            while (it.hasNext()) {
                ((yz5.a) it.next()).invoke();
            }
        }
        c0Var.f310112d = true;
    }

    @Override // android.hardware.display.VirtualDisplay.Callback
    public void onStopped() {
        super.onStopped();
        com.tencent.mars.xlog.Log.i("FinderLiveScreenRecordHelper", "#createRecorder.VirtualDisplay.onStopped");
    }
}
