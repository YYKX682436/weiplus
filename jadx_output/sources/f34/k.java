package f34;

/* loaded from: classes11.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f34.m f259357d;

    public k(f34.m mVar) {
        this.f259357d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        f34.m mVar = this.f259357d;
        f34.d dVar = mVar.f259362g;
        dVar.f259328a = 3;
        mVar.f259361f = 3;
        dVar.f259340m = c34.h0.Bi().f259327f;
        c34.x xVar = mVar.f38247d;
        if (xVar != null) {
            ((com.tencent.mm.plugin.shake.ui.ShakeReportUI) xVar).Z6(1250, mVar.f259362g, 2L);
        }
    }
}
