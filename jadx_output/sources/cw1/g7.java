package cw1;

/* loaded from: classes3.dex */
public final class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f222956d = 5;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI f222957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f222958f;

    public g7(com.tencent.mm.plugin.clean.ui.fileindexui.CleanOtherAccountUI cleanOtherAccountUI, android.widget.TextView textView) {
        this.f222957e = cleanOtherAccountUI;
        this.f222958f = textView;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f222956d - 1;
        this.f222956d = i17;
        if (i17 <= 0) {
            this.f222957e.finish();
            return;
        }
        this.f222958f.setText(this.f222957e.getString(com.tencent.mm.R.string.b7s, java.lang.Integer.valueOf(i17)));
        ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
        t0Var.getClass();
        t0Var.z(this, 1000L, false);
    }
}
