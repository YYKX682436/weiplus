package p10;

/* loaded from: classes8.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f350975d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView) {
        super(2);
        this.f350975d = magicDebugPanelView;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String cpuProfilePath = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(cpuProfilePath, "cpuProfilePath");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("finishProfile done, success=");
        sb6.append(booleanValue);
        sb6.append(", cpuProfilePath=");
        sb6.append(cpuProfilePath);
        sb6.append(", shouldUpload=");
        com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView = this.f350975d;
        sb6.append(magicDebugPanelView.f65829v);
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicDebugPanelView", sb6.toString());
        magicDebugPanelView.f65814d.post(new p10.o(magicDebugPanelView));
        return jz5.f0.f302826a;
    }
}
