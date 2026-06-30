package ui1;

/* loaded from: classes7.dex */
public class e0 implements fl1.b2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f428045d;

    /* renamed from: e, reason: collision with root package name */
    public fl1.g2 f428046e;

    public e0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488149ij, (android.view.ViewGroup) null);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        this.f428045d = inflate;
        inflate.findViewById(com.tencent.mm.R.id.khs).setOnClickListener(new ui1.c0(this));
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.agv);
        nf.y yVar = nf.x.f336616b;
        imageView.setBackgroundResource(yVar != null ? yVar.isDarkMode() : false ? com.tencent.mm.R.raw.appbrand_wmpf_voip_call_in_notify_tip_bottom_dialog_bg_dark : com.tencent.mm.R.raw.appbrand_wmpf_voip_call_in_notify_tip_bottom_dialog_bg_light);
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        fl1.g2 g2Var = this.f428046e;
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
        fl1.g2 g2Var = this.f428046e;
        if (g2Var != null) {
            g2Var.d(new ui1.d0(this));
        }
        fl1.g2 g2Var2 = this.f428046e;
        if (g2Var2 != null) {
            g2Var2.a(this);
        }
    }

    @Override // fl1.b2
    public android.view.View getContentView() {
        return this.f428045d;
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
        fl1.g2 g2Var = this.f428046e;
        if (g2Var != null) {
            g2Var.a(this);
        }
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        this.f428046e = g2Var;
    }

    @Override // fl1.b2
    public void y(int i17) {
    }
}
