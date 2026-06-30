package sp2;

/* loaded from: classes3.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f411218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f411219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f411220f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.j01 f411221g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(com.tencent.mm.ui.MMActivity mMActivity, sp2.d3 d3Var, android.content.Intent intent, r45.j01 j01Var) {
        super(0);
        this.f411218d = mMActivity;
        this.f411219e = d3Var;
        this.f411220f = intent;
        this.f411221g = j01Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sp2.d3 d3Var = this.f411219e;
        int i17 = d3Var.f411012f;
        com.tencent.mm.ui.MMActivity context = this.f411218d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.assist.a9.a(com.tencent.mm.plugin.finder.assist.d9.f102093f, context, context.getResources().getString(com.tencent.mm.R.string.f9y), 500L, null, 8, null);
        android.content.Intent intent = this.f411220f;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_TYPE", i17);
        intent.putExtra("KEY_PARAMS_ANCHOR_LIVE_PATH_ENTRANCE_ID", d3Var.f411011e);
        ((com.tencent.mm.plugin.finder.assist.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Kj(context, this.f411221g, intent, false);
        return jz5.f0.f302826a;
    }
}
