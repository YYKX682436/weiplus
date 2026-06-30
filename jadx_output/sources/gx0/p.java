package gx0;

/* loaded from: classes5.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w f276808d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(gx0.w wVar) {
        super(0);
        this.f276808d = wVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel baseComposingPanel;
        gx0.w wVar = this.f276808d;
        if (wVar.Z6().X6() && (baseComposingPanel = wVar.Z6().f69240i) != null) {
            baseComposingPanel.e(false, true);
        }
        return jz5.f0.f302826a;
    }
}
