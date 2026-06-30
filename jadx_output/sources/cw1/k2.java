package cw1;

/* loaded from: classes.dex */
public final class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f223079d = 5;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.j0 f223080e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f223081f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f223082g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI f223083h;

    public k2(com.tencent.mm.ui.widget.dialog.j0 j0Var, android.widget.TextView textView, java.lang.String str, com.tencent.mm.plugin.clean.ui.fileindexui.CleanCacheUI cleanCacheUI) {
        this.f223080e = j0Var;
        this.f223081f = textView;
        this.f223082g = str;
        this.f223083h = cleanCacheUI;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f223079d - 1;
        this.f223079d = i17;
        if (i17 <= 0) {
            this.f223080e.dismiss();
            return;
        }
        this.f223081f.setText(this.f223082g + '\n' + this.f223083h.getString(com.tencent.mm.R.string.b7s, java.lang.Integer.valueOf(this.f223079d)));
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
        t0Var.getClass();
        t0Var.z(this, 1000L, false);
    }
}
