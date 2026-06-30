package vi1;

/* loaded from: classes7.dex */
public final class p3 extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vi1.z3 f437430a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p3(vi1.z3 z3Var, long j17, long j18) {
        super(j17, j18);
        this.f437430a = z3Var;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        this.f437430a.t();
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        vi1.z3 z3Var = this.f437430a;
        z3Var.f437529s.setText(z3Var.f437517d.getString(com.tencent.mm.R.string.f490144m5, "" + (j17 / 1000)));
    }
}
