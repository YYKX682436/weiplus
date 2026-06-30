package cw2;

/* loaded from: classes10.dex */
public final class za extends android.os.CountDownTimer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw2.ab f224148a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public za(cw2.ab abVar) {
        super(3000L, 1000L);
        this.f224148a = abVar;
    }

    @Override // android.os.CountDownTimer
    public void onFinish() {
        cw2.ab abVar = this.f224148a;
        abVar.f223574e.setVisibility(8);
        ju3.d0.k(abVar.f223573d, ju3.c0.A, null, 2, null);
    }

    @Override // android.os.CountDownTimer
    public void onTick(long j17) {
        this.f224148a.f223575f.setText(java.lang.String.valueOf(a06.d.b(((float) j17) / 1000.0f)));
    }
}
