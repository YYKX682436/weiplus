package pe3;

/* loaded from: classes7.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ se3.f f353682d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f353683e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(se3.f fVar, n0.v2 v2Var) {
        super(1);
        this.f353682d = fVar;
        this.f353683e = v2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.content.Context it = (android.content.Context) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView magicBrushSclDemoView = new com.tencent.mm.plugin.magicbrush.scldemo.view.MagicBrushSclDemoView(it, null, 0, 6, null);
        magicBrushSclDemoView.e(this.f353682d.f406916a);
        magicBrushSclDemoView.setUnbindFrameSetOnDetach(false);
        magicBrushSclDemoView.setOnSizeChangeListener(new pe3.v(this.f353683e));
        return magicBrushSclDemoView;
    }
}
