package pa3;

/* loaded from: classes8.dex */
public class p extends jk3.v {
    public static final pa3.l I = new pa3.l(null);
    public java.lang.String A;
    public long B;
    public java.lang.String C;
    public java.lang.String D;
    public java.lang.String E;
    public java.lang.String F;
    public java.lang.String G;
    public java.lang.String H;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f352995x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f352996y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f352997z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ak3.c pageAdapter) {
        super(pageAdapter);
        kotlin.jvm.internal.o.g(pageAdapter, "pageAdapter");
        this.f352995x = "";
        this.f352996y = "";
        this.f352997z = "";
        this.C = "";
        this.D = "";
        this.E = "";
        this.F = "";
        this.G = "liteapp";
    }

    private final void R() {
        if (a() && s()) {
            if (this.f300116i == null) {
                ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).getClass();
                fk3.o oVar = new fk3.o();
                this.f300116i = oVar;
                ak3.c cVar = this.f300111d;
                if (cVar != null) {
                    oVar.e(cVar, this, this.f300113f);
                }
            }
            this.f300126s = true;
        }
    }

    public static final void c0(pa3.p pVar, java.lang.String str) {
        pVar.getClass();
        cl0.g gVar = new cl0.g();
        gVar.h("type", "star");
        gVar.h(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_REASON, str);
        com.tencent.mm.plugin.lite.LiteAppCenter.publishGlobalEvent(pVar.B, 0L, "tasks.addTask", gVar);
    }

    @Override // jk3.b
    public void B(boolean z17) {
        if (z17) {
            j();
            ((ku5.t0) ku5.t0.f312615d).g(new pa3.n(this));
        }
        super.B(z17);
    }

    @Override // jk3.v
    public boolean U(int i17, boolean z17) {
        R();
        return super.U(i17, z17);
    }

    @Override // jk3.v
    public void Y(int i17, com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo) {
        com.tencent.mars.xlog.Log.i("LiteAppMultiTaskHelper", "onMultiTaskInfoChangedInner way:" + i17 + " multiTaskInfo:" + multiTaskInfo);
        if (i17 == 1) {
            com.tencent.mm.plugin.lite.LiteAppCenter.releaseKeepAlive(this.f352995x, this.f352996y, this.f352997z, 1);
        }
    }

    @Override // jk3.v
    public boolean Z() {
        ((ku5.t0) ku5.t0.f312615d).g(new pa3.o(this));
        ak3.c cVar = this.f300111d;
        android.app.Activity activity = cVar != null ? cVar.getActivity() : null;
        com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI wxaLiteAppLiteUI = activity instanceof com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI ? (com.tencent.mm.plugin.lite.ui.WxaLiteAppLiteUI) activity : null;
        if (wxaLiteAppLiteUI != null) {
            wxaLiteAppLiteUI.f46104l1 = 1;
            wxaLiteAppLiteUI.d7(180);
        }
        return true;
    }

    public final void d0() {
        android.content.Intent intent;
        if (a()) {
            ak3.c cVar = this.f300111d;
            if (cVar != null && (intent = cVar.getIntent()) != null) {
                intent.putExtra("disable_swipe_back", true);
            }
            if (cVar != null) {
                cVar.i(false);
            }
        }
    }

    public final void e0(java.lang.String bizName) {
        android.content.Intent intent;
        kotlin.jvm.internal.o.g(bizName, "bizName");
        this.G = bizName;
        int i17 = kotlin.jvm.internal.o.b(bizName, "ask") ? 29 : 28;
        ak3.c cVar = this.f300111d;
        if (cVar != null && (intent = cVar.getIntent()) != null) {
            if (!intent.hasExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA)) {
                intent = null;
            }
            if (intent != null) {
                android.os.Bundle bundleExtra = intent.getBundleExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
                intent.putExtra("key_multi_task_common_info", bundleExtra != null ? bundleExtra.getByteArray("key_multi_task_common_info") : null);
                android.os.Bundle bundleExtra2 = intent.getBundleExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
                this.H = bundleExtra2 != null ? bundleExtra2.getString("coverBitmapPath") : null;
            }
        }
        y(i17, "");
        R();
        d0();
    }

    @Override // jk3.b, jk3.e
    public void j() {
        com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = this.f300077a;
        if (multiTaskInfo != null) {
            r45.lr4 v07 = multiTaskInfo.v0();
            v07.set(1, this.D);
            v07.set(0, this.C);
            v07.set(5, this.E);
            r45.p74 p74Var = new r45.p74();
            p74Var.set(0, this.f352995x);
            p74Var.set(1, this.f352996y);
            p74Var.set(2, this.f352997z);
            p74Var.set(3, this.A);
            byte[] byteArray = p74Var.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
            multiTaskInfo.field_data = byteArray;
        }
    }

    @Override // jk3.b
    public boolean x() {
        return true;
    }
}
