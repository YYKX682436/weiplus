package p10;

/* loaded from: classes7.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView f351007d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.feature.ecs.nirvana.ui.MagicDebugPanelView magicDebugPanelView) {
        super(1);
        this.f351007d = magicDebugPanelView;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String result = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(result, "result");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicDebugPanelView", "takeHeapSnapshot evaluate done, result=".concat(result));
        this.f351007d.f65814d.post(new p10.u(result));
        return jz5.f0.f302826a;
    }
}
