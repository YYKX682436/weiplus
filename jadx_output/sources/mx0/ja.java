package mx0;

/* loaded from: classes5.dex */
public final class ja implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f332075d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f332076e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f332077f;

    /* renamed from: g, reason: collision with root package name */
    public final mx0.z f332078g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Integer f332079h;

    /* renamed from: i, reason: collision with root package name */
    public mx0.t9 f332080i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f332081m;

    /* renamed from: n, reason: collision with root package name */
    public volatile e06.k f332082n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f332083o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f332084p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f332085q;

    /* renamed from: r, reason: collision with root package name */
    public wu5.c f332086r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f332087s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f332088t;

    public ja(androidx.recyclerview.widget.RecyclerView templateListRv, android.widget.TextView selectedTemplateNameTv, android.widget.TextView guideWordingTv, mx0.z controller) {
        kotlin.jvm.internal.o.g(templateListRv, "templateListRv");
        kotlin.jvm.internal.o.g(selectedTemplateNameTv, "selectedTemplateNameTv");
        kotlin.jvm.internal.o.g(guideWordingTv, "guideWordingTv");
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f332075d = templateListRv;
        this.f332076e = selectedTemplateNameTv;
        this.f332077f = guideWordingTv;
        this.f332078g = controller;
        this.f332080i = new mx0.v9(0);
        this.f332081m = new java.util.ArrayList();
        this.f332082n = new e06.k(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f332085q = true;
        this.f332087s = jz5.h.a(jz5.i.f302831f, new mx0.ea(this));
        this.f332088t = true;
    }

    public static final void a(mx0.ja jaVar) {
        mx0.t9 t9Var = jaVar.f332080i;
        mx0.v9 v9Var = t9Var instanceof mx0.v9 ? (mx0.v9) t9Var : null;
        if (v9Var == null) {
            return;
        }
        t9Var.f332360h = null;
        jaVar.f332079h = null;
        int i17 = v9Var.f332356d;
        v9Var.f332356d = 0;
        mx0.r9 r9Var = mx0.r9.f332295e;
        v9Var.notifyItemChanged(i17, r9Var);
        v9Var.notifyItemChanged(0, r9Var);
        android.widget.TextView textView = jaVar.f332076e;
        textView.setText("");
        textView.setVisibility(8);
    }

    public final void b(java.lang.String str, boolean z17) {
        int i17 = 0;
        boolean z18 = str == null || str.length() == 0;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f332075d;
        if (z18 || kotlin.jvm.internal.o.b(str, "kEmptyTemplateId")) {
            if (this.f332079h != null) {
                recyclerView.post(new mx0.fa(this));
                return;
            }
            return;
        }
        mx0.t9 t9Var = this.f332080i;
        java.util.Iterator it = t9Var.f332358f.iterator();
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((vt3.p) it.next()).f440020b, str)) {
                break;
            } else {
                i17++;
            }
        }
        recyclerView.post(new mx0.ga(this, t9Var.z(i17), z17));
    }

    public final void c(int i17) {
        this.f332080i.f332360h = null;
        this.f332079h = java.lang.Integer.valueOf(i17);
        mx0.t9 t9Var = this.f332080i;
        int i18 = t9Var.f332356d;
        t9Var.f332356d = t9Var.z(i17);
        mx0.r9 r9Var = mx0.r9.f332295e;
        t9Var.notifyItemChanged(i18, r9Var);
        t9Var.notifyItemChanged(t9Var.f332356d, r9Var);
        java.lang.Object obj = this.f332081m.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        vt3.p pVar = (vt3.p) obj;
        java.lang.String str = pVar.f440021c;
        android.widget.TextView textView = this.f332076e;
        textView.setText(str);
        textView.setVisibility(0);
        if (!(pVar.f440032n.length() > 0)) {
            this.f332077f.setVisibility(8);
            return;
        }
        this.f332077f.setVisibility(0);
        this.f332077f.setText(pVar.f440032n);
        ku5.u0 u0Var = ku5.t0.f312615d;
        mx0.ha haVar = new mx0.ha(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f332086r = t0Var.z(haVar, 3000L, false);
    }

    @Override // yt3.r2
    public void onPause() {
        this.f332079h = null;
    }

    @Override // yt3.r2
    public void release() {
        wu5.c cVar = this.f332086r;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        if (this.f332085q) {
            androidx.recyclerview.widget.RecyclerView recyclerView = this.f332075d;
            if (i17 != 0) {
                if (recyclerView.getVisibility() == 0) {
                    sa5.d.d(this.f332075d, 0, 0L, null, 7, null);
                }
            } else if (recyclerView.getVisibility() == 4 || recyclerView.getVisibility() == 8) {
                sa5.d.c(this.f332075d, 0.0f, 0L, null, 7, null);
            }
        }
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        mx0.t9 t9Var = this.f332080i;
        mx0.ca caVar = new mx0.ca(this);
        t9Var.getClass();
        t9Var.f332359g = caVar;
        mx0.t9 t9Var2 = this.f332080i;
        mx0.v9 v9Var = t9Var2 instanceof mx0.v9 ? (mx0.v9) t9Var2 : null;
        if (v9Var != null) {
            v9Var.f332403i = new mx0.da(this);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f332075d;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext());
        linearLayoutManager.Q(0);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(this.f332080i);
        recyclerView.N(new mx0.y9());
        com.tencent.mm.ui.fk.a(this.f332076e);
    }
}
