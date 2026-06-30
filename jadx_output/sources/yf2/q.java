package yf2;

/* loaded from: classes3.dex */
public final class q extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f461769m;

    /* renamed from: n, reason: collision with root package name */
    public final int f461770n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f461769m = "Finder.FinderStartLiveGameStickerWidget";
        this.f461770n = 2345;
    }

    @Override // if2.e
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.ui.MMActivity N6;
        r45.z53 z53Var;
        if (((mm2.c1) business(mm2.c1.class)).T7() && i17 == this.f461770n && (N6 = N6()) != null) {
            r45.n73 n73Var = (r45.n73) ((kotlinx.coroutines.flow.h3) ((mm2.g1) getStore().business(mm2.g1.class)).f329071i).getValue();
            java.lang.String string = (n73Var == null || (z53Var = (r45.z53) n73Var.getCustom(1)) == null) ? null : z53Var.getString(0);
            if (string != null) {
                ke2.y yVar = new ke2.y(string, 0, false, null, false, null, 60, null);
                yVar.t(N6, N6.getResources().getString(com.tencent.mm.R.string.f9y), 800L);
                yVar.l().f(N6).K(new yf2.p(this, string));
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }
}
