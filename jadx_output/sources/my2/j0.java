package my2;

/* loaded from: classes3.dex */
public final class j0 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ my2.k0 f332741a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(my2.k0 k0Var, long j17) {
        super(j17, 1000L);
        this.f332741a = k0Var;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        my2.k0 k0Var = this.f332741a;
        com.tencent.mm.plugin.finder.view.UnchangeTextView unchangeTextView = k0Var.f332744q;
        if (unchangeTextView != null) {
            unchangeTextView.setVisibility(0);
        }
        android.widget.TextView textView = k0Var.f332750w;
        if (textView == null) {
            return;
        }
        textView.setVisibility(8);
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        my2.k0 k0Var = this.f332741a;
        k0Var.B++;
        android.widget.TextView textView = k0Var.f332750w;
        if (textView == null) {
            return;
        }
        textView.setText(k0Var.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.f491886ej4, no0.l.a(no0.m.f338730a, k0Var.C - k0Var.B, ":", false, false, false, 24, null)));
    }
}
