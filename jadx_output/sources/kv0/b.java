package kv0;

/* loaded from: classes5.dex */
public class b extends com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel Y6() {
        return new kv0.a(getActivity());
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k
    public void a7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel) {
        kv0.a panel = (kv0.a) baseComposingPanel;
        kotlin.jvm.internal.o.g(panel, "panel");
    }

    public final void k7(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k childPanelUIC, java.util.Map map, zw0.b entrance, com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.o oVar) {
        hv0.i panelAnimation;
        kotlin.jvm.internal.o.g(childPanelUIC, "childPanelUIC");
        kotlin.jvm.internal.o.g(entrance, "entrance");
        kv0.a aVar = (kv0.a) this.f69240i;
        if (aVar == null || (panelAnimation = aVar.getPanelAnimation()) == null) {
            return;
        }
        h7(childPanelUIC, map, new zw0.e(entrance, zw0.d.f476561f), (hv0.f) ((jz5.n) panelAnimation.f285262c).getValue(), oVar);
    }
}
