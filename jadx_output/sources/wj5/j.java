package wj5;

/* loaded from: classes3.dex */
public final class j implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f446809e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f446810f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f446811g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f446812h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446813i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ wj5.l f446814m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f446815n;

    public j(java.lang.String str, in5.s0 s0Var, int i17, long j17, long j18, java.lang.String str2, wj5.l lVar, int i18) {
        this.f446808d = str;
        this.f446809e = s0Var;
        this.f446810f = i17;
        this.f446811g = j17;
        this.f446812h = j18;
        this.f446813i = str2;
        this.f446814m = lVar;
        this.f446815n = i18;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/tipsbar/convert/FinderLiveTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.String anchorUsername = this.f446808d;
        boolean z17 = anchorUsername == null || anchorUsername.length() == 0;
        long j17 = this.f446812h;
        if (!z17) {
            if (kotlin.jvm.internal.o.b(anchorUsername, ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(this.f446809e.f293121e))) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("KEY_PARAMS_SOURCE_TYPE", this.f446810f);
                ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).oj(intent, com.tencent.mm.sdk.platformtools.x2.f193071a, this.f446811g, java.lang.Long.valueOf(j17), this.f446813i, "", "", "", "");
                yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/FinderLiveTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
        android.content.Intent intent2 = new android.content.Intent();
        wj5.l lVar = this.f446814m;
        intent2.putExtra("key_enter_live_param_is_from_chat_group", lVar.f446818e.D());
        if (lVar.f446818e.D()) {
            if (r26.i0.n(lVar.f446818e.x(), "@chatroom", false)) {
                intent2.putExtra("KEY_ENTER_LIVE_PARAM_BOX_GROUP_ID", lVar.f446818e.x());
                intent2.putExtra("KEY_ENTER_LIVE_PARAM_BOX_GROUP_TO_LIVEID", j17);
            }
        }
        s40.q0 q0Var = (s40.q0) i95.n0.c(s40.q0.class);
        ((v80.n) ((w80.j) i95.n0.c(w80.j.class))).getClass();
        ml2.x1 x1Var = ml2.x1.f328201e;
        long j18 = this.f446811g;
        long j19 = this.f446812h;
        kotlin.jvm.internal.o.f(anchorUsername, "$anchorUsername");
        ((com.tencent.mm.feature.finder.live.i1) q0Var).wi(7L, j18, j19, anchorUsername, this.f446815n);
        ((com.tencent.mm.feature.finder.live.i1) ((s40.q0) i95.n0.c(s40.q0.class))).getClass();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        java.lang.String concat = "3-28-65-".concat(r26.i0.t(uuid, "-", "", false));
        r45.m84 m84Var = new r45.m84();
        m84Var.set(0, java.lang.Long.valueOf(this.f446811g));
        m84Var.set(1, java.lang.Long.valueOf(j17));
        m84Var.set(2, this.f446813i);
        m84Var.set(3, anchorUsername);
        m84Var.set(4, "");
        m84Var.set(5, "");
        m84Var.set(6, null);
        r45.wk0 wk0Var = new r45.wk0();
        wk0Var.set(0, concat);
        wk0Var.set(1, "");
        wk0Var.set(3, -1);
        wk0Var.set(4, -1);
        wk0Var.set(5, 1);
        ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
        android.app.Activity g17 = lVar.f446818e.g();
        kotlin.jvm.internal.o.f(g17, "getContext(...)");
        ((vd2.f1) e0Var).Ri(g17, intent2, m84Var, true, wk0Var, null);
        yj0.a.h(this, "com/tencent/mm/ui/tipsbar/convert/FinderLiveTipsBarConvert$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
