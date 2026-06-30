package g63;

/* loaded from: classes8.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI f269121d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(com.tencent.mm.plugin.gamelife.ui.GameLifeConversationUI gameLifeConversationUI) {
        super(0);
        this.f269121d = gameLifeConversationUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f269121d.findViewById(com.tencent.mm.R.id.cg7);
        com.tencent.mm.view.TouchableLayout touchableLayout = (com.tencent.mm.view.TouchableLayout) findViewById;
        int i17 = com.tencent.mm.R.id.cix;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(findViewById, com.tencent.mm.R.id.cix);
        if (frameLayout != null) {
            i17 = com.tencent.mm.R.id.f483946cj3;
            androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) x4.b.a(findViewById, com.tencent.mm.R.id.f483946cj3);
            if (recyclerView != null) {
                i17 = com.tencent.mm.R.id.m6e;
                com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = (com.tencent.mm.view.RefreshLoadMoreLayout) x4.b.a(findViewById, com.tencent.mm.R.id.m6e);
                if (refreshLoadMoreLayout != null) {
                    return new a63.c(touchableLayout, touchableLayout, frameLayout, recyclerView, refreshLoadMoreLayout);
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i17)));
    }
}
