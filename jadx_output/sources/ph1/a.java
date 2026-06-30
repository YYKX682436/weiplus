package ph1;

/* loaded from: classes7.dex */
public class a implements fl1.b2 {

    /* renamed from: d, reason: collision with root package name */
    public fl1.g2 f354303d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f354304e;

    /* renamed from: f, reason: collision with root package name */
    public final int f354305f;

    public a(android.content.Context context, int i17) {
        this.f354305f = i17;
        android.view.View view = new android.view.View(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(context));
        this.f354304e = view;
        view.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        view.setBackgroundColor(i17);
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        dismiss();
    }

    @Override // fl1.b2
    public boolean d() {
        return false;
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        fl1.g2 g2Var = this.f354303d;
        if (g2Var != null) {
            g2Var.a(this);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BlankBackgroundPlaceholderDialog", "onDismiss backgroundColor:%d", java.lang.Integer.valueOf(this.f354305f));
        }
    }

    @Override // fl1.b2
    public android.view.View getContentView() {
        return this.f354304e;
    }

    @Override // fl1.b2
    public int getPosition() {
        return 2;
    }

    @Override // fl1.b2
    public boolean j() {
        return false;
    }

    @Override // fl1.b2
    public void m() {
    }

    @Override // fl1.b2
    public boolean n() {
        return false;
    }

    @Override // fl1.b2
    public void onCancel() {
    }

    @Override // fl1.b2
    public boolean q() {
        return false;
    }

    @Override // fl1.b2
    public void v(fl1.g2 g2Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.BlankBackgroundPlaceholderDialog", "onShow backgroundColor:%d", java.lang.Integer.valueOf(this.f354305f));
        this.f354303d = g2Var;
    }

    @Override // fl1.b2
    public void y(int i17) {
    }
}
