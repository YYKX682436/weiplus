package sd;

/* loaded from: classes8.dex */
public class u0 extends sd.k implements sd.a {

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f406654h;

    /* renamed from: i, reason: collision with root package name */
    public final sd.o0 f406655i;

    /* renamed from: m, reason: collision with root package name */
    public me.imid.swipebacklayout.lib.SwipeBackLayout f406656m;

    /* renamed from: n, reason: collision with root package name */
    public final android.os.Bundle f406657n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f406658o;

    public u0(sd.x xVar, sd.o0 o0Var, android.os.Bundle bundle) {
        super(xVar);
        this.f406658o = null;
        sd.s0 s0Var = new sd.s0(this);
        this.f406657n = bundle == null ? new android.os.Bundle() : bundle;
        this.f406655i = o0Var;
        sd.x xVar2 = this.f406612f;
        if (o0Var == null) {
            sd.w wVar = ((sd.u) xVar2).f406653a;
            java.lang.Integer num = wVar.f406667h;
            wVar.f406667h = null;
            sd.o0 a17 = sd.q0.a(wVar.f406661b, num);
            o0Var = (a17 == null || !a17.f406631g.equals(wVar.c())) ? null : a17;
        }
        o0Var = o0Var == null ? new sd.o0(this.f406610d, ((sd.u) xVar2).f406653a.c()) : o0Var;
        this.f406655i = o0Var;
        o0Var.g((java.util.LinkedList) ((sd.u) this.f406612f).f406653a.f406664e.f406599a.clone(), this);
        o0Var.f406632h = s0Var;
        android.view.View k17 = k();
        me.imid.swipebacklayout.lib.SwipeBackLayout swipeBackLayout = new me.imid.swipebacklayout.lib.SwipeBackLayout(this.f406610d, null);
        this.f406656m = swipeBackLayout;
        swipeBackLayout.setScrimColor(0);
        this.f406656m.addView(k17);
        this.f406656m.setContentView(k17);
        this.f406656m.c(new sd.r0(this, new boolean[]{false}));
        this.f406654h = this.f406656m;
    }

    @Override // sd.k
    public void a() {
        f();
        this.f406611e.a(sd.b0.class);
        sd.o0 o0Var = this.f406655i;
        android.view.ViewParent parent = o0Var.f406633i.getView().getParent();
        if (parent instanceof android.view.ViewGroup) {
            com.tencent.mars.xlog.Log.i("Luggage.LuggageWebCore", "removeSelfFromParent");
            ((android.view.ViewGroup) parent).removeView(o0Var.f406633i.getView());
        }
        i();
    }

    @Override // sd.k
    public void b(java.lang.String str, android.os.Bundle bundle) {
        this.f406655i.j(str);
    }

    @Override // sd.k
    public boolean c() {
        sd.o0 o0Var = this.f406655i;
        if (!(o0Var.f406633i.canGoBack() && o0Var.f406641t)) {
            return false;
        }
        o0Var.f406633i.goBack();
        return true;
    }

    @Override // sd.a
    public sd.l0 getRuntime() {
        return this.f406655i;
    }

    public void i() {
        this.f406655i.a();
    }

    public java.lang.String j() {
        return "";
    }

    public android.view.View k() {
        return this.f406655i.f406633i.getView();
    }
}
