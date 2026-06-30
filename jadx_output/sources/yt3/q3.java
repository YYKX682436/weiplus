package yt3;

/* loaded from: classes10.dex */
public final class q3 implements com.tencent.mm.plugin.mmsight.ui.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.r3 f465613a;

    public q3(yt3.r3 r3Var) {
        this.f465613a = r3Var;
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.x
    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.RecordButtonPlugin", "onProgressFinish");
        this.f465613a.n(z17);
    }

    @Override // com.tencent.mm.plugin.mmsight.ui.x
    public void b(java.util.ArrayList subProgress) {
        kotlin.jvm.internal.o.g(subProgress, "subProgress");
        yz5.l lVar = this.f465613a.f465641v;
        if (lVar != null) {
            lVar.invoke(subProgress);
        }
    }
}
