package g63;

/* loaded from: classes.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI f269117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI gameLifeConversationUI) {
        super(0);
        this.f269117d = gameLifeConversationUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.gamelife.ui.GameLifeLoadingCoverView gameLifeLoadingCoverView = this.f269117d.f141993i;
        if (gameLifeLoadingCoverView != null) {
            gameLifeLoadingCoverView.setVisibility(8);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("loadingCoverView");
        throw null;
    }
}
