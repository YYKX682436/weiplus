package k53;

/* loaded from: classes8.dex */
public class u0 {

    /* renamed from: k, reason: collision with root package name */
    public static final java.lang.String f304394k = com.tencent.mm.plugin.game.commlib.util.m.b(com.tencent.mm.plugin.game.commlib.util.l.ONE_WEEK) + "haowan/";

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f304395a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f304396b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.game.commlib.view.CycleProgressView f304397c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f304398d;

    /* renamed from: e, reason: collision with root package name */
    public p33.l f304399e;

    /* renamed from: f, reason: collision with root package name */
    public k53.s0 f304400f;

    /* renamed from: g, reason: collision with root package name */
    public long f304401g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f304402h = false;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.model.n0 f304403i = new k53.p0(this);

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.model.m0 f304404j = new k53.r0(this);

    public u0(android.content.Context context, android.view.View view) {
        this.f304395a = context;
        this.f304396b = view;
        this.f304397c = (com.tencent.mm.plugin.game.commlib.view.CycleProgressView) view.findViewById(com.tencent.mm.R.id.f484021cq2);
    }

    public final void a(p33.l lVar, k53.s0 s0Var) {
        if (lVar == null) {
            return;
        }
        this.f304402h = false;
        this.f304399e = lVar;
        this.f304400f = s0Var;
        if (!lVar.f351602d) {
            if (s0Var != null) {
                s0Var.a(new k53.t0(this, lVar));
                return;
            }
            return;
        }
        android.view.View view = this.f304396b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper", "prepareShare", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;Lcom/tencent/mm/plugin/game/media/preview/VideoShareWrapper$PrepareCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper", "prepareShare", "(Lcom/tencent/mm/plugin/game/autogen/ugc/GameVideoItem;Lcom/tencent/mm/plugin/game/media/preview/VideoShareWrapper$PrepareCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r53.f.l().postToWorker(new k53.n0(this, lVar));
    }

    public void b() {
        this.f304402h = true;
        android.view.View view = this.f304396b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper", "stopShare", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/preview/VideoShareWrapper", "stopShare", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean f17 = com.tencent.mm.plugin.webview.modeltools.z.bj().f(this.f304398d);
        com.tencent.mm.plugin.webview.modeltools.z.bj().i(this.f304403i);
        com.tencent.mm.plugin.webview.model.i4 bj6 = com.tencent.mm.plugin.webview.modeltools.z.bj();
        com.tencent.mm.plugin.webview.model.m0 m0Var = this.f304404j;
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = bj6.f182938e;
        if (copyOnWriteArraySet != null && m0Var != null) {
            copyOnWriteArraySet.remove(m0Var);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.VideoShareWrapper", "cancel share task ret:%b, localId:%s", java.lang.Boolean.valueOf(f17), this.f304398d);
    }
}
