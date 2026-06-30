package g63;

/* loaded from: classes8.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI f269152d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f269153e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI gameLifeConversationUI, boolean z17) {
        super(0);
        this.f269152d = gameLifeConversationUI;
        this.f269153e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.gamelife.ui.GameLifeEmptyCoverView gameLifeEmptyCoverView = this.f269152d.f141994m;
        if (gameLifeEmptyCoverView != null) {
            gameLifeEmptyCoverView.setVisibility(this.f269153e ? 0 : 8);
            return jz5.f0.f302826a;
        }
        kotlin.jvm.internal.o.o("emptyCoverView");
        throw null;
    }
}
