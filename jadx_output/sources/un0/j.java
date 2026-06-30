package un0;

/* loaded from: classes13.dex */
public final class j extends android.media.projection.MediaProjection.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429383c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f429384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f429385e;

    public j(kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.h0 h0Var3, kotlin.jvm.internal.h0 h0Var4, kotlin.jvm.internal.c0 c0Var) {
        this.f429381a = h0Var;
        this.f429382b = h0Var2;
        this.f429383c = h0Var3;
        this.f429384d = h0Var4;
        this.f429385e = c0Var;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public void onCapturedContentResize(int i17, int i18) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            super.onCapturedContentResize(i17, i18);
        }
        com.tencent.mars.xlog.Log.i("FinderLiveScreenRecordHelper", "#createRecorder.mMediaProjection.registerCallback.onCapturedContentResize width=" + i17 + " height=" + i18);
    }

    @Override // android.media.projection.MediaProjection.Callback
    public void onCapturedContentVisibilityChanged(boolean z17) {
        java.util.List list;
        java.util.Iterator it;
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            super.onCapturedContentVisibilityChanged(z17);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#createRecorder.mMediaProjection.registerCallback.onCapturedContentVisibilityChanged isVisible=");
        sb6.append(z17);
        sb6.append(" notifyOnCapturedContentChanged=");
        kotlin.jvm.internal.c0 c0Var = this.f429385e;
        sb6.append(c0Var.f310112d);
        com.tencent.mars.xlog.Log.i("FinderLiveScreenRecordHelper", sb6.toString());
        if (c0Var.f310112d || !z17) {
            return;
        }
        un0.h hVar = (un0.h) this.f429381a.f310123d;
        if (hVar != null && (list = hVar.f429362k) != null && (it = list.iterator()) != null) {
            while (it.hasNext()) {
                ((yz5.a) it.next()).invoke();
            }
        }
        c0Var.f310112d = true;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public void onStop() {
        java.util.List list;
        java.util.Iterator it;
        super.onStop();
        com.tencent.mars.xlog.Log.i("FinderLiveScreenRecordHelper", "#createRecorder.mMediaProjection.registerCallback.onStop");
        kotlin.jvm.internal.h0 h0Var = this.f429381a;
        un0.h hVar = (un0.h) h0Var.f310123d;
        if (hVar != null && (list = hVar.f429363l) != null && (it = list.iterator()) != null) {
            while (it.hasNext()) {
                ((yz5.a) it.next()).invoke();
            }
        }
        kotlin.jvm.internal.h0 h0Var2 = this.f429382b;
        android.hardware.display.VirtualDisplay virtualDisplay = (android.hardware.display.VirtualDisplay) h0Var2.f310123d;
        if (virtualDisplay != null) {
            virtualDisplay.release();
        }
        h0Var2.f310123d = null;
        kotlin.jvm.internal.h0 h0Var3 = this.f429383c;
        android.media.AudioRecord audioRecord = (android.media.AudioRecord) h0Var3.f310123d;
        if (audioRecord != null) {
            audioRecord.release();
        }
        h0Var3.f310123d = null;
        kotlin.jvm.internal.h0 h0Var4 = this.f429384d;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) h0Var4.f310123d;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        h0Var4.f310123d = null;
        h0Var.f310123d = null;
        un0.s.f429418b = null;
    }
}
