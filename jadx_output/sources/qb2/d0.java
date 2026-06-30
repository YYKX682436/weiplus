package qb2;

/* loaded from: classes10.dex */
public final class d0 implements wn.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qb2.t f361189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f361190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qb2.g0 f361191f;

    public d0(qb2.t tVar, android.view.View view, qb2.g0 g0Var) {
        this.f361189d = tVar;
        this.f361190e = view;
        this.f361191f = g0Var;
    }

    @Override // wn.q
    public void G4() {
        com.tencent.mars.xlog.Log.i("Finder.ConversationOnClickListener", "onChattingUIEnter");
        zy2.e6 e6Var = (zy2.e6) i95.n0.c(zy2.e6.class);
        com.tencent.mm.storage.z3 z3Var = this.f361189d.D1;
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        com.tencent.mm.plugin.finder.service.s1 s1Var = (com.tencent.mm.plugin.finder.service.s1) e6Var;
        s1Var.getClass();
        s1Var.Bi(d17, true);
    }

    @Override // wn.q
    public boolean c3() {
        com.tencent.mars.xlog.Log.i("Finder.ConversationOnClickListener", "onChattingUIExit");
        ra5.c cVar = new ra5.c(this.f361190e);
        java.util.regex.Pattern pattern = pm0.v.f356802a;
        com.tencent.mm.sdk.platformtools.u3.i(cVar, 0L);
        com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment finderBaseConversationFragment = this.f361191f.f361211a;
        if (!(finderBaseConversationFragment instanceof com.tencent.mm.plugin.finder.ui.FinderBaseConversationFragment)) {
            return false;
        }
        finderBaseConversationFragment.L0();
        return false;
    }
}
