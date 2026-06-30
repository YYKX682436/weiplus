package vi1;

/* loaded from: classes7.dex */
public final class m2 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vi1.k3 f437409a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(vi1.k3 k3Var, long j17, long j18) {
        super(j17, j18);
        this.f437409a = k3Var;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        this.f437409a.h();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        vi1.k3 k3Var = this.f437409a;
        android.widget.TextView textView = k3Var.f437391h;
        if (textView == null) {
            return;
        }
        textView.setText(k3Var.f437384a.getString(com.tencent.mm.R.string.f490144m5, "" + (j17 / 1000)));
    }
}
