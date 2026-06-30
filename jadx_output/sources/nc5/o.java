package nc5;

/* loaded from: classes10.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f336213a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f336214b;

    /* renamed from: c, reason: collision with root package name */
    public final int f336215c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f336216d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f336217e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f336218f;

    /* renamed from: g, reason: collision with root package name */
    public nc5.u f336219g;

    /* renamed from: h, reason: collision with root package name */
    public int f336220h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f336221i;

    /* renamed from: j, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f336222j;

    /* renamed from: k, reason: collision with root package name */
    public kotlinx.coroutines.r2 f336223k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f336224l;

    public o(android.content.Context activity, java.lang.String chatRoomId, int i17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(chatRoomId, "chatRoomId");
        this.f336213a = activity;
        this.f336214b = chatRoomId;
        this.f336215c = i17;
        kotlinx.coroutines.y0 b17 = kotlinx.coroutines.z0.b();
        this.f336222j = b17;
        this.f336216d = ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ri();
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "initView >> " + hashCode());
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ui();
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Di(9);
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        android.view.View findViewById = mMActivity.findViewById(com.tencent.mm.R.id.me7);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f336217e = mMActivity.findViewById(com.tencent.mm.R.id.hii);
        this.f336218f = (androidx.recyclerview.widget.RecyclerView) mMActivity.findViewById(com.tencent.mm.R.id.hik);
        if (!((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Ni()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c("");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/gallery/query/MediaHistoryQueryHeaderUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f336218f;
        kotlin.jvm.internal.o.d(recyclerView);
        this.f336219g = new nc5.u(recyclerView, activity);
        this.f336220h = i65.a.c(activity, com.tencent.mm.ui.bl.c(activity));
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "navigationBarHeight: " + this.f336220h);
        if (this.f336216d) {
            if (!a()) {
                ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).wi(chatRoomId);
            }
            nc5.u uVar = this.f336219g;
            if (uVar != null) {
                uVar.a(new nc5.c(this), new nc5.d(this));
            }
            if (!a()) {
                aq.n nVar = aq.o.f12922c;
                boolean z17 = nVar != null ? nVar.f12910e : false;
                com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "getManagerIsDoingWork >> " + z17);
                if (!z17) {
                    this.f336224l = true;
                    this.f336223k = kotlinx.coroutines.l.d(b17, kotlinx.coroutines.q1.f310570c, null, new nc5.e(this, null), 2, null);
                }
            }
        } else {
            androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f336218f;
            if (recyclerView2 != null) {
                recyclerView2.setVisibility(8);
            }
            c("");
        }
        android.view.View view = this.f336217e;
        if (view != null) {
            view.setOnClickListener(new nc5.f(this));
        }
    }

    public final boolean a() {
        int i17 = this.f336215c;
        return i17 == 3 || i17 == 4;
    }

    public final void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "onFinish" + hashCode());
        if (a()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("RESULT_OPEN_FEATURE", this.f336221i);
            android.content.Context context = this.f336213a;
            kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((com.tencent.mm.ui.MMActivity) context).setResult(-1, intent);
        }
    }

    public final void c(java.lang.String exposeQuery) {
        kotlin.jvm.internal.o.g(exposeQuery, "exposeQuery");
        ((ku5.t0) ku5.t0.f312615d).q(new nc5.h(this, exposeQuery));
    }

    public final void d() {
        android.view.View inflate = com.tencent.mm.ui.id.b(this.f336213a).inflate(com.tencent.mm.R.layout.bmc, (android.view.ViewGroup) null);
        com.tencent.mm.ui.widget.dialog.z2 z2Var = new com.tencent.mm.ui.widget.dialog.z2(this.f336213a, 0, 0, false, true);
        z2Var.j(inflate);
        z2Var.C();
        ((c61.ec) ((qk.x7) i95.n0.c(qk.x7.class))).Bi(101);
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.czi)).setOnClickListener(new nc5.j(z2Var));
        ((android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.czr)).setOnClickListener(new nc5.l(this, z2Var));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484087cz2)).setOnClickListener(new nc5.m(this));
        ((android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f484088cz3)).setOnClickListener(new nc5.n(this, z2Var));
    }
}
