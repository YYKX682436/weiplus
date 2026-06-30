package kn;

/* loaded from: classes11.dex */
public class l implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final kn.k f309412d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f309413e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f309415g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Runnable f309416h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Runnable f309417i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f309418m = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f309414f = null;

    public l(android.content.Context context, kn.k kVar) {
        this.f309413e = context;
        this.f309412d = kVar;
    }

    public final void a(boolean z17, r45.af0 af0Var, int i17) {
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        kn.k kVar = this.f309412d;
        if (kVar != null) {
            com.tencent.mm.chatroom.ui.a2 a2Var = (com.tencent.mm.chatroom.ui.a2) kVar;
            com.tencent.mm.chatroom.ui.h1 h1Var = a2Var.f64026c;
            java.lang.String str = null;
            android.content.Context context = a2Var.f64025b;
            com.tencent.mm.chatroom.ui.ChatroomManagerUI chatroomManagerUI = a2Var.f64024a;
            if (af0Var == null || !z17) {
                int i18 = com.tencent.mm.chatroom.ui.ChatroomManagerUI.f63727s;
                chatroomManagerUI.getClass();
                if (context != null && (resources = context.getResources()) != null) {
                    str = resources.getString(com.tencent.mm.R.string.bq9);
                }
                db5.t7.i(context, str, com.tencent.mm.R.raw.icons_filled_error);
                new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.chatroom.ui.w1(new com.tencent.mm.chatroom.ui.y1(h1Var, i17)), 1000L);
                return;
            }
            int i19 = com.tencent.mm.chatroom.ui.ChatroomManagerUI.f63727s;
            chatroomManagerUI.getClass();
            int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            if (context != null && (resources2 = context.getResources()) != null) {
                str = resources2.getString(com.tencent.mm.R.string.bqa);
            }
            e4Var.f211776c = str;
            e4Var.b(com.tencent.mm.R.raw.icons_filled_done);
            com.tencent.mm.ui.widget.dialog.f4 c17 = e4Var.c();
            kotlin.jvm.internal.o.f(c17, "show(...)");
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.chatroom.ui.w1(new com.tencent.mm.chatroom.ui.z1(context, c17, h1Var, i17)), 1000L);
        }
    }

    public final void b() {
        if (this.f309415g) {
            java.lang.Runnable runnable = this.f309417i;
            if (runnable != null) {
                com.tencent.mm.sdk.platformtools.u3.l(runnable);
            }
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f309414f;
            if (u3Var != null) {
                u3Var.dismiss();
                this.f309414f = null;
            }
        }
        com.tencent.mm.sdk.platformtools.u3.l(this.f309416h);
        gm0.j1.n().f273288b.q(6217, this);
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CheckFinderManagerSwithFun", "onSceneEnd, errType = " + i17 + ", errCode = " + i18 + "," + str);
        if (!(m1Var instanceof kn.q) || m1Var.getType() != 6217) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CheckFinderManagerSwithFun", "not expected scene,  type = " + m1Var.getType());
            return;
        }
        b();
        if (i17 == 0 && i18 == 0) {
            a(true, (r45.af0) ((kn.q) m1Var).f309447e.f70711b.f70700a, 0);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            db5.e1.s(this.f309413e, str, "");
        }
        a(false, null, i18);
    }
}
