package sj3;

/* loaded from: classes14.dex */
public final class o3 {

    /* renamed from: e, reason: collision with root package name */
    public static final sj3.n3 f408666e = new sj3.n3(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI f408667a;

    /* renamed from: b, reason: collision with root package name */
    public uj3.p f408668b;

    /* renamed from: c, reason: collision with root package name */
    public uj3.i f408669c;

    /* renamed from: d, reason: collision with root package name */
    public int f408670d;

    public o3(com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI mainUI) {
        kotlin.jvm.internal.o.g(mainUI, "mainUI");
        this.f408667a = mainUI;
        this.f408670d = -1;
    }

    public final void a() {
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408667a;
        if (multiTalkMainUI.T6() == null || multiTalkMainUI.T6().findViewById(com.tencent.mm.R.id.m7w) == null) {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        sj3.n3 n3Var = f408666e;
        int a17 = n3Var.a(multiTalkMainUI);
        this.f408670d = a17;
        if (a17 == 0 || a17 == 180) {
            n3Var.d(multiTalkMainUI, true);
            layoutParams.bottomMargin = n3Var.c(multiTalkMainUI);
        } else if (a17 == 270) {
            n3Var.d(multiTalkMainUI, false);
            layoutParams.leftMargin = n3Var.c(multiTalkMainUI);
        } else if (a17 == 90) {
            n3Var.d(multiTalkMainUI, false);
            layoutParams.rightMargin = n3Var.c(multiTalkMainUI);
        }
        multiTalkMainUI.T6().findViewById(com.tencent.mm.R.id.m7w).setLayoutParams(layoutParams);
    }

    public final void b() {
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408667a;
        android.view.ViewGroup T6 = multiTalkMainUI.T6();
        if (T6 != null) {
            T6.removeView(this.f408668b);
        }
        android.view.ViewGroup T62 = multiTalkMainUI.T6();
        if (T62 != null) {
            T62.removeView(this.f408669c);
        }
        uj3.p pVar = this.f408668b;
        if (pVar != null) {
            pVar.l();
        }
        uj3.i iVar = this.f408669c;
        if (iVar != null) {
            iVar.l();
        }
        this.f408668b = null;
        this.f408669c = null;
        com.tencent.mm.plugin.multitalk.model.e3.Ri().f150186y1 = false;
        com.tencent.mm.plugin.multitalk.model.e3.Ri().f150170o = null;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScreenProjectReportHelper", "markExitProject");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.C(1538L, 4L, 1L);
    }

    public final void c(int i17) {
        android.view.ViewGroup T6 = this.f408667a.T6();
        if (T6 != null) {
            if (i17 == 2) {
                android.content.Context context = T6.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                uj3.p pVar = new uj3.p(context);
                this.f408668b = pVar;
                pVar.setVisibility(0);
                T6.addView(this.f408668b);
            } else {
                android.content.Context context2 = T6.getContext();
                kotlin.jvm.internal.o.f(context2, "getContext(...)");
                uj3.i iVar = new uj3.i(context2);
                this.f408669c = iVar;
                iVar.setVisibility(0);
                T6.addView(this.f408669c);
            }
            a();
        }
    }

    public final boolean d() {
        uj3.p pVar = this.f408668b;
        if (pVar != null) {
            return pVar != null && pVar.getVisibility() == 0;
        }
        uj3.i iVar = this.f408669c;
        if (iVar != null) {
            return iVar.isShown();
        }
        return false;
    }

    public final void e() {
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = this.f408667a;
        if (multiTalkMainUI.T6() != null) {
            uj3.p pVar = this.f408668b;
            if (pVar != null) {
                pVar.p();
            }
            a();
            com.tencent.mm.plugin.multitalk.model.q3 r17 = com.tencent.mm.plugin.multitalk.model.e3.Ri().r();
            sj3.n3 n3Var = f408666e;
            int a17 = n3Var.a(multiTalkMainUI);
            ((com.tencent.mm.plugin.multitalk.model.r3) r17).getClass();
            int i17 = a17 != 0 ? a17 != 90 ? a17 != 180 ? a17 != 270 ? a17 != 360 ? 0 : 5 : 4 : 3 : 2 : 1;
            java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(4);
            allocate.order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(i17);
            com.tencent.mm.plugin.multitalk.ilinkservice.i4 i4Var = com.tencent.mm.plugin.multitalk.ilinkservice.i4.INSTANCE;
            byte[] array = allocate.array();
            i4Var.getClass();
            com.tencent.mm.plugin.multitalk.ilinkservice.g0.c(62, array, 4);
            if (n3Var.a(multiTalkMainUI) == 90 || n3Var.a(multiTalkMainUI) == 270) {
                if (this.f408668b != null) {
                    zj3.g.f473302a.b(3, 1);
                    java.lang.String str = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t.f71606d;
                }
                if (this.f408669c != null) {
                    java.lang.String str2 = com.tencent.mm.plugin.multitalk.model.e3.Ri().f150177t.f71606d;
                }
            }
        }
    }
}
