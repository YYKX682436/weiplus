package hu3;

/* loaded from: classes4.dex */
public final class q0 extends com.tencent.mm.ui.widget.dialog.v3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f285188d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f285189e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(android.content.Context context) {
        super(context, com.tencent.mm.R.style.f494791wd);
        kotlin.jvm.internal.o.g(context, "context");
        this.f285188d = jz5.h.b(new hu3.o0(this));
        this.f285189e = jz5.h.b(new hu3.p0(this));
    }

    public final void b(java.lang.String str) {
        boolean z17 = str == null || str.length() == 0;
        jz5.g gVar = this.f285189e;
        if (z17) {
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(8);
        } else {
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setVisibility(0);
            ((android.widget.TextView) ((jz5.n) gVar).getValue()).setText(str);
        }
    }

    @Override // android.app.ProgressDialog, android.app.AlertDialog, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        setContentView((android.view.View) ((jz5.n) this.f285188d).getValue(), new android.view.ViewGroup.LayoutParams(-1, -1));
        setCancelable(false);
        setCanceledOnTouchOutside(false);
    }
}
