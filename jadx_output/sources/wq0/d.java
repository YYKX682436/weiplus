package wq0;

/* loaded from: classes7.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer f448498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq0.e0 f448499e;

    public d(com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer, hq0.e0 e0Var) {
        this.f448498d = magicSclViewContainer;
        this.f448499e = e0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        com.tencent.mm.magicbrush.plugin.scl.view.MagicSclViewContainer magicSclViewContainer = this.f448498d;
        fq0.x frameSet = magicSclViewContainer.getFrameSet();
        sb6.append(frameSet != null ? frameSet.hashCode() : 0);
        sb6.append(" notify bind:");
        sb6.append(this.f448499e);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicSclViewContainer", sb6.toString());
        fq0.x frameSet2 = magicSclViewContainer.getFrameSet();
        if (frameSet2 != null) {
            frameSet2.b();
        }
    }
}
