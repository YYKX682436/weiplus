package vq2;

/* loaded from: classes2.dex */
public final class c extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.nearby.ui.bullet.PlayTogetherBulletView f439245a;

    public c(com.tencent.mm.plugin.finder.nearby.ui.bullet.PlayTogetherBulletView playTogetherBulletView) {
        this.f439245a = playTogetherBulletView;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mm.plugin.finder.nearby.ui.bullet.PlayTogetherBulletView playTogetherBulletView = this.f439245a;
        if (!z17) {
            zm0.i iVar = playTogetherBulletView.f122111e;
            if (iVar != null) {
                iVar.d();
                return;
            }
            return;
        }
        zm0.i iVar2 = playTogetherBulletView.f122111e;
        if (iVar2 != null) {
            com.tencent.mars.xlog.Log.i("LinearBulletManager", "start: isStart=" + iVar2.f474124e);
            if (iVar2.f474124e) {
                return;
            }
            iVar2.f474124e = true;
            android.view.Choreographer.getInstance().postFrameCallback(iVar2.f474128i);
        }
    }
}
