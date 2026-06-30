package fk2;

/* loaded from: classes3.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.tq1 f263414d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fk2.m0 f263415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f263416f;

    public k0(r45.tq1 tq1Var, fk2.m0 m0Var, android.content.Context context) {
        this.f263414d = tq1Var;
        this.f263415e = m0Var;
        this.f263416f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemGameChallengeArena$onBindGameChallengeArenaMsg$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mars.xlog.Log.i("CommentItemGameChallengeArena", "Game challenge arena message clicked.");
        r45.tq1 tq1Var = this.f263414d;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) tq1Var.getCustom(2);
        if (finderJumpInfo != null) {
            java.lang.String string = tq1Var.getString(3);
            fk2.m0 m0Var = this.f263415e;
            com.tencent.mm.plugin.finder.live.view.k0 p17 = m0Var.f445240a.p();
            if (p17 != null) {
                boolean isLandscape = p17.isLandscape();
                android.content.Context context = this.f263416f;
                if (isLandscape) {
                    df2.qf qfVar = (df2.qf) p17.getController(df2.qf.class);
                    if (qfVar != null) {
                        qfVar.W6(new fk2.l0(m0Var, context, finderJumpInfo, string));
                    }
                } else {
                    m0Var.q(context, finderJumpInfo, string);
                }
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("CommentItemGameChallengeArena", "Game challenge arena message jumpInfo is null");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/model/commentitem/CommentItemGameChallengeArena$onBindGameChallengeArenaMsg$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
