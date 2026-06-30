package yt3;

/* loaded from: classes10.dex */
public final class u2 implements com.tencent.mm.plugin.mmsight.ui.b2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.z2 f465689a;

    public u2(yt3.z2 z2Var) {
        this.f465689a = z2Var;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.b2
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveRecordButtonPlugin", "onProgressFinish");
        this.f465689a.m(z17);
    }
}
