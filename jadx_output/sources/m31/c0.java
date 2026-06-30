package m31;

/* loaded from: classes9.dex */
public class c0 implements fl1.b2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f323125d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f323126e;

    /* renamed from: f, reason: collision with root package name */
    public fl1.g2 f323127f;

    /* renamed from: g, reason: collision with root package name */
    public m31.a0 f323128g;

    public c0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f323125d = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.cx6, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f323126e = inflate;
        inflate.findViewById(com.tencent.mm.R.id.khs).setOnClickListener(new m31.z(this));
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.agv);
        nf.y yVar = nf.x.f336616b;
        imageView.setBackgroundResource(yVar != null ? yVar.isDarkMode() : false ? com.tencent.mm.R.drawable.cft : com.tencent.mm.R.drawable.cfu);
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        fl1.g2 g2Var = this.f323127f;
        if (g2Var != null) {
            g2Var.a(this);
        }
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        fl1.g2 g2Var = this.f323127f;
        if (g2Var == null) {
            m31.a0 a0Var = this.f323128g;
            if (a0Var != null) {
                a0Var.onDismiss();
                return;
            }
            return;
        }
        g2Var.d(new m31.b0(this));
        fl1.g2 g2Var2 = this.f323127f;
        if (g2Var2 != null) {
            g2Var2.a(this);
        }
    }

    @Override // fl1.b2
    public android.view.View getContentView() {
        return this.f323126e;
    }

    @Override // fl1.b2
    public int getPosition() {
        return 2;
    }

    @Override // fl1.b2
    public boolean j() {
        return true;
    }

    @Override // fl1.b2
    public void m() {
    }

    @Override // fl1.b2
    public void onCancel() {
        fl1.g2 g2Var = this.f323127f;
        if (g2Var != null) {
            g2Var.a(this);
        }
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        this.f323127f = g2Var;
        m31.v vVar = m31.w.f323224a;
        java.lang.Object systemService = this.f323125d.getSystemService("window");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        vVar.a(((android.view.WindowManager) systemService).getDefaultDisplay().getRotation(), this.f323126e);
    }

    @Override // fl1.b2
    public void y(int i17) {
        m31.w.f323224a.a(i17, this.f323126e);
    }
}
