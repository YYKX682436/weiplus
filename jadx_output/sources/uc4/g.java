package uc4;

/* loaded from: classes4.dex */
public abstract class g {

    /* renamed from: a */
    public final android.content.Context f426404a;

    /* renamed from: b */
    public android.view.View f426405b;

    /* renamed from: c */
    public xc4.p f426406c;

    /* renamed from: d */
    public in5.s0 f426407d;

    /* renamed from: e */
    public final jz5.g f426408e;

    public g(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f426404a = context;
        this.f426408e = jz5.h.b(new uc4.a(this));
    }

    public static final java.lang.String g() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$cp", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTAG", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return "MicroMsg.Improve.Click";
    }

    public static /* synthetic */ void l(uc4.g gVar, android.view.View view, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("register$default", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        if (obj != null) {
            java.lang.UnsupportedOperationException unsupportedOperationException = new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: register");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register$default", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
            throw unsupportedOperationException;
        }
        if ((i17 & 2) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z18 = false;
        }
        if ((i17 & 8) != 0) {
            z19 = true;
        }
        gVar.k(view, z17, z18, z19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register$default", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
    }

    public void a(android.view.View view) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("click", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
    }

    public final android.content.Context b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getContext", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return this.f426404a;
    }

    public final xc4.p c() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        xc4.p pVar = this.f426406c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getInfo", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return pVar;
    }

    public android.view.View.OnCreateContextMenuListener d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMenuListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return null;
    }

    public final com.tencent.mm.plugin.sns.ui.listener.c e() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMenuSelectListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        android.content.Context context = this.f426404a;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC improveEventUIC = (com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC.class);
        improveEventUIC.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMenuItemSelectListener", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        com.tencent.mm.plugin.sns.ui.listener.c O6 = improveEventUIC.O6();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMenuItemSelectListener", "com.tencent.mm.plugin.sns.ui.improve.component.ImproveEventUIC");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMenuSelectListener", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return O6;
    }

    public final rl5.r f() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPopupMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        rl5.r rVar = (rl5.r) ((jz5.n) this.f426408e).getValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPopupMenu", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return rVar;
    }

    public final android.view.View h() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getView", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        android.view.View view = this.f426405b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getView", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return view;
    }

    public boolean i(android.view.MenuItem menuItem, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("handleMenuClick", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return false;
    }

    public final int j() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("position", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        in5.s0 s0Var = this.f426407d;
        int adapterPosition = s0Var != null ? s0Var.getAdapterPosition() : -1;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("position", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        return adapterPosition;
    }

    public void k(android.view.View view, boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
            return;
        }
        this.f426405b = view;
        if (z17) {
            view.setOnClickListener(new uc4.b(this, view));
        }
        if (z18) {
            if (z19) {
                rl5.r f17 = f();
                android.view.View.OnCreateContextMenuListener d17 = d();
                if (d17 == null) {
                    java.lang.IllegalArgumentException illegalArgumentException = new java.lang.IllegalArgumentException("improveClick not set menu listener");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
                    throw illegalArgumentException;
                }
                f17.j(view, d17, new uc4.c(this));
            } else {
                rl5.r f18 = f();
                android.view.View.OnCreateContextMenuListener d18 = d();
                if (d18 == null) {
                    java.lang.IllegalArgumentException illegalArgumentException2 = new java.lang.IllegalArgumentException("improveClick not set menu listener");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
                    throw illegalArgumentException2;
                }
                uc4.d dVar = new uc4.d(this);
                f18.f397338f = view;
                f18.f397354x = dVar;
                if (view instanceof android.widget.AbsListView) {
                    com.tencent.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu AbsListView", new java.lang.Object[0]);
                    ((android.widget.AbsListView) view).setOnItemLongClickListener(new rl5.b(f18, d18));
                } else {
                    com.tencent.mm.ui.yk.e("MicroMsg.MMPopupMenu", "registerForPopupMenu normal view", new java.lang.Object[0]);
                    view.setOnLongClickListener(new rl5.c(f18, d18));
                }
            }
            f().L = uc4.e.f426390d;
            f().M = uc4.f.f426400a;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("register", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
    }

    public void m(in5.s0 s0Var, xc4.p info, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
        kotlin.jvm.internal.o.g(info, "info");
        this.f426407d = s0Var;
        this.f426406c = info;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("update", "com.tencent.mm.plugin.sns.ui.improve.item.click.BaseImproveClick");
    }
}
