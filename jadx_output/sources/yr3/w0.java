package yr3;

/* loaded from: classes11.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yr3.c1 f465061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f465062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.v70 f465063f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.o5 f465064g;

    public w0(yr3.c1 c1Var, bw5.lp0 lp0Var, bw5.v70 v70Var, r45.o5 o5Var) {
        this.f465061d = c1Var;
        this.f465062e = lp0Var;
        this.f465063f = v70Var;
        this.f465064g = o5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f465061d.f464759x) {
            yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.tencent.mm.ui.jk.f209011a.a();
        yr3.c1 c1Var = this.f465061d;
        bw5.lp0 tingItem = this.f465062e;
        kotlin.jvm.internal.o.f(tingItem, "$tingItem");
        bw5.v70 v70Var = this.f465063f;
        r45.o5 o5Var = this.f465064g;
        c1Var.f464759x = true;
        java.lang.String listenId = v70Var.getListenId();
        bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
        long j17 = 1212;
        com.tencent.wechat.iam.biz.o oVar = com.tencent.wechat.iam.biz.o.f217761b;
        java.lang.Boolean bool = c1Var.f464757v;
        if (bool == null) {
            r45.m5 m5Var = o5Var.f381938y1;
            bool = m5Var != null ? java.lang.Boolean.valueOf(m5Var.f380153d) : null;
        }
        if (kotlin.jvm.internal.o.b(bool, java.lang.Boolean.TRUE)) {
            oVar.f(listenId, j17, new yr3.z0(c1Var));
        } else {
            oVar.a(tingItem, 1212, new yr3.a1(c1Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/msg/holder/MsgSingleAudioViewHolder$bind$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
